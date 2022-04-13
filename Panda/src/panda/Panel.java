package panda;

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

        // CONTORNO EXTERIOR ROSTRO
        int[] xValuesFace1 = {340, 425, 505, 470, 365, 335, 300, 200, 165, 250};
        int[] yValuesFace1 = {100, 130, 290, 390, 430, 410, 430, 380, 290, 130};
        Panda.drawPolygon(drawer, xValuesFace1, yValuesFace1, Color.BLACK, xValuesFace1.length, false);

        // OREJAS
        int[] xValuesLEar = {190, 250, 185, 150};
        int[] yValuesLEar = {90, 130, 250, 160};
        Panda.drawPolygon(drawer, xValuesLEar, yValuesLEar, Color.BLACK, xValuesLEar.length, true);

        int[] xValuesREar = {480, 425, 486, 520};
        int[] yValuesREar = {90, 130, 250, 160};
        Panda.drawPolygon(drawer, xValuesREar, yValuesREar, Color.BLACK, xValuesREar.length, true);
        // CACHETES
        int[] xValuesLCheek = {250, 310, 200, 165};
        int[] yValuesLCheek = {130, 210, 380, 290};
        Panda.drawPolygon(drawer, xValuesLCheek, yValuesLCheek, Color.BLACK, xValuesLCheek.length, false);

        int[] xValuesRCheek = {425, 505, 470, 370};
        int[] yValuesRCheek = {130, 290, 390, 210};
        Panda.drawPolygon(drawer, xValuesRCheek, yValuesRCheek, Color.BLACK, xValuesRCheek.length, false);

        // OJOS
        int[] xValuesLEye = {310, 290, 270, 235};
        int[] yValuesLEye = {210, 320, 360, 330};
        Panda.drawPolygon(drawer, xValuesLEye, yValuesLEye, Color.BLACK, xValuesLEye.length, true);

        int[] xValuesREye = {370, 380, 405, 440};
        int[] yValuesREye = {210, 320, 360, 330};
        Panda.drawPolygon(drawer, xValuesREye, yValuesREye, Color.BLACK, xValuesREye.length, true);

        // NARIZ
        int[] xValuesNose = {290, 335, 380, 370, 335, 305};
        int[] yValuesNose = {380, 385, 380, 390, 400, 390};
        Panda.drawPolygon(drawer, xValuesNose, yValuesNose, Color.BLACK, xValuesNose.length, true);

        // BOCA
        int[] xValuesMouth = {320, 335, 350, 335};
        int[] yValuesMouth = {420, 410, 420, 425};
        Panda.drawPolygon(drawer, xValuesMouth, yValuesMouth, Color.BLACK, xValuesMouth.length, true);

        // TROMPA
        Panda.drawLine(drawer, 270, 360, 285, 422, Color.BLACK);
        Panda.drawLine(drawer, 285, 422, 297, 442, Color.BLACK);
        Panda.drawLine(drawer, 405, 360, 390, 422, Color.BLACK);
        Panda.drawLine(drawer, 390, 422, 380, 442, Color.BLACK);
        Panda.drawLine(drawer, 297, 442, 335, 460, Color.BLACK);
        Panda.drawLine(drawer, 335, 460, 380, 442, Color.BLACK);
    }
}
