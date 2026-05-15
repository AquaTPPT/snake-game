package gamestructure;
import com.codeforall.simplegraphics.keyboard.*;
import objects.*;
import player.*;

public class Game implements KeyboardHandler {

    // private Obstacles obstacles;
    private Grid grid;
    private Snake snake;
    private Fruit fruit;
    private Keyboard keyboard;

    private int score = 0;

    public void init() {
        grid = new Grid(100, 50);
        grid.draw();
        fruit = new Fruit(grid);
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
