package sample;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Tab;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class SecondTask {
    SecondTask(Tab tab) {
        VBox box = new VBox();
        tab.setText("Second Task");
        box.setPadding(new Insets(75, 100, 50, 50));
        box.setSpacing(20);
        tab.setContent(box);
        TextField text = new TextField();
        text.setMinWidth(200);
        Button buttonFirst = new Button("Button First");
        Button buttonSecond = new Button("Button Second");
        buttonFirst.setMinWidth(100);
        buttonSecond.setMinWidth(100);
        buttonFirst.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent EventSecond) {
                if (
                        (!text.getText().isEmpty())
                        ) {

                    String textFromField = text.getText();
                    buttonSecond.setText(textFromField);
                }
            }
        });
        buttonSecond.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent EventThird) {
                if (
                        (!buttonFirst.getText().isEmpty())
                        ) {

                    String textFromButtonSecond = buttonSecond.getText();
                    String textFromButtonFirst = buttonFirst.getText();
                    buttonFirst.setText(textFromButtonSecond);
                    buttonSecond.setText(textFromButtonFirst);
                }
            }
        });
        HBox groupButtons = new HBox();
        groupButtons.setSpacing(50);
        groupButtons.getChildren().addAll(buttonFirst, buttonSecond);
        box.getChildren().addAll(text, groupButtons);

    }
}
