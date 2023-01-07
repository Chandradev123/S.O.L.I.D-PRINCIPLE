package liskov_depth;

public class Rectangle implements Interface_Ploygon {

    private int width;

    private int height;

    public Rectangle(int width,int height)
    {
        this.width=width;
        this.height=height;
    }
    
    //getter and setter methods for this two variables

    public int get_width()
    {
        return width;
    }

    public void set_width(int width)
    {
        this.width=width;
    }

    public int get_height()
    {
        return height;
    }

    public void set_height(int height)
    {
        this.height=height;
    }

    public int Cal_Area()
    {
        return width*height;
    }
}
