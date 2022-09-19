package java1.lessonsforqa.lesson8;

import java.awt.*;

public class Cell {
    private int x, y;
    private int size;
    private Color color;

    public Cell(int x, int y, int size, Color color){
        set(x, y);
        this.size = size;
        this.color = color;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
    public void set(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public void paint(Graphics2D graph){
        graph.setColor(color);
        graph.fillOval(x * size, y * size, size, size);
    }
}
