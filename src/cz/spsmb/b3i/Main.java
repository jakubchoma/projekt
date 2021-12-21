package cz.spsmb.b3i;

import cz.spsmb.b3i.entities.Player;
import cz.spsmb.b3i.entities.PlayerType;
import cz.spsmb.b3i.Maps;


import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    public static Player player = new Player("PLAYER", 100, 20, .5, 100);

    public static void main(String[] args) {
        chooseClass();
        chooseName();
        Maps maps = new Maps(player);
    }

    public static void chooseName() {
        System.out.print("Choose name: ");
        player.setName(scanner.next());
    }

    public static void chooseClass() {
        System.out.println("1 - WARRIOR ; 2 - MIDDLEMAN ; 3 - LUCKIER");
        System.out.print("Choose your character type: ");
        int type = scanner.nextInt();
        if (type == 1) {
            player.setHealth(120);
            player.setDamage(40);
            player.setLuck(.15);
            player.setWallet(0);
        } else if (type == 2) {
            player.setHealth(100);
            player.setDamage(20);
            player.setLuck(.35);
            player.setWallet(100);
        } else if (type == 3) {
            player.setHealth(75);
            player.setDamage(10);
            player.setLuck(.6);
            player.setWallet(225);
        } else {
            System.out.println("Invalid choice!\n");
            chooseClass();
        }
    }

}
