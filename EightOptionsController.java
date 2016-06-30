package application;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class EightOptionsController {
	private Main main;
	private Stage primaryStage;
	@FXML public TextField option1;
	@FXML public TextField option2;
	@FXML public TextField option3;
	@FXML public TextField option4;
	@FXML public TextField option5;
	@FXML public TextField option6;
	@FXML public TextField option7;
	@FXML public TextField option8;
	@FXML private Label pleaseEnter;
	
	public void setMain(Main main, Stage primaryStage){
		this.main = main;
		this.primaryStage = primaryStage;	
	}

	@FXML
	public void done(){
		main.Options[0] = option1.getText();
		main.Options[1] = option2.getText();
		main.Options[2] = option3.getText();
		main.Options[3] = option4.getText();
		main.Options[4] = option5.getText();
		main.Options[5] = option6.getText();
		main.Options[6] = option7.getText();
		main.Options[7] = option8.getText();
		if(main.Options[0].isEmpty()){
			pleaseEnter.setText("Please enter a value on Option 1");
		}else if(main.Options[1].isEmpty()){
			pleaseEnter.setText("Please enter a value on Option 2");
		}else if(main.Options[2].isEmpty()){
			pleaseEnter.setText("Please enter a value on Option 3");
		}else if(main.Options[3].isEmpty()){
			pleaseEnter.setText("Please enter a value on Option 4");
		}else if(main.Options[4].isEmpty()){
			pleaseEnter.setText("Please enter a value on Option 5");
		}else if(main.Options[5].isEmpty()){
			pleaseEnter.setText("Please enter a value on Option 6");
		}else if(main.Options[6].isEmpty()){
			pleaseEnter.setText("Please enter a value on Option 7");
		}else if(main.Options[7].isEmpty()){
			pleaseEnter.setText("Please enter a value on Option 8");
		}else{
			main.selectWindow8();
		}
	}
	@FXML
	public void goBack(){
		main.customizeWindow();
	}
	
}
