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

public class AddCopyUI extends Stage{

	//Stage primaryStage;
	
	public AddCopyUI()
	{
		
		setTitle("Add Book Copy");
		
		GridPane addCopyGrid = new GridPane();
		addCopyGrid.setAlignment(Pos.CENTER);
		addCopyGrid.setHgap(20);
		addCopyGrid.setVgap(20);
		addCopyGrid.setPadding(new Insets(25, 25, 25, 25));
		
		// LALBLE
		

		Label bookTitleLable = new Label("Book Title:");
		addCopyGrid.add(bookTitleLable, 1, 1);

		Label isbnLable = new Label("ISBN:");
		addCopyGrid.add(isbnLable, 1, 2);

		

		// TEXTField

		TextField memberIDTextField = new TextField();
		addCopyGrid.add(memberIDTextField, 2, 1);

		TextField bookTextField = new TextField();
		addCopyGrid.add(bookTextField, 2, 2);

		Button btnAddCopy = new Button("Add");
		HBox hbBtnAddCopy = new HBox(10);
		hbBtnAddCopy.setAlignment(Pos.BOTTOM_RIGHT);
		hbBtnAddCopy.getChildren().add(btnAddCopy);
		addCopyGrid.add(hbBtnAddCopy, 2, 5);
		
		Scene searchScene = new Scene(addCopyGrid);
		setScene(searchScene);
		show();

	}

}