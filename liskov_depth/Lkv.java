package liskov_depth;

public class Lkv {
    
    public static void main(String args[])
    {
        Rectangle rec=new Rectangle(10, 30);

        System.out.println(rec.Cal_Area());

        Square sq=new Square(20);

        System.out.println(sq.Cal_Area());

        useRectangle(rec);
		
		//useRectangle(sq); 
    }

    //this methods is violate Liskov substitution principle because it changes the beaviour of base class when we call useRectangle(square);
    //to avoid this we make an interface and seperate this to class by interface 

    private static void useRectangle(Rectangle rectangle) 
    {
		rectangle.set_height(20);
		rectangle.set_width(30);
		assert rectangle.get_height() == 20 : "Height Not equal to 20";
		assert rectangle.get_width() == 30 : "Width Not equal to 30";
	}
}

