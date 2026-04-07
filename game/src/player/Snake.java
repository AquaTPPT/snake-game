package player;

import com.codeforall.simplegraphics.graphics.*;
import gamestructure.Grid;
import interfaces.Movable;

public class Snake implements Movable {
    private Rectangle snake;
    private Grid grid;

    public Snake(Grid grid) {
        this.grid = grid;
        snake = new Rectangle(grid.getGridCenterX(), grid.getGridCenterY(), grid.getCellSize(), grid.getCellSize());
        snake.draw();
        snake.setColor(Color.CYAN);
        snake.fill();
    }

    @Override
    public void move() {

    }

    @Override
    public void hit() {

    }

    @Override
    public void grab() {

    }
}
