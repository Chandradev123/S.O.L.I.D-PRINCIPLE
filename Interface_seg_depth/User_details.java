package Interface_seg_depth;

import java.time.LocalDateTime;

public class User_details extends Entity {
    
        private String User_name;

        private LocalDateTime LDT;


        public void set_uname(String User_name)
        {
            this.User_name=User_name;
        }

        public String get_uname()
        {
            return User_name;
        }

        public void set_date(LocalDateTime LDT)
        {
            this.LDT=LDT;
        }

        public LocalDateTime get_date()
        {
            return LDT;
        }

}
