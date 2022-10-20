package application;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CustomMenuItem;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;



public class HomeController {
	Stage stage;
	Scene scene;
	Parent root;
	@FXML
	TextField creditCardText;
	
	public void showProfile (ActionEvent event) throws IOException {
		
		FXMLLoader loader = new FXMLLoader(getClass().getResource("profile.fxml"));
		root=loader.load();
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		Scene scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
		
	}
	
	public void showAllBooks(ActionEvent event) throws IOException {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("ShowItems.fxml"));
		root=loader.load();
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		Scene scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
		
		
		  
	}
	public void backButton(ActionEvent event) throws IOException {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("Home.fxml"));
		root=loader.load();
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		Scene scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
				  
	}
	public void birdman(ActionEvent event) throws IOException {
		if (Desktop.isDesktopSupported()) {
		    try {
		        File myFile = new File("C:\\Users\\Kiro\\eclipse-workspace\\HelloFX\\src\\Birdman.pdf");
		        Desktop.getDesktop().open(myFile);
		    } catch (IOException ex) {
		        // no application registered for PDFs
		    }
		}
	}
	public void rockets(ActionEvent event) throws IOException {
		if (Desktop.isDesktopSupported()) {
		    try {
		        File myFile = new File("C:\\Users\\Kiro\\eclipse-workspace\\HelloFX\\src\\RocketsAndPeople.pdf");
		        Desktop.getDesktop().open(myFile);
		    } catch (IOException ex) {
		        // no application registered for PDFs
		    }
		}
	}
	public void macbeth(ActionEvent event) throws IOException {
		if (Desktop.isDesktopSupported()) {
		    try {
		        File myFile = new File("C:\\Users\\Kiro\\eclipse-workspace\\HelloFX\\src\\macbeth.pdf");
		        Desktop.getDesktop().open(myFile);
		    } catch (IOException ex) {
		        // no application registered for PDFs
		    }
		}
	}
	public void aStranger(ActionEvent event) throws IOException {
		if (Desktop.isDesktopSupported()) {
		    try {
		        File myFile = new File("C:\\Users\\Kiro\\eclipse-workspace\\HelloFX\\src\\aStranger.pdf");
		        Desktop.getDesktop().open(myFile);
		    } catch (IOException ex) {
		        // no application registered for PDFs
		    }
		}
	}
	public void toKillAMockingbird(ActionEvent event) throws IOException {
		if (Desktop.isDesktopSupported()) {
		    try {
		        File myFile = new File("C:\\Users\\Kiro\\eclipse-workspace\\HelloFX\\src\\toKillAMockingbird.pdf");
		        Desktop.getDesktop().open(myFile);
		    } catch (IOException ex) {
		        // no application registered for PDFs
		    }
		}
	}
	
	public void showOwnedBooks(ActionEvent event) throws IOException {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("ShowOwnedItems.fxml"));
		root=loader.load();
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		Scene scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	
	public void buying (ActionEvent event) throws IOException {
		String creditCard = creditCardText.getText();
		if(creditCard.equals("1234567887654321")) {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("Token.fxml"));
		root=loader.load();
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		Scene scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
		}
		else {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("buyingError.fxml"));
			root=loader.load();
			stage = (Stage)((Node)event.getSource()).getScene().getWindow();
			Scene scene = new Scene(root);
			stage.setScene(scene);
			stage.show();
		}
	}
	
	

	 public void loadAllItems (ActionEvent event) throws IOException {
		 FXMLLoader loader = new FXMLLoader(getClass().getResource("ShowItems.fxml"));
			root=loader.load();
			stage = (Stage)((Node)event.getSource()).getScene().getWindow();
			Scene scene = new Scene(root);
			stage.setScene(scene);
			stage.show();
		 
	 }
	 
	 public void buyingError (ActionEvent event) throws IOException {
		 FXMLLoader loader = new FXMLLoader(getClass().getResource("Buying.fxml"));
			root=loader.load();
			stage = (Stage)((Node)event.getSource()).getScene().getWindow();
			Scene scene = new Scene(root);
			stage.setScene(scene);
			stage.show();
		 
	 }
	 
	 public void loadBuying (ActionEvent event) throws IOException {
		 
		 FXMLLoader loader = new FXMLLoader(getClass().getResource("Buying.fxml"));
			root=loader.load();
			stage = (Stage)((Node)event.getSource()).getScene().getWindow();
			Scene scene = new Scene(root);
			stage.setScene(scene);
			stage.show();
	 }
	
}
