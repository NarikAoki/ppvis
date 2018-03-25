package sample;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.control.*;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class ForthTask {
    ForthTask(Tab tab) {
        VBox box = new VBox();
        tab.setText("Forth Task");
        tab.setContent(box);
        box.setPadding(new Insets(75, 50, 50, 50));
        box.setSpacing(20);
        TextField text = new TextField();
        text.setMinWidth(200);
        CheckBox checkFirst = new CheckBox("Minsk");
        CheckBox checkSecond = new CheckBox("Grodno");
        CheckBox checkThird = new CheckBox("Brest");
        Button checkButton = new Button("Check");
        checkButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent EventFifth) {
                if (
                        (!text.getText().isEmpty())
                        ) {
                    String textCheck = text.getText();
                    if (textCheck.equals(checkFirst.getText())) {
                        checkFirst.setSelected(!checkFirst.isSelected());

                    } else if (textCheck.equals(checkSecond.getText())) {
                        checkSecond.setSelected(!checkSecond.isSelected());
                    } else if (textCheck.equals(checkThird.getText())) {
                        checkThird.setSelected(!checkThird.isSelected());
                    } else {
                        Alert alert = new Alert(Alert.AlertType.INFORMATION);
                        alert.setTitle("Error");
                        alert.setHeaderText(null);
                        alert.setContentText("The entered word isn't existed!");
                        alert.showAndWait();
                    }
                }
            }
        });
        HBox checkGroup = new HBox();
        checkGroup.setSpacing(20);
        checkGroup.getChildren().addAll(checkFirst, checkSecond, checkThird);
        box.getChildren().addAll(text, checkGroup, checkButton);
    }
}
