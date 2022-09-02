package GridManager;

import UIHelper.PaintFrame;
import UIHelper.Slider;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class Grid extends JComponent {

    private static final long serialVersionUID = 1L;

    protected static JMenuBar colorBar;
    private final int rows;
    private final int cols;

    private final JLabel[][] nodes;
    private final ColorMenuListener listener = new ColorMenuListener();

    private final DefaultColorListener standardListener = new DefaultColorListener();


    JCheckBoxMenuItem erase;

    JButton clearAll;

    JMenu colorMenu;

    JSlider rowSlider;
    JSlider colSlider;

    JSlider nodeSizeSlider;

    Slider row;
    Slider col;

    Slider nodeSize;
    JColorChooser colorChooser;
    JButton allColorMenu;

    public Grid(int rows, int cols) {

        this.rows = rows;
        this.cols = cols;

        this.setLayout(new GridLayout(rows, cols));
        this.nodes = new JLabel[this.rows][this.cols];

        Color DEFAULT_COLOR = Color.BLACK;
        Node.setNodeColor(DEFAULT_COLOR); //Set default color as black

        createScreen();

    }

    private void createScreen() {
        createColorMenu();
        initSliders();
        initNodes();
        createEraser();
    }


    /**
     * TODO Make JSlider change rows and columns within window in real time
     */


    private void createEraser() {
        erase = new JCheckBoxMenuItem("Erase");
        erase.addActionListener(listener);

        clearAll = new JButton("Clear Grid");
        clearAll.addActionListener(listener);


        colorBar.add(erase);
        colorBar.add(clearAll);
    }

    private void clearAll() {

        for (JLabel[] node : nodes) {
            for (JLabel jLabel : node) {
                jLabel.setBackground(null);
            }
        }
    }

    private void createColorMenu() {

        colorBar = new JMenuBar();

        colorMenu = new JMenu("Standard Colors");


        allColorMenu = new JButton("All colors");

        allColorMenu.addActionListener(listener);

        JCheckBoxMenuItem red = new JCheckBoxMenuItem("Red");
        red.addItemListener(standardListener);

        JCheckBoxMenuItem green = new JCheckBoxMenuItem("Green");
        green.addItemListener(standardListener);

        JCheckBoxMenuItem blue = new JCheckBoxMenuItem("Blue");
        blue.addItemListener(standardListener);

        JCheckBoxMenuItem magenta = new JCheckBoxMenuItem("Magenta");
        magenta.addItemListener(standardListener);

        JCheckBoxMenuItem cyan = new JCheckBoxMenuItem("Cyan");
        cyan.addItemListener(standardListener);

        JCheckBoxMenuItem yellow = new JCheckBoxMenuItem("Yellow");
        yellow.addItemListener(standardListener);

        JCheckBoxMenuItem black = new JCheckBoxMenuItem("Black");
        black.addItemListener(standardListener);

        JCheckBoxMenuItem white = new JCheckBoxMenuItem("White/Clear");
        white.addItemListener(standardListener);

        JCheckBoxMenuItem gray = new JCheckBoxMenuItem("Gray");
        gray.addItemListener(standardListener);

        JCheckBoxMenuItem dark_gray = new JCheckBoxMenuItem("Dark Gray");
        dark_gray.addItemListener(standardListener);

        JCheckBoxMenuItem light_gray = new JCheckBoxMenuItem("Light Gray");
        light_gray.addItemListener(standardListener);

        JCheckBoxMenuItem pink = new JCheckBoxMenuItem("Pink");
        pink.addItemListener(standardListener);

        JCheckBoxMenuItem orange = new JCheckBoxMenuItem("Orange");
        orange.addItemListener(standardListener);

        colorMenu.add(red);
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
        colorMenu.add(orange);

        colorBar.add(colorMenu);
        colorBar.add(allColorMenu);

        PaintFrame.window.setJMenuBar(colorBar);
    }

    private void initNodes() {

        for (int i = 0; i < this.rows; i++) {
            for (int j = 0; j < this.cols; j++) {
                Node node = new Node();
                this.nodes[i][j] = node;
                this.add(nodes[i][j]);
            }

        }

    }

    private void initSliders() {

        rowSlider = new JSlider();
        colSlider = new JSlider();
        nodeSizeSlider = new JSlider();

        nodeSize = new Slider(nodeSizeSlider, "Node Size");
        row = new Slider(rowSlider, "Rows");
        col = new Slider(colSlider, "Columns");

        Grid.colorBar.add(Slider.rowColSliders);

    }

    /**TODO: OPTIMIZE THIS CODE*/
    public class DefaultColorListener implements ItemListener {

        @Override
        public void itemStateChanged(ItemEvent e) {

            if (e.getSource() == colorMenu.getItem(0)) {
                Node.setNodeColor(Color.RED);
                System.out.println(Node.getNodeColor());
            }

            if (e.getSource() == colorMenu.getItem(1)) {
                Node.setNodeColor(Color.GREEN);
            }

            if (e.getSource() == colorMenu.getItem(2)) {
                Node.setNodeColor(Color.BLUE);
            }

            if (e.getSource() == colorMenu.getItem(3)) {
                Node.setNodeColor(Color.MAGENTA);
            }

            if (e.getSource() == colorMenu.getItem(4)) {
                Node.setNodeColor(Color.CYAN);
            }

            if (e.getSource() == colorMenu.getItem(5)) {
                Node.setNodeColor(Color.YELLOW);
            }

            if (e.getSource() == colorMenu.getItem(6)) {
                Node.setNodeColor(Color.BLACK);
            }

            if (e.getSource() == colorMenu.getItem(7)) {
                Node.setNodeColor(Color.WHITE);
            }

            if (e.getSource() == colorMenu.getItem(8)) {
                Node.setNodeColor(Color.GRAY);
            }

            if (e.getSource() == colorMenu.getItem(9)) {
                Node.setNodeColor(Color.DARK_GRAY);
            }

            if (e.getSource() == colorMenu.getItem(10)) {
                Node.setNodeColor(Color.LIGHT_GRAY);
            }

            if (e.getSource() == colorMenu.getItem(11)) {
                Node.setNodeColor(Color.PINK);
            }

            if (e.getSource() == colorMenu.getItem(12)) {
                Node.setNodeColor(Color.ORANGE);
            }
        }
    }

    public class ColorMenuListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            if (e.getSource() == allColorMenu) {

                try {

                    System.out.println("This button is being click");

                    colorChooser = new JColorChooser();

                    Node.nodeColor = JColorChooser.showDialog(null, "Choose any color you desire!", Color.BLACK);

                    System.out.println("Node Color: " + Node.getNodeColor());


                } catch (Exception exception) {
                    throw new Error("ERROR, COLOR CHOOSE HAS CRASHED");
                }
            }


            if (erase.getState()) {

                try {

                    System.out.println("Eraser selected");
                    Node.setNodeColor(null);

                } catch (Exception exception) {
                    throw new Error("ERROR, ERASER HAS CRASHED");
                }
            }

            if (e.getSource() == clearAll) {
                clearAll();
            }
        }
    }
}
