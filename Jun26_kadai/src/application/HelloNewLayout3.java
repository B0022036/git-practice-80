package application;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class HelloNewLayout3 extends Application{
	@Override
	public void start(Stage pstage) {
		Button b1 = new Button("ボタン1");
		Button b2 = new Button("ボタン2");
		Label lavel = new Label("こんにちは");
		GridPane root = new GridPane();
		root.add(lavel,0,0);
		root.add(b1,0, 1);
		root.add(b2,1, 1);
		root.setAlignment(Pos.CENTER);
	
		Scene scene = new Scene(root);
		pstage.setScene(scene);
		pstage.setTitle("Hello");
		pstage.sizeToScene();
		pstage.show();
	}
	public static void main(String[] args) {
		launch(args);
	}

}