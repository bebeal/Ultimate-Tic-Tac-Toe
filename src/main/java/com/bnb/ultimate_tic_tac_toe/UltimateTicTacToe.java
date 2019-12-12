package com.bnb.ultimate_tic_tac_toe;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.stage.Stage;
import javafx.scene.Scene;

/**
 * @author bnoah 
 * A GUI to play Ultimate Tic Tac Toe in the form of a Model-View-Controller
 */
public class UltimateTicTacToe extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		Parent root = FXMLLoader.load(getClass().getResource("/com/bnb/ultimate_tic_tac_toe/View.fxml"));
		primaryStage.setScene(new Scene(root, 1300, 1000));
		primaryStage.setTitle("Ultimate Tic Tac Toe");
		primaryStage.show();
	}
}
