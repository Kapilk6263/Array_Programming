import java.util.Arrays;

public class ZerosToEnd {
    public static void main(String[] args) {
        int []arr={5,6,0,7,5,0,0,8};
        int n=arr.length;

       int j=-1;
       for(int i=0;i<n;i++){
           if(arr[i]==0) {
            j=i;
             break;
           }
          
       }  

       for(int i=j+1;i<n;i++){
         if(arr[i]!=0){
           swap(arr, i, j);
            j++;
         }

       } 
       System.out.println(Arrays.toString(arr));
    }

    static void swap(int []arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}  
