package oe_cm_depth;

//this base class is closed for modification 

public abstract class Base_subscriber {
    
    protected long subscriber_id;

    protected String address;

    protected long Phn_no;

    protected int base_rate;

    public long get_id()
    {
        return subscriber_id;
    }

    public void set_id(long subscriber_id)
    {
        this.subscriber_id=subscriber_id;
    }

    public String get_add()
    {
        return address;
    } 

    public void set_add(String address)
    {
        this.address=address;
    }

    public long get_phn()
    {
        return Phn_no;
    }

    public void set_phn(long Phn_no)
    {
        this.Phn_no=Phn_no;
    }

    public int get_baserate()
    {
        return base_rate;
    }

    public void set_baserate(int base_rate)
    {
        this.base_rate=base_rate;
    }

    //open for extention this methods may varies depending upon futrue updates

    public abstract double calculateBill();
}
