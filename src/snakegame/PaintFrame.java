package snakegame;

import javax.swing.*;

public class PaintFrame {

    JFrame window;
    Paint panel;

    public PaintFrame(){
        window = new JFrame();
        panel = new Paint();
        window.setUndecorated(false);
        window.setLocationRelativeTo(null);
        window.setTitle("JPaint");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setResizable(false);
        window.add(panel);
        window.pack();
        window.setVisible(true);

    }

}
