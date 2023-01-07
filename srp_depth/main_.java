package srp_depth;

import java.io.IOException;

public class main_ 
{
    private static final String valid_josn="{\"name\":\"Chandradev\",\"email\":\"crazz@gmail.com\",\"address\":\"Patna Bihar\"}";
    private static final String invalid_josn="{\"name\":\"Raj\",\"email\":\"Razz@gmail.com\",\"address\":\"MNNIT\"}";

    public static void main(String args[]) throws IOException
    {

        UserCont us=new UserCont();
        String response=us.create_user(valid_josn);

        if(!response.equalsIgnoreCase("Sucess"))
        {
            System.out.println("FAILD");
        }
        System.out.println("Valid json responce is ..."+response);

        response=us.create_user(invalid_josn);

        if(!response.equalsIgnoreCase("Error"))
        {
            System.out.println("Invalid json Responce is...."+response);
        }

    }
}
