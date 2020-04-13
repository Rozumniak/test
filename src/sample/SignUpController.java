package sample;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class SignUpController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private PasswordField passwordField;

    @FXML
    private TextField signUpLastName;

    @FXML
    private Button signUpButton;

    @FXML
    private PasswordField loginField;

    @FXML
    private TextField signUpName;

    @FXML
    private PasswordField signUpCountry;

    @FXML
    private CheckBox signUpCheckBoxFemale;

    @FXML
    private CheckBox signUpCheckBoxMale;

    @FXML
    private Button backspace;

    @FXML
    void initialize() {

       DatabaseHandler dbHandler = new DatabaseHandler();
        signUpButton.setOnAction(event -> {
            dbHandler.signUpUser(signUpName.getText(), signUpLastName.getText(), loginField.getText(), passwordField.getText(),
                    signUpCountry.getText(),"Male" );

        });
    }
}
