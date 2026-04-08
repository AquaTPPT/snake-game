package player;

import com.codeforall.simplegraphics.graphics.*;
import com.codeforall.simplegraphics.keyboard.*;
import gamestructure.Grid;
import interfaces.Movable;
import java.util.*;

public class SnakeHead implements Movable, KeyboardHandler {
    private List<Rectangle> snake = new ArrayList<>();
    private Grid grid;
    private Rectangle mainSnakeBody;
    private Rectangle snakeBody;
    private int snakeBodyLength = 1;
    private Keyboard k;


    public SnakeHead(Grid grid) {
        this.grid = grid;
        mainSnakeBody = new Rectangle(grid.getGridCenterX(), grid.getGridCenterY(), grid.getCellSize(), grid.getCellSize());
        createSnakeBody();
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

    // When it hits something

    public void grabFruit() {

    }

    public void hitBody() {

    }

    // to add a square to the snake's body

    public void addToSnakeBody() {
        snakeBody = new Rectangle(mainSnakeBody.getX(), mainSnakeBody.getY(), grid.getCellSize(), grid.getCellSize());
        snake.add(snakeBody);
        snakeBody.setColor(Color.CYAN);
        snakeBody.draw();
        snakeBody.fill();
        snakeBodyLength++;
    }

    // to create the head of the snake, what the player will control

    public void createSnakeBody() {
        snake.add(mainSnakeBody);
        mainSnakeBody.setColor(Color.CYAN);
        mainSnakeBody.draw();
        mainSnakeBody.fill();
    }

    // moving mechanics

    public void keyboardImplementation() {
        k = new Keyboard(this);
        KeyboardEvent w = new KeyboardEvent();
        w.setKey(KeyboardEvent.KEY_W);
        w.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        k.addEventListener(w);

        KeyboardEvent a = new KeyboardEvent();
        a.setKey(KeyboardEvent.KEY_A);
        a.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        k.addEventListener(a);

        KeyboardEvent s = new KeyboardEvent();
        s.setKey(KeyboardEvent.KEY_S);
        s.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        k.addEventListener(s);

        KeyboardEvent d = new KeyboardEvent();
        d.setKey(KeyboardEvent.KEY_D);
        d.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        k.addEventListener(d);
    }

    @Override
    public void keyPressed(KeyboardEvent keyboardEvent) {
        switch (keyboardEvent.getKey()) {
            case KeyboardEvent.KEY_W:
                moveUp();
                break;
            case KeyboardEvent.KEY_A:
                moveLeft();
                break;
            case KeyboardEvent.KEY_S:
                moveDown();
                break;
            case KeyboardEvent.KEY_D:
                moveRight();
                break;
        }
    }

    @Override
    public void keyReleased(KeyboardEvent keyboardEvent) {

    }
}
