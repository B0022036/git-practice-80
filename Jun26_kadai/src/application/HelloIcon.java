package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class HelloIcon extends Application{
	@Override
	public void start(Stage pstage) {
		Image img = new Image("Hello.png");
		ImageView iv = new ImageView(img);
		Button b1 = new Button("あいさつ",iv);
		
		Button b2 = new Button("消える");
		b2.setGraphic(new ImageView("doron.png"));
		
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