package application;

import com.sun.javafx.geom.transform.Affine3D;
import com.sun.javafx.geom.transform.BaseTransform;

import javafx.animation.PathTransition;
import javafx.animation.RotateTransition;
import javafx.animation.Transition;
import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.geometry.Point3D;
import javafx.scene.Group;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.shape.Path;
import javafx.scene.transform.Transform;
import javafx.stage.Stage;
import javafx.util.Duration;

public class FirstWindowController{
	private Main main;
	private Stage primaryStage;
	@FXML private ImageView lalaKiki;
	int userInput = 1;
	int x = 0;
	int y = 1840 * userInput;
	public void setMain(Main main, Stage primaryStage){
		this.main = main;
		this.primaryStage = primaryStage;
	
			RotateTransition rt = new RotateTransition(new Duration(8000), lalaKiki);
			rt.setAxis(new Point3D(0,0,1));
			rt.setFromAngle(x);
			rt.setToAngle(y);
		//	rt.setCycleCount(Transition.INDEFINITE);
			rt.setCycleCount(1);
			rt.play();
			y+=45;
	}
	@FXML
	public void customizeOptions(){
		main.customizeWindow();
	}
	@FXML
	public void defaultYesNo(){
		main.defaultYesNo();
	}
	@FXML
	public void exit(){
		primaryStage.close();
	}
}
