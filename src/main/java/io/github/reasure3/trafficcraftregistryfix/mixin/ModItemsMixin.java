package io.github.reasure3.trafficcraftregistryfix.mixin;

import io.github.reasure3.trafficcraftregistryfix.FixedDamageableRecipeType;
import java.util.function.Supplier;
import net.minecraft.world.item.crafting.RecipeType;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Pseudo;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArgs;
import org.spongepowered.asm.mixin.injection.invoke.arg.Args;

@Pseudo
@Mixin(
        targets = "de.mrjulsen.trafficcraft.registry.ModItems",
        remap = false
)
abstract class ModItemsMixin {
    @ModifyArgs(
            method = "<clinit>",
            at = @At(
                    value = "INVOKE",
                    target = "Ldev/architectury/registry/registries/DeferredRegister;register(Ljava/lang/String;Ljava/util/function/Supplier;)Ldev/architectury/registry/registries/RegistrySupplier;",
                    remap = false
            ),
            require = 1,
            remap = false
    )
    private static void trafficcraftRegistryFix$replaceDamageableRecipeTypeSupplier(Args args) {
        if (!"damageable_recipe_type".equals(args.get(0))) {
            return;
        }

        Supplier<RecipeType<?>> replacement = FixedDamageableRecipeType::new;
        args.set(1, replacement);
    }
}
