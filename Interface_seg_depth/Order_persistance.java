package Interface_seg_depth;

import java.util.HashMap;
import java.util.Map;



public class Order_persistance implements Persistance_service<Order> {
    
    private static final Map<Long,Order> orders=new HashMap<>();


    @Override
    public void Save(Order entity)
    {
        synchronized(orders)
        {
            orders.put(entity.get_id(),entity);
        }
    }

    @Override
    public void delete(Order entity)
    {
        synchronized(orders)
        {
            orders.remove(entity.get_id());
        }
    }

    @Override
    public Order findby_id(long id)
    {
        synchronized(orders)
        {
           return orders.get(id);
        }
    }

    /*
     * 
     // find by name not need for order persistance service and not maintained in Order class as well so 
     // this will segregate by two methods
       1. remove this methods from interface
       2.maintained seperate interface for this methods 

       so here we use 1st rule ...so i remove findby_name method from interface and those classes who used this method 
       does not override...so we remove this methods from interface.

    @Override

    public List<Order> findby_name(String name)
    {
        synchronized(orders)
        {
            return orders.values().stream().filter(u->u.get_uname().equalsIgnoreCase(name)).collect(Collectors.toList());
        }
    } 

    */
}
