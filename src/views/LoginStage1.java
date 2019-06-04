package views;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class LoginStage1 extends Stage {

    private GridPane gridPane;
    private Label labelUsername;
    private Label labelMonney;
    private Label txtUsername;
    private TextField Monney;
    private Button btnLogin;
    private Button btnReset;

    public LoginStage1() {
        initComponent();
    }
    private void initComponent() {
        this.gridPane = new GridPane();
        this.labelUsername = new Label("Account");
        this.labelMonney = new Label("Monney");
        this.txtUsername = new Label ();
        this.Monney = new TextField ();
        this.btnLogin = new Button("Submit");
        this.btnReset = new Button("Close");
        btnLogin.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

            }
        });
        gridPane.setPadding(new Insets(10, 10, 10, 10));
        gridPane.setVgap(10);
        gridPane.setHgap(10);
        gridPane.setAlignment(Pos.CENTER);
        gridPane.add(labelUsername, 0, 0);
        gridPane.add(txtUsername, 1, 0);
        gridPane.add(labelMonney, 0, 1);
        gridPane.add(Monney, 1, 1);
        HBox hBox = new HBox();
        hBox.getChildren().addAll(btnLogin, btnReset);
        hBox.setSpacing(10);
        gridPane.add(hBox, 1, 2);
        Scene scene = new Scene(gridPane, 600, 300);
        this.setScene(scene);
        btnReset.setOnAction (e -> Close());
    }

    private void Close() {
        close ();
    }

}
