

//A class should have only one reson to change(single functionality).

class Amazon_account
{

    store_db sdb=new store_db();
    send_notification sntf=new send_notification();

    public void Open_account()
    {
        //1
        System.out.println("Fill account details..");

        //store in databse 2 
        //System.out.println("Account store in db..");
        sdb.store();

        //send notification 3
        //System.out.println("Send account status notification..");
        sntf.send_notification();

    }
}

class store_db
{
    public void store()
    {
        System.out.println("Data successfully store in db..");
    }
}

class send_notification
{
    public void send_notification()
    {
        System.out.println("Acoount successfully created..");
    }
}

public class srp
{

     public static void main(String[] args) {
        
        Amazon_account aa=new Amazon_account();
        aa.Open_account();
    }
}