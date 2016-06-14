package ui.control;

import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.util.Duration;

/**
 * Created by maksy on 30-May-16.
 */
public class animation {
    public static void showMenu(Pane pane1, Pane pane2, Pane pane3, Label label1, Label label2, Label label3, Label label4, Label label5, Pane pane4) {
        pane4.setStyle("-fx-background-image: url('ui/img/menu_2.png'); -fx-background-position: center center; -fx-background-repeat: stretch;");
        final Timeline slideOut = new Timeline();
        slideOut.setCycleCount(1);
        slideOut.setAutoReverse(false);
        final KeyValue kv1 = new KeyValue(pane1.translateXProperty(), 0);
        final KeyFrame kf1 = new KeyFrame(Duration.millis(500), kv1);
        final KeyValue kv2 = new KeyValue(pane2.translateXProperty(), 0);
        final KeyFrame kf2 = new KeyFrame(Duration.millis(500), kv2);
        final KeyValue kv3 = new KeyValue(pane3.translateXProperty(), 0);
        final KeyFrame kf3 = new KeyFrame(Duration.millis(500), kv3);
        final KeyValue kv4 = new KeyValue(label1.opacityProperty(), 0);
        final KeyFrame kf4 = new KeyFrame(Duration.millis(380), kv4);
        slideOut.getKeyFrames().addAll(kf1, kf2, kf3, kf4);
        slideOut.play();
        label1.setVisible(false);
        label2.setVisible(false);
        label3.setVisible(false);
        label4.setVisible(true);
        label5.setVisible(true);
    }

    public static void hideMenu(Pane pane1, Pane pane2, Pane pane3, Label label1, Label label2, Label label3, Label label4, Label label5, Pane pane4) {
        pane4.setStyle("-fx-background-image: url('ui/img/menu_1.png'); -fx-background-position: center center; -fx-background-repeat: stretch;");
        final Timeline slideBack = new Timeline();
        slideBack.setCycleCount(1);
        slideBack.setAutoReverse(false);
        final KeyValue kv1 = new KeyValue(pane1.translateXProperty(), -250);
        final KeyFrame kf1 = new KeyFrame(Duration.millis(500), kv1);
        final KeyValue kv2 = new KeyValue(pane2.translateXProperty(), 250);
        final KeyFrame kf2 = new KeyFrame(Duration.millis(500), kv2);
        final KeyValue kv3 = new KeyValue(pane3.translateXProperty(), -190);
        final KeyFrame kf3 = new KeyFrame(Duration.millis(380), kv3);
        final KeyValue kv4 = new KeyValue(label1.opacityProperty(), 1);
        final KeyFrame kf4 = new KeyFrame(Duration.millis(800), kv4);
        slideBack.getKeyFrames().addAll(kf1,kf2, kf3, kf4);
        slideBack.play();
        label1.setVisible(true);
        label2.setVisible(true);
        label3.setVisible(true);
        label4.setVisible(false);
        label5.setVisible(false);
    }
}
