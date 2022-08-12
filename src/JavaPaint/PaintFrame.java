package JavaPaint;

import javax.swing.*;

public class PaintFrame {

    protected static JFrame window;

    public PaintFrame() {
        window = new JFrame();
        Grid paintGrid = new Grid(50, 100);
        window.setUndecorated(false);
        window.setTitle("JPaint");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setResizable(false);
        window.add(paintGrid);
        window.pack();
        window.setLocationRelativeTo(null);
        window.setVisible(true);

    }

}
