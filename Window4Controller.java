package application;


import java.util.Random;

import javafx.animation.RotateTransition;
import javafx.fxml.FXML;
import javafx.geometry.Point3D;
import javafx.scene.Group;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Window4Controller {

	private Main main;
	private Stage primaryStage;
	@FXML ImageView ColorWheel4;
	@FXML Label option1;
	@FXML Label option2;
	@FXML Label option3;
	@FXML Label option4;
	@FXML Group group;
	int x = 0;
	int y = 45;
	
	
	public void setMain(Main main, Stage primaryStage){
		try{
	
		option1.setText(main.Options[0]);
		option2.setText(main.Options[1]);
		option3.setText(main.Options[2]);
		option4.setText(main.Options[3]);
		y = 45 + 180*(main.Options[0].length());
		this.main = main;
		this.primaryStage = primaryStage;
	
		}catch(NullPointerException e){
			e.printStackTrace();
		}
	}
	@FXML
	public void spin(){
		Random random = new Random();
		RotateTransition rt = new RotateTransition(new Duration(5000), group);
		rt.setAxis(new Point3D(0,0,1));
		rt.setFromAngle(x);
		rt.setToAngle(y + random.nextInt(22));
	//	rt.setCycleCount(Transition.INDEFINITE);
		rt.setCycleCount(1);
		rt.play();
		x+=y;
		y+=y;
	} 
	@FXML
	public void goBack(){
		main.Options[0] = "";
		main.Options[1] = "";
		main.Options[2] = "";
		main.Options[3] = "";
		main.enterFourOptions();
	}
}


