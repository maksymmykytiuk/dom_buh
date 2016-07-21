package ui.control;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.EventHandler;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;

import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.*;

;import static ui.animation.animationLoginForm.*;

/**
 * Created by maksy on 25-May-16.
 */
public class loginController implements Initializable {

    public Label cls_button;
    public Pane login_panel;
    public Label creat_user;
    public Label cls_button_d;
    public Label help_button;
    public Label help_button_d;
    public Label checkLogin;
    public Label checkPassword;
    public Label checkCPassword;
    public Label checkEmail;
    public Button createUser;
    public TextField fieldLogin;
    public TextField fieldCPassword;
    public TextField fieldMail;
    public TextField fieldPassword;
    public PasswordField password;
    public TextField username;
    public Pane verification;
    public Label check;
    public Button login_button;

    public void initialize(URL url, ResourceBundle rb) {
        exit(cls_button);
        exit(cls_button_d);

        pressCreateUser();

        changedField();

        creatUser();

        login();
    }

    public void pressCreateUser() {
        creat_user.addEventFilter(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                if (event.getButton() == MouseButton.PRIMARY) {
                    showCreateUser(login_panel, creat_user, cls_button_d, help_button_d);
                    fieldPassword.setText("");
                    checkPassword.setStyle("");
                    fieldCPassword.setText("");
                    checkCPassword.setStyle("");
                    fieldMail.setText("");
                    checkEmail.setStyle("");
                    fieldLogin.setText("");
                    checkLogin.setStyle("");
                }
            }
        });
    }

    public void changedField() {
        fieldCPassword.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                if (fieldCPassword.getText().trim().equals(fieldPassword.getText().trim()) && !fieldCPassword.getText().trim().isEmpty()) {
                    checkCPassword.setStyle("-fx-background-image: url('/ui/img/checkTrue.png')");
                } else {
                    checkCPassword.setStyle("-fx-background-image: url('/ui/img/checkFalse.png')");
                }
                if (fieldPassword.getText().trim().isEmpty() && fieldCPassword.getText().trim().isEmpty()) {
                    checkCPassword.setStyle("");
                }
            }
        });

        fieldPassword.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                if (fieldCPassword.getText().trim().equals(fieldPassword.getText().trim()) && !fieldCPassword.getText().trim().isEmpty()) {
                    checkCPassword.setStyle("-fx-background-image: url('/ui/img/checkTrue.png')");
                } else {
                    checkCPassword.setStyle("-fx-background-image: url('/ui/img/checkFalse.png')");
                }
                if (!fieldPassword.getText().trim().isEmpty()) {
                    checkPassword.setStyle("-fx-background-image: url('/ui/img/checkTrue.png')");
                } else {
                    checkPassword.setStyle("");
                    if (fieldPassword.getText().trim().isEmpty() && fieldCPassword.getText().trim().isEmpty()) {
                        checkCPassword.setStyle("");
                    }
                }
            }
        });

        fieldLogin.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                if (!fieldLogin.getText().trim().isEmpty()) {
                    checkLogin.setStyle("-fx-background-image: url('/ui/img/checkTrue.png')");
                } else {
                    checkLogin.setStyle("");
                }
            }
        });

        fieldMail.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                if (!fieldMail.getText().trim().isEmpty()) {
                    checkEmail.setStyle("-fx-background-image: url('/ui/img/checkTrue.png')");
                } else {
                    checkEmail.setStyle("");
                }
            }
        });
    }

    public void login() {
        login_button.addEventFilter(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                if (event.getButton() == MouseButton.PRIMARY) {
                    if (!(password.getText().trim().isEmpty() && username.getText().trim().isEmpty())) {
                        verification(verification, check, true);
                    }
                }
            }
        });
    }

    public void creatUser() {
        createUser.addEventFilter(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                if (mouseEvent.getButton() == MouseButton.PRIMARY) {
                    if (fieldLogin.getText().trim().isEmpty()) {
                        checkLogin.setStyle("-fx-background-image: url('/ui/img/checkFalse.png')");
                    } else {
                        checkLogin.setStyle("-fx-background-image: url('/ui/img/checkTrue.png')");
                    }

                    if (fieldPassword.getText().trim().isEmpty()) {
                        checkPassword.setStyle("-fx-background-image: url('/ui/img/checkFalse.png')");
                        checkCPassword.setStyle("-fx-background-image: url('/ui/img/checkFalse.png')");
                    } else {
                        checkPassword.setStyle("-fx-background-image: url('/ui/img/checkTrue.png')");
                    }

                    if (fieldMail.getText().trim().isEmpty()) {
                        checkEmail.setStyle("-fx-background-image: url('/ui/img/checkFalse.png')");
                    } else {
                        checkEmail.setStyle("-fx-background-image: url('/ui/img/checkTrue.png')");
                    }

                    if (!(fieldPassword.getText().trim().isEmpty() && fieldLogin.getText().trim().isEmpty()
                            && fieldCPassword.getText().trim().isEmpty() && fieldMail.getText().trim().isEmpty())) {
                        //create user
                    }
                }
            }
        });
    }

    public void exit(Label label) {
        label.addEventFilter(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                System.exit(0);
            }
        });
    }
}
