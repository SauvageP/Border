package border;

import javax.swing.*;
import java.awt.*;

/**
 * Created by perryrgabriel on 10/7/14.
 */

public class BorderFrameTest {
    public static void main (String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                BorderFrame frame = new BorderFrame();
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setTitle("BorderFrameTest");
                frame.setVisible(true);
            }
        });
    }
}
