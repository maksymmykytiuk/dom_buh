package ui.control;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.geometry.NodeOrientation;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.ScrollPane;
import javafx.scene.effect.DropShadow;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.TilePane;
import javafx.scene.paint.Color;

import java.net.URL;
import java.util.ResourceBundle;

/**
 * Created by maksy on 03-Jun-16.
 */
public class comUslController implements Initializable {
    public ScrollPane root;
    public TilePane root1;
    public Button btn;

    public void initialize(URL url, ResourceBundle rb) {
        root1.setPrefColumns(4);
        root1.setPrefRows(6);
        root1.setPadding(new Insets(15, 20, 5, 20));
        root1.setStyle("-fx-background-color: white; -fx-border-color: white");
        root1.setVgap(30);
        root1.setHgap(50);

        btn.addEventFilter(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                root1.getChildren().add(getBox());
            }
        });
    }

    public AnchorPane getBox() {
        DropShadow dropShadow = new DropShadow();
        dropShadow.setRadius(4.0);
        dropShadow.setOffsetX(0.0);
        dropShadow.setOffsetY(4.0);
        dropShadow.setColor(Color.color(0.0, 0.0, 0.0, 0.3));

        Pane topPane = new Pane();
        topPane.setPrefSize(200, 49);
        topPane.setStyle("-fx-background-color: #03a9f4;");
        topPane.setEffect(dropShadow);
        Label data = new Label("12 JUNE 2016");
        data.setStyle("-fx-color: white; -fx-font-size: 12pt; -fx-font-family: Segoe UI Semibold; -fx-text-fill: white;");
        data.setPrefSize(182, 18);
        data.setLayoutX(12);
        data.setLayoutY(5);
        data.nodeOrientationProperty().setValue(NodeOrientation.RIGHT_TO_LEFT);
        Label name = new Label("Платежка №125");
        name.setPrefSize(182, 17);
        name.setLayoutX(11);
        name.setLayoutY(27);
        name.setStyle("-fx-color: white; -fx-font-size: 10pt; -fx-font-family: Segoe UI Semibold; -fx-text-fill: white;");
        topPane.getChildren().add(data);
        topPane.getChildren().add(name);
        ListView lv = new ListView();
        lv.setPrefSize(200, 193);
        lv.setLayoutX(0);
        lv.setLayoutY(49);
        lv.setStyle("-fx-border-color: white");
        Pane bottomPane = new Pane();
        bottomPane.setPrefSize(200, 39);
        bottomPane.setLayoutY(241);
        bottomPane.setLayoutX(0);
        Label total = new Label("Total:");
        total.setPrefSize(44, 25);
        total.setLayoutX(6);
        total.setLayoutY(7);
        total.setStyle("-fx-color: black; -fx-font-size: 10pt; -fx-font-family: Segoe UI Semibold; -fx-text-fill: black;");
        Label sum = new Label("2 500 грн.");
        sum.setPrefSize(134, 25);
        sum.setLayoutX(59);
        sum.setLayoutY(7);
        sum.setStyle("-fx-color: black; -fx-font-size: 10pt; -fx-font-family: Segoe UI Semibold; -fx-text-fill: black;");
        sum.nodeOrientationProperty().setValue(NodeOrientation.RIGHT_TO_LEFT);
        bottomPane.getChildren().add(total);
        bottomPane.getChildren().add(sum);
        AnchorPane result = new AnchorPane();
        result.setPrefWidth(200);
        result.setPrefHeight(280);
        result.setStyle("-fx-background-color: white; -fx-effect: dropshadow(three-pass-box, rgba(0, 0, 0, 0.3), 5, 0.4, 1, 0);");

        result.getChildren().add(lv);
        result.getChildren().add(bottomPane);
        result.getChildren().add(topPane);
        return result;
    }
}
