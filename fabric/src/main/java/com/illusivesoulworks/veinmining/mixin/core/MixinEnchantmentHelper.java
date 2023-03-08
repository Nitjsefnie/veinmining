/*
 * Copyright (C) 2020-2022 Illusive Soulworks
 *
 * Vein Mining is free software: you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as published
 * by the Free Software Foundation, either version 3 of the License, or
 * any later version.
 *
 * Vein Mining is distributed in the hope that it will be useful, but
 * WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with Vein Mining.  If not, see <https://www.gnu.org/licenses/>.
 */

package com.illusivesoulworks.veinmining.mixin.core;

import com.illusivesoulworks.veinmining.mixin.VeinMiningFabricMixinHooks;
import java.util.Iterator;
import java.util.List;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.item.enchantment.EnchantmentInstance;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import org.spongepowered.asm.mixin.injection.callback.LocalCapture;

@Mixin(EnchantmentHelper.class)
public class MixinEnchantmentHelper {

  @Inject(
      method = "getAvailableEnchantmentResults(ILnet/minecraft/world/item/ItemStack;Z)Ljava/util/List;",
      at = @At(
          value = "INVOKE_ASSIGN",
          target = "Ljava/util/List;add(Ljava/lang/Object;)Z"),
      locals = LocalCapture.CAPTURE_FAILSOFT)
  private static void veinmining$removeVeinMiningEnchantment(int level, ItemStack stack,
                                                             boolean allowTreasure,
                                                             CallbackInfoReturnable<List<EnchantmentInstance>> cir,
                                                             List<EnchantmentInstance> list,
                                                             Item item, boolean isBook,
                                                             Iterator<Enchantment> iter,
                                                             Enchantment enchantment) {
    VeinMiningFabricMixinHooks.removeEnchantment(list, enchantment);
  }

  @Inject(
      method = "getAvailableEnchantmentResults(ILnet/minecraft/world/item/ItemStack;Z)Ljava/util/List;",
      at = @At("RETURN"))
  private static void veinmining$addVeinMiningEnchantment(int level, ItemStack stack,
                                                          boolean allowTreasure,
                                                          CallbackInfoReturnable<List<EnchantmentInstance>> cir) {
    VeinMiningFabricMixinHooks.addEnchantment(level, stack, allowTreasure, cir.getReturnValue());
  }
}
