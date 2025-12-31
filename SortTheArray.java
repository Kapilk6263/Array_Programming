import java.util.Arrays;

public class SortTheArray {
    public static void main(String[] args) {
        int arr[]={5,90,1,100,70,40};

       for(int i=0;i<arr.length;i++){
        for(int j=i+1;j<arr.length;j++){
            if(arr[i]>arr[j]){
                arr[i]=arr[i]+arr[j];
                arr[j]=arr[i]-arr[j];
                arr[i]=arr[i]-arr[j];
            }
        } 

       } 
       System.out.println(Arrays.toString(arr));
    }
}
