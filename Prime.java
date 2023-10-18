public class Prime 
{
    public static void main(String[] args) {
        
        int number = 100;
        int temp=0;
        for(int i=2;i<number/2;i++)
        {
            if(number%i==0)
            {
                temp=temp+1;
            }
        }
        if(temp==0)
        {
            System.out.println("  prime number");
        }
        else
        {
            System.out.println("not a prime number");
        }
    }   
}
