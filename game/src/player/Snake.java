package player;

import com.codeforall.simplegraphics.graphics.*;
import com.codeforall.simplegraphics.keyboard.*;
import gamestructure.Grid;
import interfaces.Movable;
import java.util.*;

public class Snake implements Movable {
    private List<SnakeBody> snake = new ArrayList<>();
    private Grid grid;
    private Rectangle mainSnakeBody;
    private int snakeBodyLength = 1;
    private Keyboard k;

    // When it hits something

    public void grabFruit() {

    }

    public void hitBody() {

    }

    // to add a square to the snake's body

    public void addToSnakeBody() {
        snake.add(new SnakeBody());
        snakeBodyLength++;
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

    // moving mechanics


}

