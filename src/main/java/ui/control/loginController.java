package ui.control;

import javafx.event.EventHandler;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;

import java.net.URL;
import java.util.ResourceBundle;

;import static ui.animation.animationLoginForm.*;

/**
 * Created by maksy on 25-May-16.
 */
public class loginController implements Initializable {

    public Label cls_button;
    public Pane login_panel;
    public Label creat_user;
    public Label cls_button_d;

    public void initialize(URL url, ResourceBundle rb) {
        creat_user.addEventFilter(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                showPanel(login_panel, creat_user, cls_button_d);
            }
        });
    }
}
