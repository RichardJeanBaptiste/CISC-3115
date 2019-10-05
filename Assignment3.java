/* Assignment 3
 * Student: Richard Jean-Baptiste
 * CISC 3115
 * Brooklyn College
*/

class Fruit 
{
    String name;
    String taste;
    int size;

    public void eat()
    {
        System.out.println(this.name + " tastes " + this.taste + " and is " + this.size + "inches");
    }
}

class Apple extends Fruit
{   
    String name = "Apple";
    String taste = "Sweet";
    int size = 4;

    public void eat()
    {
        System.out.println(this.name + " tastes " + this.taste + " and is " + this.size + "inches");
    }
}

class Orange extends Fruit
{
    String name = "Orange";
    String taste = "Sour";
    int size = 4;

    public void eat()
    {
        System.out.println(this.name + " tastes " + this.taste + " and is " + this.size + "inches");
    }
}

class Shape
{
    public void draw()
    {
        System.out.println("Drawing Shape");
    }

    public void erase()
    {
        System.out.println("Erasing Shape");
    }
}

class Circle extends Shape
{
    public void draw()
    {
        System.out.println("Drawing Circe");
    }

    public void erase()
    {
        System.out.println("Erasing Circle");
    }
}

class Square extends Shape
{
    public void draw()
    {
        System.out.println("Drawing Square");
    }

    public void erase()
    {
        System.out.println("Erasing Square");
    }
}

class Triangle extends Shape
{
    public void draw()
    {
        System.out.println("Drawing Triangle");
    }

    public void erase()
    {
        System.out.println("Erasing Triangle");
    }
}

class Main
{
    public static void main(String[] args)
    {

        Fruit apple = new Apple();
        Fruit orange = new Orange();

        apple.eat();
        orange.eat();

        Shape c =new Circle();
        Shape t =new Triangle();
        Shape s =new Square();

        c.draw();
        c.erase();
        t.draw();
        t.erase();
        s.draw();
        s.erase();

    }
}
