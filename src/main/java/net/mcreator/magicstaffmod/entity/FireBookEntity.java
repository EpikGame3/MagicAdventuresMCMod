
package net.mcreator.magicstaffmod.entity;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.network.PlayMessages;
import net.minecraftforge.network.NetworkHooks;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.phys.EntityHitResult;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.projectile.ItemSupplier;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.util.RandomSource;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.protocol.Packet;

import net.mcreator.magicstaffmod.procedures.FireStaffWhileProjectileFlyingTickProcedure;
import net.mcreator.magicstaffmod.procedures.FireStaffProjectileHitsLivingEntityProcedure;
import net.mcreator.magicstaffmod.init.MaModEntities;

@OnlyIn(value = Dist.CLIENT, _interface = ItemSupplier.class)
public class FireBookEntity extends AbstractArrow implements ItemSupplier {
	public FireBookEntity(PlayMessages.SpawnEntity packet, Level world) {
		super(MaModEntities.FIRE_BOOK.get(), world);
	}

	public FireBookEntity(EntityType<? extends FireBookEntity> type, Level world) {
		super(type, world);
	}

	public FireBookEntity(EntityType<? extends FireBookEntity> type, double x, double y, double z, Level world) {
		super(type, x, y, z, world);
	}

	public FireBookEntity(EntityType<? extends FireBookEntity> type, LivingEntity entity, Level world) {
		super(type, entity, world);
	}

	@Override
	public Packet<?> getAddEntityPacket() {
		return NetworkHooks.getEntitySpawningPacket(this);
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public ItemStack getItem() {
		return new ItemStack(Blocks.AIR);
	}

	@Override
	protected ItemStack getPickupItem() {
		return ItemStack.EMPTY;
	}

	@Override
	protected void doPostHurtEffects(LivingEntity entity) {
		super.doPostHurtEffects(entity);
		entity.setArrowCount(entity.getArrowCount() - 1);
	}

	@Override
	public void onHitEntity(EntityHitResult entityHitResult) {
		super.onHitEntity(entityHitResult);
		FireStaffProjectileHitsLivingEntityProcedure.execute(entityHitResult.getEntity());
	}

	@Override
	public void tick() {
		super.tick();
		FireStaffWhileProjectileFlyingTickProcedure.execute(this.level, this.getX(), this.getY(), this.getZ());
		if (this.inGround)
			this.discard();
	}

	public static FireBookEntity shoot(Level world, LivingEntity entity, RandomSource random, float power, double damage, int knockback) {
		FireBookEntity entityarrow = new FireBookEntity(MaModEntities.FIRE_BOOK.get(), entity, world);
		entityarrow.shoot(entity.getViewVector(1).x, entity.getViewVector(1).y, entity.getViewVector(1).z, power * 2, 0);
		entityarrow.setSilent(true);
		entityarrow.setCritArrow(false);
		entityarrow.setBaseDamage(damage);
		entityarrow.setKnockback(knockback);
		entityarrow.setSecondsOnFire(100);
		world.addFreshEntity(entityarrow);
		world.playSound(null, entity.getX(), entity.getY(), entity.getZ(),
				ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.campfire.crackle")), SoundSource.PLAYERS, 1,
				1f / (random.nextFloat() * 0.5f + 1) + (power / 2));
		return entityarrow;
	}

	public static FireBookEntity shoot(LivingEntity entity, LivingEntity target) {
		FireBookEntity entityarrow = new FireBookEntity(MaModEntities.FIRE_BOOK.get(), entity, entity.level);
		double dx = target.getX() - entity.getX();
		double dy = target.getY() + target.getEyeHeight() - 1.1;
		double dz = target.getZ() - entity.getZ();
		entityarrow.shoot(dx, dy - entityarrow.getY() + Math.hypot(dx, dz) * 0.2F, dz, 1f * 2, 12.0F);
		entityarrow.setSilent(true);
		entityarrow.setBaseDamage(3);
		entityarrow.setKnockback(0);
		entityarrow.setCritArrow(false);
		entityarrow.setSecondsOnFire(100);
		entity.level.addFreshEntity(entityarrow);
		entity.level.playSound(null, entity.getX(), entity.getY(), entity.getZ(),
				ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.campfire.crackle")), SoundSource.PLAYERS, 1,
				1f / (RandomSource.create().nextFloat() * 0.5f + 1));
		return entityarrow;
	}
}
