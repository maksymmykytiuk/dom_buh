package ui.animation;

import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.util.Duration;
import ui.control.loginController;
import ui.control.loginController.*;

/**
 * Created by maksy on 12-Jul-16.
 */
public class animationLoginForm {

    public static boolean Position;

    public static void showPanel(Pane pane, Label label, Label cls) {
        final Timeline slideOut = new Timeline();
        int y, x;
        String s;
        slideOut.setCycleCount(1);
        slideOut.setAutoReverse(false);
        if (Position) {
            y = 0;
            x = 0;
            s = "Create an account";
            Position = false;
        } else {
            y = -407;
            x = -38;
            Position = true;
            s = "Log in";
        }
        final KeyValue kv1 = new KeyValue(pane.translateYProperty(), y);
        final KeyFrame kf1 = new KeyFrame(Duration.millis(500), kv1);
        final KeyValue kv2 = new KeyValue(label.textProperty(),s);
        final KeyFrame kf2 = new KeyFrame(Duration.millis(500), kv2);
        final KeyValue kv3 = new KeyValue(cls.translateXProperty(), x);
        final KeyFrame kf3 = new KeyFrame(Duration.millis(10), kv3);
        slideOut.getKeyFrames().addAll(kf1, kf2, kf3);
        slideOut.play();
    }
}
