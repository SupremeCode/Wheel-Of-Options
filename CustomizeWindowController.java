package application;

import javafx.fxml.FXML;
import javafx.stage.Stage;

public class CustomizeWindowController {
	private Main main;
	private Stage primaryStage;
	
	public void setMain(Main main, Stage primaryStage){
		this.main = main;
		this.primaryStage = primaryStage;
	}
	@FXML
	public void select2(){
		main.enterTwoOptions();
	
	}
	@FXML
	public void select4(){
		main.enterFourOptions();
	}
	@FXML
	public void select6(){
		main.enterSixOptions();
	}
	@FXML
	public void select8(){
		main.enterEightOptions();
	}
	@FXML
	public void goBack(){
		main.firstWindow();
	}
}
