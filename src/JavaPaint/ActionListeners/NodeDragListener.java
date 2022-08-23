package JavaPaint.ActionListeners;

import JavaPaint.Node;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import static JavaPaint.Node.getNodeColor;

public class NodeDragListener implements MouseMotionListener {


    @Override
    public void mouseDragged(MouseEvent e) {

        try {

            Node node = (Node) e.getSource();

            if (e.getButton() == MouseEvent.BUTTON1 && e.getSource() == node) {
                System.out.println("Left click is dragging successfully");
                node.setBackground(getNodeColor());
            } else if (e.getButton() == MouseEvent.BUTTON3 && e.getSource() == node) {
                System.out.println("Right click is dragging successfully");
            } else {
                JOptionPane.showMessageDialog(null, "ERROR: Invalid or unregistered command detected");
            }

        } catch (Exception exception) {
            throw new Error("ERROR, MOUSE DRAGGED HAS CRASHED");
        }

    }

    @Override
    public void mouseMoved(MouseEvent e) {
        System.out.println("Mouse is moving");
    }
}
