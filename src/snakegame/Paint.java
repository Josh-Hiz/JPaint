package snakegame;

import java.awt.Color;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JPanel;
import javax.swing.Timer;

public class Paint extends JPanel {

    public final static Node[][] grid = new Node[40][40];

    Random rand = new Random();

    Timer timer;

    public Paint() {

        this.setBackground(Color.black);
        this.setFocusable(true);
        startWindow();

    }

    private void startWindow() {
        initNodes();

    }

    private void initNodes() {

        this.setLayout(new GridLayout(40, 40, 0, 0));

        for (int row = 0; row <= grid.length - 1; row++) {
            for (int col = 0; col <= grid[row].length - 1; col++) {
                grid[row][col] = new Node(Color.WHITE);
                grid[row][col].addMouseListener(new ColorListener());
                this.add(grid[row][col]);
            }
        }
    }

    public class ColorListener extends MouseAdapter {

        @Override
        public void mousePressed(MouseEvent event) {

            for (int row = 0; row <= grid.length - 1; row++) {
                for (int col = 0; col <= grid[row].length - 1; col++) {
                    if (event.getButton() == MouseEvent.BUTTON1) {
                        grid[row][col].setBackground(Color.BLUE);
                        grid[row][col].repaint();
                    } else if (event.getButton() == MouseEvent.BUTTON3) {
                        grid[row][col].setBackground(Color.ORANGE);
                        grid[row][col].repaint();
                    }

                }
            }
        }
    }
}
