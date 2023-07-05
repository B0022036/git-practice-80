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

public class HelloNewLayout2 extends Application{
	@Override
	public void start(Stage pstage) {
		Button b1   = new Button("ボタン1");
		Button b2   = new Button("ボタン2");
		Label lavel = new Label("こんにちは");
		HBox  hb    = new HBox();
		HBox.setHgrow(b1, Priority.ALWAYS);
		b1.setMaxWidth(Double.MAX_VALUE);
		HBox.setHgrow(b2, Priority.ALWAYS);
		b2.setMaxWidth(Double.MAX_VALUE);
		hb.getChildren().add(b1);
		hb.getChildren().add(b2);
		hb.setAlignment(Pos.CENTER);
		
		VBox  vb    = new VBox();
		vb.getChildren().add(lavel);
		vb.getChildren().add(hb);
		vb.setAlignment(Pos.CENTER);
		
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