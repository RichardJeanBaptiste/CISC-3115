import java.io.*;
import java.util.Scanner;


public class Customer{
    public String name,address,city,state,zipCode;

    public int custNo,wrongNo;

    public String getNameAndAddress(int custNo){
        
        try{

            name = CustomerIO.getCustomer(custNo).name;
            address = CustomerIO.getCustomer(custNo).address;
            city = CustomerIO.getCustomer(custNo).city;
            state = CustomerIO.getCustomer(custNo).state;
            zipCode = CustomerIO.getCustomer(custNo).zipCode;
            String result = name + "\n" + address + "\n" + city + ", " + state + " " + zipCode;
            return result;
                       
        } catch (Exception e) {
            wrongNo = NoSuchCustomerException.getCustomerNumber(custNo);
            String num = " - " + wrongNo;
            return num;  
        }
        
            
    }
}


class Main{
    public static void main(String[] args) {
        int num;
        char cont;
        boolean again = true;

        while(again == true){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a customer number");
            num = sc.nextInt();
            Customer test = new Customer();
            String x = test.getNameAndAddress(num);
            System.out.println(x);

            System.out.println("Do you want to continue");
            System.out.println("y/n");
            cont = sc.next().charAt(0);

            if(cont == 'N' || cont == 'n'){
                again = false;
            }
           
        }        
    }
}