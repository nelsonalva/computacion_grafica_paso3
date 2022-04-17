package brujita;

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
        drawer.setStroke(pincel);

        // ROSTRO
        // Contorno de rostro
        int[] xValuesFace = {170, 340, 380, 380, 310, 190, 125, 125};
        int[] yValuesFace = {270, 270, 400, 440, 500, 500, 440, 400};
        Brujita.drawPolygon(drawer, xValuesFace, yValuesFace, Color.GREEN, xValuesFace.length, true);
        // Ojos
        Brujita.drawSquare(drawer, 180, 290, 60, 60, Color.WHITE, true);
        Brujita.drawSquare(drawer, 200, 310, 40, 40, Color.BLACK, true);

        Brujita.drawSquare(drawer, 270, 290, 60, 60, Color.WHITE, true);
        Brujita.drawSquare(drawer, 270, 310, 40, 40, Color.BLACK, true);
        // Nariz
        Brujita.drawLine(drawer, 270, 350, 150, 350, Color.BLACK);
        Brujita.drawLine(drawer, 150, 350, 150, 390, Color.BLACK);
        Brujita.drawLine(drawer, 150, 390, 270, 390, Color.BLACK);
        // Boca
        Brujita.drawLine(drawer, 190, 410, 190, 430, Color.BLACK);
        Brujita.drawLine(drawer, 190, 430, 210, 450, Color.BLACK);
        Brujita.drawLine(drawer, 210, 450, 290, 450, Color.BLACK);
        Brujita.drawLine(drawer, 290, 450, 310, 430, Color.BLACK);
        Brujita.drawLine(drawer, 310, 430, 310, 410, Color.BLACK);

        // ESCOBA
        Brujita.drawSquare(drawer, 20, 670, 460, 20, Color.RED, true);

        int[] xValuesBroom = {500, 690, 690, 500, 480, 480};
        int[] yValuesBroom = {610, 610, 755, 755, 690, 670};
        Brujita.drawPolygon(drawer, xValuesBroom, yValuesBroom, Color.ORANGE, xValuesBroom.length, true);

        // CUERPO
        int[] xValuesBody = {190, 310, 380, 380, 125, 125};
        int[] yValuesBody = {500, 500, 670, 690, 690, 670};
        Brujita.drawPolygon(drawer, xValuesBody, yValuesBody, Color.MAGENTA, xValuesBody.length, true);

        // BRAZOS
        // Brazo izquierdo
        int[] xValuesLArm = {60, 190, 170, 80};
        int[] yValuesLArm = {630, 503, 580, 650};
        Brujita.drawPolygon(drawer, xValuesLArm, yValuesLArm, Color.MAGENTA, xValuesLArm.length, true);
        // Mano izquierda
        int[] xValuesLHand = {40, 60, 80, 80, 40};
        int[] yValuesLHand = {650, 630, 650, 670, 670};
        Brujita.drawPolygon(drawer, xValuesLHand, yValuesLHand, Color.GREEN, xValuesLHand.length, true);
        // Brazo derecho
        int[] xValuesRArm = {310, 440, 460, 330, 310};
        int[] yValuesRArm = {500, 480, 500, 560, 500};
        Brujita.drawPolygon(drawer, xValuesRArm, yValuesRArm, Color.MAGENTA, xValuesRArm.length, true);
        // Mano derecha
        int[] xValuesRHand = {440, 460, 460, 480, 500, 460, 440};
        int[] yValuesRHand = {440, 440, 460, 440, 480, 500, 480};
        Brujita.drawPolygon(drawer, xValuesRHand, yValuesRHand, Color.GREEN, xValuesRHand.length, true);

        // PIERNAS
        // Pierna izquierda
        int[] xValuesLLeg = {190, 230, 250, 270, 270, 230};
        int[] yValuesLLeg = {690, 690, 750, 750, 770, 770};
        Brujita.drawPolygon(drawer, xValuesLLeg, yValuesLLeg, Color.GREEN, xValuesLLeg.length, true);
        // Media izquierda
        Brujita.drawSquare(drawer, 270, 750, 20, 20, Color.YELLOW, true);
        // Pie izquierdo
        int[] xValuesLFoot = {290, 330, 330, 310, 290};
        int[] yValuesLFoot = {750, 750, 820, 770, 770};
        Brujita.drawPolygon(drawer, xValuesLFoot, yValuesLFoot, Color.BLACK, xValuesLFoot.length, true);
        // Pierna derecha
        int[] xValuesRLeg = {270, 310, 330, 350, 350, 310};
        int[] yValuesRLeg = {690, 690, 730, 730, 750, 750};
        Brujita.drawPolygon(drawer, xValuesRLeg, yValuesRLeg, Color.GREEN, xValuesRLeg.length, true);
        // Media derecha
        Brujita.drawSquare(drawer, 350, 730, 20, 20, Color.YELLOW, true);
        // Pie derecho
        int[] xValuesRFoot = {370, 410, 410, 390, 370};
        int[] yValuesRFoot = {730, 730, 800, 750, 750};
        Brujita.drawPolygon(drawer, xValuesRFoot, yValuesRFoot, Color.BLACK, xValuesRFoot.length, true);

        // SOMBRERO
        // Base
        Brujita.drawSquare(drawer, 20, 250, 460, 20, Color.MAGENTA, true);
        // Hoodie
        int[] xValuesHoodie = {250, 340, 290, 390, 120};
        int[] yValuesHoodie = {20, 80, 80, 250, 250};
        Brujita.drawPolygon(drawer, xValuesHoodie, yValuesHoodie, Color.MAGENTA, xValuesHoodie.length, true);
        // Franja
        int[] xValuesFrame = {170, 340, 365, 145};
        int[] yValuesFrame = {170, 170, 210, 210};
        Brujita.drawPolygon(drawer, xValuesFrame, yValuesFrame, Color.BLACK, xValuesFrame.length, true);
        // Hebilla
        Brujita.drawSquare(drawer, 210, 150, 80, 80, Color.YELLOW, true);
        Brujita.drawSquare(drawer, 230, 168, 43, 43, Color.BLACK, true);

        // CABELLO
        int[] xValuesLHair = {120, 170, 100, 80, 110, 60, 40, 90, 20, 2};
        int[] yValuesLHair = {270, 270, 460, 440, 360, 420, 400, 330, 400, 380};
        Brujita.drawPolygon(drawer, xValuesLHair, yValuesLHair, Color.BLACK, xValuesLHair.length, true);

        int[] xValuesRHair = {380, 340, 400, 420, 390, 440, 460, 410, 480, 500};
        int[] yValuesRHair = {270, 270, 460, 440, 360, 420, 400, 330, 400, 380};
        Brujita.drawPolygon(drawer, xValuesRHair, yValuesRHair, Color.BLACK, xValuesRHair.length, true);

        //LUNA
        int[] xValuesMoon = {520, 590, 630, 650, 650, 630, 590, 520, 560, 590, 590, 560};
        int[] yValuesMoon = {10, 10, 30, 70, 150, 190, 220, 210, 190, 150, 60, 30};
        Brujita.drawPolygon(drawer, xValuesMoon, yValuesMoon, Color.YELLOW, xValuesMoon.length, true);
    }
}
