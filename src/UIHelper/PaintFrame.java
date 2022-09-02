package UIHelper;

import GridManager.Grid;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.awt.*;

public class PaintFrame {

    public static JFrame window;

    Image icon = Toolkit.getDefaultToolkit().getImage("src/resources/pixel_brush.png");

    public PaintFrame() {

        window = new JFrame();

        window.setIconImage(icon);

        Grid paintGrid = new Grid(60, 90);

        window.setUndecorated(false);
        window.setTitle("JPaint");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setResizable(false);
        window.add(paintGrid);
        window.pack();
        window.setLocationRelativeTo(null);
        window.setVisible(true);

        JOptionPane.showMessageDialog(window,
                             "Notes when using this program: \n" +
                                      "This is still UNDER DEVELOPMENT, some features have not been implemented\n" +
                                      "such as: Row and Column sliders, improved efficiency, and refactoring.\n" +
                                      "Have fun trying it out!");

    }

}
