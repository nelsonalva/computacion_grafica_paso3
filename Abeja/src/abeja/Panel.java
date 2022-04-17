package abeja;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Stroke;
import javax.swing.JPanel;

public class Panel extends JPanel {

    @Override
    public void paint(Graphics g) {

        Graphics2D drawer = (Graphics2D) g;

        Stroke pincel = new BasicStroke(5.0f);
        Stroke pincel2 = new BasicStroke(100.0f);
        drawer.setStroke(pincel);

        // LÁPIZ
        Abeja.drawLine(drawer, 90, 340, 320, 340, Color.BLACK);
        Abeja.drawLine(drawer, 90, 430, 320, 430, Color.BLACK);
        
        // Cuerpo lápiz
        int[] xValuesPencil = {320, 370, 320, 310};
        int[] yValuesPencil = {340, 385, 430, 385};
        Abeja.drawPolygon(drawer, xValuesPencil, yValuesPencil, Color.BLACK, xValuesPencil.length, false);

        // Punta lápiz
        int[] xValuesPointer = {350, 370, 350, 345};
        int[] yValuesPointer = {370, 385, 400, 385};
        Abeja.drawPolygon(drawer, xValuesPointer, yValuesPointer, Color.BLACK, xValuesPointer.length, true);
            
        // borrador lápiz 
        Abeja.drawArc(drawer, 60, 340, 80, 90, 90, 180, Color.RED, false);
        Abeja.drawArc(drawer, 100, 340, 40, 90, 110, 140, Color.BLACK, false);  
        Abeja.drawArc(drawer, 120, 340, 40, 90, 110, 140, Color.BLACK, false); 
  
        // ALAS
        Abeja.drawTiltedEllipse(drawer, 90, 40, 80, 160, Color.BLACK, false, 140);
        Abeja.drawTiltedEllipse(drawer, 190, 40, 80, 160, Color.BLACK, false, 10);



        // CUERPO
        Abeja.drawEllipse(drawer, 50, 160, 280, 190, Color.YELLOW, true);

        Abeja.drawArc(drawer, 150, 160, 50, 190, 90, 180, Color.BLACK, false);
        Abeja.drawArc(drawer, 200, 160, 50, 185, 90, 180, Color.BLACK, false);
        Abeja.drawArc(drawer, 100, 170, 40, 170, 90, 180, Color.BLACK, false);

        // OJOS
        Abeja.drawEllipse(drawer, 265, 90, 140, 160, Color.WHITE, true);
        Abeja.drawEllipse(drawer, 190, 90, 140, 160, Color.WHITE, true);
        Abeja.drawEllipse(drawer, 240, 140, 50, 50, Color.BLACK, true);
        Abeja.drawEllipse(drawer, 330, 140, 50, 50, Color.BLACK, true);

        // BOCA
        Abeja.drawArc(drawer, 250, 250, 50, 30, 200, 140, Color.BLACK, false);
        
        // Nombre
        Abeja.drawLine(drawer, 150, 360, 150, 410, Color.BLACK);
        Abeja.drawLine(drawer, 150, 360, 170, 410, Color.BLACK);        
        Abeja.drawLine(drawer, 170, 410, 170, 360, Color.BLACK);
        Abeja.drawArc(drawer, 180, 380, 30, 30, 20, 300, Color.BLACK, false);        
        Abeja.drawLine(drawer, 185, 392, 208, 392, Color.BLACK);
        Abeja.drawLine(drawer, 215, 360, 215, 410, Color.BLACK);
        Abeja.drawArc(drawer, 225, 380, 30, 15, 90, 180, Color.BLACK, false);        
        Abeja.drawArc(drawer, 215, 393, 30, 15, 270, 180, Color.BLACK, false);  
        Abeja.drawEllipse(drawer, 250, 380, 25, 30, Color.WHITE, true);
        Abeja.drawLine(drawer, 280, 380, 280, 410, Color.BLACK);        
        Abeja.drawArc(drawer, 225, 380, 30, 15, 90, 180, Color.BLACK, false);        
        Abeja.drawArc(drawer, 281, 385, 25, 50, 360, 180, Color.BLACK, false);   
        
    }
}
