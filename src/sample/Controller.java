package sample;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class Controller {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private PasswordField passwordField;

    @FXML
    private TextField loginField;

    @FXML
    private Button sgnInButton;

    @FXML
    private Button lognButtun;

    @FXML
    void initialize() {

                sgnInButton.setOnAction(event -> {
            String loginText = loginField.getText().trim();
            String loginPass = passwordField.getText().trim();
            if (!loginText.equals("") && !loginPass.equals ("")){
                loginUser(loginText, loginPass);
            }
            else
                System.out.println("Login and Pass is empty");
    });
        lognButtun.setOnAction(event ->{
            lognButtun.getScene().getWindow().hide();
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("/sample/signUp.fxml"));
            try {
                loader.load();
            } catch (IOException e) {
                e.printStackTrace();
            }
            Parent root = loader.getRoot();
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.showAndWait();

        });
    }

    private void loginUser(String loginText, String loginPass) {

    }
}
