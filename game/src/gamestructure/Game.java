package gamestructure;
import objects.*;
import player.*;

public class Game {
    private Grid grid;
    private Snake snake;
    private Obstacles obstacles;
    private Fruit fruit;

    private int score = 0;

    public void init() {
        grid = new Grid(100, 50);
        grid.draw();
        snake = new Snake(grid);
    }

    public int addScore() { return score++; }

}
