package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class ControllerStart {

	private Stage stage;
	private Scene scene;
	private String chessScene = "Chess_View.fxml";
	
	@FXML
	Button buttonStart;
	
	@FXML
	Button buttonAI;

	public void switchChessScene(ActionEvent event) throws IOException {
		Parent root = FXMLLoader.load(getClass().getResource(chessScene));
		stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
        stage.show();
	}

}
