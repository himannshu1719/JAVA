public class Pattern4 
{
    public static void main(String[] args)
{
for(int i=0;i<5;i++)
{
    for(int j=0;j<5-i-1;j++)
    {
    System.out.print(" ");
    }
    for(int k=0;k<i;k++)
    {
    System.out.print("*");
    
    }
    for(int l=0;l<i-1;l++)
    {
        System.out.print("*");

    }
    System.out.println();
}
}
 }


