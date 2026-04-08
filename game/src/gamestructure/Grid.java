package gamestructure;

import com.codeforall.simplegraphics.graphics.*;

public class Grid {
    private Rectangle grid;

    private final int PADDING = 10;

    private int cols;
    private int rows;
    private int cellSize = 15;


    public Grid(int cols, int rows) {
        this.cols = cols;
        this.rows = rows;
        grid = new Rectangle(PADDING, PADDING, cols * cellSize, rows * cellSize);
    }

    public void draw() {
        grid.draw();
    }

    public int getCellSize() {
        return cellSize;
    }

    public Rectangle getGrid() {
        return grid;
    }

    public int getCols() {
        return cols;
    }

    public int getRows() {
        return rows;
    }

    public int rowToX() { return cols * cellSize; }

    public int colToY() { return rows * cellSize; }

    public int getGridCenterX() { return (PADDING + cols * cellSize) / 2; }

    public int getGridCenterY() { return (PADDING + rows * cellSize) / 2; }
}
