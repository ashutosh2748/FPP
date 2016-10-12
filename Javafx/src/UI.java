import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
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

		primaryStage.setTitle("Library Management System");
		GridPane loginGrid = new GridPane();
		loginGrid.setAlignment(Pos.CENTER);
		loginGrid.setHgap(20);
		loginGrid.setVgap(20);
		loginGrid.setPadding(new Insets(25, 25, 25, 25));
		GridPane rightpane=new GridPane();

		// 1 add components for Search/ Edit Member
		// page---------------------------------------
		// LALBLE
		Label loginLable = new Label("Log In:");
		loginGrid.add(loginLable, 2, 0);

		Label userIdLable = new Label("User ID:");
		loginGrid.add(userIdLable, 2, 1);

		Label passWordLable = new Label("Password:");
		loginGrid.add(passWordLable, 2, 3);

		Label logoutLable = new Label("Logout");
		loginGrid.add(logoutLable, 2, 6);

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

		Button btnLogin = new Button("Login");
		HBox hbBtnLogin = new HBox(10);
		hbBtnLogin.setAlignment(Pos.BOTTOM_RIGHT);
		hbBtnLogin.getChildren().add(btnLogin);
		loginGrid.add(hbBtnLogin, 0, 0);

		Button btn0 = new Button("Add Member");
		HBox hbBtn0 = new HBox(10);
		hbBtn0.setAlignment(Pos.BOTTOM_RIGHT);
		hbBtn0.getChildren().add(btn0);
		loginGrid.add(hbBtn0, 0, 1);
		btn0.setVisible(false);

		Button btn1 = new Button("Search/Edit Member");
		HBox hbBtn1 = new HBox(10);
		hbBtn1.setAlignment(Pos.BOTTOM_RIGHT);
		hbBtn1.getChildren().add(btn1);
		loginGrid.add(hbBtn1, 0, 2);
		btn1.setVisible(false);

		Button btn2 = new Button("Check Out");
		HBox hbBtn2 = new HBox(10);
		hbBtn2.setAlignment(Pos.BOTTOM_RIGHT);
		hbBtn2.getChildren().add(btn2);
		loginGrid.add(hbBtn2, 0, 3);
		btn2.setVisible(false);

		Button btn3 = new Button("Add Book");
		HBox hbBtn3 = new HBox(10);
		hbBtn3.setAlignment(Pos.BOTTOM_RIGHT);
		hbBtn3.getChildren().add(btn3);
		loginGrid.add(hbBtn3, 0, 4);
		btn3.setVisible(false);

		Button btn4 = new Button("Add a Copy");
		HBox hbBtn4 = new HBox(10);
		hbBtn4.setAlignment(Pos.BOTTOM_RIGHT);
		hbBtn4.getChildren().add(btn4);
		loginGrid.add(hbBtn4, 0, 5);
		btn4.setVisible(false);

		Button btn5 = new Button("Check Copy Status");
		HBox hbBtn5 = new HBox(10);
		hbBtn5.setAlignment(Pos.BOTTOM_RIGHT);
		hbBtn5.getChildren().add(btn5);
		loginGrid.add(hbBtn5, 0, 6);
		btn5.setVisible(false);

		// TEXTField

		TextField userIdTextField = new TextField();
		loginGrid.add(userIdTextField, 2, 2);

		TextField passwordTextField = new TextField();
		loginGrid.add(passwordTextField, 2, 4);

		
		// 3 add components for login
		// page----------------------------------------------------------------------
		GridPane searchGrid = new GridPane();
		searchGrid.setAlignment(Pos.CENTER);
		searchGrid.setHgap(20);
		searchGrid.setVgap(20);
		searchGrid.setPadding(new Insets(25, 25, 25, 25));
		// LALBLE
		Label idLable = new Label("ID:");
		searchGrid.add(idLable, 1, 0);

		Label firstnameLable = new Label("First Name:");
		searchGrid.add(firstnameLable, 1, 1);

		Label lastnameLable = new Label("Last Name:");
		searchGrid.add(lastnameLable, 1, 2);

		Label streetLable = new Label("Street:");
		searchGrid.add(streetLable, 1, 3);

		Label cityLable = new Label("City:");
		searchGrid.add(cityLable, 1, 4);

		Label stateLable = new Label("State:");
		searchGrid.add(stateLable, 1, 5);

		Label zipLable = new Label("Zip:");
		searchGrid.add(zipLable, 1, 6);

		Label cellLable = new Label("Cell:");
		searchGrid.add(cellLable, 1, 7);

		// TEXTField

		TextField idTextField = new TextField();
		searchGrid.add(idTextField, 2, 0);
		// idTextField.setVisible(false);

		TextField firstnameTextField = new TextField();
		searchGrid.add(firstnameTextField, 2, 1);

		TextField lastnameTextField = new TextField();
		searchGrid.add(lastnameTextField, 2, 2);

		TextField streetTextField = new TextField();
		searchGrid.add(streetTextField, 2, 3);

		TextField cityTextField = new TextField();
		searchGrid.add(cityTextField, 2, 4);

		TextField stateTextField = new TextField();
		searchGrid.add(stateTextField, 2, 5);

		TextField zipTextField = new TextField();
		searchGrid.add(zipTextField, 2, 6);

		TextField cellTextField = new TextField();
		searchGrid.add(cellTextField, 2, 7);
		
		Button btnSearch = new Button("Search");
		HBox hbBtnSearch = new HBox(10);
		hbBtnSearch.setAlignment(Pos.BOTTOM_RIGHT);
		hbBtnSearch.getChildren().add(btnSearch);
		searchGrid.add(hbBtnSearch, 3, 0);
		
		Button btnUpdate = new Button("Update");
		HBox hbBtnUpdate = new HBox(10);
		hbBtnUpdate.setAlignment(Pos.BOTTOM_RIGHT);
		hbBtnUpdate.getChildren().add(btnUpdate);
		searchGrid.add(hbBtnUpdate, 2, 8);
		
		Button btnBack = new Button("Back");
		HBox hbBtnBack = new HBox(10);
		hbBtnBack.setAlignment(Pos.BOTTOM_RIGHT);
		hbBtnBack.getChildren().add(btnBack);
		searchGrid.add(hbBtnBack, 1, 8);
		
		// Event Handler
		btnSubmit.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				// do something if the button is clicked
				if (userIdTextField.getText().equals("1")
						&& passwordTextField.getText().equals("1")) {
					informationLable.setText(("librarian login successfully"));
					btn1.setVisible(false);
					btn2.setVisible(true);
					btn3.setVisible(false);
					btn4.setVisible(false);
					btn5.setVisible(true);
				}

				if (userIdTextField.getText().equals("2")
						&& passwordTextField.getText().equals("2"))
				// System.out.println("admin login successfully");
				{
					informationLable.setText(("admin login successfully"));
					btn1.setVisible(true);
					btn2.setVisible(false);
					btn3.setVisible(true);
					btn4.setVisible(true);
					btn5.setVisible(false);
				}

				if (userIdTextField.getText().equals("3")
						&& passwordTextField.getText().equals("3")) {
					// System.out.println("admin &librarian login successfully");
					informationLable
							.setText("admin &librarian login successfully");
					btn1.setVisible(true);
					btn2.setVisible(true);
					btn3.setVisible(true);
					btn4.setVisible(true);
					btn5.setVisible(true);
				}

			}
		});

		btnLogout.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {

				btn1.setVisible(false);
				btn2.setVisible(false);
				btn3.setVisible(false);
				btn4.setVisible(false);
				btn5.setVisible(false);
				informationLable.setText("log out successfully");

			}
		});
		btn0.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {

				// do something if the button is clicked
				// outputTextField.setText(String.valueOf(inputTextField.getText().length()));

			}
		});

		btn1.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {

				Scene searchScene = new Scene(searchGrid);
				primaryStage.setScene(searchScene);
				primaryStage.show();
			}
		});

		btn2.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {

				// do something if the button is clicked

			}
		});

	

	
		
		
		// final-----------------------------------------------------------
		// Scene scene = new Scene(loginGrid, 300, 200);
		Scene loginScene = new Scene(loginGrid);
		primaryStage.setScene(loginScene);
		primaryStage.show();
		

	
	}

}