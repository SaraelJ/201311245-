package com.j1;
import ch.aplu.turtle.*;
import java.awt.geom.Point2D;

public class Draw_Star_Start{
  static Turtle t1 = new Turtle();
  static Point2D p1 = new Point2D.Double(10.0,20.0);
  public Draw_Star_Start(){};
  
  public static void drawStar(int size,double x,double y){
     t1.setPos(x,y);
     for(int i=0;i<5;i++){
     t1.forward(size);
     t1.right(144);
     }
  }
  
  public static void main(String[] args){
    double x=p1.getX();
    double y=p1.getY();
    Draw_Star_Start s=new Draw_Star_Start();
    drawStar(100,30,30);
  }
}
