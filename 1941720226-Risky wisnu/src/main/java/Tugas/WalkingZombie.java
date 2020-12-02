/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas;

/**
 *
 * @author Risky
 */
public class WalkingZombie extends Zombie {

    public WalkingZombie(int health, int level) {
        this.health = health;
        this.level = level;
    }

    @Override
    public void heal() {
        switch (this.level) {
            case 1:
                this.health = (int) (this.health + (this.health * 0.1));
                break;
            case 2:
                this.health = (int) (this.health + (this.health * 0.3));
                break;
            case 3:
                this.health = (int) (this.health + (this.health * 0.4));
                break;
        }
    }

    @Override
    public void destroyed() {
        int destroy = (int) (this.health * 0.2);
        this.health = this.health - destroy;
    }

    @Override
    public String getZombieInfo() {
        String info = "Walking Zombie Data\n";
        info += "Health = " + health + "\n";
        info += "Level = " + level + "\n";
        return info;
    }
}
