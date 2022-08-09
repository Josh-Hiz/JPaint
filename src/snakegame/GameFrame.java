package snakegame;

import javax.swing.*;
import java.awt.*;

public class GameFrame {

    JFrame window;
    Game panel;

    final int SCREEN_WIDTH = 800;
    final int SCREEN_HEIGHT = 800;
    public GameFrame(){
        window = new JFrame();
        panel = new Game();
        window.setSize(SCREEN_WIDTH, SCREEN_HEIGHT);
        window.setLocationRelativeTo(null);
        window.setTitle("JSnake");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setResizable(false);
        window.add(panel);
        window.pack();
        window.setVisible(true);

//        window.setUndecorated(false);
    }

}
