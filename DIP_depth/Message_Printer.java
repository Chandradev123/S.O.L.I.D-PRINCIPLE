package DIP_depth;

import java.io.IOException;
import java.io.PrintWriter;

public class Message_Printer {
    
    //high level class dependent upon json formatter and print writter so we should remove it and pass it by main method as an argument
    public void write_message(Message msg,Formatter_interface formater,PrintWriter print_write) throws IOException
    {
        /* 
        Formatter_interface formater=new Json_formatter();

         //create printwritter
        try(PrintWriter print_write=new PrintWriter(new FileWriter(file_name)))   
        {
            */
        print_write.println(formater.format(msg));//formats and writes message

        print_write.flush();
        
        //}
    }
}
