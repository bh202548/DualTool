package Brendan.Hansknecht.DualTool;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class shovelWoodhead extends Item
{
    public shovelWoodhead(int par1)
    {
        super(par1);
        this.setCreativeTab(mod_DualTool.tabHeads);
    }

    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister par1IconRegister)
    {
        this.itemIcon = par1IconRegister.registerIcon("DuelTool:shovelWoodhead");
    }
}
