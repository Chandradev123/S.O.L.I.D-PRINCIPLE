package oe_cm_depth;
import java.util.List;

//open for extention .....

public class Isp_subscriber extends Base_subscriber{
   
    /* 

    // this four variables are common so we can seperate this class to base class

    private long subscriber_id;

    private String address;

    private long Phn_no;

    private int base_rate;

    */


    private long free_usage;

    @Override
    public double calculateBill() {
        List<InternetSessionHistory.InternetSession> sessions = InternetSessionHistory.getCurrentSessions(subscriber_id);
        long totalData = sessions.stream().mapToLong(InternetSessionHistory.InternetSession::getDataUsed).sum();
        long chargeableData = totalData - free_usage;
        return chargeableData*base_rate/100;
    }

    /* 
    no need for this methods because we can seperate this to base class

    //getter and setter methods for above variable

    public long get_id()
    {
        return  subscriber_id;
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

    public void set_add(long Phn_no)
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

    public long get_freeusage()
    {
        return free_usage;
    }

    public void set_freeusage(long free_usage)
    {
        this.free_usage=free_usage;
    }
    
    
    */
}
