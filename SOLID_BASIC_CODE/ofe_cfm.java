//open for extention closed for modification
interface val_comp
{
    int compare(int n1,int n2);
}
class student_roll
{
    public static final void sort(int arr[],val_comp comp)
    {                                   //there are other best technque for sorting ..i am using this just for example
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(comp.compare(arr[i], arr[j])>0)
                {
                     int temp=arr[i];
                     arr[i]=arr[j];
                     arr[j]=temp;
                }
            }
        }
    }
}
public class ofe_cfm {
    
    public static void main(String[] args)
    {
        int arr[]={1,5,3,2,4};
        student_roll.sort(arr,new dsc());

        for(int e:arr)
        System.out.println(e);


    }
}
class asc implements val_comp
{
    public int compare(int n1,int n2)
    {
        return n1-n2;
    }
}
class dsc implements val_comp
{
    public int compare(int n1,int n2)
    {
        return n2-n1;
    }
}