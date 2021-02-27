package com.gomalley411.clickme;
import javafx.application.*;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;

public class ClickMe extends Application {
	public static void main (String[] args) {
		launch(args);
	}
	
	Button btn;
	
	@Override public void start(Stage primaryStage) {
		// create the button
		btn = new Button();
		btn.setText("click me please!");
		btn.setOnAction(e -> buttonClick(btn));
		
		// add the button to a layout pane
		BorderPane pane = new BorderPane();
		pane.setCenter(btn);
		// add the layout pane to a scene
		Scene scene = new Scene (pane, 300, 250);
		
		// finalize and show the stage
		primaryStage.setScene(scene);
		primaryStage.setTitle("The Click Me App");
		primaryStage.show();
	}
	
	public void buttonClick(Button b) {
		if (b.getText() == "click me please!") btn.setText("you clicked me!");
		else b.setText("click me please!");
	}
	
	public void buttonIncreaseNum(Button b) {
		int i = Integer.parseInt(String.valueOf(b.getText())); // i is the integer value of b's text
		String s = String.valueOf(i+1); // string s is the String value of i+1, so for example if i is 5 then s is 6
		b.setText(s);
	}
}
