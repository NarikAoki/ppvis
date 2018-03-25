package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class FifthTask {
    FifthTask(Tab Tab) {
        VBox Box = new VBox();
        Tab.setText("Fifth Task");
        Tab.setContent(Box);
        Box.setPadding(new Insets(25, 25, 50, 20));
        Box.setSpacing(20);
        TextField TextFifth = new TextField();
        TextFifth.setMinWidth(200);
        Button ChangeButtonFirst = new Button("Button First");
        Button ChangeButtonSecond = new Button("Button Second");
        Button ChangeButtonThird = new Button("Button Third");
        ChangeButtonFirst.setMinWidth(100);
        ChangeButtonSecond.setMinWidth(100);
        ChangeButtonThird.setMinWidth(100);
        ObservableList<Info> ListFirst = FXCollections.observableArrayList();
        TableView <Info> table = new TableView<>(ListFirst);
        TableColumn<Info, String> ColumnFirst = new TableColumn<>("First Column");
        TableColumn<Info, String> ColumnSecond = new TableColumn<>("Second Column");
        ColumnFirst.setMinWidth(180);

        ColumnSecond.setMinWidth(180);
        table.getColumns().add(ColumnFirst);
        table.getColumns().add(ColumnSecond);
        ChangeButtonFirst.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent EventSixth) {
                if (
                        (TextFifth.getText() != null && !TextFifth.getText().isEmpty())
                        ) {

                    String TextFromField = TextFifth.getText();
                    Info data=new Info(TextFromField);
                    ListFirst.add(data);
                }
            }
        });
        HBox GroupChangeButton = new HBox();
        GroupChangeButton.setSpacing(20);
        GroupChangeButton.getChildren().addAll(ChangeButtonFirst, ChangeButtonSecond, ChangeButtonThird);
        Box.getChildren().addAll(TextFifth, GroupChangeButton, table);

    }
}

class Info{
    private String first;
    private String second;

    Info(String word){
        first=word;
    }

    public void setFirst(String first) {
        this.first = first;
    }

    public String getFirst() {
        return first;
    }

    public String getSecond() {
        return second;
    }

    public void setSecond(String second) {
        this.second = second;
    }
    public void delete(String data){
        data=null;
    }
}

