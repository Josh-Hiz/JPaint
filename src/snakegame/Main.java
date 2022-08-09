package snakegame;

import java.awt.EventQueue;

public class Main {

    public static void main(String arg[]){

        EventQueue.invokeLater(() -> {

            var gameFrame = new GameFrame();
            gameFrame.window.setVisible(true);

        });

    }

}
