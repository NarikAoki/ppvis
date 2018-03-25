package sample;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.control.*;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class ThirdTask {
    ThirdTask(Tab tab) {
        tab.setText("Third Task");
        VBox box = new VBox();
        tab.setContent(box);
        box.setPadding(new Insets(75, 50, 50, 50));
        box.setSpacing(20);
        TextField text = new TextField();
        text.setMinWidth(200);
        ToggleGroup group = new ToggleGroup();
        RadioButton radioFirst = new RadioButton("Minsk");
        RadioButton radioSecond = new RadioButton("Grodno");
        RadioButton radioThird = new RadioButton("Brest");
        radioFirst.setToggleGroup(group);
        radioSecond.setToggleGroup(group);
        radioThird.setToggleGroup(group);
        Button ButtonCheck = new Button("Check");
        ButtonCheck.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent EventForth) {
                if (
                        (!text.getText().isEmpty())
                        ) {
                    String textCheck = text.getText();
                    if (textCheck.equals(radioFirst.getText())) {
                        radioFirst.setSelected(true);
                    } else if (textCheck.equals(radioSecond.getText())) {
                        radioSecond.setSelected(true);
                    } else if (textCheck.equals(radioThird.getText())) {
                        radioThird.setSelected(true);
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
        HBox radioGroup = new HBox();
        radioGroup.setSpacing(20);
        radioGroup.getChildren().addAll(radioFirst, radioSecond, radioThird);
        box.getChildren().addAll(text, radioGroup, ButtonCheck);
    }
}
