package lnwwaveza007.customfishnoonefishmod;

import javafx.geometry.Pos;
import nf.noonefishing.API.NoOneFishingEvent;
import org.apache.commons.lang.StringEscapeUtils;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.event.server.PluginDisableEvent;
import org.bukkit.scheduler.BukkitRunnable;
import org.bukkit.scheduler.BukkitTask;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Main implements Listener {
    public static Integer getRandomInt(Integer max) {
        Random ran = new Random();
        return ran.nextInt(max);
    }

    private final Map<Player, BukkitTask> tasks = new HashMap<>();

    Boolean Fishing = false;
    //Display
    String[] Blue;
    String[] Green;
    String[] Yellow;
    String[] BlueClick;
    String[] GreenClick;
    String[] YellowClick;
    //Variable
    Integer FishingProgress;
    Integer FishingComplete;
    Integer FishingChestCom;
    Integer random;
    Integer gotchest;
    Integer chest;
    Integer rb;
    String[] BlueSlot;
    Integer[] BlueSlotNumber;
    String[] GreenSlot;
    Integer[] GreenSlotNumber;
    String[] YellowSlot;
    Integer[] YellowSlotNumber;
    Boolean Fchest = true;
    Integer barSlot;
    Integer bari;
    Integer bari1;
    //Conditions
    Boolean C;
    Boolean PosPlayerSet;
    Boolean FishBarSet;
    Boolean ChestBarSet;
    Boolean FishCorrect;
    Boolean playSound;
    Boolean ComAll;
    //Fish
    Integer fishbar1;
    Integer fishbar2;
    Integer fishbar3;
    String[] bar;
    Integer fishlowest;
    Integer fishhighest;
    //Chest
    Integer chestbar;
    Integer chestlowest;
    Integer chesthighest;
    //PlayerPos
    Integer playerpos;
    String pos;

    @EventHandler
    public void onCustomFish(NoOneFishingEvent e){
        //int random = (int )(Math.random() * 2 + 1);
        //Set Variable
        Blue[1] = "???";
        Blue[2] = "???";
        Blue[3] = "???";
        Blue[4] = "???";
        Blue[5] = "???";
        Blue[6] = "???";
        Blue[7] = "???";
        Blue[8] = "???";
        Blue[9] = "???";
        Blue[10] = "???";
        Blue[11] = "???";
        Blue[12] = "???";
        Green[1] = "???";
        Green[2] = "???";
        Green[3] = "???";
        Green[4] = "???";
        Green[5] = "???";
        Green[6] = "???";
        Green[7] = "???";
        Green[8] = "???";
        Green[9] = "???";
        Green[10] = "???";
        Green[11] = "???";
        Green[12] = "???";
        Yellow[1] = "???";
        Yellow[2] = "???";
        Yellow[3] = "???";
        Yellow[4] = "???";
        Yellow[5] = "???";
        Yellow[6] = "???";
        Yellow[7] = "???";
        Yellow[8] = "???";
        Yellow[9] = "???";
        Yellow[10] = "???";
        Yellow[11] = "???";
        Yellow[12] = "???";
        BlueClick[1] = "???";
        BlueClick[2] = "???";
        BlueClick[3] = "???";
        BlueClick[4] = "???";
        BlueClick[5] = "???";
        BlueClick[6] = "???";
        BlueClick[7] = "???";
        BlueClick[8] = "???";
        BlueClick[9] = "???";
        BlueClick[10] = "???";
        BlueClick[11] = "???";
        BlueClick[12] = "???";
        GreenClick[1] = "???";
        GreenClick[2] = "???";
        GreenClick[3] = "???";
        GreenClick[4] = "???";
        GreenClick[5] = "???";
        GreenClick[6] = "???";
        GreenClick[7] = "???";
        GreenClick[8] = "???";
        GreenClick[9] = "???";
        GreenClick[10] = "???";
        GreenClick[11] = "???";
        GreenClick[12] = "???";
        YellowClick[1] = "???";
        YellowClick[2] = "???";
        YellowClick[3] = "???";
        YellowClick[4] = "???";
        YellowClick[5] = "???";
        YellowClick[6] = "???";
        YellowClick[7] = "???";
        YellowClick[8] = "???";
        YellowClick[9] = "???";
        YellowClick[10] = "???";
        YellowClick[11] = "???";
        YellowClick[12] = "???";
        //Next
        if (Fishing = false){
            System.out.println("A");
            Fishing = true;
            FishingProgress = 50;
            FishingComplete = 50;
            FishingChestCom = 0;
            random = (int )(Math.random() * 100 + 1);
            gotchest = (int )(Math.random() * 5 + 1);
            if (gotchest == 1){
                chest = (int )(Math.random() * 100 + 1);
            }
            for (int i = 1; i < 21; i++) {
                rb = (int )(Math.random() * 12 + 1);
                BlueSlot[i] = Blue[rb];
                BlueSlotNumber[i] = rb;
                rb = (int )(Math.random() * 12 + 1);
                GreenSlot[i] = Green[rb];
                GreenSlotNumber[i] = rb;
                rb = (int )(Math.random() * 12 + 1);
                YellowSlot[i] = Yellow[rb];
                YellowSlotNumber[i] = rb;
            }
            Player p = e.getPlayer();
            tasks.put(p, new BukkitRunnable() {
                @Override
                public void run() {
                    System.out.println("B");
                    if (Fishing = true){
                        System.out.println("C");
                        if (ComAll == false) {
                            System.out.println("D");
                            ComAll = true;
                            if (FishingComplete == 0) {
                                Fishing = false;
                                e.getCatchedFish().setAmount(0);
                            }
                            if (FishingComplete >= 100) {
                                if (Fchest = true) {
                                    //Got Chest
                                }
                            }
                            if (FishingProgress >= 5) {
                                FishingProgress = FishingProgress - 5;
                            }
                            bari = 0;
                            bari1 = -5;
                            for (int i = 0; i < 20; i++) {
                                barSlot = i;
                                C = false;
                                PosPlayerSet = false;
                                //Fishbar
                                if (FishBarSet == false) {
                                    if (random <= bari) {
                                        if (random > bari1) {
                                            //Display
                                            fishbar1 = barSlot;
                                            bar[fishbar1] = GreenSlot[fishbar1];
                                            fishbar2 = barSlot - 1;
                                            bar[fishbar2] = GreenSlot[fishbar2];
                                            fishbar3 = barSlot + 1;
                                            bar[fishbar3] = GreenSlot[fishbar3];
                                            //Progress
                                            fishlowest = bari1 - 5;
                                            fishhighest = bari + 5;
                                            //Another
                                            bari1 = bari1 + 5;
                                            bari = bari + 5;
                                            FishBarSet = true;
                                            C = true;
                                        }
                                    }
                                }
                                //ChestBar
                                if (ChestBarSet == false) {
                                    if (chest <= bari) {
                                        if (chest > bari1) {
                                            //Display
                                            chestbar = barSlot;
                                            bar[barSlot] = YellowSlot[chestbar];
                                            //Progress
                                            chestlowest = bari1;
                                            chesthighest = bari;
                                            //Another
                                            bari1 = bari1 + 5;
                                            bari = bari + 5;
                                            C = true;
                                            ChestBarSet = true;
                                        }
                                    }
                                }
                                //Check bar
                                if (FishingChestCom < 100) {
                                    if (ChestBarSet == true) {
                                        if (chest <= bari) {
                                            if (chest > bari1) {
                                                bar[chestbar] = YellowSlot[chestbar];
                                            }
                                        }
                                    }
                                }
                                if (FishBarSet == true) {
                                    if (random <= bari) {
                                        if (random > bari1) {
                                            bar[fishbar1] = GreenSlot[fishbar1];
                                            bar[fishbar2] = GreenSlot[fishbar2];
                                            bar[fishbar3] = GreenSlot[fishbar3];
                                        }
                                    }
                                }
                                if (C == true) {
                                    if (!bar[barSlot].equalsIgnoreCase(GreenSlot[fishbar1]) || !bar[barSlot].equalsIgnoreCase(GreenSlot[fishbar2]) || !bar[barSlot].equalsIgnoreCase(GreenSlot[fishbar3]) || !bar[barSlot].equalsIgnoreCase(GreenSlot[fishbar3]) || !bar[barSlot].equalsIgnoreCase(Yellow[chestbar])) {
                                        if (barSlot != fishbar3) {
                                            bar[barSlot] = BlueSlot[barSlot];
                                            bari1 = bari1 + 5;
                                            bari = bari + 5;
                                        }
                                    }
                                }
                                if (FishingProgress < bari) {
                                    if (FishingProgress >= bari1) {
                                        playerpos = barSlot;
                                        if (bar[barSlot].equals(YellowSlot[chestbar])) {
                                            if (PosPlayerSet == false) {
                                                PosPlayerSet = true;
                                                pos = YellowClick[YellowSlotNumber[barSlot]];
                                                bar[barSlot] = pos;
                                                bari1 = bari1 + 5;
                                                bari = bari + 5;
                                                C = true;
                                            }
                                        }
                                        if (bar[barSlot].equalsIgnoreCase(GreenSlot[fishbar1]) || bar[barSlot].equalsIgnoreCase(GreenSlot[fishbar2]) || bar[barSlot].equalsIgnoreCase(GreenSlot[fishbar3])) {
                                            if (PosPlayerSet = false) {
                                                if (!bar[fishbar1].equalsIgnoreCase(GreenClick[GreenSlotNumber[fishbar1]])) {
                                                    if (!bar[fishbar2].equalsIgnoreCase(GreenClick[GreenSlotNumber[fishbar2]])) {
                                                        if (!bar[fishbar3].equalsIgnoreCase(GreenClick[GreenSlotNumber[fishbar3]])) {
                                                            bar[fishbar1] = GreenSlot[fishbar1];
                                                            bar[fishbar2] = GreenSlot[fishbar2];
                                                            bar[fishbar3] = GreenSlot[fishbar3];
                                                            PosPlayerSet = false;
                                                            pos = GreenClick[GreenSlotNumber[barSlot]];
                                                            bar[barSlot] = pos;
                                                            bari1 = bari1 + 5;
                                                            bari = bari + 5;
                                                            C = true;
                                                        }
                                                    }
                                                }
                                            }
                                        } else if (PosPlayerSet == false) {
                                            PosPlayerSet = true;
                                            pos = BlueClick[BlueSlotNumber[barSlot]];
                                            bar[barSlot] = pos;
                                            bari1 = bari1 + 5;
                                            bari = bari + 5;
                                            C = true;
                                        }
                                    }
                                }
                            }
                            FishCorrect = false;
                            if (FishBarSet == true) {
                                if (FishingProgress < fishhighest) {
                                    if (FishingProgress >= fishlowest) {
                                        FishingComplete = FishingComplete + 10;
                                        pos = GreenClick[GreenSlotNumber[playerpos]];
                                        bar[playerpos] = pos;
                                        p.playSound(p.getLocation(), "BLOCK_NOTE_BLOCK_BELL", 1, 1);
                                        FishCorrect = true;
                                    }
                                }
                            }
                            if (ChestBarSet == true) {
                                if (FishingChestCom < 100) {
                                    if (FishingProgress < chesthighest) {
                                        if (FishingProgress >= chestlowest) {
                                            FishingChestCom = FishingChestCom + 20;
                                            pos = YellowClick[YellowSlotNumber[playerpos]];
                                            bar[playerpos] = pos;
                                            p.playSound(p.getLocation(), "BLOCK_NOTE_BLOCK_BELL", 1, 1);
                                            Fchest = true;
                                        } else if (FishingChestCom >= 100) {
                                            if (playSound == false) {
                                                playSound = true;
                                                p.playSound(p.getLocation(), "BLOCK_NOTE_BLOCK_BELL", 1, 1);
                                            }
                                        }
                                    }
                                }
                            }
                            if (FishCorrect == false) {
                                FishingComplete = FishingComplete - 5;
                            }
                            if (FishingComplete < 30) {
                                p.sendTitle(ChatColor.RED + FishingComplete.toString(), ChatColor.WHITE + "???\uF801" + bar[1] + bar[2] + bar[3] + bar[4] + bar[5] + bar[6] + bar[7] + bar[8] + bar[9] + bar[10] + bar[11] + bar[12] + bar[13] + bar[14] + bar[15] + bar[16] + bar[17] + bar[18] + bar[19] + bar[20] + "\uF801???", 0, 3, 0);
                                System.out.println("A1");
                            } else if (FishingComplete < 80) {
                                if (FishingComplete < 30) {
                                    p.sendTitle(ChatColor.YELLOW + FishingComplete.toString(), ChatColor.WHITE + "???\uF801" + bar[1] + bar[2] + bar[3] + bar[4] + bar[5] + bar[6] + bar[7] + bar[8] + bar[9] + bar[10] + bar[11] + bar[12] + bar[13] + bar[14] + bar[15] + bar[16] + bar[17] + bar[18] + bar[19] + bar[20] + "\uF801???", 0, 3, 0);
                                    System.out.println("A2");
                                }
                            } else if (FishingComplete > 80) {
                                p.sendTitle(ChatColor.GREEN + FishingComplete.toString(), ChatColor.WHITE + "???\uF801" + bar[1] + bar[2] + bar[3] + bar[4] + bar[5] + bar[6] + bar[7] + bar[8] + bar[9] + bar[10] + bar[11] + bar[12] + bar[13] + bar[14] + bar[15] + bar[16] + bar[17] + bar[18] + bar[19] + bar[20] + "\uF801???", 0, 3, 0);
                                System.out.println("A3");
                            }
                            ComAll = false;
                        }
                    }else{
                        tasks.remove(p);
                    }
                }
            }.runTaskTimer(CustomFishNoOneFishMod.plugin, 0, 4));
        }
    }

    @EventHandler
    public void onInteract(PlayerInteractEvent event) {
        if (Fishing == true) {
            if (event.getAction().equals(Action.RIGHT_CLICK_AIR)) {
                if (event.getPlayer().getItemInHand().equals(Material.FISHING_ROD)) {
                    event.setCancelled(true);
                    if (FishingProgress < 100) {
                        FishingProgress = FishingProgress + 10;
                    }
                    event.getPlayer().playSound(event.getPlayer().getLocation(), "UI_BUTTON_CLICK", 1, 1);
                }
            }
        }
    }

    @EventHandler
    public void onLeave(PlayerQuitEvent e){
        Fishing = false;
        Player p = e.getPlayer();
        tasks.remove(p);
    }

    @EventHandler
    public void onDisable(PluginDisableEvent e){
        Fishing = false;
        tasks.clear();
    }
}
