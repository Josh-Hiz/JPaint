package Listeners.NodeListeners;

import GridManager.Node;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import static GridManager.Node.getNodeColor;

public class NodeMouseListener extends MouseAdapter  {

    @Override
    public void mouseClicked(MouseEvent e) {

        Node node = (Node) e.getSource();

        if (e.getButton() == MouseEvent.BUTTON1 && e.getSource() == node) {
            System.out.println("Left click registered successfully");
            node.setBackground(getNodeColor());
        } else if (e.getButton() == MouseEvent.BUTTON3 && e.getSource() == node) {
            System.out.println("Right click registered successfully");
        } else {
            JOptionPane.showMessageDialog(null, "ERROR: Invalid or unregistered command detected");
        }

    }


}
