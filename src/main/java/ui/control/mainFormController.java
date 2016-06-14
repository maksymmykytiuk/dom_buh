package ui.control;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.geometry.NodeOrientation;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.ScrollPane;
import javafx.scene.effect.DropShadow;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.TilePane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;;
import java.net.URL;
import java.util.ResourceBundle;

import static ui.control.animation.*;

/**
 * Created by maksy on 25-May-16.
 */
public class mainFormController implements Initializable {
    //animation
    public Pane menu_button;
    public Pane nav;
    public Pane mainNav;
    public Pane panel_menu_name;
    public Label user_photo_small;
    //Меню
    public Pane switch1;
    public Pane switch2;
    public Pane switch3;
    public Pane switch4;
    public Pane switch5;
    public Pane switch6;
    public Pane switch7;
    public Pane switch8;
    public Pane switch9;
    public Pane icon1;
    public Pane icon2;
    public Pane icon3;
    public Pane icon4;
    public Pane icon5;
    public Pane icon6;
    public Pane icon7;
    public Pane icon8;
    public Pane icon9;
    public Pane label1;
    public Pane label2;
    public Pane label3;
    public Pane label4;
    public Pane label5;
    public Pane label6;
    public Pane label7;
    public Pane label8;
    public Pane label9;

    public Pane pn1;
    public Pane pn2;
    public Boolean sMenu = false;
    public Pane sw;

    public Label user_photo;
    public Label settings_b;
    public Label logout_b;
    public Label logout_m;
    public Label settings_m;

    //Подписи
    public Label lb1;
    public Label lb2;
    public Label lb3;
    public Label lb4;
    public Label lb5;
    public Label lb6;
    public Label lb7;
    public Label lb8;
    public Label lb9;

    //Заголовок окна
    public Label name_window;

    //Потом удалить
    public ScrollPane root;
    public TilePane root1;

    public void initialize(URL url, ResourceBundle rb) {
        //Выбрать первый элемент
        sw = switch1;
        pn1 = icon1;
        pn2 = label1;
        selectMenu(switch1, icon1, label1);

        //Сходу меню скрыто
        hideMenu(nav, mainNav, panel_menu_name, user_photo_small, logout_m, settings_m, logout_b, settings_b, menu_button);

        //Скрыть/показать меню
        menu_button.addEventFilter(MouseEvent.MOUSE_PRESSED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                if (sMenu) {
                    hideMenu(nav, mainNav, panel_menu_name, user_photo_small, logout_m, settings_m, logout_b, settings_b, menu_button);
                    sMenu = false;
                } else {
                    showMenu(nav, mainNav, panel_menu_name, user_photo_small, logout_m, settings_m, logout_b, settings_b, menu_button);
                    sMenu = true;
                }
            }
        });

        //Текст
        setLabelText();

        //Нажатие на фото
        clickOnPhoto(user_photo_small, user_photo);

        //Выдиление меню
        hoverMouse(icon1, label1, switch1);
        hoverMouse(icon2, label2, switch2);
        hoverMouse(icon3, label3, switch3);
        hoverMouse(icon4, label4, switch4);
        hoverMouse(icon5, label5, switch5);
        hoverMouse(icon6, label6, switch6);
        hoverMouse(icon7, label7, switch7);
        hoverMouse(icon8, label8, switch8);
        hoverMouse(icon9, label9, switch9);

        //Нажатие на меню
        clickMouse(switch1, icon1, label1);
        clickMouse(switch2, icon2, label2);
        clickMouse(switch3, icon3, label3);
        clickMouse(switch4, icon4, label4);
        clickMouse(switch5, icon5, label5);
        clickMouse(switch6, icon6, label6);
        clickMouse(switch7, icon7, label7);
        clickMouse(switch8, icon8, label8);
        clickMouse(switch9, icon9, label9);

        //Logout
        clickOnLogOut(logout_b, logout_m);

        //Settings
        clickOnSettings(settings_b, settings_m);


        root1.setPrefColumns(4);
        root1.setPrefRows(6);
        root1.setPadding(new Insets(20, 20, 20, 20));
    }

    public void clickOnPhoto(Label label1, Label label2) {
        label1.addEventFilter(MouseEvent.MOUSE_PRESSED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {

            }
        });

        label2.addEventFilter(MouseEvent.MOUSE_PRESSED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {

            }
        });
    }

    public void setColor(Pane pane1, Pane pane2, Pane pane3) {
        pane1.setStyle("-fx-background-color: #ffc107");
        pn1.setStyle("-fx-background-color: #03a9f4");
        pn2.setStyle("-fx-background-color: #03a9f4");
        pane2.setStyle("-fx-background-color: #0288d1;");
        pane3.setStyle("-fx-background-color: #0288d1;");
    }

    public void clickMouse(final Pane pane1, final Pane pane2, final Pane pane3) {
        pane2.addEventFilter(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                sw.setStyle("-fx-background-color: #03a9f4");
                sw = pane1;
                selectMenu(pane1, pane2, pane3);
                pn1 = pane2;
                pn2 = pane3;
            }
        });

        pane3.addEventFilter(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                sw.setStyle("-fx-background-color: #03a9f4");
                sw = pane1;
                selectMenu(pane1, pane2, pane3);
                pn1 = pane2;
                pn2 = pane3;
            }
        });
    }

    public void selectMenu(Pane pane1, Pane pane2, Pane pane3) {
        if (pane2 == icon1 || pane3 == label1) {
            setColor(pane1, pane2, pane3);
            name_window.setText("Home");
            //goTo
        }
        if (pane2 == icon2 || pane3 == label2) {
            setColor(pane1, pane2, pane3);
            name_window.setText("Earnings");
            //goTo
        }
        if (pane2 == icon3 || pane3 == label3) {
            setColor(pane1, pane2, pane3);
            name_window.setText("Consumption");
            //goTo
        }
        if (pane2 == icon4 || pane3 == label4) {
            setColor(pane1, pane2, pane3);
            name_window.setText("Utility services");
            //goTo
        }
        if (pane2 == icon5 || pane3 == label5) {
            setColor(pane1, pane2, pane3);
            name_window.setText("Account");
            //goTo
        }
        if (pane2 == icon6 || pane3 == label6) {
            setColor(pane1, pane2, pane3);
            name_window.setText("Report");
            //goTo
        }
        if (pane2 == icon7 || pane3 == label7) {
            setColor(pane1, pane2, pane3);
            name_window.setText("Users");
            //goTo
        }
        if (pane2 == icon8 || pane3 == label8) {
            setColor(pane1, pane2, pane3);
            name_window.setText("Car");
            //goTo
        }
        if (pane2 == icon9 || pane3 == label9) {
            setColor(pane1, pane2, pane3);
            name_window.setText("Credit");
            //goTo
        }
    }

    public void hoverMouse(final Pane pane1, final Pane pane2, final Pane pane3) {
        pane1.addEventFilter(MouseEvent.MOUSE_ENTERED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                pane1.setStyle("-fx-background-color: #0288d1");
                pane2.setStyle("-fx-background-color: #0288d1");
            }
        });

        pane2.addEventFilter(MouseEvent.MOUSE_ENTERED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                pane1.setStyle("-fx-background-color: #0288d1");
                pane2.setStyle("-fx-background-color: #0288d1");
            }
        });

        pane1.addEventFilter(MouseEvent.MOUSE_EXITED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                if (!(sw == pane3)) {
                    pane1.setStyle("-fx-background-color: #03a9f4");
                    pane2.setStyle("-fx-background-color: #03a9f4");
                }
            }
        });

        pane2.addEventFilter(MouseEvent.MOUSE_EXITED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                if (!(sw == pane3)) {
                    pane1.setStyle("-fx-background-color: #03a9f4");
                    pane2.setStyle("-fx-background-color: #03a9f4");
                }
            }
        });
    }

    public void clickOnSettings(Label label1, Label label2) {
        label1.addEventFilter(MouseEvent.MOUSE_PRESSED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                System.out.println("set");
            }
        });

        label2.addEventFilter(MouseEvent.MOUSE_PRESSED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                System.out.println("set");
            }
        });
    }

    public void clickOnLogOut(Label label1, Label label2) {
        label1.addEventFilter(MouseEvent.MOUSE_PRESSED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                System.out.println("log");
            }
        });

        label2.addEventFilter(MouseEvent.MOUSE_PRESSED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                System.out.println("log");
            }
        });
    }

    public void setLabelText() {
        lb1.setText("Home");
        lb2.setText("Earnings");
        lb3.setText("Consumption");
        lb4.setText("Utility services");
        lb5.setText("Account");
        lb6.setText("Report");
        lb7.setText("Users");
        lb8.setText("Car");
        lb9.setText("Credit");
    }


    //Потом удалить

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

    public void btn(ActionEvent actionEvent) {
        root1.getChildren().add(getBox());
    }
}
