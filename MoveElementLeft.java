import java.util.Arrays;

public class MoveElementLeft {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        int n=arr.length;
        int temp=arr[0];
        for(int i=1;i<n;i++){
           arr[i-1]=arr[i];
        }
        arr[n-1]=temp;
        System.out.println(Arrays.toString(arr)); 

        int arr2[]={3,4,5,8,9};
        int n1=arr2.length;
        int temp2=arr2[n1-1];

        for(int j=n1-1;j>0;j--){
           arr2[j]=arr2[j-1];
        }
        arr2[0]=temp2;
        System.out.println(Arrays.toString(arr2));
        
}
}
