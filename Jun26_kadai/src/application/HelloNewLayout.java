package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class HelloNewLayout extends Application{
	@Override
	public void start(Stage pstage) {
		Button b1 = new Button("ボタン1");
		Button b2 = new Button("ボタン2");
		Label label = new Label("こんにちは");
		
		BorderPane root = new BorderPane();
		root.setTop(label);
		
		FlowPane fp = new FlowPane();
		fp.setPrefWrapLength(125);
		fp.getChildren().add(b1); // シーングラフに順にノードを入れる
		fp.getChildren().add(b2);
		root.setCenter(fp);
		
		
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