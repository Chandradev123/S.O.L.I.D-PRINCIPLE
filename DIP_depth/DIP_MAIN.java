package DIP_depth;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class DIP_MAIN {
    
    public static void main(String args[]) throws IOException
    {

        //after

        Message msg=new Message("Hi i am testing DIP  updated");

        Message_Printer mp=new Message_Printer();

        try(PrintWriter pw=new PrintWriter(new FileWriter("dp.txt")))
        {
            mp.write_message(msg,new Json_formatter(),pw);
        }
        /* 
        before 
        Message msg=new Message("Hi i am testing DIP");

        Message_Printer mp=new Message_Printer();

        mp.write_message(msg,"dp.txt");
        */
    }
}
