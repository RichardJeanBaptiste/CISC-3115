import java.util.*;

public class GenericStackApp
{

    public static void main(String args[])
    {
        GenericStack<String> Test = new GenericStack<>();
        
       String x,z; 
       int y;

        Test.push("Apples");
        x = Test.getFirst();
        System.out.println(x);

        Test.push("Oranges");
        x = Test.getFirst();
        System.out.println(x);

        
        Test.push("Bananas");
        x = Test.getFirst();
        System.out.println(x);

        y = Test.size();
        System.out.println(y);

        System.out.println(" ");

        z = Test.peek();
        System.out.println(z);

        System.out.println(" ");

        Test.pop("Bananas");
        Test.pop("Oranges");
        Test.pop("Apples");

        y = Test.size();
        System.out.println(y);
      
    }

}

class GenericStack <T> 
{
    T obj1;

    LinkedList<T> Test = new LinkedList<T>();

    public void push(T obj1) {
        Test.push(obj1);        
    }

    public T getFirst(){
        obj1 = Test.getLast();
        return obj1;
    }
    
    public T peek() {
        obj1 = Test.peek();
        return obj1;
    }

    public void pop(T obj1){
        System.out.println(obj1);
        Test.pop();
    }

    public int size(){
        return Test.size();
        
    }

}
