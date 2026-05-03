
package gamelogic;

import assets.actors.Enemy;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;
import main.lilC;


public class Ticks {
//hier stehen alle Ticks, die in dem Game benutzt werden, in einer übersichtlichen Class    
private lilC c;

    public Ticks(lilC c) {
        this.c = c;
    //E... Timer regeln update() Zyklus der Gegner, d.h. z.B. bei EStandard: alle Standard Enemies bewegen sich alle 9 millisekunden um einen pixel   
        Timer EStandard = new Timer(9, (ActionEvent e) -> {
            for (int i = 0; i < Enemy.Standard.size(); i++) {
            Enemy.Standard.get(i).update();    
            }
        c.repaint();    
        }); 
        EStandard.start();
        
        Timer EFast = new Timer(5, (ActionEvent e) -> {
            for (int i = 0; i < Enemy.Fast.size(); i++) {
            Enemy.Fast.get(i).update();    
            }
        c.repaint();    
        }); 
        EFast.start();
        
        Timer ETank = new Timer(20, (ActionEvent e) -> {
            for (int i = 0; i < Enemy.Tank.size(); i++) {
            Enemy.Tank.get(i).update();    
            }
        c.repaint();    
        }); 
        ETank.start();

    }
    
}
