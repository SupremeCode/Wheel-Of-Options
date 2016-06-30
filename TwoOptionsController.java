package application;


import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class TwoOptionsController{
	private Main main;
	private Stage primaryStage;
	@FXML public TextField option1;
	@FXML public TextField option2;
	@FXML private Label pleaseEnter;
	
	public void setMain(Main main, Stage primaryStage){
		this.main = main;
		this.primaryStage = primaryStage;	
	}

	@FXML
	public void done(){
		main.Options[0] = option1.getText();
		main.Options[1] = option2.getText();
		if(main.Options[0].isEmpty()){
			pleaseEnter.setText("Please enter a value on Option 1");
		}else if(main.Options[1].isEmpty()){
			pleaseEnter.setText("Please enter a value on Option 2");
		}else if(main.Options[0].isEmpty() || main.Options[1].isEmpty()){
			pleaseEnter.setText("Please enter values both Options");
		}else{
			main.selectWindow2();
		}
	}
	public void goBack(){
		main.customizeWindow();
	}
	
}
