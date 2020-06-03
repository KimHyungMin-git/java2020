import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.VBox;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory;
import javafx.scene.control.ChoiceBox;
import javafx.collections.FXCollections;
import javafx.scene.control.Label;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
public class CH09_AdditionalControlsDemo extends Application{
	public static void main(String[] args){
		launch(args);}
	@Override
	public void start(Stage primaryStage) throws Exception{
		VBox root = new VBox();// Demonstrate radio buttons
		root.getChildren().add(new Label("Select First Day - Radio Buttons"));
		ToggleGroup toggleCrust = new ToggleGroup();
		RadioButton mon1 = new RadioButton("Mon1");
		mon1.setToggleGroup(toggleCrust);
		mon1.setSelected(true);
		RadioButton tue1 = new RadioButton("Tue1");
		tue1.setToggleGroup(toggleCrust);
		RadioButton wed1 = new RadioButton("Wed1");
		wed1.setToggleGroup(toggleCrust);
		RadioButton thu1 = new RadioButton("Thu1");
		thu1.setToggleGroup(toggleCrust);
		root.getChildren().add(mon1);
		root.getChildren().add(tue1);
		root.getChildren().add(wed1);
		root.getChildren().add(thu1);
		root.getChildren().add(new Label("Select Second Day - Checkbox"));
		CheckBox mon2 = new CheckBox("Mon2");
		CheckBox tue2 = new CheckBox("Tue2");
		CheckBox wed2 = new CheckBox("Wed2");
		CheckBox thu2 = new CheckBox("Thu2");
		root.getChildren().add(mon2);
		root.getChildren().add(tue2);
		root.getChildren().add(wed2);
		root.getChildren().add(thu2);// Demonstrate Spinner with integer values from 1-10
		root.getChildren().add(new Label("Select Third Day - Spinner with Integer(1~4)"));
		Spinner<Integer> spinnerQuantity = new Spinner();
		final int defaultValue = 1;// Value factory.
		SpinnerValueFactory<Integer> quantityFactory =new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 4, defaultValue);
		spinnerQuantity.setValueFactory(quantityFactory);
		root.getChildren().add(spinnerQuantity);// Demonstrate ChoiceBox with delivery options
		root.getChildren().add(new Label("Select Fourth Day - ChoiceBox"));
		ChoiceBox<String> cbModes = new ChoiceBox<String>(FXCollections.observableArrayList("Mon4","Tue4", "Wed4","Thu4"));
		root.getChildren().add(cbModes);// Button to display selections
		Button btnSelections = new Button("Get Selections");// Set the event handler when the button is clicked
		btnSelections.setOnAction(new EventHandler<ActionEvent>(){
			@Override
			public void handle(ActionEvent event){
				System.out.println("First Day - Radio Buttons");
				System.out.println("Mon1: " +mon1.isSelected());
				System.out.println("Tue1: " + tue1.isSelected());
				System.out.println("Wed1: " +wed1.isSelected());
				System.out.println("Thu1: " +thu1.isSelected()+"\n");
				System.out.println("Second Day - Checkbox");
				System.out.println("Mon2: " +mon2.isSelected());
				System.out.println("Tue2: " + tue2.isSelected());
				System.out.println("Wed2: " +wed2.isSelected());
				System.out.println("Thu2: " +thu2.isSelected()+"\n");
				System.out.println("Third Day - Spinner with Integer");
				System.out.println("Third Day: "+spinnerQuantity.getValue()+"\n");
				System.out.println("Fourth - ChoiceBox");
				System.out.println("Fourth Day: "+cbModes.getValue());
				}});
		root.getChildren().add(btnSelections);
		Scene scene = new Scene(root, 350, 300);
		primaryStage.setTitle("Additional Controls Demo");
		primaryStage.setScene(scene);primaryStage.show();}
	}


