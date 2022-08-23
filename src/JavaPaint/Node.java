package JavaPaint;

import JavaPaint.ActionListeners.NodeDragListener;
import JavaPaint.ActionListeners.NodeMouseListener;

import javax.swing.*;
import java.awt.*;
//import java.awt.event.MouseAdapter;
//import java.awt.event.MouseEvent;
//import java.awt.event.MouseMotionListener;

public class Node extends JLabel {

    private static final long serialVersionUID = 1L;

    protected static Color nodeColor;


    public Node() {
        setOpaque(true);
        setBorder(BorderFactory.createLineBorder(Color.BLACK));
        addMouseListener(new NodeMouseListener());
        addMouseMotionListener(new NodeDragListener());
    }

    public static Color getNodeColor() {
        return nodeColor;
    }

    protected static void setNodeColor(Color color) {
        nodeColor = color;
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(15, 15);
    }

//    public static class mouseListener extends MouseAdapter {
//
//        @Override
//        public void mouseClicked(MouseEvent e) {
//
//            Node node = (Node) e.getSource();
//
//            if (e.getButton() == MouseEvent.BUTTON1) {
//                System.out.println("Left click registered successfully");
//                node.setBackground(getNodeColor());
//            } else if (e.getButton() == MouseEvent.BUTTON3) {
//                System.out.println("Right click registered successfully");
//            } else {
//                JOptionPane.showMessageDialog(null, "ERROR: Invalid or unregistered command detected");
//            }
//
//        }

}

