/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg3dengine;

import DLibX.DConsole;

/**
 *
 * @author temacinh
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        DConsole dc = new DConsole();
        
        
         
        Vector v1 = new Vector(0.0f, 0.0f, 0.0f);
        Vector v2 = new Vector(1.0f, 0.0f, 0.0f);
        Vector v3 = new Vector(0.0f, 1.0f, 0.0f);
        
        Vector [] grr = {v1, v2, v3};
        
        Triangle t1 = new Triangle(grr, dc);
        
        while(true){
          dc.clear();
          
          
          DConsole d = new DConsole();
          
          
          dc.redraw();
          dc.pause(20);
        }
    }
    
}
