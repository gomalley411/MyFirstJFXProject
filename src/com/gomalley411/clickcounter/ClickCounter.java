package com.gomalley411.clickcounter;

import javafx.application.*;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;

public class ClickCounter extends Application {

	public static void main (String[] args) {
		launch(args);
	}
	
	Button btn;
	Label lbl;
	int iClickCount = 0;
	
	@Override public void start(Stage primaryStage) {
		// create the button
		btn = new Button("Click me please!");
		btn.setOnAction(e -> buttonClick());
		
		// create the label
		lbl = new Label("You have not yet clicked the button.");
		
		// add the label and the button to a layout pane
		BorderPane pane = new BorderPane();
		pane.setTop(lbl);
		pane.setCenter(btn);
		
		// add the layout pane to a scene
		Scene scene = new Scene (pane, 250, 150);
		
		// add the scene to the stage, set the title and show the stage
		primaryStage.setScene(scene);
		primaryStage.setTitle("Click Counter");
		primaryStage.show();
	}

	public void buttonClick() {
		iClickCount++;
		lbl.setText("You have clicked the button " + iClickCount + " times.");
	}
}
