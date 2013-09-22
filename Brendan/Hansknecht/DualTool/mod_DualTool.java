package Brendan.Hansknecht.DualTool;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.enchantment.EnumEnchantmentType;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.Configuration;
import net.minecraftforge.common.EnumHelper;
import net.minecraftforge.oredict.OreDictionary;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.PostInit;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

@Mod(modid = "dualtool", name = "Dual Tool Mod", version = "1.4")
@NetworkMod(clientSideRequired = true, serverSideRequired = false)
public class mod_DualTool
{
    // The instance of your mod that Forge uses.
    @Instance("DualTool")
    public static mod_DualTool instance = new mod_DualTool();

    
    // Says where the client and server 'proxy' code is loaded.
    @SidedProxy(clientSide = "Brendan.Hansknecht.DualTool.client.ClientProxy", serverSide = "Brendan.Hansknecht.DualTool.CommonProxy")
    public static CommonProxy proxy;

    public static final CreativeTabs tabHeads = new CreativeTabs("ToolHeads"){
        public ItemStack getIconItemStack() {
            return new ItemStack(mod_DualTool.pickaxeDiamondhead, 1, 0);
        }
    };
    
    public static final CreativeTabs tabTools = new CreativeTabs("DualTools"){
        public ItemStack getIconItemStack() {
            return new ItemStack(mod_DualTool.pickshovelDiamond, 1, 0);
        }
    };
    public static Item ironRod;
    public static Item smithhammerStone;
    public static Item smithhammerIron;
    public static Item smithhammerGold;
    public static Item smithhammerDiamond;
    
    public static int ironRodid;
    public static int smithhammerWoodid;
    public static int smithhammerStoneid;
    public static int smithhammerIronid;
    public static int smithhammerGoldid;
    public static int smithhammerDiamondid;
    
    
    public static Item hoeaxeDiamond; 
    public static Item hoeswordDiamond; 
    public static Item pickaxeDiamond; 
    public static Item pickhoeDiamond; 
    public static Item pickshovelDiamond; 
    public static Item pickswordDiamond; 
    public static Item shovelaxeDiamond; 
    public static Item shovelhoeDiamond;
    public static Item shovelswordDiamond;
    public static Item swordaxeDiamond;
    
    public static int hoeaxeDiamondid;
    public static int hoeswordDiamondid;
    public static int pickaxeDiamondid;
    public static int pickhoeDiamondid;
    public static int pickshovelDiamondid;
    public static int pickswordDiamondid;
    public static int shovelaxeDiamondid;
    public static int shovelhoeDiamondid;
    public static int shovelswordDiamondid;
    public static int swordaxeDiamondid;
    
    public static Item hoeaxeGold;
    public static Item hoeswordGold; 
    public static Item pickaxeGold; 
    public static Item pickhoeGold; 
    public static Item pickshovelGold; 
    public static Item pickswordGold; 
    public static Item shovelaxeGold; 
    public static Item shovelhoeGold;
    public static Item shovelswordGold;
    public static Item swordaxeGold;
    
    public static int hoeaxeGoldid;
    public static int hoeswordGoldid;
    public static int pickaxeGoldid;
    public static int pickhoeGoldid;
    public static int pickshovelGoldid;
    public static int pickswordGoldid;
    public static int shovelaxeGoldid;
    public static int shovelhoeGoldid;
    public static int shovelswordGoldid;
    public static int swordaxeGoldid;
    
    public static Item hoeaxeIron;
    public static Item hoeswordIron; 
    public static Item pickaxeIron; 
    public static Item pickhoeIron; 
    public static Item pickshovelIron; 
    public static Item pickswordIron; 
    public static Item shovelaxeIron; 
    public static Item shovelhoeIron;
    public static Item shovelswordIron;
    public static Item swordaxeIron;
    
    public static int hoeaxeIronid;
    public static int hoeswordIronid;
    public static int pickaxeIronid;
    public static int pickhoeIronid;
    public static int pickshovelIronid;
    public static int pickswordIronid;
    public static int shovelaxeIronid;
    public static int shovelhoeIronid;
    public static int shovelswordIronid;
    public static int swordaxeIronid;
    
    public static Item hoeaxeStone;
    public static Item hoeswordStone; 
    public static Item pickaxeStone; 
    public static Item pickhoeStone; 
    public static Item pickshovelStone; 
    public static Item pickswordStone; 
    public static Item shovelaxeStone; 
    public static Item shovelhoeStone;
    public static Item shovelswordStone;
    public static Item swordaxeStone;
    
    public static int hoeaxeStoneid;
    public static int hoeswordStoneid;
    public static int pickaxeStoneid;
    public static int pickhoeStoneid;
    public static int pickshovelStoneid;
    public static int pickswordStoneid;
    public static int shovelaxeStoneid;
    public static int shovelhoeStoneid;
    public static int shovelswordStoneid;
    public static int swordaxeStoneid;
    
    public static Item pickaxeDiamondhead;
    public static Item swordDiamondhead;
    public static Item shovelDiamondhead;
    public static Item hoeDiamondhead;
    public static Item axeDiamondhead;
    
    public static int pickaxeDiamondheadid;
    public static int swordDiamondheadid;
    public static int shovelDiamondheadid;
    public static int hoeDiamondheadid;
    public static int axeDiamondheadid;

    
    public static Item pickaxeGoldhead;
    public static Item swordGoldhead;
    public static Item shovelGoldhead;
    public static Item hoeGoldhead;
    public static Item axeGoldhead;
    
    public static int pickaxeGoldheadid;
    public static int swordGoldheadid;
    public static int shovelGoldheadid;
    public static int hoeGoldheadid;
    public static int axeGoldheadid;
    
    public static Item pickaxeIronhead;
    public static Item swordIronhead;
    public static Item shovelIronhead;
    public static Item hoeIronhead;
    public static Item axeIronhead;
    
    public static int pickaxeIronheadid;
    public static int swordIronheadid;
    public static int shovelIronheadid;
    public static int hoeIronheadid;
    public static int axeIronheadid;
    
    public static Item pickaxeStonehead;
    public static Item swordStonehead;
    public static Item shovelStonehead;
    public static Item hoeStonehead;
    public static Item axeStonehead;
    
    public static int pickaxeStoneheadid;
    public static int swordStoneheadid;
    public static int shovelStoneheadid;
    public static int hoeStoneheadid;
    public static int axeStoneheadid;
    
    public static Block oreAdamantium;
    public static Block orePlatinum;
    public static Block oreNickle;
    public static Block oreAstralDiamond;
    public static Block oreMithril;
    public static Item ingotAdamantium;
    public static Item ingotPlatinum;
    public static Item dustNickle;
    public static Item astralDiamond;
    public static Item ingotMithril;

    
    public static int oreAdamantiumid;
    public static int orePlatinumid;
    public static int oreNickleid;
    public static int oreAstralDiamondid;
    public static int oreMithrilid;
    public static int ingotAdamantiumid;
    public static int ingotPlatinumid;
    public static int dustNickleid;
    public static int astralDiamondid;
    public static int ingotMithrilid;

    @PreInit
    public void preInit(FMLPreInitializationEvent event)
    {
    	Configuration config = new Configuration(event.getSuggestedConfigurationFile());

    	config.load();

    	// Configuration goes here.
    	ironRodid = config.getItem("Iron Rod", 4000).getInt();
    	smithhammerWoodid = config.getItem("Wood Smith's Hammer", 3995).getInt();
    	smithhammerStoneid = config.getItem("Stone Smith's Hammer", 3996).getInt();
    	smithhammerIronid = config.getItem("Iron Smith's Hammer", 3997).getInt();
    	smithhammerGoldid = config.getItem("Gold Smith's Hammer", 3998).getInt();
    	smithhammerDiamondid = config.getItem("Diamond Smith's Hammer", 3999).getInt();
    	
    	hoeaxeDiamondid = config.getItem("Diamond Hoeaxe", 4026).getInt();
    	hoeswordDiamondid = config.getItem("Diamond Scyth", 4027).getInt();
    	pickaxeDiamondid = config.getItem("Diamond Pick Axe", 4028).getInt();
    	pickhoeDiamondid = config.getItem("Diamond Pickhoe", 4029).getInt();
    	pickshovelDiamondid = config.getItem("Diamond Pickshovel", 4030).getInt();
    	pickswordDiamondid = config.getItem("Diamond Warhammer", 4031).getInt();
    	shovelaxeDiamondid = config.getItem("Diamond Shovelaxe", 4032).getInt();
    	shovelhoeDiamondid = config.getItem("Diamond Shovelhoe", 4033).getInt();
    	shovelswordDiamondid = config.getItem("Diamond Broad Sword", 4034).getInt();
    	swordaxeDiamondid = config.getItem("Diamond Battle Axe", 4035).getInt();
    	
    	hoeaxeGoldid = config.getItem("Gold Hoeaxe", 4036).getInt();
    	hoeswordGoldid = config.getItem("Gold Scyth", 4037).getInt();
    	pickaxeGoldid = config.getItem("Gold Pick Axe", 4038).getInt();
    	pickhoeGoldid = config.getItem("Gold Pickhoe", 4039).getInt();
    	pickshovelGoldid = config.getItem("Gold Pickshovel", 4040).getInt();
    	pickswordGoldid = config.getItem("Gold Warhammer", 4041).getInt();
    	shovelaxeGoldid = config.getItem("Gold Shovelaxe", 4042).getInt();
    	shovelhoeGoldid = config.getItem("Gold Shovelhoe", 4043).getInt();
    	shovelswordGoldid = config.getItem("Gold Broad Sword", 4044).getInt();
    	swordaxeGoldid = config.getItem("Gold Battle Axe", 4045).getInt();
    	
    	hoeaxeIronid = config.getItem("Iron Hoeaxe", 4046).getInt();
    	hoeswordIronid = config.getItem("Iron Scyth", 4047).getInt();
    	pickaxeIronid = config.getItem("Iron Pick Axe", 4048).getInt();
    	pickhoeIronid = config.getItem("Iron Pickhoe", 4049).getInt();
    	pickshovelIronid = config.getItem("Iron Pickshovel", 4050).getInt();
    	pickswordIronid = config.getItem("Iron Warhammer", 4051).getInt();
    	shovelaxeIronid = config.getItem("Iron Shovelaxe", 4052).getInt();
    	shovelhoeIronid = config.getItem("Iron Shovelhoe", 4053).getInt();
    	shovelswordIronid = config.getItem("Iron Broad Sword", 4054).getInt();
    	swordaxeIronid = config.getItem("Iron Battle Axe", 4055).getInt();
    	
    	hoeaxeStoneid = config.getItem("Stone Hoeaxe", 4056).getInt();
    	hoeswordStoneid = config.getItem("Stone Scyth", 4057).getInt();
    	pickaxeStoneid = config.getItem("Stone Pick Axe", 4058).getInt();
    	pickhoeStoneid = config.getItem("Stone Pickhoe", 4059).getInt();
    	pickshovelStoneid = config.getItem("Stone Pickshovel", 4060).getInt();
    	pickswordStoneid = config.getItem("Stone Warhammer", 4061).getInt();
    	shovelaxeStoneid = config.getItem("Stone Shovelaxe", 4062).getInt();
    	shovelhoeStoneid = config.getItem("Stone Shovelhoe", 4063).getInt();
    	shovelswordStoneid = config.getItem("Stone Broad Sword", 4064).getInt();
    	swordaxeStoneid = config.getItem("Stone Battle Axe", 4065).getInt();
    	
    	pickaxeDiamondheadid = config.getItem("Diamond Pickaxe Head", 4001).getInt();
    	swordDiamondheadid = config.getItem("Diamond Sword Head", 4002).getInt();
    	shovelDiamondheadid = config.getItem("Diamond Shovel Head", 4003).getInt();
    	hoeDiamondheadid = config.getItem("Diamond Hoe Head", 4004).getInt();
    	axeDiamondheadid = config.getItem("Diamond Axe Head", 4005).getInt();
    	
    	pickaxeGoldheadid = config.getItem("Gold Pickaxe Head", 4006).getInt();
    	swordGoldheadid = config.getItem("Gold Sword Head", 4007).getInt();
    	shovelGoldheadid = config.getItem("Gold Shovel Head", 4008).getInt();
    	hoeGoldheadid = config.getItem("Gold Hoe Head", 4009).getInt();
    	axeGoldheadid = config.getItem("Gold Axe Head", 4010).getInt();
    	
    	pickaxeIronheadid = config.getItem("Iron Pickaxe Head", 4011).getInt();
    	swordIronheadid = config.getItem("Iron Sword Head", 4012).getInt();
    	shovelIronheadid = config.getItem("Iron Shovel Head", 4013).getInt();
    	hoeIronheadid = config.getItem("Iron Hoe Head", 4014).getInt();
    	axeIronheadid = config.getItem("Iron Axe Head", 4015).getInt();
    	
    	pickaxeStoneheadid = config.getItem("Stone Pickaxe Head", 4016).getInt();
    	swordStoneheadid = config.getItem("Stone Sword Head", 4017).getInt();
    	shovelStoneheadid = config.getItem("Stone Shovel Head", 4018).getInt();
    	hoeStoneheadid = config.getItem("Stone Hoe Head", 4019).getInt();
    	axeStoneheadid = config.getItem("Stone Axe Head", 4020).getInt();
    	
    	oreAdamantiumid = config.getItem("Adamantium Ore", 4021).getInt();
    	orePlatinumid = config.getItem("Platinum Ore", 4022).getInt();
    	oreNickleid = config.getItem("Nickle Ore", 4023).getInt();
    	oreAstralDiamondid = config.getItem("Astral Diamond Ore", 4024).getInt();
    	oreMithrilid = config.getItem("Mithril Ore", 4025).getInt();

    	ingotAdamantiumid = config.getItem("Adamantium Ingot", 4026).getInt();
    	ingotPlatinumid = config.getItem("Platinum Ingot", 4027).getInt();
    	dustNickleid = config.getItem("Nickle Dust", 4028).getInt();
    	astralDiamondid = config.getItem("Astral Diamond", 4029).getInt();
    	ingotMithrilid = config.getItem("Mithril Ingot", 4030).getInt();

    	config.save();
    }

    @Init
    public void load(FMLInitializationEvent event)
    {
    	
    	GameRegistry.registerCraftingHandler(new CraftingHandler());
        proxy.registerRenderers();
        
        ironRod = new ironRod(ironRodid).setUnlocalizedName("Iron Rod");
        
        pickaxeDiamondhead = new pickaxeDiamondhead(pickaxeDiamondheadid).setUnlocalizedName("Diamond Pickaxe Head");
        swordDiamondhead = new swordDiamondhead(swordDiamondheadid).setUnlocalizedName("Diamond Sword Head");
        shovelDiamondhead = new shovelDiamondhead(shovelDiamondheadid).setUnlocalizedName("Diamond Shovel Head");
        hoeDiamondhead = new hoeDiamondhead(hoeDiamondheadid).setUnlocalizedName("Diamond Hoe Head");
        axeDiamondhead = new axeDiamondhead(axeDiamondheadid).setUnlocalizedName("Diamond Axe Head");
        
        pickaxeGoldhead = new pickaxeGoldhead(pickaxeGoldheadid).setUnlocalizedName("Gold Pickaxe Head");
        swordGoldhead = new swordGoldhead(swordGoldheadid).setUnlocalizedName("Gold Sword Head");
        shovelGoldhead = new shovelGoldhead(shovelGoldheadid).setUnlocalizedName("Gold Shovel Head");
        hoeGoldhead = new hoeGoldhead(hoeGoldheadid).setUnlocalizedName("Gold Hoe Head");
        axeGoldhead = new axeGoldhead(axeGoldheadid).setUnlocalizedName("Gold Axe Head");
        
        pickaxeIronhead = new pickaxeIronhead(pickaxeIronheadid).setUnlocalizedName("Iron Pickaxe Head");
        swordIronhead = new swordIronhead(swordIronheadid).setUnlocalizedName("Iron Sword Head");
        shovelIronhead = new shovelIronhead(shovelIronheadid).setUnlocalizedName("Iron Shovel Head");
        hoeIronhead = new hoeIronhead(hoeIronheadid).setUnlocalizedName("Iron Hoe Head");
        axeIronhead = new axeIronhead(axeIronheadid).setUnlocalizedName("Iron Axe Head");
        
        pickaxeStonehead = new pickaxeStonehead(pickaxeStoneheadid).setUnlocalizedName("Stone Pickaxe Head");
        swordStonehead = new swordStonehead(swordStoneheadid).setUnlocalizedName("Stone Sword Head");
        shovelStonehead = new shovelStonehead(shovelStoneheadid).setUnlocalizedName("Stone Shovel Head");
        hoeStonehead = new hoeStonehead(hoeStoneheadid).setUnlocalizedName("Stone Hoe Head");
        axeStonehead = new axeStonehead(axeStoneheadid).setUnlocalizedName("Stone Axe Head");
        
        
        hoeaxeDiamond = new DiamondHoeAxe(hoeaxeDiamondid, EnumToolMaterial.EMERALD).setUnlocalizedName("Diamond HoeAxe");        
        hoeswordDiamond = new DiamondHoeSword(hoeswordDiamondid, EnumToolMaterial.EMERALD).setUnlocalizedName("Diamond HoeSword");        
        pickaxeDiamond = new DiamondPickAxe(pickaxeDiamondid, EnumToolMaterial.EMERALD).setUnlocalizedName("Diamond PickAxe");        
        pickhoeDiamond = new DiamondPickHoe(pickhoeDiamondid, EnumToolMaterial.EMERALD).setUnlocalizedName("Diamond PickHoe");  
        pickshovelDiamond = new DiamondPickShovel(pickshovelDiamondid, EnumToolMaterial.EMERALD).setUnlocalizedName("Diamond PickShovel");        
        pickswordDiamond = new DiamondPickSword(pickswordDiamondid, EnumToolMaterial.EMERALD).setUnlocalizedName("Diamond PickSword");
        shovelaxeDiamond = new DiamondShovelAxe(shovelaxeDiamondid, EnumToolMaterial.EMERALD).setUnlocalizedName("Diamond ShovelAxe");
        shovelhoeDiamond = new DiamondShovelHoe(shovelhoeDiamondid, EnumToolMaterial.EMERALD).setUnlocalizedName("Diamond ShovelHoe");
        shovelswordDiamond = new DiamondShovelSword(shovelswordDiamondid, EnumToolMaterial.EMERALD).setUnlocalizedName("Diamond ShovelSword");
        swordaxeDiamond = new DiamondSwordAxe(swordaxeDiamondid, EnumToolMaterial.EMERALD).setUnlocalizedName("Diamond SwordAxe");

        hoeaxeGold = new GoldHoeAxe(hoeaxeGoldid, EnumToolMaterial.GOLD).setUnlocalizedName("Gold HoeAxe");        
        hoeswordGold = new GoldHoeSword(hoeswordGoldid, EnumToolMaterial.GOLD).setUnlocalizedName("Gold HoeSword");        
        pickaxeGold = new GoldPickAxe(pickaxeGoldid, EnumToolMaterial.GOLD).setUnlocalizedName("Gold PickAxe");        
        pickhoeGold = new GoldPickHoe(pickhoeGoldid, EnumToolMaterial.GOLD).setUnlocalizedName("Gold PickHoe");  
        pickshovelGold = new GoldPickShovel(pickshovelGoldid, EnumToolMaterial.GOLD).setUnlocalizedName("Gold PickShovel");        
        pickswordGold = new GoldPickSword(pickswordGoldid, EnumToolMaterial.GOLD).setUnlocalizedName("Gold PickSword");
        shovelaxeGold = new GoldShovelAxe(shovelaxeGoldid, EnumToolMaterial.GOLD).setUnlocalizedName("Gold ShovelAxe");
        shovelhoeGold = new GoldShovelHoe(shovelhoeGoldid, EnumToolMaterial.GOLD).setUnlocalizedName("Gold ShovelHoe");
        shovelswordGold = new GoldShovelSword(shovelswordGoldid, EnumToolMaterial.GOLD).setUnlocalizedName("Gold ShovelSword");
        swordaxeGold = new GoldSwordAxe(swordaxeGoldid, EnumToolMaterial.GOLD).setUnlocalizedName("Gold SwordAxe");
        
        hoeaxeIron = new IronHoeAxe(hoeaxeIronid, EnumToolMaterial.IRON).setUnlocalizedName("Iron HoeAxe");        
        hoeswordIron = new IronHoeSword(hoeswordIronid, EnumToolMaterial.IRON).setUnlocalizedName("Iron HoeSword");        
        pickaxeIron = new IronPickAxe(pickaxeIronid, EnumToolMaterial.IRON).setUnlocalizedName("Iron PickAxe");        
        pickhoeIron = new IronPickHoe(pickhoeIronid, EnumToolMaterial.IRON).setUnlocalizedName("Iron PickHoe");  
        pickshovelIron = new IronPickShovel(pickshovelIronid, EnumToolMaterial.IRON).setUnlocalizedName("Iron PickShovel");        
        pickswordIron = new IronPickSword(pickswordIronid, EnumToolMaterial.IRON).setUnlocalizedName("Iron PickSword");
        shovelaxeIron = new IronShovelAxe(shovelaxeIronid, EnumToolMaterial.IRON).setUnlocalizedName("Iron ShovelAxe");
        shovelhoeIron = new IronShovelHoe(shovelhoeIronid, EnumToolMaterial.IRON).setUnlocalizedName("Iron ShovelHoe");
        shovelswordIron = new IronShovelSword(shovelswordIronid, EnumToolMaterial.IRON).setUnlocalizedName("Iron ShovelSword");
        swordaxeIron = new IronSwordAxe(swordaxeIronid, EnumToolMaterial.IRON).setUnlocalizedName("Iron SwordAxe");
        
        hoeaxeStone = new StoneHoeAxe(hoeaxeStoneid, EnumToolMaterial.STONE).setUnlocalizedName("Stone HoeAxe");        
        hoeswordStone = new StoneHoeSword(hoeswordStoneid, EnumToolMaterial.STONE).setUnlocalizedName("Stone HoeSword");        
        pickaxeStone = new StonePickAxe(pickaxeStoneid, EnumToolMaterial.STONE).setUnlocalizedName("Stone PickAxe");        
        pickhoeStone = new StonePickHoe(pickhoeStoneid, EnumToolMaterial.STONE).setUnlocalizedName("Stone PickHoe");  
        pickshovelStone = new StonePickShovel(pickshovelStoneid, EnumToolMaterial.STONE).setUnlocalizedName("Stone PickShovel");        
        pickswordStone = new StonePickSword(pickswordStoneid, EnumToolMaterial.STONE).setUnlocalizedName("Stone PickSword");
        shovelaxeStone = new StoneShovelAxe(shovelaxeStoneid, EnumToolMaterial.STONE).setUnlocalizedName("Stone ShovelAxe");
        shovelhoeStone = new StoneShovelHoe(shovelhoeStoneid, EnumToolMaterial.STONE).setUnlocalizedName("Stone ShovelHoe");
        shovelswordStone = new StoneShovelSword(shovelswordStoneid, EnumToolMaterial.STONE).setUnlocalizedName("Stone ShovelSword");
        swordaxeStone = new StoneSwordAxe(swordaxeStoneid, EnumToolMaterial.STONE).setUnlocalizedName("Stone SwordAxe");
        
        smithhammerStone = new StoneSmithHammer(smithhammerStoneid, EnumToolMaterial.STONE).setUnlocalizedName("Stone Smith Hammer");
        smithhammerIron = new IronSmithHammer(smithhammerIronid, EnumToolMaterial.IRON).setUnlocalizedName("Iron Smith Hammer");
        smithhammerGold = new GoldSmithHammer(smithhammerGoldid, EnumToolMaterial.GOLD).setUnlocalizedName("Gold Smith Hammer");
        smithhammerDiamond = new DiamondSmithHammer(smithhammerDiamondid, EnumToolMaterial.EMERALD).setUnlocalizedName("Diamond Smith Hammer");
        
        oreAdamantium = new Block(oreAdamantiumid, Material.ground).setHardness(3.0F).setResistance(5.0F).setStepSound(Block.soundStoneFootstep).setUnlocalizedName("Adamantium Ore");
        orePlatinum = new Block(orePlatinumid, Material.ground).setHardness(3.0F).setResistance(5.0F).setStepSound(Block.soundStoneFootstep).setUnlocalizedName("Platinum Ore");
        oreAstralDiamond = new Block(oreAstralDiamondid, Material.ground).setHardness(3.0F).setResistance(5.0F).setStepSound(Block.soundStoneFootstep).setUnlocalizedName("Astral Diamond Ore");
        oreNickle = new Block(oreNickleid, Material.ground).setHardness(3.0F).setResistance(5.0F).setStepSound(Block.soundStoneFootstep).setUnlocalizedName("Nickle Ore");
        oreMithril = new Block(oreMithrilid, Material.ground).setHardness(3.0F).setResistance(5.0F).setStepSound(Block.soundStoneFootstep).setUnlocalizedName("Mithril Ore");
        ingotAdamantium= new Item(ingotAdamantiumid).setUnlocalizedName("Adamantium Ingot");
        ingotPlatinum = new Item(ingotPlatinumid).setUnlocalizedName("Platinum Ingot");
        dustNickle = new Item(dustNickleid).setUnlocalizedName("Nickle Dust");
        astralDiamond= new Item(astralDiamondid).setUnlocalizedName("Astral Diamond");
        ingotMithril= new Item(ingotMithrilid).setUnlocalizedName("Mithril Ingot");
        
        GameRegistry();
        LanguageRegistry();
    }

    private void LanguageRegistry()
    {
    	LanguageRegistry.instance().addStringLocalization("itemGroup.ToolHeads", "en_US", "Tool Heads");
    	LanguageRegistry.instance().addStringLocalization("itemGroup.DualTools", "en_US", "Dual Tools");
        
    	LanguageRegistry.addName(smithhammerStone, "Stone Smith's Hammer");
    	LanguageRegistry.addName(smithhammerIron, "Iron Smith's Hammer");
    	LanguageRegistry.addName(smithhammerGold, "Gold Smith's Hammer");
    	LanguageRegistry.addName(smithhammerDiamond, "Diamond Smith's Hammer");
    	
        LanguageRegistry.addName(hoeaxeDiamond, "Diamond Hoeaxe");
        LanguageRegistry.addName(hoeswordDiamond, "Diamond Scyth");
        LanguageRegistry.addName(pickaxeDiamond, "Diamond Pick Axe");
        LanguageRegistry.addName(pickhoeDiamond, "Diamond Pickhoe");
        LanguageRegistry.addName(pickshovelDiamond, "Diamond Shickaxe");
        LanguageRegistry.addName(pickswordDiamond, "Diamond Warhammer");
        LanguageRegistry.addName(shovelaxeDiamond, "Diamond Shovelaxe");
        LanguageRegistry.addName(shovelhoeDiamond, "Diamond Shovelhoe");
        LanguageRegistry.addName(shovelswordDiamond, "Diamond Broad Sword");
        LanguageRegistry.addName(swordaxeDiamond, "Diamond Battle Axe");
        
        LanguageRegistry.addName(hoeaxeGold, "Gold Hoeaxe");
        LanguageRegistry.addName(hoeswordGold, "Gold Scyth");
        LanguageRegistry.addName(pickaxeGold, "Gold Pick Axe");
        LanguageRegistry.addName(pickhoeGold, "Gold Pickhoe");
        LanguageRegistry.addName(pickshovelGold, "Gold Shickaxe");
        LanguageRegistry.addName(pickswordGold, "Gold Warhammer");
        LanguageRegistry.addName(shovelaxeGold, "Gold Shovelaxe");
        LanguageRegistry.addName(shovelhoeGold, "Gold Shovelhoe");
        LanguageRegistry.addName(shovelswordGold, "Gold Broad Sword");
        LanguageRegistry.addName(swordaxeGold, "Gold Battle Axe");
        
        LanguageRegistry.addName(hoeaxeIron, "Iron Hoeaxe");
        LanguageRegistry.addName(hoeswordIron, "Iron Scyth");
        LanguageRegistry.addName(pickaxeIron, "Iron Pick Axe");
        LanguageRegistry.addName(pickhoeIron, "Iron Pickhoe");
        LanguageRegistry.addName(pickshovelIron, "Iron Shickaxe");
        LanguageRegistry.addName(pickswordIron, "Iron Warhammer");
        LanguageRegistry.addName(shovelaxeIron, "Iron Shovelaxe");
        LanguageRegistry.addName(shovelhoeIron, "Iron Shovelhoe");
        LanguageRegistry.addName(shovelswordIron, "Iron Broad Sword");
        LanguageRegistry.addName(swordaxeIron, "Iron Battle Axe");
        
        LanguageRegistry.addName(hoeaxeStone, "Stone Hoeaxe");
        LanguageRegistry.addName(hoeswordStone, "Stone Scyth");
        LanguageRegistry.addName(pickaxeStone, "Stone Pick Axe");
        LanguageRegistry.addName(pickhoeStone, "Stone Pickhoe");
        LanguageRegistry.addName(pickshovelStone, "Stone Shickaxe");
        LanguageRegistry.addName(pickswordStone, "Stone Warhammer");
        LanguageRegistry.addName(shovelaxeStone, "Stone Shovelaxe");
        LanguageRegistry.addName(shovelhoeStone, "Stone Shovelhoe");
        LanguageRegistry.addName(shovelswordStone, "Stone Broad Sword");
        LanguageRegistry.addName(swordaxeStone, "Stone Battle Axe");

        LanguageRegistry.addName(pickaxeDiamondhead, "Diamond Pickaxe Head");
        LanguageRegistry.addName(swordDiamondhead, "Diamond Sword Head");
        LanguageRegistry.addName(shovelDiamondhead, "Diamond Shovel Head");
        LanguageRegistry.addName(hoeDiamondhead, "Diamond Hoe Head");
        LanguageRegistry.addName(axeDiamondhead, "Diamond Axe Head");
        
        LanguageRegistry.addName(pickaxeGoldhead, "Gold Pickaxe Head");
        LanguageRegistry.addName(swordGoldhead, "Gold Sword Head");
        LanguageRegistry.addName(shovelGoldhead, "Gold Shovel Head");
        LanguageRegistry.addName(hoeGoldhead, "Gold Hoe Head");
        LanguageRegistry.addName(axeGoldhead, "Gold Axe Head");
        
        LanguageRegistry.addName(pickaxeIronhead, "Iron Pickaxe Head");
        LanguageRegistry.addName(swordIronhead, "Iron Sword Head");
        LanguageRegistry.addName(shovelIronhead, "Iron Shovel Head");
        LanguageRegistry.addName(hoeIronhead, "Iron Hoe Head");
        LanguageRegistry.addName(axeIronhead, "Iron Axe Head");
        
        LanguageRegistry.addName(pickaxeStonehead, "Stone Pickaxe Head");
        LanguageRegistry.addName(swordStonehead, "Stone Sword Head");
        LanguageRegistry.addName(shovelStonehead, "Stone Shovel Head");
        LanguageRegistry.addName(hoeStonehead, "Stone Hoe Head");
        LanguageRegistry.addName(axeStonehead, "Stone Axe Head");
        
        
        LanguageRegistry.addName(ironRod, "Iron Rod");
        //LanguageRegistry.addName(stoneForge, "Stone Forge");
        
        LanguageRegistry.addName(ingotAdamantium, "Adamantium Ingot");
        LanguageRegistry.addName(ingotPlatinum, "Plantinum Ingot");
        LanguageRegistry.addName(dustNickle, "Nickle Dust");
        LanguageRegistry.addName(astralDiamond, "Astral Diamond");
        LanguageRegistry.addName(ingotMithril, "Mithril Ingot");
    }

    private void GameRegistry()
    {
        blocks();
        newvanillarecipes();
        toolheadrecipes();
        dueltoolrecipes();
        randomrecipes();
    }

    private void blocks()
    {
        //GameRegistry.registerBlock(stoneForge, "Stone Forge");
        
    }

    private void randomrecipes()
    {
        GameRegistry.addRecipe(new ItemStack(mod_DualTool.ironRod), new Object[]
                {
                    "I", "I", 'I', Item.ingotIron
                });
        GameRegistry.addRecipe(new ItemStack(mod_DualTool.smithhammerStone), new Object[]
        		{
        			" CC"," SC","S  ", 'C', Block.planks, 'S', Item.stick
        		});
        GameRegistry.addRecipe(new ItemStack(mod_DualTool.smithhammerIron), new Object[]
        		{
        			" CC"," SC","S  ", 'C', Item.ingotIron, 'S', Item.stick
        		});
        GameRegistry.addRecipe(new ItemStack(mod_DualTool.smithhammerGold), new Object[]
        		{
        			" CC"," SC","S  ", 'C', Item.ingotGold, 'S', Item.stick
        		});
        GameRegistry.addRecipe(new ItemStack(mod_DualTool.smithhammerDiamond), new Object[]
        		{
        			" CC"," SC","S  ", 'C', Item.diamond, 'S', Item.stick
        		});
    }

    private void dueltoolrecipes()
    {
    	//stone

        GameRegistry.addShapelessRecipe(new ItemStack(mod_DualTool.hoeaxeGold), new ItemStack(mod_DualTool.axeGoldhead), new ItemStack(mod_DualTool.ironRod), new ItemStack(mod_DualTool.hoeGoldhead), new ItemStack(mod_DualTool.smithhammerStone,1, OreDictionary.WILDCARD_VALUE));
        GameRegistry.addShapelessRecipe(new ItemStack(mod_DualTool.hoeswordGold), new ItemStack(mod_DualTool.hoeGoldhead), new ItemStack(mod_DualTool.ironRod), new ItemStack(mod_DualTool.swordGoldhead), new ItemStack(mod_DualTool.smithhammerStone,1, OreDictionary.WILDCARD_VALUE));
        GameRegistry.addShapelessRecipe(new ItemStack(mod_DualTool.pickaxeGold), new ItemStack(mod_DualTool.pickaxeGoldhead), new ItemStack(mod_DualTool.ironRod), new ItemStack(mod_DualTool.axeGoldhead), new ItemStack(mod_DualTool.smithhammerStone,1, OreDictionary.WILDCARD_VALUE));
        GameRegistry.addShapelessRecipe(new ItemStack(mod_DualTool.pickhoeGold), new ItemStack(mod_DualTool.pickaxeGoldhead), new ItemStack(mod_DualTool.ironRod), new ItemStack(mod_DualTool.hoeGoldhead), new ItemStack(mod_DualTool.smithhammerStone,1, OreDictionary.WILDCARD_VALUE));
        GameRegistry.addShapelessRecipe(new ItemStack(mod_DualTool.pickshovelGold), new ItemStack(mod_DualTool.pickaxeGoldhead), new ItemStack(mod_DualTool.ironRod), new ItemStack(mod_DualTool.shovelGoldhead), new ItemStack(mod_DualTool.smithhammerStone,1, OreDictionary.WILDCARD_VALUE));
        GameRegistry.addShapelessRecipe(new ItemStack(mod_DualTool.pickswordGold), new ItemStack(mod_DualTool.pickaxeGoldhead), new ItemStack(mod_DualTool.ironRod), new ItemStack(mod_DualTool.swordGoldhead), new ItemStack(mod_DualTool.smithhammerStone,1, OreDictionary.WILDCARD_VALUE));
        GameRegistry.addShapelessRecipe(new ItemStack(mod_DualTool.shovelaxeGold), new ItemStack(mod_DualTool.axeGoldhead), new ItemStack(mod_DualTool.ironRod), new ItemStack(mod_DualTool.shovelGoldhead), new ItemStack(mod_DualTool.smithhammerStone,1, OreDictionary.WILDCARD_VALUE));
        GameRegistry.addShapelessRecipe(new ItemStack(mod_DualTool.shovelhoeGold), new ItemStack(mod_DualTool.hoeGoldhead), new ItemStack(mod_DualTool.ironRod), new ItemStack(mod_DualTool.shovelGoldhead), new ItemStack(mod_DualTool.smithhammerStone,1, OreDictionary.WILDCARD_VALUE));
        GameRegistry.addShapelessRecipe(new ItemStack(mod_DualTool.shovelswordGold), new ItemStack(mod_DualTool.swordGoldhead), new ItemStack(mod_DualTool.ironRod), new ItemStack(mod_DualTool.shovelGoldhead), new ItemStack(mod_DualTool.smithhammerStone,1, OreDictionary.WILDCARD_VALUE));
        GameRegistry.addShapelessRecipe(new ItemStack(mod_DualTool.swordaxeGold), new ItemStack(mod_DualTool.axeGoldhead), new ItemStack(mod_DualTool.ironRod), new ItemStack(mod_DualTool.swordGoldhead), new ItemStack(mod_DualTool.smithhammerStone,1, OreDictionary.WILDCARD_VALUE));

        GameRegistry.addShapelessRecipe(new ItemStack(mod_DualTool.hoeaxeIron), new ItemStack(mod_DualTool.axeIronhead), new ItemStack(mod_DualTool.ironRod), new ItemStack(mod_DualTool.hoeIronhead), new ItemStack(mod_DualTool.smithhammerStone,1, OreDictionary.WILDCARD_VALUE));
        GameRegistry.addShapelessRecipe(new ItemStack(mod_DualTool.hoeswordIron), new ItemStack(mod_DualTool.hoeIronhead), new ItemStack(mod_DualTool.ironRod), new ItemStack(mod_DualTool.swordIronhead), new ItemStack(mod_DualTool.smithhammerStone,1, OreDictionary.WILDCARD_VALUE));
        GameRegistry.addShapelessRecipe(new ItemStack(mod_DualTool.pickaxeIron), new ItemStack(mod_DualTool.pickaxeIronhead), new ItemStack(mod_DualTool.ironRod), new ItemStack(mod_DualTool.axeIronhead), new ItemStack(mod_DualTool.smithhammerStone,1, OreDictionary.WILDCARD_VALUE));
        GameRegistry.addShapelessRecipe(new ItemStack(mod_DualTool.pickhoeIron), new ItemStack(mod_DualTool.pickaxeIronhead), new ItemStack(mod_DualTool.ironRod), new ItemStack(mod_DualTool.hoeIronhead), new ItemStack(mod_DualTool.smithhammerStone,1, OreDictionary.WILDCARD_VALUE));
        GameRegistry.addShapelessRecipe(new ItemStack(mod_DualTool.pickshovelIron), new ItemStack(mod_DualTool.pickaxeIronhead), new ItemStack(mod_DualTool.ironRod), new ItemStack(mod_DualTool.shovelIronhead), new ItemStack(mod_DualTool.smithhammerStone,1, OreDictionary.WILDCARD_VALUE));
        GameRegistry.addShapelessRecipe(new ItemStack(mod_DualTool.pickswordIron), new ItemStack(mod_DualTool.pickaxeIronhead), new ItemStack(mod_DualTool.ironRod), new ItemStack(mod_DualTool.swordIronhead), new ItemStack(mod_DualTool.smithhammerStone,1, OreDictionary.WILDCARD_VALUE));
        GameRegistry.addShapelessRecipe(new ItemStack(mod_DualTool.shovelaxeIron), new ItemStack(mod_DualTool.axeIronhead), new ItemStack(mod_DualTool.ironRod), new ItemStack(mod_DualTool.shovelIronhead), new ItemStack(mod_DualTool.smithhammerStone,1, OreDictionary.WILDCARD_VALUE));
        GameRegistry.addShapelessRecipe(new ItemStack(mod_DualTool.shovelhoeIron), new ItemStack(mod_DualTool.hoeIronhead), new ItemStack(mod_DualTool.ironRod), new ItemStack(mod_DualTool.shovelIronhead), new ItemStack(mod_DualTool.smithhammerStone,1, OreDictionary.WILDCARD_VALUE));
        GameRegistry.addShapelessRecipe(new ItemStack(mod_DualTool.shovelswordIron), new ItemStack(mod_DualTool.swordIronhead), new ItemStack(mod_DualTool.ironRod), new ItemStack(mod_DualTool.shovelIronhead), new ItemStack(mod_DualTool.smithhammerStone,1, OreDictionary.WILDCARD_VALUE));
        GameRegistry.addShapelessRecipe(new ItemStack(mod_DualTool.swordaxeIron), new ItemStack(mod_DualTool.axeIronhead), new ItemStack(mod_DualTool.ironRod), new ItemStack(mod_DualTool.swordIronhead), new ItemStack(mod_DualTool.smithhammerStone,1, OreDictionary.WILDCARD_VALUE));
    
        GameRegistry.addShapelessRecipe(new ItemStack(mod_DualTool.hoeaxeStone), new ItemStack(mod_DualTool.axeStonehead), new ItemStack(mod_DualTool.ironRod), new ItemStack(mod_DualTool.hoeStonehead), new ItemStack(mod_DualTool.smithhammerStone,1, OreDictionary.WILDCARD_VALUE));
        GameRegistry.addShapelessRecipe(new ItemStack(mod_DualTool.hoeswordStone), new ItemStack(mod_DualTool.hoeStonehead), new ItemStack(mod_DualTool.ironRod), new ItemStack(mod_DualTool.swordStonehead), new ItemStack(mod_DualTool.smithhammerStone,1, OreDictionary.WILDCARD_VALUE));
        GameRegistry.addShapelessRecipe(new ItemStack(mod_DualTool.pickaxeStone), new ItemStack(mod_DualTool.pickaxeStonehead), new ItemStack(mod_DualTool.ironRod), new ItemStack(mod_DualTool.axeStonehead), new ItemStack(mod_DualTool.smithhammerStone,1, OreDictionary.WILDCARD_VALUE));
        GameRegistry.addShapelessRecipe(new ItemStack(mod_DualTool.pickhoeStone), new ItemStack(mod_DualTool.pickaxeStonehead), new ItemStack(mod_DualTool.ironRod), new ItemStack(mod_DualTool.hoeStonehead), new ItemStack(mod_DualTool.smithhammerStone,1, OreDictionary.WILDCARD_VALUE));
        GameRegistry.addShapelessRecipe(new ItemStack(mod_DualTool.pickshovelStone), new ItemStack(mod_DualTool.pickaxeStonehead), new ItemStack(mod_DualTool.ironRod), new ItemStack(mod_DualTool.shovelStonehead), new ItemStack(mod_DualTool.smithhammerStone,1, OreDictionary.WILDCARD_VALUE));
        GameRegistry.addShapelessRecipe(new ItemStack(mod_DualTool.pickswordStone), new ItemStack(mod_DualTool.pickaxeStonehead), new ItemStack(mod_DualTool.ironRod), new ItemStack(mod_DualTool.swordStonehead), new ItemStack(mod_DualTool.smithhammerStone,1, OreDictionary.WILDCARD_VALUE));
        GameRegistry.addShapelessRecipe(new ItemStack(mod_DualTool.shovelaxeStone), new ItemStack(mod_DualTool.axeStonehead), new ItemStack(mod_DualTool.ironRod), new ItemStack(mod_DualTool.shovelStonehead), new ItemStack(mod_DualTool.smithhammerStone,1, OreDictionary.WILDCARD_VALUE));
        GameRegistry.addShapelessRecipe(new ItemStack(mod_DualTool.shovelhoeStone), new ItemStack(mod_DualTool.hoeStonehead), new ItemStack(mod_DualTool.ironRod), new ItemStack(mod_DualTool.shovelStonehead), new ItemStack(mod_DualTool.smithhammerStone,1, OreDictionary.WILDCARD_VALUE));
        GameRegistry.addShapelessRecipe(new ItemStack(mod_DualTool.shovelswordStone), new ItemStack(mod_DualTool.swordStonehead), new ItemStack(mod_DualTool.ironRod), new ItemStack(mod_DualTool.shovelStonehead), new ItemStack(mod_DualTool.smithhammerStone,1, OreDictionary.WILDCARD_VALUE));
        GameRegistry.addShapelessRecipe(new ItemStack(mod_DualTool.swordaxeStone), new ItemStack(mod_DualTool.axeStonehead), new ItemStack(mod_DualTool.ironRod), new ItemStack(mod_DualTool.swordStonehead), new ItemStack(mod_DualTool.smithhammerStone,1, OreDictionary.WILDCARD_VALUE));
    
        //iron
        
        GameRegistry.addShapelessRecipe(new ItemStack(mod_DualTool.hoeaxeDiamond), new ItemStack(mod_DualTool.axeDiamondhead), new ItemStack(mod_DualTool.ironRod), new ItemStack(mod_DualTool.hoeDiamondhead), new ItemStack(mod_DualTool.smithhammerIron,1, OreDictionary.WILDCARD_VALUE));
        GameRegistry.addShapelessRecipe(new ItemStack(mod_DualTool.hoeswordDiamond), new ItemStack(mod_DualTool.hoeDiamondhead), new ItemStack(mod_DualTool.ironRod), new ItemStack(mod_DualTool.swordDiamondhead), new ItemStack(mod_DualTool.smithhammerIron,1, OreDictionary.WILDCARD_VALUE));
        GameRegistry.addShapelessRecipe(new ItemStack(mod_DualTool.pickaxeDiamond), new ItemStack(mod_DualTool.pickaxeDiamondhead), new ItemStack(mod_DualTool.ironRod), new ItemStack(mod_DualTool.axeDiamondhead), new ItemStack(mod_DualTool.smithhammerIron,1, OreDictionary.WILDCARD_VALUE));
        GameRegistry.addShapelessRecipe(new ItemStack(mod_DualTool.pickhoeDiamond), new ItemStack(mod_DualTool.pickaxeDiamondhead), new ItemStack(mod_DualTool.ironRod), new ItemStack(mod_DualTool.hoeDiamondhead), new ItemStack(mod_DualTool.smithhammerIron,1, OreDictionary.WILDCARD_VALUE));
        GameRegistry.addShapelessRecipe(new ItemStack(mod_DualTool.pickshovelDiamond), new ItemStack(mod_DualTool.pickaxeDiamondhead), new ItemStack(mod_DualTool.ironRod), new ItemStack(mod_DualTool.shovelDiamondhead), new ItemStack(mod_DualTool.smithhammerIron,1, OreDictionary.WILDCARD_VALUE));
        GameRegistry.addShapelessRecipe(new ItemStack(mod_DualTool.pickswordDiamond), new ItemStack(mod_DualTool.pickaxeDiamondhead), new ItemStack(mod_DualTool.ironRod), new ItemStack(mod_DualTool.swordDiamondhead), new ItemStack(mod_DualTool.smithhammerIron,1, OreDictionary.WILDCARD_VALUE));
        GameRegistry.addShapelessRecipe(new ItemStack(mod_DualTool.shovelaxeDiamond), new ItemStack(mod_DualTool.axeDiamondhead), new ItemStack(mod_DualTool.ironRod), new ItemStack(mod_DualTool.shovelDiamondhead), new ItemStack(mod_DualTool.smithhammerIron,1, OreDictionary.WILDCARD_VALUE));
        GameRegistry.addShapelessRecipe(new ItemStack(mod_DualTool.shovelhoeDiamond), new ItemStack(mod_DualTool.hoeDiamondhead), new ItemStack(mod_DualTool.ironRod), new ItemStack(mod_DualTool.shovelDiamondhead), new ItemStack(mod_DualTool.smithhammerIron,1, OreDictionary.WILDCARD_VALUE));
        GameRegistry.addShapelessRecipe(new ItemStack(mod_DualTool.shovelswordDiamond), new ItemStack(mod_DualTool.swordDiamondhead), new ItemStack(mod_DualTool.ironRod), new ItemStack(mod_DualTool.shovelDiamondhead), new ItemStack(mod_DualTool.smithhammerIron,1, OreDictionary.WILDCARD_VALUE));
        GameRegistry.addShapelessRecipe(new ItemStack(mod_DualTool.swordaxeDiamond), new ItemStack(mod_DualTool.axeDiamondhead), new ItemStack(mod_DualTool.ironRod), new ItemStack(mod_DualTool.swordDiamondhead), new ItemStack(mod_DualTool.smithhammerIron,1, OreDictionary.WILDCARD_VALUE));

        GameRegistry.addShapelessRecipe(new ItemStack(mod_DualTool.hoeaxeGold), new ItemStack(mod_DualTool.axeGoldhead), new ItemStack(mod_DualTool.ironRod), new ItemStack(mod_DualTool.hoeGoldhead), new ItemStack(mod_DualTool.smithhammerIron,1, OreDictionary.WILDCARD_VALUE));
        GameRegistry.addShapelessRecipe(new ItemStack(mod_DualTool.hoeswordGold), new ItemStack(mod_DualTool.hoeGoldhead), new ItemStack(mod_DualTool.ironRod), new ItemStack(mod_DualTool.swordGoldhead), new ItemStack(mod_DualTool.smithhammerIron,1, OreDictionary.WILDCARD_VALUE));
        GameRegistry.addShapelessRecipe(new ItemStack(mod_DualTool.pickaxeGold), new ItemStack(mod_DualTool.pickaxeGoldhead), new ItemStack(mod_DualTool.ironRod), new ItemStack(mod_DualTool.axeGoldhead), new ItemStack(mod_DualTool.smithhammerIron,1, OreDictionary.WILDCARD_VALUE));
        GameRegistry.addShapelessRecipe(new ItemStack(mod_DualTool.pickhoeGold), new ItemStack(mod_DualTool.pickaxeGoldhead), new ItemStack(mod_DualTool.ironRod), new ItemStack(mod_DualTool.hoeGoldhead), new ItemStack(mod_DualTool.smithhammerIron,1, OreDictionary.WILDCARD_VALUE));
        GameRegistry.addShapelessRecipe(new ItemStack(mod_DualTool.pickshovelGold), new ItemStack(mod_DualTool.pickaxeGoldhead), new ItemStack(mod_DualTool.ironRod), new ItemStack(mod_DualTool.shovelGoldhead), new ItemStack(mod_DualTool.smithhammerIron,1, OreDictionary.WILDCARD_VALUE));
        GameRegistry.addShapelessRecipe(new ItemStack(mod_DualTool.pickswordGold), new ItemStack(mod_DualTool.pickaxeGoldhead), new ItemStack(mod_DualTool.ironRod), new ItemStack(mod_DualTool.swordGoldhead), new ItemStack(mod_DualTool.smithhammerIron,1, OreDictionary.WILDCARD_VALUE));
        GameRegistry.addShapelessRecipe(new ItemStack(mod_DualTool.shovelaxeGold), new ItemStack(mod_DualTool.axeGoldhead), new ItemStack(mod_DualTool.ironRod), new ItemStack(mod_DualTool.shovelGoldhead), new ItemStack(mod_DualTool.smithhammerIron,1, OreDictionary.WILDCARD_VALUE));
        GameRegistry.addShapelessRecipe(new ItemStack(mod_DualTool.shovelhoeGold), new ItemStack(mod_DualTool.hoeGoldhead), new ItemStack(mod_DualTool.ironRod), new ItemStack(mod_DualTool.shovelGoldhead), new ItemStack(mod_DualTool.smithhammerIron,1, OreDictionary.WILDCARD_VALUE));
        GameRegistry.addShapelessRecipe(new ItemStack(mod_DualTool.shovelswordGold), new ItemStack(mod_DualTool.swordGoldhead), new ItemStack(mod_DualTool.ironRod), new ItemStack(mod_DualTool.shovelGoldhead), new ItemStack(mod_DualTool.smithhammerIron,1, OreDictionary.WILDCARD_VALUE));
        GameRegistry.addShapelessRecipe(new ItemStack(mod_DualTool.swordaxeGold), new ItemStack(mod_DualTool.axeGoldhead), new ItemStack(mod_DualTool.ironRod), new ItemStack(mod_DualTool.swordGoldhead), new ItemStack(mod_DualTool.smithhammerIron,1, OreDictionary.WILDCARD_VALUE));

        GameRegistry.addShapelessRecipe(new ItemStack(mod_DualTool.hoeaxeIron), new ItemStack(mod_DualTool.axeIronhead), new ItemStack(mod_DualTool.ironRod), new ItemStack(mod_DualTool.hoeIronhead), new ItemStack(mod_DualTool.smithhammerIron,1, OreDictionary.WILDCARD_VALUE));
        GameRegistry.addShapelessRecipe(new ItemStack(mod_DualTool.hoeswordIron), new ItemStack(mod_DualTool.hoeIronhead), new ItemStack(mod_DualTool.ironRod), new ItemStack(mod_DualTool.swordIronhead), new ItemStack(mod_DualTool.smithhammerIron,1, OreDictionary.WILDCARD_VALUE));
        GameRegistry.addShapelessRecipe(new ItemStack(mod_DualTool.pickaxeIron), new ItemStack(mod_DualTool.pickaxeIronhead), new ItemStack(mod_DualTool.ironRod), new ItemStack(mod_DualTool.axeIronhead), new ItemStack(mod_DualTool.smithhammerIron,1, OreDictionary.WILDCARD_VALUE));
        GameRegistry.addShapelessRecipe(new ItemStack(mod_DualTool.pickhoeIron), new ItemStack(mod_DualTool.pickaxeIronhead), new ItemStack(mod_DualTool.ironRod), new ItemStack(mod_DualTool.hoeIronhead), new ItemStack(mod_DualTool.smithhammerIron,1, OreDictionary.WILDCARD_VALUE));
        GameRegistry.addShapelessRecipe(new ItemStack(mod_DualTool.pickshovelIron), new ItemStack(mod_DualTool.pickaxeIronhead), new ItemStack(mod_DualTool.ironRod), new ItemStack(mod_DualTool.shovelIronhead), new ItemStack(mod_DualTool.smithhammerIron,1, OreDictionary.WILDCARD_VALUE));
        GameRegistry.addShapelessRecipe(new ItemStack(mod_DualTool.pickswordIron), new ItemStack(mod_DualTool.pickaxeIronhead), new ItemStack(mod_DualTool.ironRod), new ItemStack(mod_DualTool.swordIronhead), new ItemStack(mod_DualTool.smithhammerIron,1, OreDictionary.WILDCARD_VALUE));
        GameRegistry.addShapelessRecipe(new ItemStack(mod_DualTool.shovelaxeIron), new ItemStack(mod_DualTool.axeIronhead), new ItemStack(mod_DualTool.ironRod), new ItemStack(mod_DualTool.shovelIronhead), new ItemStack(mod_DualTool.smithhammerIron,1, OreDictionary.WILDCARD_VALUE));
        GameRegistry.addShapelessRecipe(new ItemStack(mod_DualTool.shovelhoeIron), new ItemStack(mod_DualTool.hoeIronhead), new ItemStack(mod_DualTool.ironRod), new ItemStack(mod_DualTool.shovelIronhead), new ItemStack(mod_DualTool.smithhammerIron,1, OreDictionary.WILDCARD_VALUE));
        GameRegistry.addShapelessRecipe(new ItemStack(mod_DualTool.shovelswordIron), new ItemStack(mod_DualTool.swordIronhead), new ItemStack(mod_DualTool.ironRod), new ItemStack(mod_DualTool.shovelIronhead), new ItemStack(mod_DualTool.smithhammerIron,1, OreDictionary.WILDCARD_VALUE));
        GameRegistry.addShapelessRecipe(new ItemStack(mod_DualTool.swordaxeIron), new ItemStack(mod_DualTool.axeIronhead), new ItemStack(mod_DualTool.ironRod), new ItemStack(mod_DualTool.swordIronhead), new ItemStack(mod_DualTool.smithhammerIron,1, OreDictionary.WILDCARD_VALUE));
    
        GameRegistry.addShapelessRecipe(new ItemStack(mod_DualTool.hoeaxeStone), new ItemStack(mod_DualTool.axeStonehead), new ItemStack(mod_DualTool.ironRod), new ItemStack(mod_DualTool.hoeStonehead), new ItemStack(mod_DualTool.smithhammerIron,1, OreDictionary.WILDCARD_VALUE));
        GameRegistry.addShapelessRecipe(new ItemStack(mod_DualTool.hoeswordStone), new ItemStack(mod_DualTool.hoeStonehead), new ItemStack(mod_DualTool.ironRod), new ItemStack(mod_DualTool.swordStonehead), new ItemStack(mod_DualTool.smithhammerIron,1, OreDictionary.WILDCARD_VALUE));
        GameRegistry.addShapelessRecipe(new ItemStack(mod_DualTool.pickaxeStone), new ItemStack(mod_DualTool.pickaxeStonehead), new ItemStack(mod_DualTool.ironRod), new ItemStack(mod_DualTool.axeStonehead), new ItemStack(mod_DualTool.smithhammerIron,1, OreDictionary.WILDCARD_VALUE));
        GameRegistry.addShapelessRecipe(new ItemStack(mod_DualTool.pickhoeStone), new ItemStack(mod_DualTool.pickaxeStonehead), new ItemStack(mod_DualTool.ironRod), new ItemStack(mod_DualTool.hoeStonehead), new ItemStack(mod_DualTool.smithhammerIron,1, OreDictionary.WILDCARD_VALUE));
        GameRegistry.addShapelessRecipe(new ItemStack(mod_DualTool.pickshovelStone), new ItemStack(mod_DualTool.pickaxeStonehead), new ItemStack(mod_DualTool.ironRod), new ItemStack(mod_DualTool.shovelStonehead), new ItemStack(mod_DualTool.smithhammerIron,1, OreDictionary.WILDCARD_VALUE));
        GameRegistry.addShapelessRecipe(new ItemStack(mod_DualTool.pickswordStone), new ItemStack(mod_DualTool.pickaxeStonehead), new ItemStack(mod_DualTool.ironRod), new ItemStack(mod_DualTool.swordStonehead), new ItemStack(mod_DualTool.smithhammerIron,1, OreDictionary.WILDCARD_VALUE));
        GameRegistry.addShapelessRecipe(new ItemStack(mod_DualTool.shovelaxeStone), new ItemStack(mod_DualTool.axeStonehead), new ItemStack(mod_DualTool.ironRod), new ItemStack(mod_DualTool.shovelStonehead), new ItemStack(mod_DualTool.smithhammerIron,1, OreDictionary.WILDCARD_VALUE));
        GameRegistry.addShapelessRecipe(new ItemStack(mod_DualTool.shovelhoeStone), new ItemStack(mod_DualTool.hoeStonehead), new ItemStack(mod_DualTool.ironRod), new ItemStack(mod_DualTool.shovelStonehead), new ItemStack(mod_DualTool.smithhammerIron,1, OreDictionary.WILDCARD_VALUE));
        GameRegistry.addShapelessRecipe(new ItemStack(mod_DualTool.shovelswordStone), new ItemStack(mod_DualTool.swordStonehead), new ItemStack(mod_DualTool.ironRod), new ItemStack(mod_DualTool.shovelStonehead), new ItemStack(mod_DualTool.smithhammerIron,1, OreDictionary.WILDCARD_VALUE));
        GameRegistry.addShapelessRecipe(new ItemStack(mod_DualTool.swordaxeStone), new ItemStack(mod_DualTool.axeStonehead), new ItemStack(mod_DualTool.ironRod), new ItemStack(mod_DualTool.swordStonehead), new ItemStack(mod_DualTool.smithhammerIron,1, OreDictionary.WILDCARD_VALUE));
    
        //gold
        
        GameRegistry.addShapelessRecipe(new ItemStack(mod_DualTool.hoeaxeStone), new ItemStack(mod_DualTool.axeStonehead), new ItemStack(mod_DualTool.ironRod), new ItemStack(mod_DualTool.hoeStonehead), new ItemStack(mod_DualTool.smithhammerGold,1, OreDictionary.WILDCARD_VALUE));
        GameRegistry.addShapelessRecipe(new ItemStack(mod_DualTool.hoeswordStone), new ItemStack(mod_DualTool.hoeStonehead), new ItemStack(mod_DualTool.ironRod), new ItemStack(mod_DualTool.swordStonehead), new ItemStack(mod_DualTool.smithhammerGold,1, OreDictionary.WILDCARD_VALUE));
        GameRegistry.addShapelessRecipe(new ItemStack(mod_DualTool.pickaxeStone), new ItemStack(mod_DualTool.pickaxeStonehead), new ItemStack(mod_DualTool.ironRod), new ItemStack(mod_DualTool.axeStonehead), new ItemStack(mod_DualTool.smithhammerGold,1, OreDictionary.WILDCARD_VALUE));
        GameRegistry.addShapelessRecipe(new ItemStack(mod_DualTool.pickhoeStone), new ItemStack(mod_DualTool.pickaxeStonehead), new ItemStack(mod_DualTool.ironRod), new ItemStack(mod_DualTool.hoeStonehead), new ItemStack(mod_DualTool.smithhammerGold,1, OreDictionary.WILDCARD_VALUE));
        GameRegistry.addShapelessRecipe(new ItemStack(mod_DualTool.pickshovelStone), new ItemStack(mod_DualTool.pickaxeStonehead), new ItemStack(mod_DualTool.ironRod), new ItemStack(mod_DualTool.shovelStonehead), new ItemStack(mod_DualTool.smithhammerGold,1, OreDictionary.WILDCARD_VALUE));
        GameRegistry.addShapelessRecipe(new ItemStack(mod_DualTool.pickswordStone), new ItemStack(mod_DualTool.pickaxeStonehead), new ItemStack(mod_DualTool.ironRod), new ItemStack(mod_DualTool.swordStonehead), new ItemStack(mod_DualTool.smithhammerGold,1, OreDictionary.WILDCARD_VALUE));
        GameRegistry.addShapelessRecipe(new ItemStack(mod_DualTool.shovelaxeStone), new ItemStack(mod_DualTool.axeStonehead), new ItemStack(mod_DualTool.ironRod), new ItemStack(mod_DualTool.shovelStonehead), new ItemStack(mod_DualTool.smithhammerGold,1, OreDictionary.WILDCARD_VALUE));
        GameRegistry.addShapelessRecipe(new ItemStack(mod_DualTool.shovelhoeStone), new ItemStack(mod_DualTool.hoeStonehead), new ItemStack(mod_DualTool.ironRod), new ItemStack(mod_DualTool.shovelStonehead), new ItemStack(mod_DualTool.smithhammerGold,1, OreDictionary.WILDCARD_VALUE));
        GameRegistry.addShapelessRecipe(new ItemStack(mod_DualTool.shovelswordStone), new ItemStack(mod_DualTool.swordStonehead), new ItemStack(mod_DualTool.ironRod), new ItemStack(mod_DualTool.shovelStonehead), new ItemStack(mod_DualTool.smithhammerGold,1, OreDictionary.WILDCARD_VALUE));
        GameRegistry.addShapelessRecipe(new ItemStack(mod_DualTool.swordaxeStone), new ItemStack(mod_DualTool.axeStonehead), new ItemStack(mod_DualTool.ironRod), new ItemStack(mod_DualTool.swordStonehead), new ItemStack(mod_DualTool.smithhammerGold,1, OreDictionary.WILDCARD_VALUE));
    
        //diamond
        
        GameRegistry.addShapelessRecipe(new ItemStack(mod_DualTool.hoeaxeDiamond), new ItemStack(mod_DualTool.axeDiamondhead), new ItemStack(mod_DualTool.ironRod), new ItemStack(mod_DualTool.hoeDiamondhead), new ItemStack(mod_DualTool.smithhammerDiamond,1, OreDictionary.WILDCARD_VALUE));
        GameRegistry.addShapelessRecipe(new ItemStack(mod_DualTool.hoeswordDiamond), new ItemStack(mod_DualTool.hoeDiamondhead), new ItemStack(mod_DualTool.ironRod), new ItemStack(mod_DualTool.swordDiamondhead), new ItemStack(mod_DualTool.smithhammerDiamond,1, OreDictionary.WILDCARD_VALUE));
        GameRegistry.addShapelessRecipe(new ItemStack(mod_DualTool.pickaxeDiamond), new ItemStack(mod_DualTool.pickaxeDiamondhead), new ItemStack(mod_DualTool.ironRod), new ItemStack(mod_DualTool.axeDiamondhead), new ItemStack(mod_DualTool.smithhammerDiamond,1, OreDictionary.WILDCARD_VALUE));
        GameRegistry.addShapelessRecipe(new ItemStack(mod_DualTool.pickhoeDiamond), new ItemStack(mod_DualTool.pickaxeDiamondhead), new ItemStack(mod_DualTool.ironRod), new ItemStack(mod_DualTool.hoeDiamondhead), new ItemStack(mod_DualTool.smithhammerDiamond,1, OreDictionary.WILDCARD_VALUE));
        GameRegistry.addShapelessRecipe(new ItemStack(mod_DualTool.pickshovelDiamond), new ItemStack(mod_DualTool.pickaxeDiamondhead), new ItemStack(mod_DualTool.ironRod), new ItemStack(mod_DualTool.shovelDiamondhead), new ItemStack(mod_DualTool.smithhammerDiamond,1, OreDictionary.WILDCARD_VALUE));
        GameRegistry.addShapelessRecipe(new ItemStack(mod_DualTool.pickswordDiamond), new ItemStack(mod_DualTool.pickaxeDiamondhead), new ItemStack(mod_DualTool.ironRod), new ItemStack(mod_DualTool.swordDiamondhead), new ItemStack(mod_DualTool.smithhammerDiamond,1, OreDictionary.WILDCARD_VALUE));
        GameRegistry.addShapelessRecipe(new ItemStack(mod_DualTool.shovelaxeDiamond), new ItemStack(mod_DualTool.axeDiamondhead), new ItemStack(mod_DualTool.ironRod), new ItemStack(mod_DualTool.shovelDiamondhead), new ItemStack(mod_DualTool.smithhammerDiamond,1, OreDictionary.WILDCARD_VALUE));
        GameRegistry.addShapelessRecipe(new ItemStack(mod_DualTool.shovelhoeDiamond), new ItemStack(mod_DualTool.hoeDiamondhead), new ItemStack(mod_DualTool.ironRod), new ItemStack(mod_DualTool.shovelDiamondhead), new ItemStack(mod_DualTool.smithhammerDiamond,1, OreDictionary.WILDCARD_VALUE));
        GameRegistry.addShapelessRecipe(new ItemStack(mod_DualTool.shovelswordDiamond), new ItemStack(mod_DualTool.swordDiamondhead), new ItemStack(mod_DualTool.ironRod), new ItemStack(mod_DualTool.shovelDiamondhead), new ItemStack(mod_DualTool.smithhammerDiamond,1, OreDictionary.WILDCARD_VALUE));
        GameRegistry.addShapelessRecipe(new ItemStack(mod_DualTool.swordaxeDiamond), new ItemStack(mod_DualTool.axeDiamondhead), new ItemStack(mod_DualTool.ironRod), new ItemStack(mod_DualTool.swordDiamondhead), new ItemStack(mod_DualTool.smithhammerDiamond,1, OreDictionary.WILDCARD_VALUE));

        GameRegistry.addShapelessRecipe(new ItemStack(mod_DualTool.hoeaxeGold), new ItemStack(mod_DualTool.axeGoldhead), new ItemStack(mod_DualTool.ironRod), new ItemStack(mod_DualTool.hoeGoldhead), new ItemStack(mod_DualTool.smithhammerDiamond,1, OreDictionary.WILDCARD_VALUE));
        GameRegistry.addShapelessRecipe(new ItemStack(mod_DualTool.hoeswordGold), new ItemStack(mod_DualTool.hoeGoldhead), new ItemStack(mod_DualTool.ironRod), new ItemStack(mod_DualTool.swordGoldhead), new ItemStack(mod_DualTool.smithhammerDiamond,1, OreDictionary.WILDCARD_VALUE));
        GameRegistry.addShapelessRecipe(new ItemStack(mod_DualTool.pickaxeGold), new ItemStack(mod_DualTool.pickaxeGoldhead), new ItemStack(mod_DualTool.ironRod), new ItemStack(mod_DualTool.axeGoldhead), new ItemStack(mod_DualTool.smithhammerDiamond,1, OreDictionary.WILDCARD_VALUE));
        GameRegistry.addShapelessRecipe(new ItemStack(mod_DualTool.pickhoeGold), new ItemStack(mod_DualTool.pickaxeGoldhead), new ItemStack(mod_DualTool.ironRod), new ItemStack(mod_DualTool.hoeGoldhead), new ItemStack(mod_DualTool.smithhammerDiamond,1, OreDictionary.WILDCARD_VALUE));
        GameRegistry.addShapelessRecipe(new ItemStack(mod_DualTool.pickshovelGold), new ItemStack(mod_DualTool.pickaxeGoldhead), new ItemStack(mod_DualTool.ironRod), new ItemStack(mod_DualTool.shovelGoldhead), new ItemStack(mod_DualTool.smithhammerDiamond,1, OreDictionary.WILDCARD_VALUE));
        GameRegistry.addShapelessRecipe(new ItemStack(mod_DualTool.pickswordGold), new ItemStack(mod_DualTool.pickaxeGoldhead), new ItemStack(mod_DualTool.ironRod), new ItemStack(mod_DualTool.swordGoldhead), new ItemStack(mod_DualTool.smithhammerDiamond,1, OreDictionary.WILDCARD_VALUE));
        GameRegistry.addShapelessRecipe(new ItemStack(mod_DualTool.shovelaxeGold), new ItemStack(mod_DualTool.axeGoldhead), new ItemStack(mod_DualTool.ironRod), new ItemStack(mod_DualTool.shovelGoldhead), new ItemStack(mod_DualTool.smithhammerDiamond,1, OreDictionary.WILDCARD_VALUE));
        GameRegistry.addShapelessRecipe(new ItemStack(mod_DualTool.shovelhoeGold), new ItemStack(mod_DualTool.hoeGoldhead), new ItemStack(mod_DualTool.ironRod), new ItemStack(mod_DualTool.shovelGoldhead), new ItemStack(mod_DualTool.smithhammerDiamond,1, OreDictionary.WILDCARD_VALUE));
        GameRegistry.addShapelessRecipe(new ItemStack(mod_DualTool.shovelswordGold), new ItemStack(mod_DualTool.swordGoldhead), new ItemStack(mod_DualTool.ironRod), new ItemStack(mod_DualTool.shovelGoldhead), new ItemStack(mod_DualTool.smithhammerDiamond,1, OreDictionary.WILDCARD_VALUE));
        GameRegistry.addShapelessRecipe(new ItemStack(mod_DualTool.swordaxeGold), new ItemStack(mod_DualTool.axeGoldhead), new ItemStack(mod_DualTool.ironRod), new ItemStack(mod_DualTool.swordGoldhead), new ItemStack(mod_DualTool.smithhammerDiamond,1, OreDictionary.WILDCARD_VALUE));

        GameRegistry.addShapelessRecipe(new ItemStack(mod_DualTool.hoeaxeIron), new ItemStack(mod_DualTool.axeIronhead), new ItemStack(mod_DualTool.ironRod), new ItemStack(mod_DualTool.hoeIronhead), new ItemStack(mod_DualTool.smithhammerDiamond,1, OreDictionary.WILDCARD_VALUE));
        GameRegistry.addShapelessRecipe(new ItemStack(mod_DualTool.hoeswordIron), new ItemStack(mod_DualTool.hoeIronhead), new ItemStack(mod_DualTool.ironRod), new ItemStack(mod_DualTool.swordIronhead), new ItemStack(mod_DualTool.smithhammerDiamond,1, OreDictionary.WILDCARD_VALUE));
        GameRegistry.addShapelessRecipe(new ItemStack(mod_DualTool.pickaxeIron), new ItemStack(mod_DualTool.pickaxeIronhead), new ItemStack(mod_DualTool.ironRod), new ItemStack(mod_DualTool.axeIronhead), new ItemStack(mod_DualTool.smithhammerDiamond,1, OreDictionary.WILDCARD_VALUE));
        GameRegistry.addShapelessRecipe(new ItemStack(mod_DualTool.pickhoeIron), new ItemStack(mod_DualTool.pickaxeIronhead), new ItemStack(mod_DualTool.ironRod), new ItemStack(mod_DualTool.hoeIronhead), new ItemStack(mod_DualTool.smithhammerDiamond,1, OreDictionary.WILDCARD_VALUE));
        GameRegistry.addShapelessRecipe(new ItemStack(mod_DualTool.pickshovelIron), new ItemStack(mod_DualTool.pickaxeIronhead), new ItemStack(mod_DualTool.ironRod), new ItemStack(mod_DualTool.shovelIronhead), new ItemStack(mod_DualTool.smithhammerDiamond,1, OreDictionary.WILDCARD_VALUE));
        GameRegistry.addShapelessRecipe(new ItemStack(mod_DualTool.pickswordIron), new ItemStack(mod_DualTool.pickaxeIronhead), new ItemStack(mod_DualTool.ironRod), new ItemStack(mod_DualTool.swordIronhead), new ItemStack(mod_DualTool.smithhammerDiamond,1, OreDictionary.WILDCARD_VALUE));
        GameRegistry.addShapelessRecipe(new ItemStack(mod_DualTool.shovelaxeIron), new ItemStack(mod_DualTool.axeIronhead), new ItemStack(mod_DualTool.ironRod), new ItemStack(mod_DualTool.shovelIronhead), new ItemStack(mod_DualTool.smithhammerDiamond,1, OreDictionary.WILDCARD_VALUE));
        GameRegistry.addShapelessRecipe(new ItemStack(mod_DualTool.shovelhoeIron), new ItemStack(mod_DualTool.hoeIronhead), new ItemStack(mod_DualTool.ironRod), new ItemStack(mod_DualTool.shovelIronhead), new ItemStack(mod_DualTool.smithhammerDiamond,1, OreDictionary.WILDCARD_VALUE));
        GameRegistry.addShapelessRecipe(new ItemStack(mod_DualTool.shovelswordIron), new ItemStack(mod_DualTool.swordIronhead), new ItemStack(mod_DualTool.ironRod), new ItemStack(mod_DualTool.shovelIronhead), new ItemStack(mod_DualTool.smithhammerDiamond,1, OreDictionary.WILDCARD_VALUE));
        GameRegistry.addShapelessRecipe(new ItemStack(mod_DualTool.swordaxeIron), new ItemStack(mod_DualTool.axeIronhead), new ItemStack(mod_DualTool.ironRod), new ItemStack(mod_DualTool.swordIronhead), new ItemStack(mod_DualTool.smithhammerDiamond,1, OreDictionary.WILDCARD_VALUE));
    
        GameRegistry.addShapelessRecipe(new ItemStack(mod_DualTool.hoeaxeStone), new ItemStack(mod_DualTool.axeStonehead), new ItemStack(mod_DualTool.ironRod), new ItemStack(mod_DualTool.hoeStonehead), new ItemStack(mod_DualTool.smithhammerDiamond,1, OreDictionary.WILDCARD_VALUE));
        GameRegistry.addShapelessRecipe(new ItemStack(mod_DualTool.hoeswordStone), new ItemStack(mod_DualTool.hoeStonehead), new ItemStack(mod_DualTool.ironRod), new ItemStack(mod_DualTool.swordStonehead), new ItemStack(mod_DualTool.smithhammerDiamond,1, OreDictionary.WILDCARD_VALUE));
        GameRegistry.addShapelessRecipe(new ItemStack(mod_DualTool.pickaxeStone), new ItemStack(mod_DualTool.pickaxeStonehead), new ItemStack(mod_DualTool.ironRod), new ItemStack(mod_DualTool.axeStonehead), new ItemStack(mod_DualTool.smithhammerDiamond,1, OreDictionary.WILDCARD_VALUE));
        GameRegistry.addShapelessRecipe(new ItemStack(mod_DualTool.pickhoeStone), new ItemStack(mod_DualTool.pickaxeStonehead), new ItemStack(mod_DualTool.ironRod), new ItemStack(mod_DualTool.hoeStonehead), new ItemStack(mod_DualTool.smithhammerDiamond,1, OreDictionary.WILDCARD_VALUE));
        GameRegistry.addShapelessRecipe(new ItemStack(mod_DualTool.pickshovelStone), new ItemStack(mod_DualTool.pickaxeStonehead), new ItemStack(mod_DualTool.ironRod), new ItemStack(mod_DualTool.shovelStonehead), new ItemStack(mod_DualTool.smithhammerDiamond,1, OreDictionary.WILDCARD_VALUE));
        GameRegistry.addShapelessRecipe(new ItemStack(mod_DualTool.pickswordStone), new ItemStack(mod_DualTool.pickaxeStonehead), new ItemStack(mod_DualTool.ironRod), new ItemStack(mod_DualTool.swordStonehead), new ItemStack(mod_DualTool.smithhammerDiamond,1, OreDictionary.WILDCARD_VALUE));
        GameRegistry.addShapelessRecipe(new ItemStack(mod_DualTool.shovelaxeStone), new ItemStack(mod_DualTool.axeStonehead), new ItemStack(mod_DualTool.ironRod), new ItemStack(mod_DualTool.shovelStonehead), new ItemStack(mod_DualTool.smithhammerDiamond,1, OreDictionary.WILDCARD_VALUE));
        GameRegistry.addShapelessRecipe(new ItemStack(mod_DualTool.shovelhoeStone), new ItemStack(mod_DualTool.hoeStonehead), new ItemStack(mod_DualTool.ironRod), new ItemStack(mod_DualTool.shovelStonehead), new ItemStack(mod_DualTool.smithhammerDiamond,1, OreDictionary.WILDCARD_VALUE));
        GameRegistry.addShapelessRecipe(new ItemStack(mod_DualTool.shovelswordStone), new ItemStack(mod_DualTool.swordStonehead), new ItemStack(mod_DualTool.ironRod), new ItemStack(mod_DualTool.shovelStonehead), new ItemStack(mod_DualTool.smithhammerDiamond,1, OreDictionary.WILDCARD_VALUE));
        GameRegistry.addShapelessRecipe(new ItemStack(mod_DualTool.swordaxeStone), new ItemStack(mod_DualTool.axeStonehead), new ItemStack(mod_DualTool.ironRod), new ItemStack(mod_DualTool.swordStonehead), new ItemStack(mod_DualTool.smithhammerDiamond,1, OreDictionary.WILDCARD_VALUE));
    
    }

    private void toolheadrecipes()
    {
    	
    	//wood
    	
    	//stone
        
        GameRegistry.addShapelessRecipe(new ItemStack(mod_DualTool.shovelGoldhead), new ItemStack(Item.ingotGold), new ItemStack(mod_DualTool.smithhammerStone,1, OreDictionary.WILDCARD_VALUE));
        GameRegistry.addRecipe(new ItemStack(mod_DualTool.pickaxeGoldhead), new Object[]
                {
                    " H ","TTT", 'T', Item.ingotGold,'H', new ItemStack(mod_DualTool.smithhammerStone,1, OreDictionary.WILDCARD_VALUE)
                });
        GameRegistry.addRecipe(new ItemStack(mod_DualTool.axeGoldhead), new Object[]
                {
                    "H ","TT", "T ", 'T', Item.ingotGold,'H', new ItemStack(mod_DualTool.smithhammerStone,1, OreDictionary.WILDCARD_VALUE)
                });
        GameRegistry.addRecipe(new ItemStack(mod_DualTool.axeGoldhead), new Object[]
                {
                    "H ","TT", " T", 'T', Item.ingotGold,'H', new ItemStack(mod_DualTool.smithhammerStone,1, OreDictionary.WILDCARD_VALUE)
                });
        GameRegistry.addRecipe(new ItemStack(mod_DualTool.hoeGoldhead), new Object[]
                {
                    "H ","TT", 'T', Item.ingotGold,'H', new ItemStack(mod_DualTool.smithhammerStone,1, OreDictionary.WILDCARD_VALUE)
                });
        GameRegistry.addRecipe(new ItemStack(mod_DualTool.swordGoldhead), new Object[]
                {
                    "H","T", "T", 'T', Item.ingotGold,'H', new ItemStack(mod_DualTool.smithhammerStone,1, OreDictionary.WILDCARD_VALUE)
                });
        
        GameRegistry.addShapelessRecipe(new ItemStack(mod_DualTool.shovelIronhead), new ItemStack(Item.ingotIron), new ItemStack(mod_DualTool.smithhammerStone,1, OreDictionary.WILDCARD_VALUE));
        GameRegistry.addRecipe(new ItemStack(mod_DualTool.pickaxeIronhead), new Object[]
                {
                    " H ","TTT", 'T', Item.ingotIron,'H', new ItemStack(mod_DualTool.smithhammerStone,1, OreDictionary.WILDCARD_VALUE)
                });
        GameRegistry.addRecipe(new ItemStack(mod_DualTool.axeIronhead), new Object[]
                {
                    "H ","TT", "T ", 'T', Item.ingotIron,'H', new ItemStack(mod_DualTool.smithhammerStone,1, OreDictionary.WILDCARD_VALUE)
                });
        GameRegistry.addRecipe(new ItemStack(mod_DualTool.axeIronhead), new Object[]
                {
        			"H ","TT", " T", 'T', Item.ingotIron,'H', new ItemStack(mod_DualTool.smithhammerStone,1, OreDictionary.WILDCARD_VALUE)
                });
        GameRegistry.addRecipe(new ItemStack(mod_DualTool.hoeIronhead), new Object[]
                {
        			"H ","TT", 'T', Item.ingotIron,'H', new ItemStack(mod_DualTool.smithhammerStone,1, OreDictionary.WILDCARD_VALUE)
                });
        GameRegistry.addRecipe(new ItemStack(mod_DualTool.swordIronhead), new Object[]
                {
        			"H","T", "T", 'T', Item.ingotIron,'H', new ItemStack(mod_DualTool.smithhammerStone,1, OreDictionary.WILDCARD_VALUE)
                });
        
        GameRegistry.addShapelessRecipe(new ItemStack(mod_DualTool.shovelStonehead), new ItemStack(Block.cobblestone), new ItemStack(mod_DualTool.smithhammerStone,1, OreDictionary.WILDCARD_VALUE));
        GameRegistry.addRecipe(new ItemStack(mod_DualTool.pickaxeStonehead), new Object[]
                {
                    " H ","TTT", 'T', Block.cobblestone,'H', new ItemStack(mod_DualTool.smithhammerStone,1, OreDictionary.WILDCARD_VALUE)
                });
        GameRegistry.addRecipe(new ItemStack(mod_DualTool.axeStonehead), new Object[]
                {
                    "H ","TT", "T ", 'T', Block.cobblestone,'H', new ItemStack(mod_DualTool.smithhammerStone,1, OreDictionary.WILDCARD_VALUE)
                });
        GameRegistry.addRecipe(new ItemStack(mod_DualTool.axeStonehead), new Object[]
                {
        			"H ","TT", " T", 'T', Block.cobblestone,'H', new ItemStack(mod_DualTool.smithhammerStone,1, OreDictionary.WILDCARD_VALUE)
                });
        GameRegistry.addRecipe(new ItemStack(mod_DualTool.hoeStonehead), new Object[]
                {
        			"H ","TT", 'T', Block.cobblestone,'H', new ItemStack(mod_DualTool.smithhammerStone,1, OreDictionary.WILDCARD_VALUE)
                });
        GameRegistry.addRecipe(new ItemStack(mod_DualTool.swordStonehead), new Object[]
                {
        			"H","T", "T", 'T', Block.cobblestone,'H', new ItemStack(mod_DualTool.smithhammerStone,1, OreDictionary.WILDCARD_VALUE)
                });
        //iron
        
        GameRegistry.addShapelessRecipe(new ItemStack(mod_DualTool.shovelDiamondhead), new ItemStack(Item.diamond), new ItemStack(mod_DualTool.smithhammerIron,1, OreDictionary.WILDCARD_VALUE));
        GameRegistry.addRecipe(new ItemStack(mod_DualTool.pickaxeDiamondhead), new Object[]
                {
                    " H ","TTT", 'T', Item.diamond,'H', new ItemStack(mod_DualTool.smithhammerIron,1, OreDictionary.WILDCARD_VALUE)
                });
        GameRegistry.addRecipe(new ItemStack(mod_DualTool.axeDiamondhead), new Object[]
                {
                    " H","TT", " T", 'T', Item.diamond,'H', new ItemStack(mod_DualTool.smithhammerIron,1, OreDictionary.WILDCARD_VALUE)
                });
        GameRegistry.addRecipe(new ItemStack(mod_DualTool.axeDiamondhead), new Object[]
                {
                    " H","TT", "T ", 'T', Item.diamond,'H', new ItemStack(mod_DualTool.smithhammerIron,1, OreDictionary.WILDCARD_VALUE)
                });
        GameRegistry.addRecipe(new ItemStack(mod_DualTool.hoeDiamondhead), new Object[]
                {
                    " H","TT", 'T', Item.diamond,'H', new ItemStack(mod_DualTool.smithhammerIron,1, OreDictionary.WILDCARD_VALUE)
                });
        GameRegistry.addRecipe(new ItemStack(mod_DualTool.swordDiamondhead), new Object[]
                {
                    "H","T", "T", 'T', Item.diamond,'H', new ItemStack(mod_DualTool.smithhammerIron,1, OreDictionary.WILDCARD_VALUE)
                });
        
        GameRegistry.addShapelessRecipe(new ItemStack(mod_DualTool.shovelGoldhead), new ItemStack(Item.ingotGold), new ItemStack(mod_DualTool.smithhammerIron,1, OreDictionary.WILDCARD_VALUE));
        GameRegistry.addRecipe(new ItemStack(mod_DualTool.pickaxeGoldhead), new Object[]
                {
                    " H ","TTT", 'T', Item.ingotGold,'H', new ItemStack(mod_DualTool.smithhammerIron,1, OreDictionary.WILDCARD_VALUE)
                });
        GameRegistry.addRecipe(new ItemStack(mod_DualTool.axeGoldhead), new Object[]
                {
                    "H ","TT", "T ", 'T', Item.ingotGold,'H', new ItemStack(mod_DualTool.smithhammerIron,1, OreDictionary.WILDCARD_VALUE)
                });
        GameRegistry.addRecipe(new ItemStack(mod_DualTool.axeGoldhead), new Object[]
                {
                    "H ","TT", " T", 'T', Item.ingotGold,'H', new ItemStack(mod_DualTool.smithhammerIron,1, OreDictionary.WILDCARD_VALUE)
                });
        GameRegistry.addRecipe(new ItemStack(mod_DualTool.hoeGoldhead), new Object[]
                {
                    "H ","TT", 'T', Item.ingotGold,'H', new ItemStack(mod_DualTool.smithhammerIron,1, OreDictionary.WILDCARD_VALUE)
                });
        GameRegistry.addRecipe(new ItemStack(mod_DualTool.swordGoldhead), new Object[]
                {
                    "H","T", "T", 'T', Item.ingotGold,'H', new ItemStack(mod_DualTool.smithhammerIron,1, OreDictionary.WILDCARD_VALUE)
                });
        
        GameRegistry.addShapelessRecipe(new ItemStack(mod_DualTool.shovelIronhead), new ItemStack(Item.ingotIron), new ItemStack(mod_DualTool.smithhammerIron,1, OreDictionary.WILDCARD_VALUE));
        GameRegistry.addRecipe(new ItemStack(mod_DualTool.pickaxeIronhead), new Object[]
                {
                    " H ","TTT", 'T', Item.ingotIron,'H', new ItemStack(mod_DualTool.smithhammerIron,1, OreDictionary.WILDCARD_VALUE)
                });
        GameRegistry.addRecipe(new ItemStack(mod_DualTool.axeIronhead), new Object[]
                {
                    "H ","TT", "T ", 'T', Item.ingotIron,'H', new ItemStack(mod_DualTool.smithhammerIron,1, OreDictionary.WILDCARD_VALUE)
                });
        GameRegistry.addRecipe(new ItemStack(mod_DualTool.axeIronhead), new Object[]
                {
        			"H ","TT", " T", 'T', Item.ingotIron,'H', new ItemStack(mod_DualTool.smithhammerIron,1, OreDictionary.WILDCARD_VALUE)
                });
        GameRegistry.addRecipe(new ItemStack(mod_DualTool.hoeIronhead), new Object[]
                {
        			"H ","TT", 'T', Item.ingotIron,'H', new ItemStack(mod_DualTool.smithhammerIron,1, OreDictionary.WILDCARD_VALUE)
                });
        GameRegistry.addRecipe(new ItemStack(mod_DualTool.swordIronhead), new Object[]
                {
        			"H","T", "T", 'T', Item.ingotIron,'H', new ItemStack(mod_DualTool.smithhammerIron,1, OreDictionary.WILDCARD_VALUE)
                });
        
        GameRegistry.addShapelessRecipe(new ItemStack(mod_DualTool.shovelStonehead), new ItemStack(Block.cobblestone), new ItemStack(mod_DualTool.smithhammerIron,1, OreDictionary.WILDCARD_VALUE));
        GameRegistry.addRecipe(new ItemStack(mod_DualTool.pickaxeStonehead), new Object[]
                {
                    " H ","TTT", 'T', Block.cobblestone,'H', new ItemStack(mod_DualTool.smithhammerIron,1, OreDictionary.WILDCARD_VALUE)
                });
        GameRegistry.addRecipe(new ItemStack(mod_DualTool.axeStonehead), new Object[]
                {
                    "H ","TT", "T ", 'T', Block.cobblestone,'H', new ItemStack(mod_DualTool.smithhammerIron,1, OreDictionary.WILDCARD_VALUE)
                });
        GameRegistry.addRecipe(new ItemStack(mod_DualTool.axeStonehead), new Object[]
                {
        			"H ","TT", " T", 'T', Block.cobblestone,'H', new ItemStack(mod_DualTool.smithhammerIron,1, OreDictionary.WILDCARD_VALUE)
                });
        GameRegistry.addRecipe(new ItemStack(mod_DualTool.hoeStonehead), new Object[]
                {
        			"H ","TT", 'T', Block.cobblestone,'H', new ItemStack(mod_DualTool.smithhammerIron,1, OreDictionary.WILDCARD_VALUE)
                });
        GameRegistry.addRecipe(new ItemStack(mod_DualTool.swordStonehead), new Object[]
                {
        			"H","T", "T", 'T', Block.cobblestone,'H', new ItemStack(mod_DualTool.smithhammerIron,1, OreDictionary.WILDCARD_VALUE)
                });
        //gold
        
        GameRegistry.addShapelessRecipe(new ItemStack(mod_DualTool.shovelStonehead), new ItemStack(Block.cobblestone), new ItemStack(mod_DualTool.smithhammerGold,1, OreDictionary.WILDCARD_VALUE));
        GameRegistry.addRecipe(new ItemStack(mod_DualTool.pickaxeStonehead), new Object[]
                {
                    " H ","TTT", 'T', Block.cobblestone,'H', new ItemStack(mod_DualTool.smithhammerGold,1, OreDictionary.WILDCARD_VALUE)
                });
        GameRegistry.addRecipe(new ItemStack(mod_DualTool.axeStonehead), new Object[]
                {
                    "H ","TT", "T ", 'T', Block.cobblestone,'H', new ItemStack(mod_DualTool.smithhammerGold,1, OreDictionary.WILDCARD_VALUE)
                });
        GameRegistry.addRecipe(new ItemStack(mod_DualTool.axeStonehead), new Object[]
                {
        			"H ","TT", " T", 'T', Block.cobblestone,'H', new ItemStack(mod_DualTool.smithhammerGold,1, OreDictionary.WILDCARD_VALUE)
                });
        GameRegistry.addRecipe(new ItemStack(mod_DualTool.hoeStonehead), new Object[]
                {
        			"H ","TT", 'T', Block.cobblestone,'H', new ItemStack(mod_DualTool.smithhammerGold,1, OreDictionary.WILDCARD_VALUE)
                });
        GameRegistry.addRecipe(new ItemStack(mod_DualTool.swordStonehead), new Object[]
                {
        			"H","T", "T", 'T', Block.cobblestone,'H', new ItemStack(mod_DualTool.smithhammerGold,1, OreDictionary.WILDCARD_VALUE)
                });
        //diamond
        
        GameRegistry.addShapelessRecipe(new ItemStack(mod_DualTool.shovelDiamondhead), new ItemStack(Item.diamond), new ItemStack(mod_DualTool.smithhammerDiamond,1, OreDictionary.WILDCARD_VALUE));
        GameRegistry.addRecipe(new ItemStack(mod_DualTool.pickaxeDiamondhead), new Object[]
                {
                    " H ","TTT", 'T', Item.diamond,'H', new ItemStack(mod_DualTool.smithhammerDiamond,1, OreDictionary.WILDCARD_VALUE)
                });
        GameRegistry.addRecipe(new ItemStack(mod_DualTool.axeDiamondhead), new Object[]
                {
                    " H","TT", " T", 'T', Item.diamond,'H', new ItemStack(mod_DualTool.smithhammerDiamond,1, OreDictionary.WILDCARD_VALUE)
                });
        GameRegistry.addRecipe(new ItemStack(mod_DualTool.axeDiamondhead), new Object[]
                {
                    " H","TT", "T ", 'T', Item.diamond,'H', new ItemStack(mod_DualTool.smithhammerDiamond,1, OreDictionary.WILDCARD_VALUE)
                });
        GameRegistry.addRecipe(new ItemStack(mod_DualTool.hoeDiamondhead), new Object[]
                {
                    " H","TT", 'T', Item.diamond,'H', new ItemStack(mod_DualTool.smithhammerDiamond,1, OreDictionary.WILDCARD_VALUE)
                });
        GameRegistry.addRecipe(new ItemStack(mod_DualTool.swordDiamondhead), new Object[]
                {
                    "H","T", "T", 'T', Item.diamond,'H', new ItemStack(mod_DualTool.smithhammerDiamond,1, OreDictionary.WILDCARD_VALUE)
                });
        
        GameRegistry.addShapelessRecipe(new ItemStack(mod_DualTool.shovelGoldhead), new ItemStack(Item.ingotGold), new ItemStack(mod_DualTool.smithhammerDiamond,1, OreDictionary.WILDCARD_VALUE));
        GameRegistry.addRecipe(new ItemStack(mod_DualTool.pickaxeGoldhead), new Object[]
                {
                    " H ","TTT", 'T', Item.ingotGold,'H', new ItemStack(mod_DualTool.smithhammerDiamond,1, OreDictionary.WILDCARD_VALUE)
                });
        GameRegistry.addRecipe(new ItemStack(mod_DualTool.axeGoldhead), new Object[]
                {
                    "H ","TT", "T ", 'T', Item.ingotGold,'H', new ItemStack(mod_DualTool.smithhammerDiamond,1, OreDictionary.WILDCARD_VALUE)
                });
        GameRegistry.addRecipe(new ItemStack(mod_DualTool.axeGoldhead), new Object[]
                {
                    "H ","TT", " T", 'T', Item.ingotGold,'H', new ItemStack(mod_DualTool.smithhammerDiamond,1, OreDictionary.WILDCARD_VALUE)
                });
        GameRegistry.addRecipe(new ItemStack(mod_DualTool.hoeGoldhead), new Object[]
                {
                    "H ","TT", 'T', Item.ingotGold,'H', new ItemStack(mod_DualTool.smithhammerDiamond,1, OreDictionary.WILDCARD_VALUE)
                });
        GameRegistry.addRecipe(new ItemStack(mod_DualTool.swordGoldhead), new Object[]
                {
                    "H","T", "T", 'T', Item.ingotGold,'H', new ItemStack(mod_DualTool.smithhammerDiamond,1, OreDictionary.WILDCARD_VALUE)
                });
        
        GameRegistry.addShapelessRecipe(new ItemStack(mod_DualTool.shovelIronhead), new ItemStack(Item.ingotIron), new ItemStack(mod_DualTool.smithhammerDiamond,1, OreDictionary.WILDCARD_VALUE));
        GameRegistry.addRecipe(new ItemStack(mod_DualTool.pickaxeIronhead), new Object[]
                {
                    " H ","TTT", 'T', Item.ingotIron,'H', new ItemStack(mod_DualTool.smithhammerDiamond,1, OreDictionary.WILDCARD_VALUE)
                });
        GameRegistry.addRecipe(new ItemStack(mod_DualTool.axeIronhead), new Object[]
                {
                    "H ","TT", "T ", 'T', Item.ingotIron,'H', new ItemStack(mod_DualTool.smithhammerDiamond,1, OreDictionary.WILDCARD_VALUE)
                });
        GameRegistry.addRecipe(new ItemStack(mod_DualTool.axeIronhead), new Object[]
                {
        			"H ","TT", " T", 'T', Item.ingotIron,'H', new ItemStack(mod_DualTool.smithhammerDiamond,1, OreDictionary.WILDCARD_VALUE)
                });
        GameRegistry.addRecipe(new ItemStack(mod_DualTool.hoeIronhead), new Object[]
                {
        			"H ","TT", 'T', Item.ingotIron,'H', new ItemStack(mod_DualTool.smithhammerDiamond,1, OreDictionary.WILDCARD_VALUE)
                });
        GameRegistry.addRecipe(new ItemStack(mod_DualTool.swordIronhead), new Object[]
                {
        			"H","T", "T", 'T', Item.ingotIron,'H', new ItemStack(mod_DualTool.smithhammerDiamond,1, OreDictionary.WILDCARD_VALUE)
                });
        
        GameRegistry.addShapelessRecipe(new ItemStack(mod_DualTool.shovelStonehead), new ItemStack(Block.cobblestone), new ItemStack(mod_DualTool.smithhammerDiamond,1, OreDictionary.WILDCARD_VALUE));
        GameRegistry.addRecipe(new ItemStack(mod_DualTool.pickaxeStonehead), new Object[]
                {
                    " H ","TTT", 'T', Block.cobblestone,'H', new ItemStack(mod_DualTool.smithhammerDiamond,1, OreDictionary.WILDCARD_VALUE)
                });
        GameRegistry.addRecipe(new ItemStack(mod_DualTool.axeStonehead), new Object[]
                {
                    "H ","TT", "T ", 'T', Block.cobblestone,'H', new ItemStack(mod_DualTool.smithhammerDiamond,1, OreDictionary.WILDCARD_VALUE)
                });
        GameRegistry.addRecipe(new ItemStack(mod_DualTool.axeStonehead), new Object[]
                {
        			"H ","TT", " T", 'T', Block.cobblestone,'H', new ItemStack(mod_DualTool.smithhammerDiamond,1, OreDictionary.WILDCARD_VALUE)
                });
        GameRegistry.addRecipe(new ItemStack(mod_DualTool.hoeStonehead), new Object[]
                {
        			"H ","TT", 'T', Block.cobblestone,'H', new ItemStack(mod_DualTool.smithhammerDiamond,1, OreDictionary.WILDCARD_VALUE)
                });
        GameRegistry.addRecipe(new ItemStack(mod_DualTool.swordStonehead), new Object[]
                {
        			"H","T", "T", 'T', Block.cobblestone,'H', new ItemStack(mod_DualTool.smithhammerDiamond,1, OreDictionary.WILDCARD_VALUE)
                });
    }

    private void newvanillarecipes()
    {
        GameRegistry.addRecipe(new ItemStack(Item.pickaxeDiamond), new Object[]
                {
                    "P", "I", "I", 'P', mod_DualTool.pickaxeDiamondhead, 'I', Item.stick
                });
        GameRegistry.addRecipe(new ItemStack(Item.axeDiamond), new Object[]
                {
                    "P", "I", "I", 'P', mod_DualTool.axeDiamondhead, 'I', Item.stick
                });
        GameRegistry.addRecipe(new ItemStack(Item.shovelDiamond), new Object[]
                {
                    "P", "I", "I", 'P', mod_DualTool.shovelDiamondhead, 'I', Item.stick
                });
        GameRegistry.addRecipe(new ItemStack(Item.swordDiamond), new Object[]
                {
                    "P", "I", 'P', mod_DualTool.swordDiamondhead, 'I', Item.stick
                });
        GameRegistry.addRecipe(new ItemStack(Item.hoeDiamond), new Object[]
                {
                    "P", "I", "I", 'P', mod_DualTool.hoeDiamondhead, 'I', Item.stick
                });
        
        GameRegistry.addRecipe(new ItemStack(Item.pickaxeGold), new Object[]
                {
                    "P", "I", "I", 'P', mod_DualTool.pickaxeGoldhead, 'I', Item.stick
                });
        GameRegistry.addRecipe(new ItemStack(Item.axeGold), new Object[]
                {
                    "P", "I", "I", 'P', mod_DualTool.axeGoldhead, 'I', Item.stick
                });
        GameRegistry.addRecipe(new ItemStack(Item.shovelGold), new Object[]
                {
                    "P", "I", "I", 'P', mod_DualTool.shovelGoldhead, 'I', Item.stick
                });
        GameRegistry.addRecipe(new ItemStack(Item.swordGold), new Object[]
                {
                    "P", "I", 'P', mod_DualTool.swordGoldhead, 'I', Item.stick
                });
        GameRegistry.addRecipe(new ItemStack(Item.hoeGold), new Object[]
                {
                    "P", "I", "I", 'P', mod_DualTool.hoeGoldhead, 'I', Item.stick
                });
        
        GameRegistry.addRecipe(new ItemStack(Item.pickaxeIron), new Object[]
                {
                    "P", "I", "I", 'P', mod_DualTool.pickaxeIronhead, 'I', Item.stick
                });
        GameRegistry.addRecipe(new ItemStack(Item.axeIron), new Object[]
                {
                    "P", "I", "I", 'P', mod_DualTool.axeIronhead, 'I', Item.stick
                });
        GameRegistry.addRecipe(new ItemStack(Item.shovelIron), new Object[]
                {
                    "P", "I", "I", 'P', mod_DualTool.shovelIronhead, 'I', Item.stick
                });
        GameRegistry.addRecipe(new ItemStack(Item.swordIron), new Object[]
                {
                    "P", "I", 'P', mod_DualTool.swordIronhead, 'I', Item.stick
                });
        GameRegistry.addRecipe(new ItemStack(Item.hoeIron), new Object[]
                {
                    "P", "I", "I", 'P', mod_DualTool.hoeIronhead, 'I', Item.stick
                });
        
        GameRegistry.addRecipe(new ItemStack(Item.pickaxeStone), new Object[]
                {
                    "P", "I", "I", 'P', mod_DualTool.pickaxeStonehead, 'I', Item.stick
                });
        GameRegistry.addRecipe(new ItemStack(Item.axeStone), new Object[]
                {
                    "P", "I", "I", 'P', mod_DualTool.axeStonehead, 'I', Item.stick
                });
        GameRegistry.addRecipe(new ItemStack(Item.shovelStone), new Object[]
                {
                    "P", "I", "I", 'P', mod_DualTool.shovelStonehead, 'I', Item.stick
                });
        GameRegistry.addRecipe(new ItemStack(Item.swordStone), new Object[]
                {
                    "P", "I", 'P', mod_DualTool.swordStonehead, 'I', Item.stick
                });
        GameRegistry.addRecipe(new ItemStack(Item.hoeStone), new Object[]
                {
                    "P", "I", "I", 'P', mod_DualTool.hoeStonehead, 'I', Item.stick
                });
    }

    @PostInit
    public void postInit(FMLPostInitializationEvent event)
    {
        // Stub Method
    }
}