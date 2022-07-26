package UIHelper;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
//import java.awt.*;

public class Slider extends JSlider  {

    private final sliderListener listener = new sliderListener();

    public static final JMenu rowColSliders = new JMenu("Rows & Columns");
    private final JSlider windowSlider;

    public Slider(JSlider slider, String Name) {
        this.windowSlider = slider;
        createWindowSlider(slider, Name);

    }

    private void createWindowSlider(JSlider slider, String Name) {

        slider.setName(Name);

        slider.setPaintTicks(true);
        slider.setPaintTicks(true);

        slider.setMinorTickSpacing(5);
        slider.setMajorTickSpacing(20);


        slider.addChangeListener(listener);

        rowColSliders.add(slider);


    }

  public class sliderListener implements ChangeListener {

      @Override
      public void stateChanged(ChangeEvent e) {

          if (!windowSlider.getValueIsAdjusting()) {
              int currentValue = windowSlider.getValue();
              System.out.println(currentValue);
          }

      }

  }

}
