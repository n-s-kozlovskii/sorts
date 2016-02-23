package sample;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import my_pairs.*;
import sorts.BubbleSort;
import sorts.CombSort;
import sorts.Sort;

import java.util.List;


public class Main extends Application {

    private static List<Pair<Integer>> orderSortData;
    private static List<Pair<Integer>> improvedSortData;
    private static String orderSortName;
    private static String improvedSortName;



    @Override public void start(Stage stage) {
        stage.setTitle("Сравнение скорости");
        stage.getIcons().add(new Image("img\\win_icon.png"));
        //defining the axes
        final NumberAxis xAxis = new NumberAxis();
        final NumberAxis yAxis = new NumberAxis();
        xAxis.setLabel("число элементов");
        yAxis.setLabel("количество операций");
        //creating the chart
        final LineChart<Number,Number> lineChart =
                new LineChart<>(xAxis,yAxis);

        lineChart.setTitle("Сравнение скорости сортировок");

        //defining a ordinalSortSeries
        XYChart.Series<Number,Number> ordinalSortSeries = setSeries(orderSortData);
        ordinalSortSeries.setName(orderSortName);
        XYChart.Series<Number,Number> improvedSortSeries = setSeries(improvedSortData);
        improvedSortSeries.setName(improvedSortName);
        Scene scene  = new Scene(lineChart,800,600);
        lineChart.getData().addAll(ordinalSortSeries, improvedSortSeries);

        stage.setScene(scene);
        stage.show();
    }

    public XYChart.Series<Number,Number> setSeries(List<Pair<Integer>> data){
        XYChart.Series<Number,Number> series = new XYChart.Series();
        for (Pair c: data){
            series.getData().add(new XYChart.Data(c.getX(), c.getY()));
        }

        return  series;
    }

    public static void main(String[] args) {
        Sort x = new BubbleSort();
        Sort y = new CombSort();
        orderSortData = x.getData();
        improvedSortData = y.getData();
        orderSortName = x.getClass().getSimpleName();
        improvedSortName = y.getClass().getSimpleName();
        launch(args);
    }
}