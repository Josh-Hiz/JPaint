package snakegame;

import java.awt.Color;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Draw extends JPanel implements ActionListener {

    private boolean gameIsRunning = true;
    private int delay = 175;

    public Draw(){
        startGame();
    }

    private void startGame(){


    }

    private void generateApple(){

    }

    private void checkCrash(){

    }



    @Override
    public Dimension getPreferredSize(){
        return new Dimension(Board.WINDOW_WIDTH, Board.WINDOW_HEIGHT);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
