
package brujita;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Polygon;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;

public class Brujita {

    // MÉTODO PRINCIPAL
    public static void main(String[] args) {
        Ventana ventana = new Ventana();
        ventana.setVisible(true);
    }
    
    public static void drawLine(Graphics2D drawer, int coor1, int coor2, int coor3, int coor4, Color color) {
        drawer.setColor(color);
        Line2D line = new Line2D.Double(coor1, coor2, coor3, coor4);
        drawer.draw(line);
    }

    public static void drawSquare(Graphics2D drawer, int coor1, int coor2, int coor3, int coor4, Color color, boolean isFull) {
        drawer.setColor(color);
        Rectangle2D rectangle = new Rectangle2D.Double(coor1, coor2, coor3, coor4);

        if (isFull) {
            drawer.fill(rectangle);
            drawer.setColor(Color.BLACK);
            drawer.draw(rectangle);
        } else {
            drawer.draw(rectangle);
        }
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
    
}
