package cz.spsmb.b3i.entities;

import java.util.Locale;
import java.util.Random;

public class Entity {

    private Random random = new Random();

    public String name;
    public double health;
    public double damage;
    public double luck;

    public Entity(String name, double health, double damage, double luck) {
        this.name = name;
        this.health = health;
        this.damage = damage;
        this.luck = luck;
    }

    public Entity(Enemies enemies) {
        this.name = enemies.getEntity().name;
        this.health = enemies.getEntity().health;
        this.damage = enemies.getEntity().damage;
        this.luck = enemies.getEntity().luck;
    }


    public void getASCII() {
        if (this.name.contains("SKELETON")) {
            System.out.println(
                    "                              _.--\"\"-._\n" +
                            "  .                         .\"         \".\n" +
                            " / \\    ,^.         /(     Y             |      )\\\n" +
                            "/   `---. |--'\\    (  \\__..'--   -   -- -'\"\"-.-'  )\n" +
                            "|        :|    `>   '.     l_..-------.._l      .'\n" +
                            "|      __l;__ .'      \"-.__.||_.-'v'-._||`\"----\"\n" +
                            " \\  .-' | |  `              l._       _.'\n" +
                            "  \\/    | |                   l`^^'^^'j\n" +
                            "        | |                _   \\_____/     _\n" +
                            "        j |               l `--__)-'(__.--' |\n" +
                            "        | |               | /`---``-----'\"1 |  ,-----.\n" +
                            "        | |               )/  `--' '---'   \\'-'  ___  `-.\n" +
                            "        | |              //  `-'  '`----'  /  ,-'   I`.  \\\n" +
                            "      _ L |_            //  `-.-.'`-----' /  /  |   |  `. \\\n" +
                            "     '._' / \\         _/(   `/   )- ---' ;  /__.J   L.__.\\ :\n" +
                            "      `._;/7(-.......'  /        ) (     |  |            | |\n" +
                            "      `._;l _'--------_/        )-'/     :  |___.    _._./ ;\n" +
                            "        | |                 .__ )-'\\  __  \\  \\  I   1   / /\n" +
                            "        `-'                /   `-\\-(-'   \\ \\  `.|   | ,' /\n" +
                            "                           \\__  `-'    __/  `-. `---'',-'\n" +
                            "                              )-._.-- (        `-----'\n" +
                            "                             )(  l\\ o ('..-.\n" +
                            "                       _..--' _'-' '--'.-. |\n" +
                            "                __,,-'' _,,-''            \\ \\\n" +
                            "               f'. _,,-'                   \\ \\\n" +
                            "              ()--  |                       \\ \\\n" +
                            "                \\.  |                       /  \\\n" +
                            "                  \\ \\                      |._  |\n" +
                            "                   \\ \\                     |  ()|\n" +
                            "                    \\ \\                     \\  /\n" +
                            "                     ) `-.                   | |\n" +
                            "                    // .__)                  | |\n" +
                            "                 _.//7'                      | |\n" +
                            "               '---'                         j_| `\n" +
                            "                                            (| |\n" +
                            "                                             |  \\\n" +
                            "                                             |lllj\n" +
                            "                                             |||||  -nabis"
            );

        } else if (this.name.contains("SPIDER")) {
            System.out.println(
                    "           ;               ,           \n" +
                            "         ,;                 '.         \n" +
                            "        ;:                   :;        \n" +
                            "       ::                     ::       \n" +
                            "       ::                     ::       \n" +
                            "       ':                     :        \n" +
                            "        :.                    :        \n" +
                            "     ;' ::                   ::  '     \n" +
                            "    .'  ';                   ;'  '.    \n" +
                            "   ::    :;                 ;:    ::   \n" +
                            "   ;      :;.             ,;:     ::   \n" +
                            "   :;      :;:           ,;\"      ::   \n" +
                            "   ::.      ':;  ..,.;  ;:'     ,.;:   \n" +
                            "    \"'\"...   '::,::::: ;:   .;.;\"\"'    \n" +
                            "        '\"\"\"....;:::::;,;.;\"\"\"         \n" +
                            "    .:::.....'\"':::::::'\",...;::::;.   \n" +
                            "   ;:' '\"\"'\"\";.,;:::::;.'\"\"\"\"\"\"  ':;   \n" +
                            "  ::'         ;::;:::;::..         :;  \n" +
                            " ::         ,;:::::::::::;:..       :: \n" +
                            " ;'     ,;;:;::::::::::::::;\";..    ':.\n" +
                            "::     ;:\"  ::::::\"\"\"'::::::  \":     ::\n" +
                            " :.    ::   ::::::;  :::::::   :     ; \n" +
                            "  ;    ::   :::::::  :::::::   :    ;  \n" +
                            "   '   ::   ::::::....:::::'  ,:   '   \n" +
                            "    '  ::    :::::::::::::\"   ::       \n" +
                            "       ::     ':::::::::\"'    ::       \n" +
                            "       ':       \"\"\"\"\"\"\"'      ::       \n" +
                            "        ::                   ;:        \n" +
                            "        ':;                 ;:\"        \n" +
                            "-hrr-     ';              ,;'          \n" +
                            "            \"'           '\"            \n" +
                            "              '"
            );
        } else if (this.name.contains("BANDIT")) {
            System.out.println(
                    "                                             ,--,  ,.-.\n" +
                            "               ,                   \\,       '-,-`,'-.' | ._\n" +
                            "              /|           \\    ,   |\\         }  )/  / `-,',\n" +
                            "              [ ,          |\\  /|   | |        /  \\|  |/`  ,`\n" +
                            "              | |       ,.`  `,` `, | |  _,...(   (      .',\n" +
                            "              \\  \\  __ ,-` `  ,  , `/ |,'      Y     (   /_L\\\n" +
                            "               \\  \\_\\,``,   ` , ,  /  |         )         _,/\n" +
                            "                \\  '  `  ,_ _`_,-,<._.<        /         /\n" +
                            "                 ', `>.,`  `  `   ,., |_      |         /\n" +
                            "                   \\/`  `,   `   ,`  | /__,.-`    _,   `\\\n" +
                            "               -,-..\\  _  \\  `  /  ,  / `._) _,-\\`       \\\n" +
                            "                \\_,,.) /\\    ` /  / ) (-,, ``    ,        |\n" +
                            "               ,` )  | \\_\\       '-`  |  `(               \\\n" +
                            "              /  /```(   , --, ,' \\   |`<`    ,            |\n" +
                            "             /  /_,--`\\   <\\  V /> ,` )<_/)  | \\      _____)\n" +
                            "       ,-, ,`   `   (_,\\ \\    |   /) / __/  /   `----`\n" +
                            "      (-, \\           ) \\ ('_.-._)/ /,`    /\n" +
                            "      | /  `          `/ \\\\ V   V, /`     /\n" +
                            "   ,--\\(        ,     <_/`\\\\     ||      /\n" +
                            "  (   ,``-     \\/|         \\-A.A-`|     /\n" +
                            " ,>,_ )_,..(    )\\          -,,_-`  _--`\n" +
                            "(_ \\|`   _,/_  /  \\_            ,--`\n" +
                            " \\( `   <.,../`     `-.._   _,-`"
            );
        } else if (this.name.contains("ORG")) {
            System.out.println(
                    "           _......._\n" +
                            "       .-'.'.'.'.'.'.`-.\n" +
                            "     .'.'.'.'.'.'.'.'.'.`.\n" +
                            "    /.'.'               '.\\\n" +
                            "    |.'    _.--...--._     |\n" +
                            "    \\    `._.-.....-._.'   /\n" +
                            "    |     _..- .-. -.._   |\n" +
                            " .-.'    `.   ((@))  .'   '.-.\n" +
                            "( ^ \\      `--.   .-'     / ^ )\n" +
                            " \\  /         .   .       \\  /\n" +
                            " /          .'     '.  .-    \\\n" +
                            "( _.\\    \\ (_`-._.-'_)    /._\\)\n" +
                            " `-' \\   ' .--.          / `-'\n" +
                            "     |  / /|_| `-._.'\\   |\n" +
                            "     |   |       |_| |   /-.._\n" +
                            " _..-\\   `.--.______.'  |\n" +
                            "      \\       .....     |\n" +
                            "       `.  .'      `.  /\n" +
                            "         \\           .'\n" +
                            "  LGB     `-..___..-`"
            );
        }
    }

    public void setRandomNameAdjective() {
        String[] adjectives = {
                "ANGRY",
                "OBNOXIOUS",
                "NASTY",
                "GRISLY",
                "TERRIBLE",
                "GRIM",
                "HATEFUL",
                "HIDEOUS",
                "SHOCKING",
                "FEARFUL",
                "FRIGHTENING",
                "BAD LOOKING",
                "HANDSOME",
                "SERIOUS",
                "THAT ANGRY",
                "THE",
                "POOR",
                "RAGE"
        };
        this.setName(adjectives[random.nextInt(adjectives.length)] + " " + this.getName());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name.toUpperCase(Locale.ROOT);
    }

    public double getHealth() {
        return health;
    }

    public void setHealth(double health) {
        this.health = health;
    }

    public double getDamage() {
        return damage;
    }

    public void setDamage(double damage) {
        this.damage = damage;
    }

    public double getLuck() {
        return luck;
    }

    public void setLuck(double luck) {
        this.luck = luck;
    }
}
