package JavaPaint;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Slider extends JSlider implements ChangeListener {

    protected static final JMenu rowColSliders = new JMenu("Rows & Columns");
    private final JSlider windowSlider;
    private final String sliderName;

    public Slider(JSlider slider, String Name) {
        this.windowSlider = slider;
        this.sliderName = Name;
        createWindowSlider(slider, Name);

    }

    private void createWindowSlider(JSlider slider, String Name) {

        slider.setName(Name);

        slider.setPaintTicks(true);
        slider.setPaintTicks(true);

        slider.setMinorTickSpacing(5);
        slider.setMajorTickSpacing(20);

        slider.addChangeListener(this);

        rowColSliders.add(slider);


    }


    @Override
    public void stateChanged(ChangeEvent e) {

        if (!windowSlider.getValueIsAdjusting()) {
            int currentValue = windowSlider.getValue();
            System.out.println(currentValue);
        }

    }
}
