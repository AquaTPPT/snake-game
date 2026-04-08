package player;

import com.codeforall.simplegraphics.graphics.*;
import com.codeforall.simplegraphics.keyboard.*;
import gamestructure.Grid;
import interfaces.Movable;
import java.util.*;

public class Snake implements Movable, KeyboardHandler {
    private List<Rectangle> snake = new ArrayList<>();
    private Grid grid;
    private Rectangle mainSnakeBody;
    private Rectangle snakeBody;
    private int snakeBodyLength = 1;
    private Keyboard k;


    public Snake(Grid grid) {
        this.grid = grid;
        mainSnakeBody = new Rectangle(grid.getGridCenterX(), grid.getGridCenterY(), grid.getCellSize(), grid.getCellSize());
        createSnakeBody();
        keyboardImplementation();
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
                System.out.println("Moved up!");
                moveUp();
                break;
            case KeyboardEvent.KEY_A:
                System.out.println("Moved left!");
                moveLeft();
                break;
            case KeyboardEvent.KEY_S:
                System.out.println("Moved down!");
                moveDown();
                break;
            case KeyboardEvent.KEY_D:
                System.out.println("Moved right!");
                moveRight();
                break;
        }
    }

    @Override
    public void keyReleased(KeyboardEvent keyboardEvent) {

    }

    class SnakeBody implements Movable {
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
}

