package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class HelloFlowPane extends Application{
	@Override
	public void start(Stage pstage) {
		Button b1 = new Button("ボタン1");
		Button b2 = new Button("ボタン2");
		Label label = new Label("こんにちは");
		
		FlowPane root = new FlowPane(10,10);
		root.setPrefWrapLength(205);
		root.getChildren().add(label);
		root.getChildren().add(b1); // シーングラフに順にノードを入れる
		root.getChildren().add(b2);
		
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