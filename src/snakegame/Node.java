package snakegame;

import javax.swing.*;
import java.awt.*;

public class Node extends JPanel {

    protected static final int SIZE = 10;

    Color color;

    public Node(Color color) {
        this.color = color;
        this.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        this.setPreferredSize(new Dimension(SIZE, SIZE));
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(color);
        g.fillRect(0, 0, getWidth(), getHeight());
    }
}
