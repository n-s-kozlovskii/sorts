package sample;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;
import my_pairs.*;
import sorts.BubbleSort;
import sorts.Sort;

import java.util.List;


public class Main extends Application {

    private static List<Pair<Integer>> data;

    @Override public void start(Stage stage) {
        stage.setTitle("Line Chart Sample");
        //defining the axes
        final NumberAxis xAxis = new NumberAxis();
        final NumberAxis yAxis = new NumberAxis();
        xAxis.setLabel("����� ���������");
        yAxis.setLabel("���������� ��������");
        //creating the chart
        final LineChart<Number,Number> lineChart =
                new LineChart<Number,Number>(xAxis,yAxis);

        lineChart.setTitle("��������� �������� ����������");
        //defining a series
        XYChart.Series series = setSeries(data);
        //series.setName("My portfolio");
        //populating the series with data
        /*
        series.getData().add(new XYChart.Data(1, 23));
        series.getData().add(new XYChart.Data(2, 14));
        series.getData().add(new XYChart.Data(3, 15));
        series.getData().add(new XYChart.Data(4, 24));
        series.getData().add(new XYChart.Data(5, 34));
        series.getData().add(new XYChart.Data(6, 36));
        series.getData().add(new XYChart.Data(7, 22));
        series.getData().add(new XYChart.Data(8, 45));
        series.getData().add(new XYChart.Data(9, 43));
        series.getData().add(new XYChart.Data(10, 17));
        series.getData().add(new XYChart.Data(11, 29));
        series.getData().add(new XYChart.Data(12, 25));
        */

        Scene scene  = new Scene(lineChart,800,600);
        lineChart.getData().add(series);

        stage.setScene(scene);
        stage.show();
    }

    public XYChart.Series setSeries(List<Pair<Integer>> data){
        XYChart.Series series = new XYChart.Series();
        for (Pair c: data){
            series.getData().add(new XYChart.Data(c.getX(), c.getY()));
        }

        return  series;
    }

    public static void main(String[] args) {
        Sort x = new BubbleSort();
        data = x.getData();
        launch(args);
    }
}