package assets.actors;

import assets.GameAsset;
import javax.swing.ImageIcon;

public class Enemy extends GameAsset {

    int damage, velocity, healthpoints, bounty;

    public Enemy(int x, int y, ImageIcon img, String name) {
        super(x, y, img, name);
        this.damage = 10;
        this.velocity = 5;
        this.healthpoints = 100;
        this.bounty = 5;

    }

    public Enemy(int damage, int velocity, int healthpoints, int bounty, int x, int y, ImageIcon img, String name) {
        super(x,y,img, name);
        this.damage = damage;
        this.velocity = velocity;
        this.healthpoints = healthpoints;
        this.bounty = bounty;
    }
    
    
    public void update() {
        //Gegner um ein Feld bewegen
        System.out.println("update"+this.getName());
     //   this.setX(tile[a+1].getx);
    }

    public int getDamage() {
        return damage;
    }


    public int getVelocity() {
        return velocity;
    }


    public int getHealthpoints() {
        return healthpoints;
    }

    public void setHealthpoints(int healthpoints) {
        this.healthpoints = healthpoints;
    }
    public void takeDamage(int damage){
    this.healthpoints -= damage;
        if (healthpoints <= 0) {
        this.die();    
        }
    }
    public int die(){
    //Lösch den Enemy
    return bounty;
    }
    public int getBounty() {
        return bounty;
    }
    public int doDamage(){  
    return damage;    
    }
}
