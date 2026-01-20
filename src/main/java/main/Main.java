/*----------------------------------------------------------------------------------------
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See LICENSE in the project root for license information.
 *---------------------------------------------------------------------------------------*/

package main;

import assets.actors.Enemy;
import assets.actors.Tower;
import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

public class Main {
    static Enemy one[] = {null,null,null,null,null};
    static Enemy eight[] = {null,null,null,null,null};
    static int Tickcount = 0;
    static int Tickloop = 1;
    public static void main(String[] args) {
        System.out.println("Hello Remote World!");

        Tower p = new Tower(0, 0, null, "Peter");
        System.out.println(p.getName());
        p.setName("fghjklö");
        System.out.println(p.getName());
        List<Enemy> Enemies = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
        Enemies.add(new Enemy(5,5,50,5,0,0,null,"Fish"));            
        }
        for (int i = 0; i < Enemies.size(); i++) {
            System.out.println(Enemies.get(i).getName());    
        }
        Enemy banana = new Enemy(8,3,85,7,0,0,null,"Banana");
        Timer timer = new Timer();
        TimerTask timerTask = new TimerTask() {
            @Override
            public void run() {
            if(Tickloop==20){
                Tickloop=1;
            }
                for (int i = 1; i < Tickloop; i++) {
                    if (Tickcount % i == 0) {
                    switch(i){
                        case 1:
                        break;
                        case 2: 
                        break;
                        case 3:
                        banana.update();
                        break;
                        case 4: 
                        break;
                        case 5: 
                            for (int j = 0; j < Enemies.size(); j++) {
                            Enemies.get(j).update();    
                            }
                        break;
                        case 6: 
                        break;
                        case 7: 
                        break;
                        case 8:   
                        for (Enemy eight1 : eight) {
                            eight1.update();
                        }
                        break;
                        case 9:  
                        break;
                        case 10: 
                        break;    
                        case 11: 
                        break;    
                        case 12: 
                        break;    
                        case 13: 
                        break;    
                        case 14: 
                        break;    
                        case 15: 
                        break;    
                        case 16: 
                        break;
                        case 17: 
                        break;
                        case 18: 
                        break;    
                        case 19:
                        break;
                        case 20:  
                        break;
                        default: 
                            System.out.println("Fehler bei ticks");
                        break;
                    }   
                    }
    
                }
            Tickcount++; 
            Tickloop++;
            }
        };
        while (true) {
            timer.schedule(timerTask, 100);
        }
    }
}
