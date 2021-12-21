package cz.spsmb.b3i.entities;

public class Player extends Entity {

    public int wallet;

    public Player(String name, double health, double damage, double luck, int wallet) {
        super(name, health, damage, luck);
        this.wallet = wallet;
    }

    public int getWallet() {
        return wallet;
    }

    public void setWallet(int wallet) {
        this.wallet = wallet;
    }
}
