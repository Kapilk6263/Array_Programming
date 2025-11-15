import java.util.Arrays;

public class MoveElementLeftByD {
 public static void main(String[] args) {


    // Brute force solution

     int arr[]={3,5,6,7,8,9,10,11};
     int n=arr.length;
      int d=5;
//     int temp[]=new int[d];
    
//     for(int i=0;i<d;i++){
//         temp[i]=arr[i];
//     }

//    for(int i=d;i<n;i++){
//     arr[i-d]=arr[i];
//    }
   
//     int j=0;
//     for(int i=n-d;i<n;i++){
//        arr[i]=temp[j];
//        j++;
//     }
//     System.out.println(Arrays.toString(arr));



// optimal solution
 
 reverse(arr, 0, d-1);
 reverse(arr, d, n-1);
 reverse(arr, 0, n-1);
  
   System.out.println(Arrays.toString(arr));
 }  


 static void reverse(int[]arr,int st,int end ){

    while(st<end){
        int temp=arr[st];
         arr[st]=arr[end];
         arr[end]=temp;
         st++;
         end--;

    }
 }


 
}
