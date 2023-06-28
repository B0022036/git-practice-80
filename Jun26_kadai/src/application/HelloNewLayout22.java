package application;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class HelloNewLayout22 extends Application{
	@Override
	public void start(Stage pstage) {
		Button b1   = new Button("ボタン1");
		Button b2   = new Button("ボタン2");
		Label lavel = new Label("こんにちは");
		HBox  hb    = new HBox();
		hb.getChildren().add(b1);
		hb.getChildren().add(b2);
		hb.setAlignment(Pos.CENTER);
		hb.setPrefHeight(0);
		
		VBox  vb    = new VBox();
		vb.getChildren().add(lavel);
		vb.getChildren().add(hb);
		vb.setAlignment(Pos.CENTER);
		vb.setPrefHeight(0);
		
		
		Scene scene = new Scene(vb);
		pstage.setScene(scene);
		pstage.setTitle("Hello");
		pstage.sizeToScene();
		pstage.show();
	}
	public static void main(String[] args) {
		launch(args);
	}

}