package JavaPaint;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Node extends JLabel {

    private static final long serialVersionUID = 1L;

    static Color nodeColor;

    public Node() {
        setOpaque(true);
        setBorder(BorderFactory.createLineBorder(Color.BLACK));
        addMouseListener(new mouseListener());
    }

    protected static Color getNodeColor() {
        return nodeColor;
    }

    protected void setNodeColor(Color color) {
        nodeColor = color;
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(15, 15);
    }

    public static class mouseListener extends MouseAdapter {

        @Override
        public void mouseClicked(MouseEvent e) {

            if (e.getButton() == MouseEvent.BUTTON1) {
                System.out.println("Left click registered successfully");
            } else if (e.getButton() == MouseEvent.BUTTON3) {
                System.out.println("Right click registered successfully");
            } else {
                JOptionPane.showMessageDialog(null, "ERROR: Invalid or unregistered command detected");
            }


        }


    }

}
