package fr.WarzouMc.MonaiServGroup.shop.sell;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

public enum SellPerGrade {
    COBBLESTONE(0, new ItemStack(Material.COBBLESTONE), 0, "Cobble", "block", 10, 5, 1),
    SEEDS(0, new ItemStack(Material.SEEDS), 0, "Graine de blé", "farm", 2, 1, 1),
    WHEAT(0, new ItemStack(Material.WHEAT), 0, "Blé", "farm", 5, 3, 2),
    HAY_BLOCK(0, new ItemStack(Material.HAY_BLOCK), 0, "Bote de blé", "farm", 50, 25, 3),
    LEATHER(0, new ItemStack(Material.LEATHER), 0, "Cuire", "farm", 10, 5, 4),
    COAL(0, new ItemStack(Material.COAL), 0, "Charbon", "ore", 20, 10, 1),
    STONE(1, new ItemStack(Material.STONE), 0, "Stone", "block", 20, 10, 2),
    DIRT(1, new ItemStack(Material.DIRT), 0, "Terre", "block", 15, 8, 3),
    CARROT(1, new ItemStack(Material.CARROT_ITEM), 0, "Carotte", "farm", 6, 3, 5),
    FLINT(1, new ItemStack(Material.FLINT), 0, "Silex", "ore", 10, 5, 2),
    IRON_INGOT(1, new ItemStack(Material.IRON_INGOT), 0, "Fer", "ore", 100, 50, 3),
    CLAY_BALL(1, new ItemStack(Material.CLAY_BALL), 0, "Clay", "other", 20, 10, 1),
    GRASS(2, new ItemStack(Material.GRASS), 0, "Herbe", "block", 20, 10, 4),
    PLANK0(2, new ItemStack(Material.WOOD), 0, "Bois de chêne", "block", 8, 4, 5),
    BONE(2, new ItemStack(Material.BONE), 0, "Os", "farm", 6, 3, 6),
    GOLD_NUGGET(2, new ItemStack(Material.GOLD_NUGGET), 0, "Pépite d'or", "ore", 10, 5, 4),
    WATER_BUCKET(2, new ItemStack(Material.WATER_BUCKET), 0, "Seau d'eau", "other", 10, 50, 2),
    GRAVEL(3, new ItemStack(Material.GRAVEL), 0, "Gravier", "block", 20, 10, 6),
    PODZOL(3, new ItemStack(Material.DIRT), 2, "Podzol", "block", 30, 15, 7),
    NETHER_WART(3, new ItemStack(Material.NETHER_STALK), 0, "Veru du nether", "farm", 50, 25, 7),
    MELON_SEED(3, new ItemStack(Material.MELON_SEEDS), 0, "Graine de melon", "farm", 40, 20, 8),
    GUNPOWDER(3, new ItemStack(Material.SULPHUR), 0, "Poudre à canon", "other", 70, 35, 3),
    PLANK1(4, new ItemStack(Material.WOOD), 1, "Bois d'épicéa", "block", 10, 5, 8),
    PLANK2(4, new ItemStack(Material.WOOD), 2, "Bois de bouleau", "block", 12, 6, 9),
    PLANK3(4, new ItemStack(Material.WOOD), 3, "Bois de la jungle", "block", 14, 7, 10),
    PLANK4(4, new ItemStack(Material.WOOD), 4, "Bois d'acacia", "block", 16, 8, 11),
    PLANK5(5, new ItemStack(Material.WOOD), 5, "Bois de chêne noir", "block", 20, 10, 12),
    DYE3(5, new ItemStack(Material.INK_SACK), 3, "Graine de coco", "farm", 30, 15, 8),
    REEDS(5, new ItemStack(Material.SUGAR_CANE), 0, "Canne à sucre", "farm", 50, 25, 9),
    SNOW_BALL(5, new ItemStack(Material.SNOW_BALL), 0, "Boule de neige", "other", 5, 2, 4),
    GOLD_INGOT(6, new ItemStack(Material.GOLD_INGOT), 0, "Lingot d'or", "ore", 110, 55, 5),
    EMERALD(6, new ItemStack(Material.EMERALD), 0, "Emeraude", "ore", 200, 100, 6),
    PUMKIN_SEED(6, new ItemStack(Material.PUMPKIN_SEEDS), 0, "Graine de citrouille", "farm", 50, 25, 10),
    POTATO(6, new ItemStack(Material.POTATO_ITEM), 0, "Patate", "farm", 60, 30, 11),
    STONEBRICK(7, new ItemStack(Material.SMOOTH_BRICK), 0, "Pierre taillé", "block", 100, 50, 13),
    MOSSYSTONEBRICK(7, new ItemStack(Material.SMOOTH_BRICK), 1, "Pierre taillé moussu", "block", 300, 150, 14),
    BAKED_POTATO(7, new ItemStack(Material.BAKED_POTATO), 0, "Patate cuite", "farm", 150, 75, 12),
    POISONOUS_POTATO(7, new ItemStack(Material.POISONOUS_POTATO), 0, "Patate empoisonée", "farm", 400, 200, 13),
    CLAY_BRICK(7, new ItemStack(Material.CLAY_BRICK), 0, "Terre cuite", "other", 50, 25, 5),
    BEETROOR_SEED(8, new ItemStack(Material.BEETROOT_SEEDS), 0, "Graine de betterave", "farm", 40, 20, 14),
    BEETROOT(8, new ItemStack(Material.BEETROOT), 0, "Betterave", "farm", 60, 30, 15),
    PUMKIN_PIE(8, new ItemStack(Material.PUMPKIN_PIE), 0, "Tarte à la citrouille", "farm", 100, 50, 16),
    LAVA_BUCKET(8, new ItemStack(Material.LAVA_BUCKET), 0, "Seau de lave", "other", 100, 50, 6),
    SAND0(9, new ItemStack(Material.SAND), 0, "Sable", "block", 150, 75, 15),
    SAND1(9, new ItemStack(Material.SAND), 1, "Sable rouge", "block", 200, 100, 16),
    DIAMOND(9, new ItemStack(Material.DIAMOND), 0, "Diamand", "ore", 500, 250, 7),
    EGG(10, new ItemStack(Material.EGG), 0, "Œuf", "farm", 20, 10, 17),
    LOG0(11, new ItemStack(Material.LOG), 0, "Bûche de chêne", "block", 20, 10, 17),
    LOG1(11, new ItemStack(Material.LOG), 1, "Bûche de d'épicéa", "block", 24, 12, 18),
    XP_BOTTLE(11, new ItemStack(Material.EXP_BOTTLE), 0, "Bouteille d'xp", "other", 400, 200, 7),
    CHICKEN(12, new ItemStack(Material.RAW_CHICKEN), 0, "Viende de poulet", "farm", 50, 25, 18),
    COOKED_CHICKEN(12, new ItemStack(Material.COOKED_CHICKEN), 0, "Viende de poulet cuit", "farm", 100, 50, 19),
    LOG2(12, new ItemStack(Material.LOG), 2, "Bûche de bouleau", "block", 28, 14, 19),
    LOG3(12, new ItemStack(Material.LOG), 3, "Bûche de bois de la jungle", "block", 32, 16, 20),
    LOG4(13, new ItemStack(Material.LOG_2), 0, "Bûche de d'acacia", "block", 36, 18, 21),
    LOG5(13, new ItemStack(Material.LOG_2), 1, "Bûche de chêne noir", "block", 40, 20, 22),
    COAL_BLOCK(14, new ItemStack(Material.COAL_BLOCK), 0, "Bloc de charbon", "ore", 200, 100, 8),
    MELON(14, new ItemStack(Material.MELON), 0, "Melon", "farm", 60, 30, 20);

    private int prestige;
    private ItemStack it;
    private int data;
    private String name;
    private String type;
    private int price;
    private int xp;
    private int place;
    SellPerGrade(int prestige, ItemStack it, int data, String name, String type, int price, int xp, int place) {
        this.prestige = prestige;
        this.it = it;
        this.data = data;
        this.name = name;
        this.type = type;
        this.price = price;
        this.xp = xp;
        this.place = place;
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
}
