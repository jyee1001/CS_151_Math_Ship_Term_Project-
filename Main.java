import javafx.application.Application;
import javafx.scene.Scene;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.event.ActionEvent;
import javafx.stage.Stage;
import javafx.scene.control.Label;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.canvas.Canvas;

public class Main extends Application{
	
	Button button;
	
	public static void main(String [] args) {
		launch(args);
	}
	
	@Override 
	public void start(Stage primaryStage) throws Exception {
		Canvas canvas = new Canvas(500, 800);
		GraphicsContext gc = canvas.getGraphicsContext2D();
		primaryStage.setTitle("Math Ship");
		
		button = new Button();
		button.setText("Click me");
		
		StackPane layout = new StackPane();
		layout.getChildren().add(button);
		
		//Scene scene = new Scene(layout, 500, 800);
		
		
		//primaryStage.setScene(scene);
		primaryStage.setScene(new Scene(new StackPane(canvas)));
		gc.fillRect(250, 700, 15, 30 );
		primaryStage.show();
	}

}
