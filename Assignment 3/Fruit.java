class Fruit
{
    String name,taste;
    double size;

    public Fruit(String x, String y, double z){ 
        super();
        name = x;
        taste = y;
        size = z;
    }

    public void eat(){
        System.out.println("The name of the fruit is " + this.name + " The taste of the fruit is " + this.taste);
    }
    
}

class Apple extends Fruit
{

    public Apple(String x, String y, double z) {
        super(x, y, z);
    }
    
    public void eat(){
        System.out.println("The name of the fruit is " + this.name + " The taste of the fruit is " + this.taste);
    }
}

class Orange extends Fruit
{

    public Orange(String x, String y, double z) {
        super(x, y, z);
    }
    
    public void eat(){
        System.out.println("The name of the fruit is " + this.name + " The taste of the fruit is " + this.taste);
    }
}

class Main 
{    
    public static void main(String[] args) {
        Apple a = new Apple("apple", "sweet", 3.0);
        Orange b = new Orange("orange", "sour", 4.0);
        a.eat();
        b.eat();
    }

}