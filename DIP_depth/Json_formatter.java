package DIP_depth;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

//this class convert message to json formate....

public class Json_formatter implements Formatter_interface{
    
    public String format(Message message) throws FormatException {
		ObjectMapper mapper = new ObjectMapper();
		try {
			return mapper.writeValueAsString(message);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
			throw new FormatException(e);
		}
	}
}
