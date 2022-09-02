package Listeners;

import UIHelper.PaintFrame;

import java.awt.*;

public class Main {

    public static void main(String[] arg) {

        EventQueue.invokeLater(() -> {

            var gameFrame = new PaintFrame();
            gameFrame.window.setVisible(true);

        });

    }

}
