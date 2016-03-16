package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Main extends Application {

    private BorderPane layout;

    @Override
    public void start(Stage primaryStage) throws Exception{
        //Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Lab-4");
        GridPane gridpane = new GridPane();

        gridpane.setHgap(20);
        gridpane.setVgap(20);

        Label userNameLbl = new Label("Username: ");
        TextField userFld = new TextField();
        Label passLbl = new Label("Password: ");
        PasswordField passFld = new PasswordField();
        Label fullNameLbl = new Label("Full name :");
        TextField fullNameFld = new TextField();
        Label phoneNumLbl = new Label("Phone #");
        TextField phoneNumFld = new TextField();
        Label dobLbl = new Label("Date of Birth: ");
        DatePicker datePicker = new DatePicker();
        Label emailLbl = new Label("Email: ");
        TextField emailFld = new TextField();
        Button registerBtn = new Button("Register");

        gridpane.add(userNameLbl, 0, 0);
        gridpane.add(userFld, 1, 0);
        gridpane.add(passLbl, 0, 1);
        gridpane.add(passFld, 1, 1);
        gridpane.add(fullNameLbl, 0, 2);
        gridpane.add(fullNameFld, 1, 2);
        gridpane.add(emailLbl, 0, 3);
        gridpane.add(emailFld, 1, 3);
        gridpane.add(phoneNumLbl, 0, 4);
        gridpane.add(phoneNumFld, 1, 4);
        gridpane.add(dobLbl, 0, 5);
        gridpane.add(datePicker, 1, 5);
        gridpane.add(registerBtn, 1, 6);

        registerBtn.setOnAction(evt -> System.out.println(userFld.getText() + " " + fullNameFld.getText() + " " + emailFld.getText() + " " +  phoneNumFld.getText() + " " + datePicker.getValue()));


        //layout.setCenter(vbox);
        //Scene scene = new Scene(layout, 600, 600);
        Scene scene = new Scene(gridpane, 600, 600);
        primaryStage.setScene(scene);
        //primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
