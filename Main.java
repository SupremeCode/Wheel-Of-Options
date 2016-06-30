package application;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;


public class Main extends Application {
	Stage primaryStage;
	String[] Options = new String[8];
	
	@Override
	public void start(Stage primaryStage) {
		this.primaryStage = primaryStage;
		firstWindow();
	
	}
	public void firstWindow(){
		try {
			FXMLLoader loader = new FXMLLoader(Main.class.getResource("FirstWindowView.fxml"));
			AnchorPane pane = loader.load();
			Scene scene = new Scene(pane);
			
			FirstWindowController firstWindowController = loader.getController();
			firstWindowController.setMain(this,primaryStage);
			
//			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());

			primaryStage.setScene(scene);
			primaryStage.setResizable(false);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	public void customizeWindow(){
		try {
			FXMLLoader loader = new FXMLLoader(Main.class.getResource("customizeWindowView.fxml"));
			AnchorPane pane = loader.load();
			Scene scene = new Scene(pane);
			
			CustomizeWindowController customizeWindowController = loader.getController();
			customizeWindowController.setMain(this,primaryStage);
			
//			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());

			primaryStage.setScene(scene);
			primaryStage.setResizable(false);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void selectWindow2(){
		try {
			FXMLLoader loader = new FXMLLoader(Main.class.getResource("Window2View.fxml"));
			AnchorPane pane = loader.load();
			Scene scene = new Scene(pane);
	
			Window2Controller window2Controller = loader.getController();
			window2Controller.setMain(this,primaryStage);

//			twoOptions[0] = "test1";

			primaryStage.setScene(scene);
			primaryStage.setResizable(false);
			primaryStage.show();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	public void enterTwoOptions(){
		try {
			FXMLLoader loader = new FXMLLoader(Main.class.getResource("TwoOptionsView.fxml"));
			AnchorPane pane = loader.load();
			Scene scene = new Scene(pane);
			
			TwoOptionsController twoOptionsController = loader.getController();
			twoOptionsController.setMain(this,primaryStage);
			
//			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());

			primaryStage.setScene(scene);
			primaryStage.setResizable(false);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	public void enterFourOptions(){
		try {
			FXMLLoader loader = new FXMLLoader(Main.class.getResource("FourOptionsView.fxml"));
			AnchorPane pane = loader.load();
			Scene scene = new Scene(pane);
			
			FourOptionsController fourOptionsController = loader.getController();
			fourOptionsController.setMain(this,primaryStage);
			
//			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());

			primaryStage.setScene(scene);
			primaryStage.setResizable(false);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	public void selectWindow4(){
		try {
			FXMLLoader loader = new FXMLLoader(Main.class.getResource("Window4View.fxml"));
			AnchorPane pane = loader.load();
			Scene scene = new Scene(pane);
	
			Window4Controller window4Controller = loader.getController();
			window4Controller.setMain(this,primaryStage);

			primaryStage.setScene(scene);
			primaryStage.setResizable(false);
			primaryStage.show();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	public void enterEightOptions(){
		try {
			FXMLLoader loader = new FXMLLoader(Main.class.getResource("EightOptionsView.fxml"));
			AnchorPane pane = loader.load();
			Scene scene = new Scene(pane);
			
			EightOptionsController eightOptionsController = loader.getController();
			eightOptionsController.setMain(this,primaryStage);
			
//			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());

			primaryStage.setScene(scene);
			primaryStage.setResizable(false);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	public void selectWindow8(){
		try {
			FXMLLoader loader = new FXMLLoader(Main.class.getResource("Window8View.fxml"));
			AnchorPane pane = loader.load();
			Scene scene = new Scene(pane);
	
			Window8Controller window8Controller = loader.getController();
			window8Controller.setMain(this,primaryStage);

			primaryStage.setScene(scene);
			primaryStage.setResizable(false);
			primaryStage.show();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	public void enterSixOptions(){
		try {
			FXMLLoader loader = new FXMLLoader(Main.class.getResource("SixOptionsView.fxml"));
			AnchorPane pane = loader.load();
			Scene scene = new Scene(pane);
			
			SixOptionsController sixOptionsController = loader.getController();
			sixOptionsController.setMain(this,primaryStage);
			
//			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());

			primaryStage.setScene(scene);
			primaryStage.setResizable(false);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	public void selectWindow6(){
		try {
			FXMLLoader loader = new FXMLLoader(Main.class.getResource("Window6View.fxml"));
			AnchorPane pane = loader.load();
			Scene scene = new Scene(pane);
	
			Window6Controller window6Controller = loader.getController();
			window6Controller.setMain(this,primaryStage);

			primaryStage.setScene(scene);
			primaryStage.setResizable(false);
			primaryStage.show();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	public void defaultYesNo(){
		try {
			FXMLLoader loader = new FXMLLoader(Main.class.getResource("DefaultYesNoView.fxml"));
			AnchorPane pane = loader.load();
			Scene scene = new Scene(pane);
			
			DefaultYesNoController defaultYesNoController = loader.getController();
			defaultYesNoController.setMain(this,primaryStage);
			
//			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());

			primaryStage.setScene(scene);
			primaryStage.setResizable(false);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
