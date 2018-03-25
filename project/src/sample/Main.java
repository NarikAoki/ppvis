package sample;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        TabPane root = new TabPane();

        Tab taskFirst = new Tab();
        Tab taskSecond = new Tab();
        Tab taskThird = new Tab();
        Tab taskForth = new Tab();
        Tab taskFifth = new Tab();
        FirstTask First = new FirstTask(taskFirst);
        SecondTask Second = new SecondTask(taskSecond);
        ThirdTask Third = new ThirdTask(taskThird);
        ForthTask Forth = new ForthTask(taskForth);
        FifthTask Fifth = new FifthTask(taskFifth);

        root.getTabs().addAll(taskFirst, taskSecond, taskThird, taskForth, taskFifth);
        primaryStage.setTitle("Task");
        primaryStage.setScene(new Scene(root, 500, 300));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
