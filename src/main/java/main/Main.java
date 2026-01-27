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
        List<Enemy> Standard = new ArrayList<>();
        List<Enemy> Tank = new ArrayList<>();   
        List<Enemy> Fast = new ArrayList<>();
        for (int i = 0; i < 2; i++) {
        Standard.add(new Enemy(5,5,50,5,0,0,null,"Standard"));            
        }
        for (int i = 0; i < 3; i++) {
        Tank.add(new Enemy(5,5,50,5,0,0,null,"Tank"));           
        }
        Enemy banana = new Enemy(8,3,85,7,0,0,null,"Banana");
        Timer timer = new Timer();
        TimerTask timerTask = new TimerTask() {
            @Override
            public void run() {
            if(Tickloop==41){
                Tickloop=21;
            }
                for (int i = 1; i < Tickloop; i++) {
                    if (Tickcount % i == 0) {
                    switch(i){
                        case 1:
                        break;
                        case 2: 
                        break;
                        case 3:
                        break;
                        case 4: 
                        break;
                        case 5: 
                            for (int j = 0; j < Standard.size(); j++) {
                            Standard.get(j).update();    
                            }
                        break;
                        case 6: 
                        break;
                        case 7: 
                        break;
                        case 8:   
                        break;
                        case 9:  
                        break;
                        case 10: 
                        break;    
                        case 11: 
                            for (int j = 0; j < Tank.size(); j++) {
                            Tank.get(j).update();    
                            }
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
                    }   
                    }
    
                }
            Tickcount++; 
            Tickloop++;
            }
        };

            timer.scheduleAtFixedRate(timerTask,0, 1000);
    }
}
