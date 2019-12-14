public class NoSuchCustomerException extends Exception{
    private static int wrongCustomerNumber;


    public NoSuchCustomerException(int e) {
        //customerNum = e;
        System.out.println("The customer number doesn't exist");
    }

    public static int getCustomerNumber(int e) {
        wrongCustomerNumber = e;
        return wrongCustomerNumber;
    }
    public static void testMessage(){
        System.out.println("test");
    }
}