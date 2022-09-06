package d0720;

public class Test2 {
    public static void main (String[] args)
    {
        Car car = new Car();

    }
}
class Car extends Vehicle
{

    private final void run()
    {
        System. out. println ("Car");
    }
}
class Vehicle
{
    private final void run()
    {
        System. out. println("Vehicle");
    }
}