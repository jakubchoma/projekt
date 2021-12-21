package cz.spsmb.b3i.map.content;

import cz.spsmb.b3i.entities.Entity;
import cz.spsmb.b3i.entities.Player;

import java.util.Random;
import java.util.Scanner;

public class Fight {

    private Scanner scanner = new Scanner(System.in);
    private Random random = new Random();

    public Entity enemy;
    public Player player;

    public Fight(Entity enemy, Player player) {
        this.enemy = enemy;
        this.player = player;
    }

    public void startFight() {
        if (player.getHealth() <= 0) {
            System.out.println("\nGAME OVER! - PLAYER DIED");
            System.exit(0);
        } else if (enemy.getHealth() <= 0) {
            System.out.println("\nVICTORY! - " + enemy.getName() + " DIED");
            int coins = random.nextInt(100)+1;
            player.setWallet(player.getWallet() + coins);
            System.out.println(" - You gain " + coins + " CR (" + player.getWallet() + ")");
        }

        else {
            enemy.getASCII();
            System.out.println(enemy.getName() + " : " + enemy.getHealth() + "HP");
            System.out.println(player.getName() + " : " + player.getHealth() + "HP");
            writeHelp();
            System.out.print("\nYour input: ");
            int choice = scanner.nextInt();


            if (choice == 1) {
                System.out.println(player.getName() + " - Choose to FIGHT");
                if (random.nextInt(2) == 1) {
                    System.out.println(enemy.getName() + " - Choose to BLOCK");
                    enemy.setHealth(enemy.getHealth() - random.nextDouble(enemy.getLuck()) * player.getDamage());
                    startFight();
                } else {
                    System.out.println(enemy.getName() + " - Choose to FIGHT");
                    enemy.setHealth(enemy.getHealth() - player.getDamage());
                    player.setHealth(player.getHealth() - enemy.getDamage());
                    startFight();
                }
            } else if (choice == 2) {
                System.out.println(player.getName() + " - Choose to BLOCK");
                if (random.nextInt(2) == 1) {
                    System.out.println(enemy.getName() + " - Choose to BLOCK");
                    startFight();
                } else {
                    System.out.println(enemy.getName() + " - Choose to FIGHT");
                    player.setHealth(player.getHealth() - random.nextDouble(player.getLuck()) * enemy.getDamage());
                    startFight();
                }
            } else if (choice == 3) {
                if (random.nextDouble(100) <= player.luck * 100) {
                    System.out.println(player.getName() + " - SUCCESSFULLY RUN AWAY");
                } else {
                    System.out.println(player.getName() + " - UNSUCCESSFULLY RUN AWAY");
                    System.out.println(enemy.getName() + " - Choose to FIGHT");
                    player.setHealth(player.getHealth() - enemy.getDamage());
                    startFight();
                }
            } else {
                System.out.println("Invalid Input!");
                startFight();
            }
        }
    }

    public void writeHelp() {
        System.out.println(
                "\n1 - Fight ; 2 - Block ; 3 - Run Away"
        );
    }
}
