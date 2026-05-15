import com.codeforall.simplegraphics.keyboard.Keyboard;
import com.codeforall.simplegraphics.keyboard.KeyboardEvent;
import com.codeforall.simplegraphics.keyboard.KeyboardEventType;
import com.codeforall.simplegraphics.keyboard.KeyboardHandler;
import player.SnakeHead;

import javax.naming.ldap.Control;

public class Controls implements KeyboardHandler {
    private Keyboard k;
    private SnakeHead snakeHead;

    public Controls() {
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
                snakeHead.moveUp();
                break;
            case KeyboardEvent.KEY_A:
                System.out.println("Moved left!");
                snakeHead.moveLeft();
                break;
            case KeyboardEvent.KEY_S:
                System.out.println("Moved down!");
                snakeHead.moveDown();
                break;
            case KeyboardEvent.KEY_D:
                System.out.println("Moved right!");
                snakeHead.moveRight();
                break;
        }
    }

    @Override
    public void keyReleased(KeyboardEvent keyboardEvent) {

    }
}
