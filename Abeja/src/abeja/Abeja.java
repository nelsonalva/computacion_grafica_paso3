package abeja;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Polygon;
import java.awt.geom.Arc2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;

public class Abeja {

    public static void main(String[] args) {
        Ventana ventana = new Ventana();
        ventana.setVisible(true);

    }

    public static void drawLine(Graphics2D drawer, int coor1, int coor2, int coor3, int coor4, Color color) {
        drawer.setColor(color);
        Line2D line = new Line2D.Double(coor1, coor2, coor3, coor4);
        drawer.draw(line);
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

    public static void drawArc(Graphics2D drawer, int xValue, int yValue, int width, int height, int startAngle, int arcAngle, Color color, boolean isChord) {

        drawer.setColor(color);
        Arc2D arc;

        if (isChord) {
            arc = new Arc2D.Double(xValue, yValue, width, height, startAngle, arcAngle, Arc2D.CHORD);
        } else {
            arc = new Arc2D.Double(xValue, yValue, width, height, startAngle, arcAngle, Arc2D.OPEN);

        }

        drawer.draw(arc);
    }

    public static void drawEllipse(
            Graphics2D drawer, int xValue, int yValue, int width, int height, Color color, boolean isFull) {
        Ellipse2D ellipse = new Ellipse2D.Double(xValue, yValue, width, height);

        drawer.setColor(color);

        if (isFull) {
            drawer.fill(ellipse);
            drawer.setColor(Color.BLACK);
            drawer.draw(ellipse);
        } else {

            drawer.draw(ellipse);
        }
    }

    public static void drawTiltedEllipse(
            Graphics2D drawer, int xValue, int yValue, int width, int height, Color color, boolean isFull, int angle) {
        Ellipse2D ellipse = new Ellipse2D.Double(xValue, yValue, width, height);

        drawer.setColor(color);

        drawer.rotate(Math.toRadians(angle), xValue + width / 2, yValue + height / 2);

        drawer.draw(ellipse);

        drawer.rotate(Math.toRadians(360 - angle), xValue + width / 2, yValue + height / 2);
    }

}
