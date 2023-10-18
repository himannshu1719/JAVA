public class Palindrome
{
public static void main(String[] args) 
{
    int n =536835;
    int temp=n;
    int rev=0;
    int r=0;
    while(n>0)
    {   r=n%10;
        rev=r;
        n=n/10;
       
    }  
    if(rev==temp)
    {
         System.out.println("number is palindrome");
    }
    else
    System.out.println("not a palindrome number");
}
}