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

        JOptionPane.showMessageDialog(window,
                             "Please use the EXPORT utility when you are 100% sure you are \n" +
                                      "finished with your project, as an import utility is currently \n" +
                                      "under development and will take time, thank you for your patience.");

    }

}
