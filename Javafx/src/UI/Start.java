package UI;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.util.ArrayList;

public class Start extends Application {

	String Title="LMS";
	BorderPane border=new BorderPane();
	FlowPane menu=new FlowPane();
	
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) {
		
		primaryStage.setTitle(Title);
		//menu.getMenuFlow(border);
		
		menu=getMenuFlow();
		// Scene scene = new Scene(loginGrid, 300, 200);
		//anc.add
		
	border.setCenter(getLoginGrid());
	
		Scene loginScene = new Scene(border);
		//right=loginScene;
		primaryStage.setScene(loginScene);
		
		primaryStage.show();
		
		border.setLeft(menu);
		
	}
	
	
	
		
	

	public GridPane getLoginGrid()
	{
		
GridPane loginGrid = new GridPane();
loginGrid.setAlignment(Pos.CENTER);
loginGrid.setHgap(20);
loginGrid.setVgap(20);
loginGrid.setPadding(new Insets(25, 25, 25, 25));


// LALBLE
//Label loginLable = new Label("Log In:");
//loginGrid.add(loginLable, 0, 0);
//loginLable.setFont(Font.font("Comic Sans MS", FontWeight.BOLD, 30));


Label userIdLable = new Label("User ID:");
loginGrid.add(userIdLable, 2, 1);

Label passWordLable = new Label("Password:");
loginGrid.add(passWordLable, 2, 3);

//Label logoutLable = new Label("Logout");
//loginGrid.add(logoutLable, 0, 6);
//logoutLable.setFont(Font.font("Comic Sans MS", FontWeight.BOLD, 30));

 

Label informationLable = new Label("            ");
loginGrid.add(informationLable, 0, 7);

// BUTTON
Button btnSubmit = new Button("Submit");
HBox hbBtnSubmit = new HBox(10);
hbBtnSubmit.setAlignment(Pos.BOTTOM_RIGHT);
hbBtnSubmit.getChildren().add(btnSubmit);
loginGrid.add(hbBtnSubmit, 2, 5);

Button btnLogout = new Button("Logout");
HBox hbBtnLogout = new HBox(10);
hbBtnLogout.setAlignment(Pos.BOTTOM_RIGHT);
hbBtnLogout.getChildren().add(btnLogout);
loginGrid.add(hbBtnLogout, 2, 7);

//loginGrid.add
// TEXTField

TextField userIdTextField = new TextField();
loginGrid.add(userIdTextField, 2, 2);

TextField passwordTextField = new TextField();
loginGrid.add(passwordTextField, 2, 4);




// Event Handler

btnSubmit.setOnAction(new EventHandler<ActionEvent>() {
	@Override
	public void handle(ActionEvent event) {
		// do something if the button is clicked
		if (userIdTextField.getText().equals("1")
				&& passwordTextField.getText().equals("1")) {
			informationLable.setText(("librarian login successfully"));
		
			//invoke librarian window
			//new AddCopyUI().show();
			border.setCenter(getWelcomeLibrarian("Welcome You are a librarian"));
			FlowPane xx=(FlowPane)border.getLeft();
			
		
			
			
			
		}

		if (userIdTextField.getText().equals("2")
				&& passwordTextField.getText().equals("2"))
		// System.out.println("admin login successfully");
		{
			informationLable.setText(("admin login successfully"));
			
			border.setCenter(getWelcomeLibrarian("Welcome You are a Admin"));
			//invoke admin window
			
		}

		if (userIdTextField.getText().equals("3")
				&& passwordTextField.getText().equals("3")) {
			// System.out.println("admin &librarian login successfully");
			informationLable
					.setText("admin &librarian login successfully");
			border.setCenter(getWelcomeLibrarian("Welcome You are a librarian and admin"));
			//invoke both window
		}

	}

	
});

btnLogout.setOnAction(new EventHandler<ActionEvent>() {
	@Override
	public void handle(ActionEvent event) {

	
		informationLable.setText("log out successfully");
		

	}
});

return loginGrid;

	}
	
	public GridPane getWelcomeLibrarian(String text) {
		// TODO Auto-generated method stub
		
		GridPane test= new GridPane();
		test.setAlignment(Pos.CENTER);
		test.setHgap(20);
		test.setVgap(20);
		test.setPadding(new Insets(25, 25, 25, 25));
		Label Wel=new Label(text);
		test.getChildren().add(Wel);
		return test;
			
	}
	
	public GridPane getCheckPane()
	{
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
		return checkCopyGrid;
	}
	public FlowPane getMenuFlow() {
		// TODO Auto-generated method stub
		//menuGrid=m;
		FlowPane menuGrid=new FlowPane();
		menuGrid.setVgap(8);
	    menuGrid.setHgap(4);
	    menuGrid.setPrefWrapLength(50);
		Button btn0 = new Button("Add Member");
		
		//HBox hbBtn0 = new HBox(10);
		//hbBtn0.setAlignment(Pos.BOTTOM_RIGHT);
		//hbBtn0.getChildren().add(btn0);
		
		menuGrid.getChildren().add(btn0);
		//btn0.setDisabled(true);
		btn0.setDisable(true);
		

		Button btn1 = new Button("Search/Edit Member");
//		HBox hbBtn1 = new HBox(10);
//		hbBtn1.setAlignment(Pos.BOTTOM_RIGHT);
//		hbBtn1.getChildren().add(btn1);
		menuGrid.getChildren().add(btn1);
		btn1.setDisable(true);

		Button btn2 = new Button("Check Out");
//		HBox hbBtn2 = new HBox(10);
//		hbBtn2.setAlignment(Pos.BOTTOM_RIGHT);
//		hbBtn2.getChildren().add(btn2);
		menuGrid.getChildren().add(btn2);
		btn2.setDisable(true);

		Button btn3 = new Button("Add Book");
//		HBox hbBtn3 = new HBox(10);
//		hbBtn3.setAlignment(Pos.BOTTOM_RIGHT);
//		hbBtn3.getChildren().add(btn3);
//		menuGrid.add(hbBtn3, 0, 4);
		menuGrid.getChildren().add(btn3);
		btn3.setVisible(false);

		Button btn4 = new Button("Add a Copy");
//		HBox hbBtn4 = new HBox(10);
//		hbBtn4.setAlignment(Pos.BOTTOM_RIGHT);
//		hbBtn4.getChildren().add(btn4);
//		menuGrid.add(hbBtn4, 0, 5);
		menuGrid.getChildren().add(btn4);
		btn4.setVisible(false);

		Button btn5 = new Button("Check Copy Status");
//		HBox hbBtn5 = new HBox(10);
//		hbBtn5.setAlignment(Pos.BOTTOM_RIGHT);
//		hbBtn5.getChildren().add(btn5);
//		menuGrid.add(hbBtn5, 0, 6);
		menuGrid.getChildren().add(btn5);
		btn5.setDisable(true);
		//return menuGrid;
		btn5.setOnAction(
			evt-> border.setCenter(getCheckPane()));
		
		//};
		return menuGrid;
}


}