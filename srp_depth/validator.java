package srp_depth;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class validator {


    public boolean validate_user(User user)
    {
        return isvalid_user(user);
    }

    //In this class we validate the user Object......................

    public boolean isvalid_user(User user)
    {

        if(!isPresent(user.getName()))
        {
            return false;
        }
        user.setName(user.getName().trim());

        if(!isValidAlphaNumeric(user.getName()))
        {
            return false;
        }

        if(user.getName()==null&&user.getName().trim().length()==0)
        {
            return false;
        }
        user.setEmail(user.getEmail().trim());

        if(!isValidEmail(user.getEmail()))
        {
            return false;
        }

        return true;

    }
    //we check if value null or empty
    public boolean isPresent(String name)
    {
        return name!=null&&name.trim().length()>0;
    }

    //check string for special characters
    private boolean isValidAlphaNumeric(String value) 
    {
        Pattern pattern=Pattern.compile("[^A-Za-z0-9]"); 
        Matcher matcher=pattern.matcher(value);
        return !matcher.find();
    }

    //check string for valid email address
    private boolean isValidEmail(String value) 
    {
        Pattern pattern=Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$"); 
        Matcher matcher=pattern.matcher(value);
        return matcher.find();
    }
    
}
