package DIP_depth;

public class TextFormatter implements Formatter_interface{
    
    public String format(Message message){
		return message.get_msg();
	}
}
