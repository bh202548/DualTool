package Brendan.Hansknecht.DualTool;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class GoldSmithHammer extends ItemSmithHammer{
	
	public GoldSmithHammer(int par1, EnumToolMaterial par2EnumToolMaterial) {
		super(par1, par2EnumToolMaterial);
		this.setMaxStackSize(1);
		this.setCreativeTab(mod_DualTool.tabTools);
	}

	@SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister par1IconRegister)
    {
        this.itemIcon = par1IconRegister.registerIcon("dualtool:hamergold");
    }

}
