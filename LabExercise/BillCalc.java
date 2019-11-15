import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.*;
import javafx.scene.text.Text;
import javafx.geometry.*;


public class BillCalc extends Application {

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
                TextField split = new TextField();
                grid.add(split, 1, 5);

        //buttons
        Button calc = new Button();
        Button clear = new Button();
        Button exit = new Button();

        Text text = new Text("");
        grid.add(text, 1, 7);

        calc.setText("Calculate");
        clear.setText("Clear");
        exit.setText("Exit");

        HBox buttonBox = new HBox(15, calc, clear, exit);
        grid.add(buttonBox, 0, 9, 2, 1);

        calc.setOnAction(e -> {
            double x = Double.valueOf(bill.getText());
            double y = Double.valueOf(salesTax.getText());
            double ytax = y * .05;
            double z = Double.valueOf(split.getText());
       
         
            
            if(x == 0 || y == 0 || z == 0){
                text.setText("Can't divide Zero");
            }else{
                double result = ((x + (x * ytax)) / z);
                double finalAmount = x + y;
                
                String pay = "Your final amount of $" + finalAmount + " and split " + z + " ways is: " + result;
                text.setText(pay);
                
            }
        });

        clear.setOnAction(e -> {
            bill.clear();
            salesTax.clear();
            split.clear();
            text.setText("");
        });

        exit.setOnAction(e -> {
            System.exit(0);
        });



        primaryStage.setScene(scene);
        primaryStage.show();
    }

}