package JavaPaint;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Grid extends JComponent implements ActionListener {

    private static final long serialVersionUID = 1L;
    protected static JMenuBar colorBar;
    private final int rows;
    private final int cols;
    private final JLabel[][] nodes;

    JSlider rowSlider;
    JSlider colSlider;

    Slider row;
    Slider col;
    JColorChooser colorChooser;
    private JButton allColorMenu;
    private JMenu colorMenu;

    public Grid(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        this.setLayout(new GridLayout(rows, cols));
        this.nodes = new JLabel[this.rows][this.cols];
        createScreen();
    }

    private void createScreen() {
        createColorMenu();
        initSliders();
        initNodes();

    }

    private void createColorMenu() {

        colorBar = new JMenuBar();

        colorMenu = new JMenu("Standard Colors");

        allColorMenu = new JButton("All colors");
        allColorMenu.addActionListener(this);


        JCheckBoxMenuItem orange = new JCheckBoxMenuItem("Red");
        JCheckBoxMenuItem green = new JCheckBoxMenuItem("Green");
        JCheckBoxMenuItem blue = new JCheckBoxMenuItem("Blue");
        JCheckBoxMenuItem magenta = new JCheckBoxMenuItem("Magenta");
        JCheckBoxMenuItem cyan = new JCheckBoxMenuItem("Cyan");
        JCheckBoxMenuItem yellow = new JCheckBoxMenuItem("Yellow");
        JCheckBoxMenuItem black = new JCheckBoxMenuItem("Black");
        JCheckBoxMenuItem white = new JCheckBoxMenuItem("White/Clear");
        JCheckBoxMenuItem gray = new JCheckBoxMenuItem("Gray");
        JCheckBoxMenuItem dark_gray = new JCheckBoxMenuItem("Dark Gray");
        JCheckBoxMenuItem light_gray = new JCheckBoxMenuItem("Light Gray");
        JCheckBoxMenuItem pink = new JCheckBoxMenuItem("Pink");

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

        row = new Slider(rowSlider, "Rows");
        col = new Slider(colSlider, "Columns");

        Grid.colorBar.add(Slider.rowColSliders);

    }

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
    }
}