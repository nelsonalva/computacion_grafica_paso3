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
        drawer.setStroke(pincel);

        Abeja.drawArc(drawer);
    }
}
