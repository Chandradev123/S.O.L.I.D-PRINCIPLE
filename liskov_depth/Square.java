package liskov_depth;

public class Square implements Interface_Ploygon {
    
    private int side;

    public Square(int side)
    {
       this.side=side;
    }

    /* 
        this two methods violates the behaviour of base class in main methos so we can avoid by implements interface .

    @Override
	public void set_width(int width) {
		setSide(width);
	}

	@Override
	public void set_height(int height) {
		setSide(height);
	}

    */

    //getter and setter methods ..

    public int get_side()
    {
        return side;
    }

    public void set_side(int side)
    {
        this.side=side;
    }

	public int Cal_Area()
    {
        return side*side;
    }

}
