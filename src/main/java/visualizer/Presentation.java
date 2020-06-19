package visualizer;

import lombok.Data;

import javax.swing.*;

@Data
public class Presentation {
    private Window window = new Window();;
    private JPanel panel = window.getPanel();

    public void loop() throws InterruptedException {
        while (true) {
            panel.repaint();
            Thread.sleep(1000);
        }
    }
}
