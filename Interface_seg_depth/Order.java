package Interface_seg_depth;

import java.time.LocalDateTime;

public class Order extends Entity {
    
    private LocalDateTime order_placed_date;

    private double total_amount;


    public void set_pdate(LocalDateTime order_placed_date)
    {
        this.order_placed_date=order_placed_date;
    }

    public LocalDateTime get_pdate()
    {
        return order_placed_date;
    }

    public void set_amount(double total_amount)
    {
        this.total_amount=total_amount;
    }

    public double get_amount()
    {
        return total_amount;
    }

}
