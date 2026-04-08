package objects;

import com.codeforall.simplegraphics.graphics.Color;
import com.codeforall.simplegraphics.graphics.Rectangle;
import gamestructure.Grid;
import statics.Random;

public class Fruit {
    private Rectangle rectangle;
    private Grid grid;
    private boolean isCatched = false;

    public Fruit(Grid grid) {
        this.grid = grid;
        rectangle = new Rectangle(10 + Random.randomWholeNumberPlusOne(grid.rowToX()), 10 + Random.randomWholeNumberPlusOne(grid.colToY()), grid.getCellSize(), grid.getCellSize());
        rectangle.setColor(Color.RED);
        rectangle.draw();
        rectangle.fill();
    }

    public void moveFruit() {
        switch (Random.randomWholeNumber(8)) {
            case 0:
                rectangle.translate(0, -Random.randomWholeNumberPlusOne(getY()));
                break;
            case 1:
                rectangle.translate(Random.randomWholeNumberPlusOne(grid.rowToX() - getX()), -Random.randomWholeNumberPlusOne(getY()));
                break;
            case 2:
                rectangle.translate(Random.randomWholeNumberPlusOne(grid.rowToX() - getX()), 0);
                break;
            case 3:
                rectangle.translate(Random.randomWholeNumberPlusOne(grid.rowToX() - getX()), Random.randomWholeNumberPlusOne(grid.colToY() - getX()));
                break;
            case 4:
                rectangle.translate(0, Random.randomWholeNumberPlusOne(grid.colToY() - getX()));
                break;
            case 5:
                rectangle.translate(-Random.randomWholeNumberPlusOne(getX()), Random.randomWholeNumberPlusOne(grid.colToY() - getX()));
                break;
            case 6:
                rectangle.translate(-Random.randomWholeNumberPlusOne(getX()), 0);
                break;
            case 7:
                rectangle.translate(-Random.randomWholeNumberPlusOne(getX()), -Random.randomWholeNumberPlusOne(getY()));
                if (rectangle.getY() > grid.rowToX() && rectangle.getX() > grid.colToY())
                    break;
        }
        if (rectangle.getY() > grid.rowToX() && rectangle.getX() > grid.colToY()) {

        }
    }

    public int getY() { return rectangle.getY(); }

    public int getX() { return rectangle.getX(); }
}
