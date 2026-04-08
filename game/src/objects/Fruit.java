package objects;

import com.codeforall.simplegraphics.graphics.Color;
import com.codeforall.simplegraphics.graphics.Rectangle;
import gamestructure.Grid;
import statics.Random;

public class Fruit {
    private Rectangle rectangle;
    private Grid grid;

    public Fruit(Grid grid) {
        this.grid = grid;
        rectangle = new Rectangle(10 + Random.randomWholeNumberPlusOne(grid.rowToX()), 10 + Random.randomWholeNumberPlusOne(grid.colToY()), grid.getCellSize(), grid.getCellSize());
        rectangle.setColor(Color.RED);
        rectangle.draw();
        rectangle.fill();
    }

    public int getY() { return rectangle.getY(); }

    public int getX() { return rectangle.getX(); }
}
