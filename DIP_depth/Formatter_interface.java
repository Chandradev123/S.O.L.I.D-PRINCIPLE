package DIP_depth;


//Common interface for classes formatting Message object

public interface Formatter_interface {
    
    public String format(Message message) throws FormatException;
    
}
