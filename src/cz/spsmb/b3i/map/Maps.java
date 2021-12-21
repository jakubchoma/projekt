package cz.spsmb.b3i;

import cz.spsmb.b3i.entities.Enemies;
import cz.spsmb.b3i.entities.Entity;
import cz.spsmb.b3i.entities.Player;
import cz.spsmb.b3i.map.content.Fight;
import cz.spsmb.b3i.map.content.Shop;

import java.util.Random;
import java.util.Scanner;

public class Maps {

    private Scanner scanner = new Scanner(System.in);
    private Random random = new Random();

    Player player;
    public enum MapElements {
        FIGHT,
        SHOP,
        CHEST
    }

    public Maps(Player player) {
        this.player = player;
        OrgForest();
    }

    public void OrgForest() {
        Entity[] enemies = {
                new Entity(Enemies.ORG),
                new Entity(Enemies.ORG),
                new Entity(Enemies.ORG)
        };
        for (Entity enemy : enemies) {
            enemy.setRandomNameAdjective();
        }
        MapElements[][] map = {
            {MapElements.CHEST, MapElements.SHOP},
            {MapElements.FIGHT, MapElements.FIGHT, MapElements.FIGHT},
            {MapElements.SHOP, MapElements.CHEST},
            {MapElements.CHEST, MapElements.FIGHT, MapElements.FIGHT, MapElements.CHEST},
            {MapElements.FIGHT},
            {MapElements.SHOP, MapElements.SHOP}
        };
        System.out.println("\nORG FORTRESS:");
        System.out.println("As the only brave warrior, you set out to defeat the terrible Minotaur who ruled the world.");
        System.out.println("But along the way you came across Org Forest, one of the scariest forests that led to the castle.");
        Map(enemies, map);
        SpiderCave();
    }

    public void SpiderCave() {
        Entity[] enemies = {
                new Entity(Enemies.SPIDER),
                new Entity(Enemies.SPIDER),
                new Entity(Enemies.SPIDER)
        };
        for (Entity enemy : enemies) {
            enemy.setRandomNameAdjective();
        }
        MapElements[][] map = {
                {MapElements.SHOP},
                {MapElements.FIGHT, MapElements.CHEST, MapElements.FIGHT},
                {MapElements.SHOP, MapElements.CHEST},
                {MapElements.FIGHT, MapElements.FIGHT, MapElements.CHEST},
                {MapElements.FIGHT, MapElements.FIGHT},
                {MapElements.SHOP}
        };
        System.out.println("\nSPIDER CAVE:");
        System.out.println("When you finally passed through Org Forest, you came across Spider Cave,");
        System.out.println("where both monsters and a crew of lost soldiers were watching, who would be happy to help you.");
        Map(enemies, map);
        OldCastle();
    }

    public void OldCastle() {
        Entity[] enemies = {
                new Entity(Enemies.SKELETON),
                new Entity(Enemies.SKELETON),
                new Entity(Enemies.SKELETON)
        };
        for (Entity enemy : enemies) {
            enemy.setRandomNameAdjective();
        }
        MapElements[][] map = {
                {MapElements.SHOP},
                {MapElements.CHEST, MapElements.CHEST},
                {MapElements.FIGHT, MapElements.FIGHT, MapElements.FIGHT, MapElements.FIGHT},
                {MapElements.SHOP},
                {MapElements.FIGHT, MapElements.FIGHT},
                {MapElements.CHEST, MapElements.FIGHT, MapElements.CHEST},
                {MapElements.SHOP}
        };
        System.out.println("You went through Spider Cave.");
        Map(enemies, map);
        MinotaurBoss();
    }

    public void MinotaurBoss() {
        Entity[] enemies = {
                new Entity(Enemies.MINOTAUR)
        };
        for (Entity enemy : enemies) {
            enemy.setRandomNameAdjective();
        }
        MapElements[][] map = {
                {MapElements.SHOP},
                {MapElements.FIGHT}
        };
        System.out.println("\n BOSS:");
        System.out.println("Finally, the BOSS is watching you up close, now just get ready to execute him and get up to fight.");
        System.out.println("Buy a beer or something that will drive away his hideous stench.");
        Map(enemies, map);
        System.out.println();
    }

    public void Map(Entity[] enemies, MapElements[][] map) {
        int enemy = 0;
        for (MapElements[] mapElements : map) {
            System.out.print("\n( ");
            for (int j = 0; j < mapElements.length; j++) {
                System.out.print(j + " ");
            }
            System.out.println(")");
            System.out.print("Choose your way: ");
            int choice = scanner.nextInt();
            if (mapElements[choice] == MapElements.FIGHT) {
                System.out.println("You've encountered an Enemy.");
                new Fight(enemies[enemy], player).startFight();
                enemy++;
            } else if (mapElements[choice] == MapElements.SHOP) {
                System.out.println("You've encountered a Trader.");
                System.out.println(
                        "             _.oood\"\"\"\"\"\"\"booo._\n" +
                                "         _.o\"\"      _____    * \"\"o._\n" +
                                "       oP\"  _.ooo\"\"\"\"   \"\"\"\"o|o*_* \"Yo\n" +
                                "     o8   oP  _.-\":          | |\"._* `8o\n" +
                                "    d'  o8',-\"    :          | |/  ,\\* `b\n" +
                                "   d'  d.-\"      :           | |: (( `\\\n" +
                                "  8'  d' \"\"\"\"\":  :           | |  ||\\_/* `8\n" +
                                " 8   8'      :  :       |)   _ |  || |`|   8\n" +
                                ",8  8        :  :     /)| \\ || |\\_|| | |8  8.\n" +
                                "8' ,8       :  :      \" /_) |`:' | | | |8. `8\n" +
                                "8  8'       :  :        _ _='  \\ ' __   __  8\n" +
                                "8  8       :  :         \\|__ |  | |  | | 8| 8\n" +
                                "8  8.      :  :         ||   |  | |-:' | 8| 8\n" +
                                "8. `8     /   |      __/ |__ |__| |  \\ |__|,8\n" +
                                "`8  8   .'    \\     /     __ . . . . . .8LL8'\n" +
                                " 8   8.'       `-. (    ,'  `.`. | | ,-|8  8\n" +
                                "  8.(__________dd_) \\__/ '  0|`.`: |: (8 ,8\n" +
                                "   Y.  Y.                    | :/| |,\\|* .P\n" +
                                "    Y.  \"8.          .,o     | | |,|\"*  ,P\n" +
                                "     \"8.  \"Yo_               | |p|\"* ,8\"\n" +
                                "       \"Y_   `\"ooo.__   __.oo|\"* * _P\"\n" +
                                "         `'\"oo_     \"\"\"\"\"    * _oo\"\"'\n" +
                                "              `\"\"\"boooooood\"\"\"'"
                );
                new Shop(player).goShopping();
            } else if (mapElements[choice] == MapElements.CHEST) {
                System.out.println("You've found a chest.");
                System.out.println(
                        "                            _.--.\n" +
                                "                        _.-'_:-'||\n" +
                                "                    _.-'_.-::::'||\n" +
                                "               _.-:'_.-::::::'  ||\n" +
                                "             .'`-.-:::::::'     ||\n" +
                                "            /.'`;|:::::::'      ||_\n" +
                                "           ||   ||::::::'     _.;._'-._\n" +
                                "           ||   ||:::::'  _.-!oo @.!-._'-.\n" +
                                "           \\'.  ||:::::.-!()oo @!()@.-'_.|\n" +
                                "            '.'-;|:.-'.&$@.& ()$%-'o.'\\U||\n" +
                                "              `>'-.!@%()@'@_%-'_.-o _.|'||\n" +
                                "               ||-._'-.@.-'_.-' _.-o  |'||\n" +
                                "               ||=[ '-._.-\\U/.-'    o |'||\n" +
                                "               || '-.]=|| |'|      o  |'||\n" +
                                "               ||      || |'|        _| ';\n" +
                                "               ||      || |'|    _.-'_.-'\n" +
                                "               |'-._   || |'|_.-'_.-'\n" +
                                "            jgs '-._'-.|| |' `_.-'\n" +
                                "                    '-.||_/.-'\n"
                );
                int coins = random.nextInt(100) + 1;
                player.setWallet(player.getWallet() + coins);
                System.out.println(" - You gain " + coins + " CR (" + player.getWallet() + ")");
            }
        }
    }

}
