package sample.signin;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

public class LoggedInController implements Initializable {

    @FXML
    private Button button_log_out;

    @FXML
    private Label label_welcome;

    @FXML
    private Label label_app;
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        button_log_out.setOnAction(event -> DBUtils.changeScene(event, "sample.fxml", "Log In!", null, null));
    }

    public void setUserInformation(String username, String app){
        label_welcome.setText("Welcome " + username + "!");
        label_app.setText("Your favourite app is " + app + "!");
    }
}
