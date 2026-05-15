package player;

import com.codeforall.simplegraphics.graphics.Color;
import com.codeforall.simplegraphics.graphics.Rectangle;

public class SnakeBody extends Snake {
    private Rectangle rectangle;

    public SnakeBody() {
        createBodyPart();
    }

    public void saveCurrentPosition() {

    }

    public void setNextPosition() {

    }

    private void createBodyPart() {
        rectangle = new Rectangle(); // I don't remember how this is done, set later
        rectangle.setColor(Color.CYAN);
        rectangle.fill();
    }
}
