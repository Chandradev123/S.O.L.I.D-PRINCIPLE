package srp_depth;

import java.util.HashMap;
import java.util.Map;

//store data in memory

public class DB_store {
    
    private static final Map<String,User> db_storage = new HashMap<>();
    
//setter

    public void store(User user)
    {
        synchronized(db_storage)
        {
            db_storage.put(user.getName(), user);
        }
    }
//getter

    public User getUser(String uname)
    {
        synchronized(db_storage)
        {
            return db_storage.get(uname);
        }
    }

}
