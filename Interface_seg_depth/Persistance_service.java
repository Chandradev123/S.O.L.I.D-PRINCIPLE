package Interface_seg_depth;



public interface Persistance_service<T extends Entity> {
    
    public void Save(T entity);

    public void delete(T entity);

    public T findby_id(long id);


    //remove this methods to maintained interface segregation principle..
    //public List<T> findby_name(String name);
    
}
