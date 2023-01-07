
//Dependency inversion Principle
//--High level modules/classes should not depends upon low level modules/classes but both should depends upon abastraction
//Also Abstraction should not depends upomn details but details should be depends upon abstraction .


//High level modules for just an eg

class messenger
{
    protocol_handler ph;

    public messenger(String prot)
    {
        ph=protocol_handler_factory.phf(prot);
    }

    public void send(String to,String message)
    {
        ph.send_data("message to.."+to+"...from..java.."+message);
    }
}

//Abstraction.....

interface protocol_handler
{
    void send_data(String protocol);
}

class protocol_handler_factory
{
    public static protocol_handler phf(String protocol)
    {
        if("TCP".equalsIgnoreCase(protocol))
        return new Tcp_handler();

        if("UDP".equalsIgnoreCase(protocol))
        return new Udp_handler();

        return null;
    }
}

//low level modules just example
class Tcp_handler implements protocol_handler
{
    public void send_data(String message)
    {
        System.out.println("TCp_handler..."+message);
    }
}

class Udp_handler implements protocol_handler
{
    public void send_data(String message)
    {
        System.out.println("Udp_handler..."+message);
    }
}
public class Dip {

    public static void  main(String args[])
    {
        String str="TCP";
        messenger msg = new messenger(str);
        msg.send("java....","....solid is great concept...");
    }
    
}
