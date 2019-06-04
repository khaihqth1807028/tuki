////package views;
////
////import javafx.event.ActionEvent;
////import javafx.event.EventHandler;
////import javafx.geometry.Insets;
////import javafx.geometry.Pos;
////import javafx.scene.Scene;
////import javafx.scene.control.Button;
////import javafx.scene.control.Label;
////import javafx.scene.control.PasswordField;
////import javafx.scene.control.TextField;
////import javafx.scene.layout.GridPane;
////import javafx.scene.layout.HBox;
////import javafx.stage.Modality;
////import javafx.stage.Stage;
////import main.MyApplication;
////
////public class LoginStage extends Stage {
////
////    private MyApplication application;
////    private TextField loginStatus;
////    private GridPane gridPane;
////    private Label labelUsername;
////    private Label labelPassword;
////    private TextField txtUsername;
////    private PasswordField pwdField;
////    private Button btnLogin;
////    private Button btnReset;
////    public LoginStage(MyApplication application) {
////        this.application = application;
////        initComponent();
////    }
////
////    public LoginStage(TextField loginStatus) {
////        this.loginStatus = loginStatus;
////        initComponent();
////    }
////
////    private void initComponent() {
////        this.initModality(Modality.APPLICATION_MODAL);
////        this.gridPane = new GridPane();
////        this.labelUsername = new Label("Username");
////        this.labelPassword = new Label("Password");
////        this.txtUsername = new TextField();
////        this.pwdField = new PasswordField();
////        this.btnLogin = new Button("Login");
////        this.btnReset = new Button("Reset");
////        this.btnLogin.setOnAction (new EventHandler<ActionEvent>() {
////            @Override
////            public void handle(ActionEvent event) {
////                String username = txtUsername.getText();
////                application.getLoginStatus().setText("Logged in: " + username);
//////                loginStatus.setText(username);
////            }
////        });
////        this.gridPane.setPadding(new Insets(10, 10, 10, 10));
////        this.gridPane.setVgap(10);
////        this.gridPane.setHgap(10);
////        this.gridPane.setAlignment(Pos.CENTER);
////        this.gridPane.add(this.labelUsername, 0, 0);
////        this.gridPane.add(this.txtUsername, 1, 0);
////        this.gridPane.add(this.labelPassword, 0, 1);
////        this.gridPane.add(this.pwdField, 1, 1);
////        HBox hBox = new HBox();
////        hBox.getChildren().addAll(this.btnLogin, this.btnReset);
////        hBox.setSpacing(10);
////        this.gridPane.add(hBox, 1, 2);
////        Scene scene = new Scene(this.gridPane, 600, 300);
////        this.setScene(scene);
////    }
////    public MyApplication getApplication() {
////        return application;
////    }
////    public void setApplication(MyApplication application) {
////        this.application = application;
////    }
////
////    public TextField getLoginStatus() {
////        return loginStatus;
////    }
////
////    public void setLoginStatus(TextField loginStatus) {
////        this.loginStatus = loginStatus;
////    }
////
////    public GridPane getGridPane() {
////        return gridPane;
////    }
////
////    public void setGridPane(GridPane gridPane) {
////        this.gridPane = gridPane;
////    }
////
////    public Label getLabelUsername() {
////        return labelUsername;
////    }
////
////    public void setLabelUsername(Label labelUsername) {
////        this.labelUsername = labelUsername;
////    }
////
////    public Label getLabelPassword() {
////        return labelPassword;
////    }
////
////    public void setLabelPassword(Label labelPassword) {
////        this.labelPassword = labelPassword;
////    }
////
////    public TextField getTxtUsername() {
////        return txtUsername;
////    }
////
////    public void setTxtUsername(TextField txtUsername) {
////        this.txtUsername = txtUsername;
////    }
////
////    public PasswordField getPwdField() {
////        return pwdField;
////    }
////
////    public void setPwdField(PasswordField pwdField) {
////        this.pwdField = pwdField;
////    }
////
////    public Button getBtnLogin() {
////        return btnLogin;
////    }
////
////    public void setBtnLogin(Button btnLogin) {
////        this.btnLogin = btnLogin;
////    }
////
////    public Button getBtnReset() {
////        return btnReset;
////    }
////
////    public void setBtnReset(Button btnReset) {
////        this.btnReset = btnReset;
////    }
////}
//package views;
//
//import javafx.event.ActionEvent;
//import javafx.event.Event;
//import javafx.event.EventHandler;
//import javafx.scene.Scene;
//import javafx.scene.control.Button;
//import javafx.scene.control.Label;
//import javafx.scene.control.TextField;
//import javafx.scene.layout.GridPane;
//import javafx.stage.Modality;
//import javafx.stage.Stage;
//import main.MyApplication;
//import main.MyApplication;
//
//public class LoginStage extends Stage{
//    private String accountName = "Hồ Khải";
//    private int accountBalance = 50000;
//    private MyApplication application;
//    private Label lblTitle;
//    private TextField lblAccount;
//    private Label lblBalance;
//    private Label lblAccountName;
//    private Label lblBalanceValue;
//    private Button Submit;
//    private Button Close;
//    private GridPane gridPane;
//    private Integer monney;
//    private  Integer total;
//    private void CloseProgram(){
//
//    }
//
//    public LoginStage (MyApplication application){
//        this.application=application;
//        initComponent();
//    }
//
//
//    private void initComponent() {
//        this.initModality(Modality.APPLICATION_MODAL);
//        this.gridPane = new GridPane ();
//        this.lblTitle = new Label ("Nạp tiền thi vào đây ");
//        this.lblAccountName = new Label (accountName);
//        this.lblAccount = new TextField (""+accountBalance );
//        this.Submit = new Button ("Submit");
//        this.Close = new Button ("Close");
//this.Close.setOnAction (e -> Closerogram());
//        this.Submit.setOnAction (new EventHandler<ActionEvent> ( ) {
//            @Override
//            public void handle(ActionEvent event) {
////                int total = lblAccount.doubleValue (accountBalance+ monney);
////            total = lblAccount.getText (accountBalance+ monney);
//              int total = lblAccount.getPrefColumnCount ();
//              int total1 = total+ accountBalance;
//                application.getApplication ().setCurrentStage ();
//            }
//        });
//        this.gridPane.add (this.lblAccountName,1,1);
//this.gridPane.add (this.lblAccount,1,2);
//        this.gridPane.add (this.lblTitle,0,0);
//        this.gridPane.add (this.Submit,0,2);
//        this.gridPane.add (this.Close,0,3);
////        this.gridPane.add(hBox, 1, 2);
//        Scene scene = new Scene(this.gridPane, 600, 300);
//        this.setScene(scene);
//    }
//
//    private void Closerogram() {
//close ();
//    }
//    public void setTotal(Integer total) {
//        this.total = total;
//    }
//    public String getAccountName() {
//        return accountName;
//    }
//    public void setAccountName(String accountName) {
//        this.accountName = accountName;
//    }
//    public int getAccountBalance() {
//        return accountBalance;
//    }
//    public void setAccountBalance(int accountBalance) {
//        this.accountBalance = accountBalance;
//    }
//    public void setLblBalance(Label lblBalance) {
//        this.lblBalance = lblBalance;
//    }
//
//    public MyApplication getApplication() {
//        return application;
//    }
//
//    public void setApplication(MyApplication application) {
//        this.application = application;
//    }
//    public Label getLblTitle() {
//        return lblTitle;
//    }
//    public void setLblTitle(Label lblTitle) {
//        this.lblTitle = lblTitle;
//    }
//    public Label getLblBalance() {
//        return lblBalance;
//    }
//    public Integer getTotal() {
//        return total;
//    }
//
//    public void setTotal(int total) {
//        this.total = total;
//    }
//
//    public Label getLblAccountName() {
//        return lblAccountName;
//    }
//
//    public void setLblAccountName(Label lblAccountName) {
//        this.lblAccountName = lblAccountName;
//    }
//
//    public Label getLblBalanceValue() {
//        return lblBalanceValue;
//    }
//
//    public void setLblBalanceValue(Label lblBalanceValue) {
//        this.lblBalanceValue = lblBalanceValue;
//    }
//
//    public Button getSubmit() {
//        return Submit;
//    }
//
//    public void setSubmit(Button submit) {
//        Submit = submit;
//    }
//
//    public Button getClose() {
//        return Close;
//    }
//
//    public void setClose(Button close) {
//        Close = close;
//    }
//
//    public GridPane getGridPane() {
//        return gridPane;
//    }
//
//    public TextField getLblAccount() {
//        return lblAccount;
//    }
//
//    public void setLblAccount(TextField lblAccount) {
//        this.lblAccount = lblAccount;
//    }
//
//    public Integer getMonney() {
//        return monney;
//    }
//
//    public void setMonney(Integer monney) {
//        this.monney = monney;
//    }
//
//    public void setGridPane(GridPane gridPane) {
//        this.gridPane = gridPane;
//    }
//
//}
//package views;
//
//import javafx.event.ActionEvent;
//import javafx.event.EventHandler;
//import javafx.scene.Scene;
//import javafx.scene.control.Button;
//import javafx.scene.control.Label;
//import javafx.scene.control.TextField;
//import javafx.scene.layout.GridPane;
//import javafx.stage.Modality;
//import javafx.stage.Stage;
//
//public class LoginStage extends Stage{
//    private String accountName = "Hồ Khải";
//    private int accountBalance = 50000;
//    private MainApplication application;
//    private Label lblTitle;
//    private TextField lblAccount;
//    private Label lblBalance;
//    private Label lblAccountName;
//    private Label lblBalanceValue;
//    private Button Submit;
//    private Button Close;
//    private GridPane gridPane;
//    private Integer monney;
//    private  Integer total;
//    private void CloseProgram(){
//
//
//    }
//
//    public LoginStage (MainApplication application){
//        this.application=application;
//        initComponent();
//    }
//
//
//    private void initComponent() {
//        this.initModality(Modality.APPLICATION_MODAL);
//        this.gridPane = new GridPane ();
//        this.lblTitle = new Label ("Nạp tiền thi vào đây ");
//        this.lblAccountName = new Label (accountName);
//        this.lblAccount = new TextField (""+accountBalance );
//        this.Submit = new Button ("Submit");
//        this.Close = new Button ("Close");
//        this.Close.setOnAction (e -> Closerogram());
//        this.Submit.setOnAction (new EventHandler<ActionEvent> ( ) {
//            @Override
//            public void handle(ActionEvent event) {
////                int total = lblAccount.doubleValue (accountBalance+ monney);
////            total = lblAccount.getText (accountBalance+ monney);
//                int total = lblAccount.getPrefColumnCount ();
//                int total1 = total+ accountBalance;
//            }
//        });
//        this.gridPane.add (this.lblAccountName,1,1);
//        this.gridPane.add (this.lblAccount,1,2);
//        this.gridPane.add (this.lblTitle,0,0);
//        this.gridPane.add (this.Submit,0,2);
//        this.gridPane.add (this.Close,0,3);
////        this.gridPane.add(hBox, 1, 2);
//        Scene scene = new Scene(this.gridPane, 600, 300);
//        this.setScene(scene);
//    }
//
//    private void Closerogram() {
//        close ();
//    }
//    public void setTotal(Integer total) {
//        this.total = total;
//    }
//    public String getAccountName() {
//        return accountName;
//    }
//    public void setAccountName(String accountName) {
//        this.accountName = accountName;
//    }
//    public int getAccountBalance() {
//        return accountBalance;
//    }
//    public void setAccountBalance(int accountBalance) {
//        this.accountBalance = accountBalance;
//    }
//    public void setLblBalance(Label lblBalance) {
//        this.lblBalance = lblBalance;
//    }
//
////    public MyApplication getApplication() {
////        return application;
////    }
//
//    public void setApplication(MainApplication application) {
//        this.application = application;
//    }
//    public Label getLblTitle() {
//        return lblTitle;
//    }
//    public void setLblTitle(Label lblTitle) {
//        this.lblTitle = lblTitle;
//    }
//    public Label getLblBalance() {
//        return lblBalance;
//    }
//    public Integer getTotal() {
//        return total;
//    }
//
//    public void setTotal(int total) {
//        this.total = total;
//    }
//
//    public Label getLblAccountName() {
//        return lblAccountName;
//    }
//
//    public void setLblAccountName(Label lblAccountName) {
//        this.lblAccountName = lblAccountName;
//    }
//
//    public Label getLblBalanceValue() {
//        return lblBalanceValue;
//    }
//
//    public void setLblBalanceValue(Label lblBalanceValue) {
//        this.lblBalanceValue = lblBalanceValue;
//    }
//
//    public Button getSubmit() {
//        return Submit;
//    }
//
//    public void setSubmit(Button submit) {
//        Submit = submit;
//    }
//
//    public Button getClose() {
//        return Close;
//    }
//
//    public void setClose(Button close) {
//        Close = close;
//    }
//
//    public GridPane getGridPane() {
//        return gridPane;
//    }
//
//    public TextField getLblAccount() {
//        return lblAccount;
//    }
//
//    public void setLblAccount(TextField lblAccount) {
//        this.lblAccount = lblAccount;
//    }
//
//    public Integer getMonney() {
//        return monney;
//    }
//
//    public void setMonney(Integer monney) {
//        this.monney = monney;
//    }
//
//    public void setGridPane(GridPane gridPane) {
//        this.gridPane = gridPane;
//    }
//
//    private class MainApplication {
//    }
//}
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

public class LoginStage extends Stage {

    private GridPane gridPane;
    private Label labelUsername;
    private Label labelMonney;
    private Label txtUsername;
    private TextField Monney;
    private Button btnLogin;
    private Button btnReset;

    public LoginStage() {
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
