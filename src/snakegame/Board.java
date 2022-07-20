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

    protected static int WINDOW_WIDTH = 1000;
    protected static int WINDOW_HEIGHT = 800;

    public Board(){
        initBoard();
    }

    private void initBoard(){

        window = new JFrame();
        window.setTitle("JNSnake!");
        window.setSize(WINDOW_WIDTH,WINDOW_HEIGHT);
        window.setResizable(false);
        window.setLocationRelativeTo(null);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.getContentPane().setBackground(Color.black);

        window.setVisible(true);
    }


}
