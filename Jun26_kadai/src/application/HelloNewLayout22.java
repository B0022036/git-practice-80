package application;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class HelloNewLayout22 extends Application{
	@Override
	public void start(Stage pstage) {
		Button b1   = new Button("ボタン1");
		Button b2   = new Button("ボタン2");
		Label lavel = new Label("こんにちは");
		HBox  hb    = new HBox();
		HBox.setHgrow(b1, Priority.ALWAYS);
		HBox.setHgrow(b2, Priority.ALWAYS);
		b1.setMaxSize(Double.MAX_VALUE,Double.MAX_VALUE);
		b2.setMaxSize(Double.MAX_VALUE,Double.MAX_VALUE);
		hb.getChildren().add(b1);
		hb.getChildren().add(b2);
		hb.setAlignment(Pos.CENTER);
		
		VBox  vb    = new VBox();


		HBox.setHgrow(lavel, Priority.ALWAYS);
		VBox.setVgrow(lavel, Priority.ALWAYS);
		VBox.setVgrow(hb, Priority.ALWAYS);
		lavel.setMaxSize(Double.MAX_VALUE,Double.MAX_VALUE);
		lavel.setAlignment(Pos.CENTER);
		vb.getChildren().add(lavel);
		vb.getChildren().add(hb);
		vb.setFillWidth(true);
		
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