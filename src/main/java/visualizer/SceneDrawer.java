package visualizer;

import java.awt.*;

public class SceneDrawer {
    public void drawScene(Graphics g) {
        drawDependency(g, new Point(130, 100), new Point(180, 140));
        drawDependency(g, new Point(130, 100), new Point(160, 140));
        drawDependency(g, new Point(130, 100), new Point(140, 140));
        drawDependency(g, new Point(130, 100), new Point(120, 140));
    }

    private void drawDependency(Graphics g, Point start, Point end) {
        g.setColor(Color.BLACK);
        g.drawLine(start.x, start.y, end.x, end.y);

        drawNode(g, start);

        drawNode(g, end);
    }

    private void drawNode(Graphics g, Point point) {
        int squareWidth = 7;
        int squareOffset = squareWidth / 2;
        int x = point.x;
        int y = point.y;

        g.setColor(Color.YELLOW);
        g.fillRect(x - squareOffset, y - squareOffset, squareWidth, squareWidth);

        g.setColor(Color.BLACK);
        g.drawRect(x - squareOffset, y - squareOffset, squareWidth, squareWidth);
    }
}
