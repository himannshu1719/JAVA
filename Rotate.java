public class Rotate
 {
   
    public static void main(String[] args) 
    {
        
        int arr[]={1,2,3,4,5,6};
        for(int j=0;j<3;j++)
        {
        int n=arr[5];
        for(int i=5;i>=1;i--)
        {
            arr[i]=arr[i-1];
        }
        arr[0]=n;
    }
        for(int i=0;i<6;i++)
        {
            System.out.print(arr[i]+",");
        }
    }
}
