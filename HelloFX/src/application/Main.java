package application;
	
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCombination;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polygon;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;




public class Main extends Application {
	
	
	public static void main(String[] args) {
		launch(args);
	}

	
	@Override
	public void start(Stage stage) throws Exception {
		//Stage stage = new Stage();
		try {
		Parent root = FXMLLoader.load(getClass().getResource("Login.fxml"));
		Scene scene = new Scene(root);
		
		stage.setScene(scene);
		stage.show();
		
		
		
		
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
		
		
		
	}

	

