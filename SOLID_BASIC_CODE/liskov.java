


/*
Liskov substitution principle...

Object of super class shall be replaced object of subclass or we should be to substitute base class object with the child class object 
and this should not alter the behaviour/characteristics of a program

*/


class vehicle
{
    public void start()
    {
        System.out.println("Start vehicle.....");
    }
    public void stop()
    {
        System.out.println("Start vehicle.....");
    }
}
class bike extends vehicle
{
    public void start()
    {
        System.out.println("Start bike.....");
    }
    public void stop()
    {
        System.out.println("Start bike.....");
    }
}
class autoo extends vehicle
{
    public void start()
    {
        System.out.println("Start Auto.....");
    }
    public void stop()
    {
        System.out.println("Start Auto.....");
    }
}
public class liskov {
    
    static void test_drive(vehicle vh)
    {
        vh.start();
        vh.stop();
    }
    public static void main(String args[])
    {
        test_drive(new bike());
        test_drive(new autoo());
    }
}
