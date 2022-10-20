package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class LoginController {
	@FXML
TextField nameTextField;
	@FXML
TextField passwordTextField;
private Stage stage;
private Scene scene;
private Parent root;

public void login (ActionEvent event) throws IOException {
	String username = nameTextField.getText();
	String password = passwordTextField.getText();
	if (username.equals("user1") && password.equals("123")) {
	
	FXMLLoader loader = new FXMLLoader(getClass().getResource("Achievment.fxml"));
	root=loader.load();
	stage = (Stage)((Node)event.getSource()).getScene().getWindow();
	Scene scene = new Scene(root);
	stage.setScene(scene);
	stage.show();
	}
	
	else {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("LoginError.fxml"));
		root=loader.load();
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		Scene scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
		
	}
	
	
		
		
	}

public void loadHome (ActionEvent event) throws IOException {
	FXMLLoader loader = new FXMLLoader(getClass().getResource("Home.fxml"));
	root=loader.load();
	stage = (Stage)((Node)event.getSource()).getScene().getWindow();
	Scene scene = new Scene(root);
	stage.setScene(scene);
	stage.show();
	
}



}
