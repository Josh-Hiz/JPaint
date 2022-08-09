package snakegame;

import java.awt.Color;
import java.awt.Image;
import java.awt.*;
import java.awt.event.*;
import java.awt.EventQueue;
import java.awt.Graphics2D;
import java.awt.Graphics;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.ImageIcon;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.Timer;
import javax.swing.JMenu;

public class Game extends JPanel implements ActionListener {

    private final int DELAY = 75;

    private Node[][] grid = new Node[50][50];

    private char direction;



    public Game(){
        initNodes();
    }

    private JPanel initNodes(){
        this.setLayout(new GridLayout(50,50,0,0));
        for(int row = 0; row <= grid.length - 1; row++){
            for(int col = 0; col <= grid[row].length - 1; col++){
                grid[row][col] = new Node();
                this.add(grid[row][col]);
            }
        }
        return this;
    }


    //Create the game loop
    @Override
    public void actionPerformed(ActionEvent e) {

    }

    //Check for key presses to use in the moveSnake method
    public class KeyListener extends KeyAdapter{

        @Override
        public void keyPressed(KeyEvent e) {
            switch (e.getKeyCode()) {
                case KeyEvent.VK_LEFT:
                    if (direction != 'R') {
                        direction = 'L';
                    }
                    break;
                case KeyEvent.VK_RIGHT:
                    if (direction != 'L') {
                        direction = 'R';
                    }
                    break;
                case KeyEvent.VK_UP:
                    if (direction != 'D') {
                        direction = 'U';
                    }
                    break;
                case KeyEvent.VK_DOWN:
                    if (direction != 'U') {
                        direction = 'D';
                    }
                    break;
            }
        }

    }
}
