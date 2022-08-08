package snakegame;

import javax.swing.*;
import java.awt.Color;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Node extends JPanel {

    int xPos;
    int yPos;

    public Node(int x, int  y){
        this.xPos = x;
        this.yPos = y;

    }

    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        g2.setColor(Color.WHITE);
        g2.drawRect(this.xPos,this.yPos, Board.WINDOW_WIDTH/200,Board.WINDOW_HEIGHT/ 160);
        g2.setColor(Color.DARK_GRAY);
        g2.fillRect(this.xPos,this.yPos,Board.WINDOW_WIDTH/200,Board.WINDOW_HEIGHT/ 160);
    }

}
