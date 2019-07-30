package fr.WarzouMc.MonaiServGroup.shop.sell;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

public enum SellPerGrade {
    COBBLESTONE(0, new ItemStack(Material.COBBLESTONE), 0, "Cobble", "block", 1, 1, 1, 9600, 75),
    SEEDS(0, new ItemStack(Material.SEEDS), 0, "Graine de blé", "farm", 1, 1, 1, 6400, 90),
    WHEAT(0, new ItemStack(Material.WHEAT), 0, "Blé", "farm", 2, 1, 2, 4800, 90),
    HAY_BLOCK(0, new ItemStack(Material.HAY_BLOCK), 0, "Botte de blé", "farm", 19, 9, 3, 3200, 240),
    LEATHER(0, new ItemStack(Material.LEATHER), 0, "Cuire", "farm", 2, 1, 4, 640, 20*60),
    COAL(0, new ItemStack(Material.COAL), 0, "Charbon", "ore", 3, 1, 1, 1280, 9*60),
    STONE(1, new ItemStack(Material.STONE), 0, "Stone", "block", 5, 2, 2, 8620, 60),
    DIRT(1, new ItemStack(Material.DIRT), 0, "Terre", "block", 1, 1, 3, 11200, 70),
    CARROT(1, new ItemStack(Material.CARROT_ITEM), 0, "Carotte", "farm", 3, 1, 5, 4480, 105),
    FLINT(1, new ItemStack(Material.FLINT), 0, "Silex", "ore", 4, 2, 2, 640, 15*60),
    IRON_INGOT(1, new ItemStack(Material.IRON_INGOT), 0, "Fer", "ore", 10, 5, 3, 960, 5*60),
    CLAY_BALL(1, new ItemStack(Material.CLAY_BALL), 0, "Clay", "other", 2, 1, 1, 3840, 3*60),
    GRASS(2, new ItemStack(Material.GRASS), 0, "Herbe", "block", 6, 3, 4, 6400, 110),
    PLANK0(2, new ItemStack(Material.WOOD), 0, "Bois de chêne", "block", 1, 1, 5, 7680, 45),
    BONE(2, new ItemStack(Material.BONE), 0, "Os", "farm", 3, 1, 6, 2240, 192),
    GOLD_NUGGET(2, new ItemStack(Material.GOLD_NUGGET), 0, "Pépite d'or", "ore", 3, 1, 4, 3072,252),
    WATER_BUCKET(2, new ItemStack(Material.WATER_BUCKET), 0, "Seau d'eau", "other", 31, 15, 2, 960, 270),
    GRAVEL(3, new ItemStack(Material.GRAVEL), 0, "Gravier", "block", 2, 2, 6, 3200, 162),
    PODZOL(3, new ItemStack(Material.DIRT), 2, "Podzol", "block", 2, 1, 7, 960, 630),
    NETHER_WART(3, new ItemStack(Material.NETHER_STALK), 0, "Verrue du nether", "farm", 5, 1, 7, 6400, 108),
    MELON_SEED(3, new ItemStack(Material.MELON_SEEDS), 0, "Graine de melon", "farm", 5, 2, 8, 2560, 270),
    GUNPOWDER(3, new ItemStack(Material.SULPHUR), 0, "Poudre à canon", "other", 10, 5, 3, 640, 675),
    PLANK1(4, new ItemStack(Material.WOOD), 1, "Bois d'épicéa", "block", 2, 1, 8, 7680, 45),
    PLANK2(4, new ItemStack(Material.WOOD), 2, "Bois de bouleau", "block", 3, 1, 9, 7680, 45),
    PLANK3(4, new ItemStack(Material.WOOD), 3, "Bois de la jungle", "block", 4, 1, 10, 7680, 45),
    PLANK4(4, new ItemStack(Material.WOOD), 4, "Bois d'acacia", "block", 5, 1, 11, 7680, 45),
    PLANK5(5, new ItemStack(Material.WOOD), 5, "Bois de chêne noir", "block", 6, 1, 12, 7680, 45),
    DYE3(5, new ItemStack(Material.INK_SACK), 3, "Graine de coco", "farm", 8, 4, 9, 1600, 432),
    REEDS(5, new ItemStack(Material.SUGAR_CANE), 0, "Canne à sucre", "farm", 6, 3, 10, 1600, 432),
    SNOW_BALL(5, new ItemStack(Material.SNOW_BALL), 0, "Boule de neige", "other", 1, 0, 4, 7424, 80),
    GOLD_INGOT(6, new ItemStack(Material.GOLD_INGOT), 0, "Lingot d'or", "ore", 28, 14, 5, 3200, 270),
    EMERALD(6, new ItemStack(Material.EMERALD), 0, "Émeraude", "ore", 50, 25, 6, 640, 1620),
    PUMKIN_SEED(6, new ItemStack(Material.PUMPKIN_SEEDS), 0, "Graine de citrouille", "farm", 9, 4, 11, 2560, 270),
    POTATO(6, new ItemStack(Material.POTATO_ITEM), 0, "Patate", "farm", 9, 5, 12, 2560, 270),
    STONEBRICK(7, new ItemStack(Material.SMOOTH_BRICK), 0, "Pierre taillé", "block", 20, 10, 13, 1280, 9*60),
    MOSSYSTONEBRICK(7, new ItemStack(Material.SMOOTH_BRICK), 1, "Pierre taillé moussu", "block", 24, 12, 14, 1280, 9*60),
    BAKED_POTATO(7, new ItemStack(Material.BAKED_POTATO), 0, "Patate cuite", "farm", 10, 5, 13, 1280, 270),
    POISONOUS_POTATO(7, new ItemStack(Material.POISONOUS_POTATO), 0, "Patate empoisonnée", "farm", 20, 10, 14, 640, 675),
    CLAY_BRICK(7, new ItemStack(Material.CLAY_BRICK), 0, "Terre cuite", "other", 5, 1, 5, 3840, 3*60),
    BEETROOR_SEED(8, new ItemStack(Material.BEETROOT_SEEDS), 0, "Graine de betterave", "farm", 5, 2, 15, 2560, 270),
    BEETROOT(8, new ItemStack(Material.BEETROOT), 0, "Betterave", "farm", 6, 3, 16, 640, 810),
    PUMKIN_PIE(8, new ItemStack(Material.PUMPKIN_PIE), 0, "Tarte à la citrouille", "farm", 12, 6, 17, 640, 675),
    LAVA_BUCKET(8, new ItemStack(Material.LAVA_BUCKET), 0, "Seau de lave", "other", 32, 16, 6, 960, 270),
    SAND0(9, new ItemStack(Material.SAND), 0, "Sable", "block", 10, 5, 15, 11200, 70),
    SAND1(9, new ItemStack(Material.SAND), 1, "Sable rouge", "block", 12, 6, 16, 1920, 360),
    DIAMOND(9, new ItemStack(Material.DIAMOND), 0, "Diamant", "ore", 70, 35, 7, 640, 1620),
    EGG(10, new ItemStack(Material.EGG), 0, "Œuf", "farm", 4, 2, 18, 1280, 270),
    LOG0(11, new ItemStack(Material.LOG), 0, "Bûche de chêne", "block", 5, 1, 17, 7680, 45),
    LOG1(11, new ItemStack(Material.LOG), 1, "Bûche de d'épicéa", "block", 6, 1, 18, 7680, 45),
    XP_BOTTLE(11, new ItemStack(Material.EXP_BOTTLE), 0, "Bouteille d'xp", "other", 100, 25, 7, 128, 3600),
    CHICKEN(12, new ItemStack(Material.RAW_CHICKEN), 0, "Viande de poulet", "farm", 10, 5, 19, 320, 1620),
    COOKED_CHICKEN(12, new ItemStack(Material.COOKED_CHICKEN), 0, "Viande de poulet cuit", "farm", 12, 6, 20, 320, 1620),
    LOG2(12, new ItemStack(Material.LOG), 2, "Bûche de bouleau", "block", 7, 1, 19, 7680, 45),
    LOG3(12, new ItemStack(Material.LOG), 3, "Bûche de bois de la jungle", "block", 8, 1, 20, 7680, 45),
    LOG4(13, new ItemStack(Material.LOG_2), 0, "Bûche de d'acacia", "block", 9, 1, 21, 7680, 45),
    LOG5(13, new ItemStack(Material.LOG_2), 1, "Bûche de chêne noir", "block", 10, 1, 22, 7680, 45),
    COAL_BLOCK(14, new ItemStack(Material.COAL_BLOCK), 0, "Bloc de charbon", "ore", 30, 15, 8, 256, 3375),
    MELON(14, new ItemStack(Material.MELON), 0, "Melon", "farm", 6, 3, 21, 640, 810),
    CRAKEDSTONEBRICK(15, new ItemStack(Material.SMOOTH_BRICK), 2, "Pierre taillé craqué", "block", 25, 12, 23, 640, 1350),
    CHISELEDSTONEBRICK(15, new ItemStack(Material.SMOOTH_BRICK), 3, "Pierre taillé ciselé", "block", 26, 12, 24, 640, 1350),
    NETHER_QUARTZ(15, new ItemStack(Material.QUARTZ), 0, "Minerai de quartz", "ore", 20, 10, 9, 960, 5*60),
    IRON_BLOCK(15, new ItemStack(Material.IRON_BLOCK), 0, "Bloc de fer", "ore", 91, 45, 10, 224, 3471),
    PUMPKIN(15, new ItemStack(Material.PUMPKIN), 0, "Citrouille", "farm", 10, 5, 22, 640, 810),
    MELON_BLOCK(15, new ItemStack(Material.MELON_BLOCK), 0, "Bloc de melon", "farm", 55, 27, 23, 512, 1012),
    GLOWSTONE(15, new ItemStack(Material.GLOWSTONE_DUST), 0, "Poudre de glowstone", "other", 28, 14, 8, 960, 5*60),
    QUARTZ_BLOCK(16, new ItemStack(Material.QUARTZ_BLOCK), 0, "Bloc de quartz", "block", 82, 41, 25, 240, 1800),
    CHISELED_QUARTZ_BLOCK(16, new ItemStack(Material.QUARTZ_BLOCK), 1, "Bloc de quartz ciselé", "block", 84, 42, 26, 240, 1800),
    APPLE(16, new ItemStack(Material.APPLE), 0, "Pomme", "farm", 4, 1, 24, 640, 810),
    BREAD(16, new ItemStack(Material.BREAD), 0, "Pain", "farm", 7, 3, 25, 640, 810),
    RAW_RABBIT(16, new ItemStack(Material.RABBIT), 0, "Viande de lapin", "farm", 11, 5, 26, 320, 1620),
    COOKED_RABBIT(17, new ItemStack(Material.COOKED_RABBIT), 0, "Viande de lapin cuit", "farm", 12, 5, 27, 320, 1620),
    PILLAR_QUARTZ(19, new ItemStack(Material.QUARTZ_BLOCK), 2, "Pilier de quartz", "block", 86, 43, 27, 240, 1800),
    GOLD_BLOCK(19, new ItemStack(Material.GOLD_BLOCK), 0, "Bloc d'or", "ore", 253, 126, 11, 224, 3471),
    RAW_PIG(20, new ItemStack(Material.PORK), 0, "Viande de cochon", "farm", 12, 6, 28, 320, 1620),
    COOKED_PIG(20, new ItemStack(Material.GRILLED_PORK), 0, "Viande de cochon cuit", "farm", 13, 6, 29, 320, 1620),
    REDSTONNE(20, new ItemStack(Material.REDSTONE), 0, "Restonne", "ore", 10, 5, 12, 1280, 9*60),
    ICE(21, new ItemStack(Material.ICE), 0, "Glace", "block", 9, 5, 28, 3200, 162),
    RAW_SHEEP(22, new ItemStack(Material.MUTTON), 0, "Viande de mouton", "farm", 13, 6, 30, 320, 1620),
    COOKED_SHEEP(22, new ItemStack(Material.COOKED_MUTTON), 0, "Viande de mouton cuit", "farm", 14, 6, 31, 320, 1620),
    GLASS_BOTTLE(23, new ItemStack(Material.GLASS_BOTTLE), 0, "Bouteille en verre", "other", 8, 4, 9, 1920, 360),
    PAPER(23, new ItemStack(Material.PAPER), 0, "Papier", "other", 19, 9, 10, 1600, 432),
    NETHERRACK(24, new ItemStack(Material.NETHERRACK), 0, "Netherrack", "block", 10, 5, 29, 9600, 75),
    REDSTONNE_BLOCK(24, new ItemStack(Material.REDSTONE_BLOCK), 0, "Bloc de redstonne", "ore", 91, 45, 13, 256, 3375),
    RAW_BEEF(25, new ItemStack(Material.RAW_BEEF), 0, "Viande de vache", "farm", 14, 7, 32, 320, 1620),
    DIORITE(26, new ItemStack(Material.STONE), 3, "Diorite", "block", 43, 21, 30, 640, 1350),
    MYCELIUM(26, new ItemStack(Material.MYCEL), 0, "Mycélium", "block", 50, 25, 31, 3200, 162),
    EMERALD_BLOCK(27, new ItemStack(Material.EMERALD_BLOCK), 0, "Bloc d'émeraude", "ore", 451, 225, 14, 256, 4050),
    COOKED_BEEF(28, new ItemStack(Material.COOKED_BEEF), 0, "Viande de vache cuite", "farm", 15, 7, 33, 320, 1620),
    SEA_LANTERN(29, new ItemStack(Material.SEA_LANTERN), 0, "Lanterne de la mer", "block", 50, 25, 32, 64, 18900),
    RAW_FISH(29, new ItemStack(Material.RAW_FISH), 0, "Poisson cru", "farm", 15, 7, 34, 320, 1620),
    COOKED_FISH(29, new ItemStack(Material.COOKED_FISH), 0, "Poisson cuit", "farm", 16, 7, 35, 320, 1620),
    DIAMON_BLOCK(29, new ItemStack(Material.DIAMOND_BLOCK), 0, "Bloc de diamant", "ore", 631, 315, 15, 256, 4050),
    GOLDEN_CARROT(29, new ItemStack(Material.GOLDEN_CARROT), 0, "Carotte en or", "other", 31, 15, 11, 320, 1890);

    private int prestige;
    private ItemStack it;
    private int data;
    private String name;
    private String type;
    private int price;
    private int xp;
    private int place;
    private int index;
    private int reload_index;
    SellPerGrade(int prestige, ItemStack it, int data, String name, String type, int price, int xp, int place, int index, int reload_index) {
        this.prestige = prestige;
        this.it = it;
        this.data = data;
        this.name = name;
        this.type = type;
        this.price = price;
        this.xp = xp;
        this.place = place;
        this.index = index;
        this.reload_index = reload_index;
    }

    public int getPrestige() {
        return prestige;
    }

    public ItemStack getIt() {
        return it;
    }

    public int getData() {
        return data;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public int getPrice() {
        return price;
    }

    public int getXp() {
        return xp;
    }

    public int getPlace() {
        return place;
    }

    public int getIndex() {
        return index;
    }

    public int getReload_index() {
        return reload_index;
    }
}
