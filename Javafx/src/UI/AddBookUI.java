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

public class AddBookUI extends Application {

	
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) {
		
		primaryStage.setTitle("Add Book");
		
		GridPane addBookGrid = new GridPane();
		addBookGrid.setAlignment(Pos.CENTER);
		addBookGrid.setHgap(20);
		addBookGrid.setVgap(20);
		addBookGrid.setPadding(new Insets(25, 25, 25, 25));
		
		// LALBLE
		

		Label bookTitleLable = new Label("Book Title:");
		addBookGrid.add(bookTitleLable, 1, 1);

		Label isbnLable = new Label("ISBN:");
		addBookGrid.add(isbnLable, 1, 2);

		Label authorCreLable = new Label("Author Credentials:");
		addBookGrid.add(authorCreLable, 1, 3);

		Label authorBioLable = new Label("Author Bio:");
		addBookGrid.add(authorBioLable, 1, 4);

	

		// TEXTField

		TextField memberIDTextField = new TextField();
		addBookGrid.add(memberIDTextField, 2, 1);

		TextField bookTextField = new TextField();
		addBookGrid.add(bookTextField, 2, 2);

		TextField nextCopyTextField = new TextField();
		addBookGrid.add(nextCopyTextField, 2, 3);

		TextField maxLengthTextField = new TextField();
		addBookGrid.add(maxLengthTextField, 2, 4);

		
		


		Button btnAddBook = new Button("Add");
		HBox hbBtnAddBook = new HBox(10);
		hbBtnAddBook.setAlignment(Pos.BOTTOM_RIGHT);
		hbBtnAddBook.getChildren().add(btnAddBook);
		addBookGrid.add(hbBtnAddBook, 2, 8);
		
		Scene searchScene = new Scene(addBookGrid);
		primaryStage.setScene(searchScene);
		primaryStage.show();

	}

}