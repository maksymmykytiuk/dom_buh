package ui.control;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.geometry.NodeOrientation;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.ScrollPane;
import javafx.scene.effect.DropShadow;
import javafx.scene.input.MouseButton;
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
    public Boolean sActive = false;
    public Pane sw;
    public Pane SelectPane;

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

    //Панели
    public Pane pane_for_com_usl;
    public Pane pane_for_home;
    public Pane pane_for_earnings;
    public Pane pane_for_consumption;
    public Pane pane_for_account;
    public Pane pane_for_report;
    public Pane pane_for_users;
    public Pane pane_for_car;
    public Pane pane_for_credit;

    //Action button
    public Label addButton;

    //Active button
    public Label activ3;
    public Label activ2;
    public Label activ7;
    public Label activ6;
    public Label activ1;
    public Label activ5;
    public Label activ4;

    public void initialize(URL url, ResourceBundle rb) {
        //Выбрать первый элемент
        sw = switch1;
        pn1 = icon1;
        pn2 = label1;
        selectMenu(switch1, icon1, label1);

        //Сходу меню скрыто
        hideMenu(nav, mainNav, panel_menu_name, user_photo_small, logout_m, settings_m, logout_b, settings_b, menu_button, SelectPane);

        //Скрыть/показать меню
        menu_button.addEventFilter(MouseEvent.MOUSE_PRESSED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                if (sMenu) {
                    hideMenu(nav, mainNav, panel_menu_name, user_photo_small, logout_m, settings_m, logout_b, settings_b, menu_button, SelectPane);
                    sMenu = false;
                } else {
                    showMenu(nav, mainNav, panel_menu_name, user_photo_small, logout_m, settings_m, logout_b, settings_b, menu_button, SelectPane);
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

        //Нажатие на Action button
        addButton.addEventFilter(MouseEvent.MOUSE_PRESSED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                if (event.getButton() == MouseButton.PRIMARY) {
                    switch (name_window.getText().trim()) {
                        case "Home":

                            break;
                        case "Utility services":
                            sActive(sActive, activ1, activ2, null, null, null, null, null);
                            break;
                        case "Earnings":

                            break;
                        case "Consumption":

                            break;
                        case "Account":

                            break;
                        case "Report":

                            break;
                        case "Users":

                            break;
                        case "Car":

                            break;
                        case "Credit":

                            break;
                    }
                }
            }
        });
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

    public void sActive(Boolean aBoolean, Label label1, Label label2, Label label3, Label label4, Label label5, Label label6, Label label7) {
        if (aBoolean) {
            hideActiveButton(label1, label2, label3, label4, label5, label6, label7);
            sActive = false;
        } else {
            showActiveButton(label1, label2, label3, label4, label5, label6, label7);
            sActive = true;
        }
    }

    public void clickMouse(final Pane pane1, final Pane pane2, final Pane pane3) {
        pane2.addEventFilter(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                if (mouseEvent.getButton() == MouseButton.PRIMARY) {
                    sw.setStyle("-fx-background-color: #03a9f4");
                    sw = pane1;
                    selectMenu(pane1, pane2, pane3);
                    pn1 = pane2;
                    pn2 = pane3;
                }
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
            showPanel("Home");
            //goTo
        }
        if (pane2 == icon2 || pane3 == label2) {
            setColor(pane1, pane2, pane3);
            name_window.setText("Earnings");
            showPanel("Earnings");
            //goTo
        }
        if (pane2 == icon3 || pane3 == label3) {
            setColor(pane1, pane2, pane3);
            name_window.setText("Consumption");
            showPanel("Consumption");
            //goTo
        }
        if (pane2 == icon4 || pane3 == label4) {
            setColor(pane1, pane2, pane3);
            name_window.setText("Utility services");
            showPanel("Utility services");
            //goTo
        }
        if (pane2 == icon5 || pane3 == label5) {
            setColor(pane1, pane2, pane3);
            name_window.setText("Account");
            showPanel("Account");
            //goTo
        }
        if (pane2 == icon6 || pane3 == label6) {
            setColor(pane1, pane2, pane3);
            name_window.setText("Report");
            showPanel("Report");
            //goTo
        }
        if (pane2 == icon7 || pane3 == label7) {
            setColor(pane1, pane2, pane3);
            name_window.setText("Users");
            showPanel("Users");
            //goTo
        }
        if (pane2 == icon8 || pane3 == label8) {
            setColor(pane1, pane2, pane3);
            name_window.setText("Car");
            showPanel("Car");
            //goTo
        }
        if (pane2 == icon9 || pane3 == label9) {
            setColor(pane1, pane2, pane3);
            name_window.setText("Credit");
            showPanel("Credit");
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
                if (mouseEvent.getButton() == MouseButton.PRIMARY) {
                    System.out.println("set");
                }
            }
        });

        label2.addEventFilter(MouseEvent.MOUSE_PRESSED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                if (mouseEvent.getButton() == MouseButton.PRIMARY) {
                    System.out.println("set");
                }
            }
        });
    }

    public void clickOnLogOut(Label label1, Label label2) {
        label1.addEventFilter(MouseEvent.MOUSE_PRESSED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                if (mouseEvent.getButton() == MouseButton.PRIMARY) {
                    System.out.println("log");
                }
            }
        });

        label2.addEventFilter(MouseEvent.MOUSE_PRESSED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                if (mouseEvent.getButton() == MouseButton.PRIMARY) {
                    System.out.println("log");
                }
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

    public void positionPane() {
        if (!sMenu) {
            hidePanel_a(SelectPane);
        } else {
            showPanel_a(SelectPane);
        }
    }

    public void showPanel(String s) {
        hideAllPanel();
        switch (s) {
            case "Home":
                SelectPane = pane_for_home;
                positionPane();
                pane_for_home.setVisible(true);
                break;
            case "Utility services":
                SelectPane = pane_for_com_usl;
                positionPane();
                pane_for_com_usl.setVisible(true);
                break;
            case "Earnings":
                SelectPane = pane_for_earnings;
                positionPane();
                pane_for_earnings.setVisible(true);
                break;
            case "Consumption":
                SelectPane = pane_for_consumption;
                positionPane();
                pane_for_consumption.setVisible(true);
                break;
            case "Account":
                SelectPane = pane_for_account;
                positionPane();
                pane_for_account.setVisible(true);
                break;
            case "Report":
                SelectPane = pane_for_report;
                positionPane();
                pane_for_report.setVisible(true);
                break;
            case "Users":
                SelectPane = pane_for_users;
                positionPane();
                pane_for_users.setVisible(true);
                break;
            case "Car":
                SelectPane = pane_for_car;
                positionPane();
                pane_for_car.setVisible(true);
                break;
            case "Credit":
                SelectPane = pane_for_credit;
                positionPane();
                pane_for_credit.setVisible(true);
                break;
        }
    }

    public void hideAllPanel() {
        pane_for_com_usl.setVisible(false);
        pane_for_home.setVisible(false);
        pane_for_account.setVisible(false);
        pane_for_car.setVisible(false);
        pane_for_users.setVisible(false);
        pane_for_consumption.setVisible(false);
        pane_for_report.setVisible(false);
        pane_for_earnings.setVisible(false);
        pane_for_credit.setVisible(false);
        if (sActive) {
            hideActiveButton(activ1, activ2, activ3, activ4, activ5, activ6, activ7);
            sActive = false;
        }
    }
}
