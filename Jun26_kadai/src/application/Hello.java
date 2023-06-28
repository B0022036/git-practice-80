package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Hello extends Application{
	@Override
	public void start(Stage pstage) {
		Button b1 = new Button("ボタン1");
		Button b2 = new Button("ボタン2");
		Label lavel = new Label("こんにちは");
		BorderPane root = new BorderPane();
		root.setTop(lavel);
		root.setLeft(b1);
		root.setRight(b2);
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