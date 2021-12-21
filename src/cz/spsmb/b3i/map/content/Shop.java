package cz.spsmb.b3i.map.content;

import cz.spsmb.b3i.entities.Player;

import java.util.Scanner;

public class Shop {

    private Scanner scanner = new Scanner(System.in);

    public Player player;

    public Shop(Player player) {
        this.player = player;
        System.out.println("\n\"Hello traveler, wanna buy something?\" - SAID TRADER");
    }

    public void goShopping() {
        System.out.println(
                "Your wallet : " + player.getWallet() + " CR\n" +
                " - (1) - WEAPON UPGRADE (+15 DMG) : 100 CR\n" +
                " - (2) - HEAL POTION    (+20 HP) : 75 CR\n" +
                " - (0) - exit\n"
        );
        System.out.print("Choose: ");
        int choice = scanner.nextInt();
        if (choice == 1) {
            if (player.getWallet() >= 100) {
                player.setWallet(player.getWallet() - 100);
                player.setDamage(player.getDamage() + 15);
                System.out.println("YOU'VE BOUGHT WEAPON UPGRADE");
                System.out.println("+15 DMG (" + player.getDamage() + " DMG)\n");
                goShopping();
            } else {
                System.out.println("YOU DON'T HAVE ENOUGH OF FUNDS!");
                System.out.println("YOU NEED " + (100 - player.getWallet()) + " MORE!\n");
                goShopping();
            }
        } else if (choice == 2) {
            if (player.getWallet() >= 75) {
                player.setWallet(player.getWallet() - 75);
                player.setHealth(player.getHealth() + 20);
                System.out.println("YOU'VE BOUGHT HEALTH POTION");
                System.out.println("+20 HP (" + player.getHealth() + " HP)\n");
                goShopping();
            } else {
                System.out.println("YOU DON'T HAVE ENOUGH OF FUNDS!");
                System.out.println("YOU NEED " + (75 - player.getWallet()) + " MORE!\n");
                goShopping();
            }
        } else {
            System.out.println("\n\"Wish you good luck!\" - SAID TRADER");
        }
    }


}