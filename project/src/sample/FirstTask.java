package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;

public class FirstTask {
    FirstTask(Tab tab) {
        VBox box = new VBox();
        tab.setText("First Task");
        tab.setContent(box);
        box.setPadding(new Insets(75, 100, 50, 50));
        box.setSpacing(20);
        Button button = new Button("Input Text");
        TextField text = new TextField();
        text.setMinWidth(200);
        ObservableList<String> ObjectList = FXCollections.observableArrayList();
        ComboBox<String> Combo = new ComboBox<String>(ObjectList);
        Combo.setMinWidth(300);
        button.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent EventFirst) {
                if (
                        (!text.getText().isEmpty())) {
                    String textFromField = text.getText();
                    if (!ObjectList.contains(textFromField)) {
                        ObjectList.add(textFromField);
                    } else {
                        Alert alert = new Alert(Alert.AlertType.INFORMATION);
                        alert.setTitle("Error");
                        alert.setHeaderText(null);
                        alert.setContentText("The entered word's already existed!");
                        alert.showAndWait();
                    }

                }
            }
        });
        box.getChildren().addAll(text, Combo, button);
    }

}
