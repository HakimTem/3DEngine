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
public class Triangle {
     
    protected Vector[] points = new Vector[3];
    protected DConsole dc;
    
    public Triangle(Vector[] v, DConsole d){
      this.points =  v;
      this.dc = d;
    }
    
    public void drawTriangle(){
      dc.drawLine(points[0].xCoord, points[0].yCoord, points[1].xCoord, points[1].yCoord);
      dc.drawLine(points[1].xCoord, points[1].yCoord, points[2].xCoord, points[2].yCoord);
      dc.drawLine(points[2].xCoord, points[2].yCoord, points[0].xCoord, points[0].yCoord);
    }
}
