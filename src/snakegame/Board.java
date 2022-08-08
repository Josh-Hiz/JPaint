package snakegame;

import java.awt.Color;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Board {

    JFrame window;

    JPanel panel;

    Graphics g;

    protected final Node[][] nodes = new Node[800][1000];

    protected static int WINDOW_WIDTH = 1000;
    protected static int WINDOW_HEIGHT = 800;

    public Board(){
        initBoard();
    }

    private void initPanel(){
        panel = new JPanel();
        panel.setBackground(Color.BLACK);
        panel.setLayout(new GridLayout(800,1000));
        initNodes();
        window.getContentPane().add(panel);
    }

    private void initNodes(){
        for(int row = 0; row < nodes.length; row++){
            for(int col = 0; col < nodes[row].length; col++){
                nodes[row][col] = new Node(row, col); //Whenever this is called this should draw a square at each node
                panel.add(nodes[row][col]); //Add to panel grid layout
            }
        }
    }

    private void initBoard(){

        window = new JFrame();
        window.setTitle("JSnake!");
        window.setSize(WINDOW_WIDTH,WINDOW_HEIGHT);
        window.setResizable(false);
        window.setLocationRelativeTo(null);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        initPanel();

        window.pack();

        window.setVisible(true);
    }
}
