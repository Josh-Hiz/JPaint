package snakegame;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
public class Node extends JPanel {

    protected static final int SIZE = 20;

    Color color;

    public Node(Color color){
        this.color = color;
        this.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        this.setPreferredSize(new Dimension(SIZE,SIZE));
    }

    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.setColor(color);
        g.fillRect(0,0, getWidth(), getHeight());
    }
}
