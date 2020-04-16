package net.saikatsune.uhc.enums;

import net.saikatsune.uhc.Game;
import net.saikatsune.uhc.gamestate.states.IngameState;
import net.saikatsune.uhc.handler.ItemHandler;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.Arrays;
import java.util.UUID;

public enum Scenarios {

    CUTCLEAN(false, new ItemHandler(Material.IRON_ORE).setDisplayName("§bCutClean").build(), new String[]{"Food and ores are pre-smelted, removing", "the needs of furnaces."}),
    TIMEBOMB(false, new ItemHandler(Material.TNT).setDisplayName("§bTimeBomb").build(), new String[]{"When you kill a player, a chest appears", "containing his drops. After 30 ", "seconds this chest will explode."}),
    TIMBER(false, new ItemHandler(Material.SAPLING).setDisplayName("§bTimber").build(), new String[]{"The whole tree drops when you mine a log."}),
    NOCLEAN(false, new ItemHandler(Material.DIAMOND_SWORD).setDisplayName("§bNoClean").build(), new String[]{"When you kill a player you get 20", " seconds of invincibility."}),
    LIMITATIONS(false, new ItemHandler(Material.REDSTONE_BLOCK).setDisplayName("§bLimitations").build(), new String[]{"You can only mine up to 16 diamonds, ", "32 gold, and 64 iron during the game."}),
    NOFALL(false, new ItemHandler(Material.FEATHER).setDisplayName("§bNoFall").build(), new String[]{"You take no fall damage."}),
    BACKPACKS(false, new ItemHandler(Material.CHEST).setDisplayName("§bBackpacks").build(), new String[]{"You get backpacks which you can share with", " your team."}),
    BAREBONES(false, new ItemHandler(Material.BONE).setDisplayName("§bBarebones").build(), new String[]{"You can only mine iron, you get 1 diamond,", " 1 gapple, 32 arrows and 2 strings from a kill."}),
    SOUP(false, new ItemHandler(Material.MUSHROOM_SOUP).setDisplayName("§bSoup").build(), new String[]{"When you right click a soup, you regain", "3.5 hearts."}),
    BLOODDIAMONDS(false, new ItemHandler(Material.REDSTONE).setDisplayName("§bBloodDiamonds").build(), new String[]{"When you mine a diamond, you", " lose half a heart."}),
    HASTEYBOYS(false, new ItemHandler(Material.WOOD_PICKAXE).setDisplayName("§bHasteyBoys").build(), new String[]{"Tools automatically enchant", "with efficiency 3."}),
    DIAMONDLESS(false, new ItemHandler(Material.DIAMOND_ORE).setDisplayName("§bDiamondless").build(), new String[]{"You cannot mine diamonds.", "Players drop 1 diamond", "if they die."}),
    GOLDLESS(false, new ItemHandler(Material.GOLD_ORE).setDisplayName("§bGoldless").build(), new String[]{"You cannot mine gold.", "Players drop 8 gold", "if they die."}),
    FLOWERPOWER(false, new ItemHandler(Material.YELLOW_FLOWER).setDisplayName("§bFlowerPower").build(), new String[]{"You gain items by", "destroying flowers."}),
    GONEFISHING(false, new ItemHandler(Material.RAW_FISH).setDisplayName("§bGoneFishing").build(), new String[]{"You get an Unbreaking 250 and ", "Luck of the Sea 250 fishing rod along with 20 anvils."}),
    INFINITEENCHANT(false, new ItemHandler(Material.ENCHANTMENT_TABLE).setDisplayName("§bInfiniteEnchant").build(), new String[]{"You can infinitely enchant, no limitations."}),
    DOUBLEORES(false, new ItemHandler(Material.ICE).setDisplayName("§bDoubleOres").build(), new String[]{"Ore drops are doubled."}),
    TRIPLEORES(false, new ItemHandler(Material.PACKED_ICE).setDisplayName("§bTripleOres").build(), new String[]{"Ore drops are tripled."}),
    LONGSHOTS(false, new ItemHandler(Material.ARROW).setDisplayName("§bLongShots").build(), new String[]{"If you get a shot from more than 50 blocks, ", "you get healed 1 heart, and do 1.5x the damage."}),
    BOWLESS(false, new ItemHandler(Material.BOW).setDisplayName("§bBowless").build(), new String[]{"You cannot use bows."}),
    RODLESS(false, new ItemHandler(Material.FISHING_ROD).setDisplayName("§bRodless").build(), new String[]{"You cannot use rods."}),
    WEBCAGE(false, new ItemHandler(Material.WEB).setDisplayName("§bWebcage").build(), new String[]{"When you kill a player a sphere of", " cobwebs surrounds you"}),
    LUCKYLEAVES(false, new ItemHandler(Material.LEAVES).setDisplayName("§bLuckyLeaves").build(), new String[]{"There's a 0.5% chance of golden apples, ", "dropping from decaying leaves"}),
    FIRELESS(false, new ItemHandler(Material.FIRE).setDisplayName("§bFireless").build(), new String[]{"You take no fire damage."}),
    OREFRENZY(false, new ItemHandler(Material.NETHER_STAR).setDisplayName("§bOreFrenzy").build(), new String[]{"Mining lapis ore will get you a splash potion of healing.", "Mining emeralds will get you 32 arrows.", "Mining redstone ore will get you a book.", "Mining diamond ore will get you a diamond 4 xp bottles.", "Mining quartz will get you a block of TNT."}),
    BLEEDINGSWEETS(false, new ItemHandler(Material.DIAMOND).setDisplayName("§bBleedingSweets").build(), new String[]{"When a player dies, they will drop ", "1 diamond, 5 gold ingots, 16 arrows and 1 string."}),
    SWITCHEROO(false, new ItemHandler(Material.ENDER_PEARL).setDisplayName("§bSwitcheroo").build(), new String[]{"When you shoot someone, you trade places with them."}),
    HORSELESS(false, new ItemHandler(Material.SADDLE).setDisplayName("§bHorseless").build(), new String[]{"You cannot ride horses."}),
    BESTPVE(false, new ItemHandler(Material.WATCH).setDisplayName("§bBestPVE").build(), new String[]{"You're part of a BestPVE list, if you take damage", "you're removed from it and to be added back", "you need to kill a player. If you're part of", "the list, you'll gain an extra heart."}),
    ABSORPTIONLESS(false, new ItemHandler(Material.GLOWSTONE_DUST).setDisplayName("§bAbsorptionless").build(), new String[]{"You do not receive absorption", "hearts after eating a", "golden apple."}),
    VEINMINER(false, new ItemHandler(Material.IRON_PICKAXE).setDisplayName("§bVeinMiner").build(), new String[]{"Mine all blocks in a vein, ", "when sneaking."}),
    BETAZOMBIES(false, new ItemHandler(Material.ROTTEN_FLESH).setDisplayName("§bBetaZombies").build(), new String[]{"Zombies drop feathers."}),
    SWORDLESS(false, new ItemHandler(Material.WOOD_SWORD).setDisplayName("§bSwordless").build(), new String[]{"You cannot craft/use swords."});

    private Game game = Game.getInstance();

    private String prefix = game.getPrefix();
    private String mColor = game.getmColor();
    private String sColor = game.getsColor();

    private boolean enabled;
    private ItemStack scenarioItem;
    private String[] scenarioExplanation;

    Scenarios(boolean enabled, ItemStack scenarioItem, String[] scenarioExplanation) {
        this.enabled = enabled;
        this.scenarioItem = scenarioItem;
        this.scenarioExplanation = scenarioExplanation;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;

        if(enabled) {
            Bukkit.broadcastMessage(prefix + mColor + scenarioItem.getItemMeta().getDisplayName() + sColor + " has been " + ChatColor.GREEN + "enabled" + sColor + ".");

            if(scenarioItem.getItemMeta().getDisplayName().contains("BestPVE")) {
                if(game.getGameStateManager().getCurrentGameState() instanceof IngameState) {
                    if(Scenarios.BESTPVE.isEnabled()) {
                        game.getGameManager().startBestPveTimer();

                        for (UUID allPlayers : game.getPlayers()) {
                            game.getBestPvePlayers().add(allPlayers);

                            if(allPlayers != null) {
                                Player allOnlinePlayers = Bukkit.getPlayer(allPlayers);

                                allOnlinePlayers.sendMessage(prefix + ChatColor.GREEN + "You have been added to the BestPVE list.");
                            }
                        }
                    }
                }
            }
        } else {
            Bukkit.broadcastMessage(prefix + mColor + scenarioItem.getItemMeta().getDisplayName() + sColor + " has been " + ChatColor.RED + "disabled" + sColor + ".");

            if(scenarioItem.getItemMeta().getDisplayName().contains("BestPVE")) {
                if(game.getGameStateManager().getCurrentGameState() instanceof IngameState) {
                    for (UUID allPlayers : game.getPlayers()) {
                        game.getBestPvePlayers().remove(allPlayers);
                    }
                }
            }
        }
    }

    public static Inventory getExplanations() {
        Inventory inventory = Bukkit.createInventory(null, 9*4,  "Scenarios Explained");

        inventory.clear();

        for(Scenarios scenarios : Scenarios.values()) {
            if(scenarios.isEnabled()) {
                ItemStack itemStack = scenarios.getScenarioItem();
                ItemMeta itemMeta = itemStack.getItemMeta();
                itemMeta.setLore(Arrays.asList(scenarios.getScenarioExplanation()));
                itemStack.setItemMeta(itemMeta);
                inventory.addItem(scenarios.getScenarioItem());
            }
        }

        return inventory;
    }

    public static Inventory toToggle() {
        Inventory inventory = Bukkit.createInventory(null, 9*4,  "Scenarios Editor");

        inventory.clear();

        for(Scenarios scenarios : Scenarios.values()) {
            ItemStack itemStack = scenarios.getScenarioItem();
            ItemMeta itemMeta = itemStack.getItemMeta();
            itemMeta.setLore(Arrays.asList(scenarios.getScenarioExplanation()));
            itemStack.setItemMeta(itemMeta);
            inventory.addItem(scenarios.getScenarioItem());
        }

        return inventory;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public ItemStack getScenarioItem() {
        return scenarioItem;
    }

    public String[] getScenarioExplanation() {
        return scenarioExplanation;
    }

}
