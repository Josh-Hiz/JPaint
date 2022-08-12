package JavaPaint;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Node extends JLabel {

    private static final long serialVersionUID = 1L;

    public Node(){
        setOpaque(true);
        setBorder(BorderFactory.createLineBorder(Color.BLACK));
        addMouseListener(new NodeListener());
    }

    @Override
    public Dimension getPreferredSize(){
        return new Dimension(15,15);
    }

    protected void setNodeColor(){

    }

    protected void getNodeColor() {

    }



    public static class NodeListener extends MouseAdapter {

        @Override
        public void mouseClicked(MouseEvent e){

            if(e.getButton() == MouseEvent.BUTTON1){
                System.out.println("Left click registered successfully");
            } else if (e.getButton() == MouseEvent.BUTTON3){
                System.out.println("Right click registered successfully");
            } else {
                JOptionPane.showMessageDialog(null, "ERROR: Invalid or unregistered command detected");
            }


        }


    }

}
