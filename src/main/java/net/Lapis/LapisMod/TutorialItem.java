package net.Lapis.LapisMod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class TutorialItem extends Item
{
    public TutorialItem()
    {
        this.setUnlocalizedName("key");
        this.setRegistryName("key");

        this.setCreativeTab(CreativeTabs.FOOD);
    }
}
