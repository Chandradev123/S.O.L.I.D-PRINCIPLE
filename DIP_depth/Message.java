package DIP_depth;


//import java.time.LocalDateTime;
//import java.time.ZoneId;



public class Message {
    
    private String msg;

    //private LocalDateTime timestamp;

    public Message(String msg)
    {
        this.msg=msg;
      //  this.timestamp=LocalDateTime.now(ZoneId.of("UTC"));
    }
    //get  method;

    public String get_msg()
    {
        return msg;
    }
/*
    public LocalDateTime get_timestamp()
    {
        return timestamp;
    }
      */

}
