package JavaPaint;

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

public class Grid extends JPanel implements ActionListener {

    private static final long serialVersionUID = 1L;

    private final int rows;
    private final int cols;

    public JButton allColorMenu;

    protected Color nodeColor;

    private final JLabel[][] nodes;

    public Grid(int rows, int cols){
        this.rows = rows;
        this.cols = cols;
        this.setLayout(new GridLayout(rows,cols));
        this.nodes = new JLabel[this.rows][this.cols];
        createScreen();
    }

    private void createScreen(){
        createColorMenu();
        initNodes();

    }

    private void createColorMenu(){

        JMenu colorMenu = new JMenu("Standard Colors");

        allColorMenu = new JButton("All colors");
        allColorMenu.addActionListener(this);

        JMenuBar colorBar = new JMenuBar();

        JMenuItem orange = new JMenuItem("Red");
        JMenuItem green = new JMenuItem("Green");
        JMenuItem blue = new JMenuItem("Blue");
        JMenuItem magenta = new JMenuItem("Magenta");
        JMenuItem cyan = new JMenuItem("Cyan");
        JMenuItem yellow = new JMenuItem("Yellow");
        JMenuItem black = new JMenuItem("Black");
        JMenuItem white = new JMenuItem("White/Clear");
        JMenuItem gray = new JMenuItem("Gray");
        JMenuItem dark_gray = new JMenuItem("Dark Gray");
        JMenuItem light_gray = new JMenuItem("Light Gray");
        JMenuItem pink = new JMenuItem("Pink");

        colorMenu.add(orange);
        colorMenu.add(green);
        colorMenu.add(blue);
        colorMenu.add(magenta);
        colorMenu.add(cyan);
        colorMenu.add(yellow);
        colorMenu.add(black);
        colorMenu.add(white);
        colorMenu.add(gray);
        colorMenu.add(dark_gray);
        colorMenu.add(light_gray);
        colorMenu.add(pink);

        colorBar.add(colorMenu);
        colorBar.add(allColorMenu);

        PaintFrame.window.setJMenuBar(colorBar);
    }

    private void initNodes(){

        for(int i = 0; i < this.rows; i++){
            for(int j = 0; j < this.cols; j++){
                Node node = new Node();
                this.nodes[i][j] = node;
                this.add(nodes[i][j]);
            }

        }

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == allColorMenu){
            try{
                System.out.println("This button is being click");
                JColorChooser colorChooser = new JColorChooser();
                nodeColor = JColorChooser.showDialog(null, "Choose any color you desire!",Color.BLACK);
            } catch (Exception exception){
                System.out.println("ERROR: COLOR CHOOSER HAS CRASHED");
            }
        }
    }
}