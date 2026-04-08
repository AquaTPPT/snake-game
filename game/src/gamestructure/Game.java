package gamestructure;
import com.codeforall.simplegraphics.keyboard.*;
import objects.*;
import player.*;

public class Game implements KeyboardHandler {
    private Grid grid;
    private Snake snake;
    private Obstacles obstacles;
    private Fruit fruit;
    private Keyboard keyboard;

    private int score = 0;

    public void init() {
        grid = new Grid(100, 50);
        grid.draw();
        snake = new Snake(grid);
        fruit = new Fruit(grid);
        keyboardImplementation();
    }

    public boolean checkPosition() {
     return false;
    }

    public void keyboardImplementation() {
        keyboard = new Keyboard(this);
        KeyboardEvent space = new KeyboardEvent();
        space.setKey(KeyboardEvent.KEY_SPACE);
        space.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(space);
    }
    public int addScore() { return score++; }

    @Override
    public void keyPressed(KeyboardEvent keyboardEvent) {
        fruit.moveFruit();
    }

    @Override
    public void keyReleased(KeyboardEvent keyboardEvent) {

    }
}
