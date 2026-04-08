package player;

import com.codeforall.simplegraphics.graphics.Rectangle;
import gamestructure.Grid;
import interfaces.Movable;

public class SnakeBody implements Movable {
    public Rectangle snakeBody;
    public Grid grid;

    public SnakeBody(Grid grid) {
        this.grid = grid;
        snakeBody = new Rectangle(grid.getGridCenterX(), grid.getGridCenterY(), grid.getCellSize(), grid.getCellSize());
    }

    @Override
    public void move() {

    }

    @Override
    public void moveUp() {

    }

    @Override
    public void moveDown() {

    }

    @Override
    public void moveLeft() {

    }

    @Override
    public void moveRight() {

    }


}
