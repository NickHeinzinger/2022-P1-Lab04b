// Lab04bvst.java
// The AWT Graphics Program
// This is the student, starting version of Lab04b.


import sun.java2d.loops.DrawRect;

import java.awt.*;
import java.applet.*;


public class Lab04bvst extends Applet
{

    public void paint(Graphics g)
    {
        // DRAW CUBE
g.drawRect(25,25, 100, 100);
g.drawRect(50,50, 100, 100);
g.drawLine(25, 25, 50, 50);
g.drawLine(125, 25, 150, 50);
g.drawLine(25, 125, 50, 150);
g.drawLine(125, 125, 150, 150);

        // DRAW SPHERE
g.drawOval(35, 35, 105,105);
g.drawOval(45, 35, 85,105);
g.drawOval(55, 35, 65,105);
g.drawOval(65, 35, 45,105);
g.drawOval(75, 35, 25,105);
g.drawOval(85, 35, 5,105);

g.drawOval(35, 45, 105,85);
g.drawOval(35, 55, 105,65);
g.drawOval(35, 65, 105,45);
g.drawOval(35, 75, 105,25);
g.drawOval(35, 85, 105,5);

        // DRAW INSCRIBED/CIRCUMSCRIBED TRIANGLE
g.drawOval(250,50, 100, 100); //Origin (300,100) r=50

g.drawLine(250,100, 300, 150);
g.drawLine(250,100, 300, 50);
g.drawLine(300,150, 300, 50);

g.drawOval(259,79, 41,41);


        // DRAW APCS
 // A
g.fillRect(50,200, 10, 55);
g.fillRect(75,200, 10, 55);
g.fillRect(60,200, 15, 10);
g.fillRect(60,220, 15, 10);

//P
g.fillRect(100,200, 10, 55);
g.fillRect(110,200, 15, 10);
g.fillRect(110,220, 15, 10);
g.fillRect(125,200, 10, 30);

//C
g.fillRect(150,200, 10, 55);
g.fillRect(160,200, 20, 10);
g.fillRect(160,245, 20, 10);

//S
g.fillRect(210,200, 20, 10);
g.fillRect(200,200, 10, 30);
g.fillRect(200,223, 30, 10);
g.fillRect(220,225, 10, 30);
g.fillRect(200,245, 20, 10);

        // DRAW PACMEN FLOWER
g.fillArc(310,200,51,51,45,270);
g.fillArc(275,165,51,51,135,270);
g.fillArc(240,200,51,51,225,270);
g.fillArc(275,235,51,51,-45,270);


    }

}


