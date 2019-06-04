package main;

import com.sun.java.swing.plaf.windows.WindowsInternalFrameTitlePane;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;
//import  views.LoginStage;
////import views.RegisterStage;
import views.LoginStage;
import views.LoginStage1;
import views.RegisterStage;

public class MyApplication extends Application {
    private VBox vBox;
    private HBox titleBox;
String accountname = "Hồ Khải";
int monney = 10000;
    private Scene defaultScene;
    private HBox btnBox;
    private GridPane gridPaneContent;
    private MyApplication application;
    private Stage currentStage;
    private LoginStage loginStage;
    private LoginStage1 loginStage1;
    private RegisterStage registerStage;
    private Scene Scene;
    private Label tittle;
    private int accountBalance = 50000;
    private Button btnLogin;
    private Button btnRegister;
    private Label Account;
    private Label AccountName;
    private Label Monney1;
    private TextField Monney = new TextField ();

    @Override
    public void start(Stage stage) throws Exception {
        this.application = this.application;
        this.currentStage = stage;
       initComponent ();
        this.currentStage.setScene (this.Scene);
        this.currentStage.show ( );
    }

//    private void initComponent() {
//        VBox vBox = new VBox ();
//        this.titleBox = new HBox ();
//        this.tittle = new Label (" Bank j đấy" );
//        this.titleBox.getChildren ().add (tittle);
//
//        this.gridPaneContent = new GridPane ();
//        this.Account = new Label ("Khách hàng : ");
//        this.AccountName = new Label ("Khải");
//        this.Monney1 = new Label ("Số dư trong tài khoản");
//        this.Monney = new TextField ();
//        this.gridPaneContent.add (Account,0,0);
//        this.gridPaneContent.add (AccountName,1,0);
//        this.gridPaneContent.add (Monney1,0,1);
//        this.gridPaneContent.add (Monney,1,1);
//            this.gridPaneContent.setAlignment(Pos.CENTER);
//    this.gridPaneContent.setPadding(new Insets(10, 10, 10, 10));
//    this.gridPaneContent.setVgap(10);
//    this.gridPaneContent.setHgap(10);
//
//
//        this.btnBox = new HBox ();
//        this.btnLogin = new Button ();
//        this.btnRegister = new Button ();
//            this.vBox.getChildren().addAll(this.titleBox, this.gridPaneContent, this.btnBox);
//    this.vBox.setAlignment(Pos.CENTER);
//    this.vBox.setSpacing(30);
//    this.vBox.setPadding(new Insets(10, 10, 10, 10));
//
//    this.Scene = new Scene(this.vBox, 300, 200);
//        //    btnLogin.setOnAction (new EventHandler<ActionEvent> ( ) {
////        @Override
////        public void handle(ActionEvent event) {
////            registerStage .show ();
////        }
////    });
//    }
private void initComponent() {
this.loginStage1 = new LoginStage1 ();
this.registerStage = new RegisterStage ();
    this.loginStage = new LoginStage();
    this.vBox = new VBox ( ); // layout
    this.titleBox = new HBox ( );
    this.tittle = new Label ("Spring Hero Bank");
    this.tittle.setFont (Font.font (17));
    this.tittle.setTextFill (Color.web ("#f9e70b"));
    this.titleBox.getChildren ( ).add (tittle);
    this.titleBox.setAlignment (Pos.TOP_LEFT);
    this.titleBox.setSpacing (10);

    this.gridPaneContent = new GridPane ( );
    this.Account = new Label ("Account:" );
    this.AccountName = new Label ( accountname);
    this.Monney1 = new Label ("Số tiền trong tài khoản");
    this.Monney = new TextField (String.valueOf (monney));
    this.gridPaneContent.add (this.Account, 0, 0);
    this.gridPaneContent.add (this.AccountName, 1, 0);
    this.gridPaneContent.add (this.Monney1, 0, 1);
    this.gridPaneContent.add (this.Monney, 1, 1);
    this.gridPaneContent.setAlignment (Pos.CENTER);
    this.gridPaneContent.setPadding (new Insets (10, 10, 10, 10));
    this.gridPaneContent.setVgap (10);
    this.gridPaneContent.setHgap (10);

    this.btnBox = new HBox ( );
    this.btnLogin = new Button ("Withdraw");
    this.btnRegister = new Button ("Deposit");
    this.btnBox.getChildren ( ).addAll (this.btnLogin, this.btnRegister);
    this.btnBox.setAlignment (Pos.CENTER);
    this.btnBox.setSpacing (10);

    this.vBox.getChildren ( ).addAll (this.titleBox, this.gridPaneContent, this.btnBox);
    this.vBox.setAlignment (Pos.CENTER);
    this.vBox.setSpacing (30);
    this.vBox.setPadding (new Insets (10, 10, 10, 10));

    this.Scene = new Scene (this.vBox, 300, 200);

    btnRegister.setOnAction (new EventHandler<ActionEvent> ( ) {
        @Override
        public void handle(ActionEvent event) {
            loginStage1.show();
        }
    });

    btnLogin.setOnAction (new EventHandler<ActionEvent> ( ) {
        @Override
        public void handle(ActionEvent event) {
            registerStage.show( );
        }
    });
}
    public static void main(String[] args) {

        launch (args);
    }

    public String getAccountname() {
        return accountname;
    }

    public void setAccountname(String accountname) {
        this.accountname = accountname;
    }

    public void setMonney(int monney) {
        this.monney = monney;
    }

    public VBox getvBox() {
        return vBox;
    }

    public void setvBox(VBox vBox) {
        this.vBox = vBox;
    }

    public HBox getTitleBox() {
        return titleBox;
    }

    public void setTitleBox(HBox titleBox) {
        this.titleBox = titleBox;
    }

    public javafx.scene.Scene getDefaultScene() {
        return defaultScene;
    }

    public void setDefaultScene(javafx.scene.Scene defaultScene) {
        this.defaultScene = defaultScene;
    }

    public HBox getBtnBox() {
        return btnBox;
    }

    public void setBtnBox(HBox btnBox) {
        this.btnBox = btnBox;
    }

    public GridPane getGridPaneContent() {
        return gridPaneContent;
    }

    public void setGridPaneContent(GridPane gridPaneContent) {
        this.gridPaneContent = gridPaneContent;
    }

    public void setCurrentStage(Stage currentStage) {
        this.currentStage = currentStage;
    }

    public LoginStage getLoginStage() {
        return loginStage;
    }

    public void setLoginStage(LoginStage loginStage) {
        this.loginStage = loginStage;
    }

    public RegisterStage getRegisterStage() {
        return registerStage;
    }

    public void setRegisterStage(RegisterStage registerStage) {
        this.registerStage = registerStage;
    }

    public javafx.scene.Scene getScene() {
        return Scene;
    }

    public void setScene(javafx.scene.Scene scene) {
        Scene = scene;
    }

    public Label getTittle() {
        return tittle;
    }

    public void setTittle(Label tittle) {
        this.tittle = tittle;
    }

    public int getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(int accountBalance) {
        this.accountBalance = accountBalance;
    }

    public Button getBtnLogin() {
        return btnLogin;
    }

    public void setBtnLogin(Button btnLogin) {
        this.btnLogin = btnLogin;
    }

    public Button getBtnRegister() {
        return btnRegister;
    }

    public void setBtnRegister(Button btnRegister) {
        this.btnRegister = btnRegister;
    }

    public Label getAccount() {
        return Account;
    }

    public void setAccount(Label account) {
        Account = account;
    }

    public Label getAccountName() {
        return AccountName;
    }

    public void setAccountName(Label accountName) {
        AccountName = accountName;
    }

    public Label getMonney1() {
        return Monney1;
    }

    public void setMonney1(Label monney1) {
        Monney1 = monney1;
    }

    public TextField getMonney() {
        return Monney;
    }

    public void setMonney(TextField monney) {
        Monney = monney;
    }

    public Stage getCurrentStage() {
        return currentStage;
    }

    public void setCurrentStage() {
        this.currentStage = currentStage;
    }

    public MyApplication getApplication() {
        return application;
    }

    public void setApplication(MyApplication application) {
        this.application = application;
    }

    private class LoginStage {
    }
}
