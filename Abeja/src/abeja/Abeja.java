package abeja;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Polygon;
import java.awt.geom.Arc2D;

public class Abeja {

    public static void main(String[] args) {
        Ventana ventana = new Ventana();
        ventana.setVisible(true);
    }
    
        
    public static void drawPolygon(Graphics2D drawer, int[] xValues, int[] yValues, Color color, int sides, boolean isFull) {
        drawer.setColor(color);
        Polygon polygon = new Polygon(xValues, yValues, sides);

        if (isFull) {
            drawer.fill(polygon);
            drawer.setColor(Color.BLACK);
            drawer.draw(polygon);
        } else {
            drawer.draw(polygon);
        }
    }
    
    public static void drawArc (Graphics2D drawer) {
        
//        Arc2D arc = new Arc2D.Double(100, 100, 160, 160, 90, 180, Arc2D.CHORD);
        Arc2D arc2 = new Arc2D.Double(100, 100, 160, 160, 180, 50, Arc2D.CHORD);
        Arc2D arc3 = new Arc2D.Double(100, 100, 160, 160, 180, 180, Arc2D.CHORD);
        
//        drawer.draw(arc);
        drawer.draw(arc2);
        drawer.draw(arc3);
        
    }
}
