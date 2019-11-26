package sample;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
         primaryStage.setTitle("Tax Calculator");
         GridPane grid = new GridPane();
         grid.setPadding(new Insets(25, 25, 25, 25));
         grid.setHgap(10);
         grid.setVgap(10);

         Scene scene = new Scene(grid, 400, 400);

         grid.add(new Label("Income "), 0, 1);
         TextField incField = new TextField();
         grid.add(incField, 1, 1);

         grid.add(new Label("Filing as "),  0, 3);
         String filingArray[] = {"Single"};
         ComboBox filing = new ComboBox(FXCollections.observableArrayList(filingArray));
         grid.add(filing, 1, 3);

         grid.add(new Label("Federal Tax Rate: "), 0, 5);
         Text fedTaxRate = new Text("");
         grid.add(fedTaxRate, 2, 5);

         grid.add(new Label(" Federal Tax Amount: "), 0 , 7);
         Text fedTaxAmount = new Text("");
         grid.add(fedTaxAmount, 2, 7);

         grid.add(new Label("NYS Tax Rate: "), 0, 9);
         Text NysTaxRate = new Text("");
         grid.add(NysTaxRate, 2, 9);

         grid.add(new Label("NYS Tax Amount: "), 0 , 11);
         Text NysTaxAmount = new Text("");
         grid.add(NysTaxAmount, 2, 11);

         grid.add(new Label("Total Income Tax: "),0 , 13);
         Text TotalIncome = new Text("");
         grid.add(TotalIncome, 2, 13);

         Button calc = new Button();
         calc.setText("Calculate");
         grid.add(calc, 1, 15);

         calc.setOnAction(e -> {
             // get user income amount
             int x = Integer.parseInt(incField.getText());
             int excess, result, finalResult;

             finalResult = 0;

            //NYS State Tax
             if(x >= 8500 && x < 11700){
                excess = x - 8500;
                result = (int) (340 + (0.045 * excess));
                finalResult += result;
                 NysTaxRate.setText("4.5%");
                 NysTaxAmount.setText( String.valueOf(result));
             }else if(x >= 11700 && x < 13900){
                 excess = x - 11700;
                 result = (int) (484 + (0.0525 * excess));
                 finalResult += result;
                 NysTaxRate.setText("5.25%");
                 NysTaxAmount.setText( String.valueOf(result));
             }else if(x >= 13900 && x < 21400){
                 excess = x - 13900;
                 result = (int) (600 + (0.059 * excess));
                 finalResult += result;
                 NysTaxRate.setText("5.9%");
                 NysTaxAmount.setText( String.valueOf(result));
             }else if(x >= 21400 && x < 80650){
                 excess = x - 21400;
                 result = (int) (1042 + (0.0633 * excess));
                 finalResult += result;
                 NysTaxRate.setText("6.33%");
                 NysTaxAmount.setText( String.valueOf(result));
             }else if(x >= 80650 && x < 215400){
                 excess = x - 80650;
                 result = (int) (4793 + (0.0657 * excess));
                 finalResult += result;
                 NysTaxRate.setText("6.57%");
                 NysTaxAmount.setText( String.valueOf(result));
             }

             //Federal Tax
             if(x >= 0 && x < 9525){
                 result = (int) (x * 0.1);
                 finalResult += result;
                 fedTaxRate.setText("10%");
                 fedTaxAmount.setText( String.valueOf(result));
             }else if(x >= 9525 && x < 38700){
                 excess = x - 9525;
                 result = (int) (952.50 + (0.12 * excess));
                 finalResult += result;
                 fedTaxRate.setText("12%");
                 fedTaxAmount.setText( String.valueOf(result));
             }else if(x >= 38700 && x < 82500){
                 excess = x - 38700;
                 result = (int) (4453.50 + (0.22 * excess));
                 finalResult += result;
                 fedTaxRate.setText("22%");
                 fedTaxAmount.setText( String.valueOf(result));
             }else if(x >= 82500 && x < 157500){
                 excess = x - 82500;
                 result = (int) (14089.50 + (0.24 * excess));
                 finalResult += result;
                 fedTaxRate.setText("24%");
                 fedTaxAmount.setText( String.valueOf(result));
             }

             TotalIncome.setText( String.valueOf(finalResult));

         });


         primaryStage.setScene(scene);
         primaryStage.show();

    }


    public static void main(String[] args) {
        launch(args);
    }
}
