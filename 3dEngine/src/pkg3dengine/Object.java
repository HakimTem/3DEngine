/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg3dengine;

import DLibX.DConsole;
import java.util.ArrayList;

/**
 *
 * @author temacinh
 */
public class Object {
    
    protected ArrayList<Triangle> mesh = new ArrayList();
    protected DConsole dc;
    
    public Object(ArrayList<Triangle> m, DConsole d){
      this.mesh = m;
      this.dc = d;
    }
    
    public void drawEverything(){
      mesh.forEach(triangle -> {
        triangle.drawTriangle();
      });
    }
    
    
}
