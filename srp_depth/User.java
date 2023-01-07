package srp_depth;

public class User 
{
    private String name;
    private String email;
    private String address;

    //default constructor

    public User()
    {

    }

    public User(String name,String email,String address)
    {
        this.name=name;
        this.email=email;
        this.address=address;
    }

    //getter setter for user name

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name=name;
    }

    //getter setter for email address

    public String getEmail()
    {
        return email;
    }

    public void setEmail(String email)
    {
        this.email=email;
    }

    //getter setter for user address

    public String getAddress()
    {
        return address;
    }

    public void setAddress(String address)
    {
        this.address=address;
    }

    //---------------------------------


}
