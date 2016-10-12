package UI;

import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;

public class Menu {
	FlowPane menuGrid=new FlowPane();
	
	public void getMenuFlow(BorderPane border) {
		// TODO Auto-generated method stub
		//menuGrid=m;
		menuGrid.setVgap(8);
	    menuGrid.setHgap(4);
	    menuGrid.setPrefWrapLength(50);
		Button btn0 = new Button("Add Member");
		
		//HBox hbBtn0 = new HBox(10);
		//hbBtn0.setAlignment(Pos.BOTTOM_RIGHT);
		//hbBtn0.getChildren().add(btn0);
		
		menuGrid.getChildren().add(btn0);
		btn0.setVisible(false);

		Button btn1 = new Button("Search/Edit Member");
//		HBox hbBtn1 = new HBox(10);
//		hbBtn1.setAlignment(Pos.BOTTOM_RIGHT);
//		hbBtn1.getChildren().add(btn1);
		menuGrid.getChildren().add(btn1);
		btn1.setVisible(false);

		Button btn2 = new Button("Check Out");
//		HBox hbBtn2 = new HBox(10);
//		hbBtn2.setAlignment(Pos.BOTTOM_RIGHT);
//		hbBtn2.getChildren().add(btn2);
		menuGrid.getChildren().add(btn2);
		btn2.setVisible(false);

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
		btn5.setVisible(true);
		//return menuGrid;
//		btn5.setOnAction(
//			evt-> border.setCenter(getCheckPane()));
//		
//		};

}}
