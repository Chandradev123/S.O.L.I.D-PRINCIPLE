package srp_depth;
import java.io.IOException;
import com.fasterxml.jackson.databind.ObjectMapper;

//Handles incoming JSON requests that work on User

public class UserCont {
    
    private Persistance_service p_service=new Persistance_service();
    //create a new user
    public String create_user(String user_json) throws IOException
    {
        ObjectMapper mapper=new ObjectMapper();
        User user=mapper.readValue(user_json,User.class);

        //inside create user i am validating user but not this class
        //we want to follow srp then we must create validation in other class

        validator valid=new validator();

        boolean Is_valid=valid.validate_user(user);

        if(!Is_valid)
        {
            return "Error";
        }

        //store db
        p_service.save_user(user);
        return "Sucess";

    }

    //store user data in db
}
