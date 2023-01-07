package srp_depth;

public class Persistance_service {
    
    private DB_store store=new DB_store();

    public void save_user(User user)
    {
        store.store(user);
    }

}
