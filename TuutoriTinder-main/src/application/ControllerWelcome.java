package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
//tuo toiminnallisuuden etusivulle
public class ControllerWelcome {
	
	 private Stage stage;
	 private Scene scene;
	 private Parent root;
	//vie profiilihakuun
	public void switchToScene(ActionEvent event) throws IOException {
		  root = FXMLLoader.load(getClass().getResource("profiili.fxml"));
		  stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		  scene = new Scene(root);
		  stage.setScene(scene);
		  stage.show();
		 }
	//vie tuutori-rekisteröintiin	
	 public void switchToTuutoriScene(ActionEvent event) throws IOException {
		  root = FXMLLoader.load(getClass().getResource("Tuutori.fxml"));
		  stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		  scene = new Scene(root);
		  stage.setScene(scene);
		  stage.show();
		 }
	 //työn alla...
	 public void switchToConnectionsScene(ActionEvent event) throws IOException {
		 	FXMLLoader loader = new FXMLLoader(getClass().getResource("Connections.fxml"));
			root = loader.load();
			stage = (Stage)((Node)event.getSource()).getScene().getWindow();
			scene = new Scene(root);
			stage.setScene(scene);
			stage.show();
		 }
}
