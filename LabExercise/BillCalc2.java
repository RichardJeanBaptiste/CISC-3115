
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;
import javafx.scene.layout.*;
import javafx.scene.text.Text;
import javafx.geometry.*;

import java.text.DecimalFormat;


public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Bill Calculator");

        GridPane grid = new GridPane();
        grid.setAlignment(Pos.TOP_CENTER);
        grid.setPadding(new Insets(25, 25, 25, 25));
        grid.setHgap(10);
        grid.setVgap(10);

        Scene scene = new Scene(grid, 400, 400);

        //labels
        grid.add(new Label("Bill: "), 0, 0);
        TextField bill = new TextField();
        grid.add(bill, 1, 0);


        grid.add(new Label("Sales Tax: "), 0, 3);
        TextField salesTax = new TextField();
        grid.add(salesTax, 1, 3);


        grid.add(new Label("Split: "), 0, 5);
        Spinner split = new Spinner();
        split.setValueFactory( new SpinnerValueFactory.DoubleSpinnerValueFactory(0,10));
        split.setEditable(true);
        grid.add(split, 1, 5);


        grid.add(new Label("Tip: "), 0, 7);
        String tipAmounts[] = {"5", "10", "15", "20", "25", "30"};
        ComboBox tips = new ComboBox(FXCollections.observableArrayList(tipAmounts));
        tips.setEditable(true);
        grid.add(tips, 1, 7);

        //buttons
        Button calc = new Button();
        Button clear = new Button();
        Button exit = new Button();

        Text text = new Text("");
        grid.add(text, 1, 9);

        calc.setText("Calculate");
        clear.setText("Clear");
        exit.setText("Exit");

        HBox buttonBox = new HBox(15, calc, clear, exit);
        grid.add(buttonBox, 0, 11, 2, 1);


        calc.setOnAction(e -> {
            double x = Double.parseDouble(bill.getText());
            double y = Double.parseDouble(salesTax.getText());
            double ytax = y / 100;
            double z = (double) split.getValue();
            double getTip = Double.parseDouble((String) tips.getValue()); //5
            getTip /= 100; // .05


            //else if z = 0
            // smae thing but don't divide 0
            if(x == 0 || y == 0 || z == 0){
                text.setText("Can't divide Zero");
            }else{
                double result = ((x + (x * ytax)) / z);

                double finalAmount = x + y;

                double tipAmount = result * getTip;

                result += tipAmount;


                String pay = String.format("Your final amount of $%.2f and split %.0f ways with a tip of $%.2f and the amount per person is $%.2f", finalAmount,z , tipAmount, result);

                text.setText(pay);

            }
        });

        clear.setOnAction(e -> {
            bill.clear();
            salesTax.clear();
            split.getValueFactory().setValue(null);
            split.setValueFactory( new SpinnerValueFactory.DoubleSpinnerValueFactory(0,10) );
            tips.getEditor().clear();
            tips.getItems().removeAll(tipAmounts);
            tips.getItems().addAll(tipAmounts);
            text.setText("");
        });

        exit.setOnAction(e -> {
            System.exit(0);
        });



        primaryStage.setScene(scene);
        primaryStage.show();
    }


}
