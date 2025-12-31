import java.util.Arrays;

public class RemoveDuplicate {
    public static void main(String[] args) {
        int arr[]={2,2,3,3,3,4,4,4,5,5,5};
        int newLength=removeDuplicate(arr);

      for (int k = 0; k < newLength; k++) {
            System.out.print(arr[k] + " ");
        }
     
    } 

    static int removeDuplicate(int arr[]){
             
        if(arr.length==0) return 0;

     //   Arrays.sort(arr); if array is not sorted
        int i=0;
        for(int j=1;j<arr.length;j++){
            if(arr[j]!=arr[i]){
                i++;
                arr[i]=arr[j];
            }
        } 
        return i+1;
    }
}
