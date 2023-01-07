package Interface_seg_depth;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class User_Persistance implements Persistance_service<User_details> {
    
    private static final Map<Long,User_details> users=new HashMap<>();

    @Override
    public void Save(User_details entity)
    {
        synchronized(users)
        {
            users.put(entity.get_id(),entity);
        }
    }

    @Override
    public void delete(User_details entity)
    {
        synchronized(users)
        {
            users.remove(entity.get_id());
        }
    }

    @Override
    public User_details findby_id(long id)
    {
        synchronized(users)
        {
            return users.get(id);
        }
    }

   
    public List<User_details> findby_name(String name)
    {
        synchronized(users)
        {
            return users.values().stream().filter(u->u.get_uname().equalsIgnoreCase(name)).collect(Collectors.toList());
        }
    }

}
