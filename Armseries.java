public class Armseries
 {
    public static void main(String[] args) {
        int n=1538;
        int d=n;
        int count=0;
        int arm=0;
    
        while(d>0)
     {
     d=d/10;
     count++; 
     }
     d=n;
     while(d>0)
     {
     int b=d%10;
     arm=arm + (int)Math.pow(b,count);
     d=d/10;
     }
     if(arm==n)
     System.out.println(arm+" this numbeer is armstrong  ");
     else
     System.out.println(" not a armstrong number");
     }
}
