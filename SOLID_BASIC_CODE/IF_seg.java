
/*
interface segregation principle....
A client should never be forced to implement an interface that it does not used
Write highly Cohessive Interfaces 
avoid interface pollution
*/ 


interface veg_meals
{
    public void veg();
    //public void non_veg();----no need to implement ...it shoud implement seperate interface
}
interface nonveg_meals
{
    public void non_veg();

}
class veg_resturant implements veg_meals
{
    public void veg()
    {
        System.out.println("veg_meals menu_card");
    }
}
class nonveg_resturant implements nonveg_meals
{
    public void non_veg()
    {
        System.out.println("non-veg_meals menu_card");
    }
}

class Resturant implements veg_meals,nonveg_meals
{
    public void veg()
    {
        System.out.println("veg_meals menu_card");
    }
    public void non_veg()
    {
        System.out.println("non-veg_meals menu_card");
    }
}
public class IF_seg {

    public static void main(String args[])
    {
        veg_resturant vr=new veg_resturant();
        vr.veg();

        nonveg_resturant nvg=new nonveg_resturant();
        nvg.non_veg();

        Resturant res=new Resturant();

        res.non_veg();
        res.veg();
    }
    
}
