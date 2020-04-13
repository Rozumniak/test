package sample;


import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.image.ImageView;

public class HomeController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private ImageView image_button;

    @FXML
    void initialize() {
        assert image_button != null : "fx:id=\"image_button\" was not injected: check your FXML file 'app.fxml'.";

    }
}
