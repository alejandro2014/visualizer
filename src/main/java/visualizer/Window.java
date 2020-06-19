package visualizer;

import lombok.Getter;

import javax.swing.*;
import java.awt.*;

public class Window extends JFrame {
    private Color backgroundColor = new Color(255, 251, 230);
    private SceneDrawer sceneDrawer = new SceneDrawer();

    @Getter
    private JPanel panel = new JPanel() {
        protected void paintComponent(Graphics g) {
            super.setBackground(backgroundColor);
            super.paintComponent(g);

            sceneDrawer.drawScene(g);
        }
    };

    public Window() {
        add(panel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(Const.SCREEN_WIDTH, Const.SCREEN_HEIGHT);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
    }
}
