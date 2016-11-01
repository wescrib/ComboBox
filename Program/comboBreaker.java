/**
*Author: William Scribner
*
*Purpose: To use the combobox and switch case
*
*/

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.VBox;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;

public class comboBreaker extends Application {
//defining new types of variables
	Stage window;
	Scene scene;
	Button submitButton;
	ComboBox<String> combobox;

	public void start(Stage primaryStage) throws Exception {
	//setting up features of new window
	window = primaryStage;
	window.setTitle("Combooooooo");
	submitButton = new Button("Submit");

	combobox = new ComboBox<>();
	//making the list of options to choose from in the drop down
	combobox.getItems().addAll(

		"Jan",
		"Feb",
		"Mar",
		"Apr",
		"May",
		"Jun",
		"Jul",
		"Aug",
		"Sep",
		"Oct",
		"Nov",
		"Dec"
	);

	combobox.setPromptText("Please select a month Mr. Man, or Ms. Woman");
	//pointing at the instructions once "Submit" is hit
	submitButton.setOnAction(e -> printMonth());
	//more setting up the window
	VBox layout = new VBox(10);
	layout.setPadding(new Insets(20,20,20,20));
	layout.getChildren().addAll(combobox,submitButton);

	scene = new Scene(layout, 300,300);
	window.setScene(scene);
	window.show();

	}

	private void printMonth(){
	//setting up alert window for whatever is selected
	String winter = "WINTER'S COMMIN...";
	String spring = "It's allergy season...";
	String summer = "It's SUUUMMMEERRRR TIME!!!";
	String fall = "It's the best season of the year!";

	Alert alert = new Alert(AlertType.INFORMATION);

	switch(combobox.getValue()) {
	
	case "Jan":
		alert.setTitle(combobox.getValue());
		alert.setHeaderText(winter);
		alert.showAndWait();
		break;
	case "Feb":
		alert.setTitle(combobox.getValue());
		alert.setHeaderText(winter);
		alert.showAndWait();
		break;
	case "Mar":
		alert.setTitle(combobox.getValue());
		alert.setHeaderText(spring);
		alert.showAndWait();
		break;
	case "Apr":
		alert.setTitle(combobox.getValue());
		alert.setHeaderText(spring);
		alert.showAndWait();
		break;
	case "May":
		alert.setTitle(combobox.getValue());
		alert.setHeaderText(spring);
		alert.showAndWait();
		break;
	case "Jun":
		alert.setTitle(combobox.getValue());
		alert.setHeaderText(summer);
		alert.showAndWait();
		break;
	case "Jul":
		alert.setTitle(combobox.getValue());
		alert.setHeaderText(summer);
		alert.showAndWait();
		break;
	case "Aug":
		alert.setTitle(combobox.getValue());
		alert.setHeaderText(summer);
		alert.showAndWait();
		break;
	case "Sep":
		alert.setTitle(combobox.getValue());
		alert.setHeaderText(summer);
		alert.showAndWait();
		break;
	case "Oct":
		alert.setTitle(combobox.getValue());
		alert.setHeaderText(fall);
		alert.showAndWait();
		break;
	case "Nov":
		alert.setTitle(combobox.getValue());
		alert.setHeaderText(fall);
		alert.showAndWait();
		break;
	case "Dec":
		alert.setTitle(combobox.getValue());
		alert.setHeaderText(winter);
		alert.showAndWait();
		break;

			}

		}

}



