package UI;


import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import java.util.ArrayList;

public class UI extends Application {

	
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) {
		
		primaryStage.setTitle("Check Copy Status");
		
		GridPane checkCopyGrid = new GridPane();
		checkCopyGrid.setAlignment(Pos.CENTER);
		checkCopyGrid.setHgap(20);
		checkCopyGrid.setVgap(20);
		checkCopyGrid.setPadding(new Insets(25, 25, 25, 25));
		
		// LALBLE
		

		Label bookTitleLable = new Label("Book Title:");
		checkCopyGrid.add(bookTitleLable, 1, 1);

		Label copyNumberLable = new Label("Copy Number:");
		checkCopyGrid.add(copyNumberLable, 1, 2);

		

	

		// TEXTField

		TextField memberIDTextField = new TextField();
		checkCopyGrid.add(memberIDTextField, 2, 1);

		TextField bookTextField = new TextField();
		checkCopyGrid.add(bookTextField, 2, 2);

		

		
		


		Button btnAddCopy = new Button("Check Book Copy Status");
		HBox hbBtnAddCopy = new HBox(10);
		hbBtnAddCopy.setAlignment(Pos.BOTTOM_RIGHT);
		hbBtnAddCopy.getChildren().add(btnAddCopy);
		checkCopyGrid.add(hbBtnAddCopy, 2, 4);
		
		Scene searchScene = new Scene(checkCopyGrid);
		primaryStage.setScene(searchScene);
		primaryStage.show();

	}

}