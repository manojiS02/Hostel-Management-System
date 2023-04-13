package controller;

import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class HomeFormController {
    public AnchorPane background;
    public JFXButton btnStudent;
    public JFXButton btnRoom;
    public JFXButton btnRemainKeyMoney;
    public JFXButton BtnReservation;
    public JFXButton btnBack;
    public AnchorPane context;

    public void btnRemainKeyMoneyOnAction(ActionEvent actionEvent) {
    }

    public void btnReservationOnAction(ActionEvent actionEvent) throws IOException {
        context.getChildren().clear();
        Parent parent=FXMLLoader.load(getClass().getResource("../view/ReservationForm.fxml"));
        context.getChildren().add(parent);
    }

    public void btnBackOnAction(ActionEvent actionEvent) throws IOException {
        Stage stage = (Stage) background.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/LoginForm.fxml"))));
    }

    public void btnRoomOnAction(ActionEvent actionEvent) throws IOException {
        context.getChildren().clear();
        Parent parent=FXMLLoader.load(getClass().getResource("../view/RoomForm.fxml"));
        context.getChildren().add(parent);
    }

    public void btnStudentOnAction(ActionEvent actionEvent) throws IOException {
        context.getChildren().clear();
        Parent parent= FXMLLoader.load(getClass().getResource("../view/StudentForm.fxml"));
        context.getChildren().add(parent);
    }
}
