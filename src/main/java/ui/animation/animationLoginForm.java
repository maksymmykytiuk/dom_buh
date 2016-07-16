package ui.animation;

import javafx.animation.*;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.util.Duration;

import java.security.Key;

/**
 * Created by maksy on 12-Jul-16.
 */
public class animationLoginForm {

    public static boolean Position;

    public static void showCreateUser(Pane pane, Label label, Label cls, Label hlp) {
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
            s = "Log in";
            Position = true;
        }
        final KeyValue kv1 = new KeyValue(pane.translateYProperty(), y);
        final KeyFrame kf1 = new KeyFrame(Duration.millis(500), kv1);
        final KeyValue kv2 = new KeyValue(label.textProperty(), s);
        final KeyFrame kf2 = new KeyFrame(Duration.millis(500), kv2);
        final KeyValue kv3 = new KeyValue(cls.translateXProperty(), x);
        final KeyFrame kf3 = new KeyFrame(Duration.millis(10), kv3);
        final KeyValue kv4 = new KeyValue(hlp.translateXProperty(), Math.abs(x));
        final KeyFrame kf4 = new KeyFrame(Duration.millis(10), kv4);
        slideOut.getKeyFrames().addAll(kf1, kf2, kf3, kf4);
        slideOut.play();
    }

    public static void verification(Pane pane, Label check, Boolean aBoolean) {
        verificationPanel(pane);
        verificationCheck(check, aBoolean);
    }

    private static void verificationPanel(Pane pane) {
        final Timeline slideOut = new Timeline();
        pane.setOpacity(0);
        final KeyValue kv1 = new KeyValue(pane.translateXProperty(), -372);
        final KeyFrame kf1 = new KeyFrame(Duration.millis(.1), kv1);
        final KeyValue kv2 = new KeyValue(pane.opacityProperty(), 1);
        final KeyFrame kf2 = new KeyFrame(Duration.millis(100), kv2);

        slideOut.getKeyFrames().addAll(kf1, kf2);
        slideOut.play();
    }

    private static void verificationCheck(Label check, Boolean aBoolean) {
        final Timeline slideOut = new Timeline();
        if(aBoolean){check.setStyle("-fx-background-image: url('/ui/img/loginTrue.png')");}else{check.setStyle("-fx-background-image: url('/ui/img/loginFalse.png')");}
        check.setOpacity(0);
        final KeyValue kv1 = new KeyValue(check.opacityProperty(), 1);
        final KeyFrame kf1 = new KeyFrame(Duration.millis(1000), kv1);
        final KeyFrame kf2 = new KeyFrame(Duration.millis(4000));

        slideOut.getKeyFrames().addAll(kf1, kf2);
        slideOut.play();
    }
}
