public class ArrayISSorted {
    public static void main(String[] args) {
        // int arr[]={2,6,6,7,8,96,9,};
         int arr[]={1,2,3,4,5,6};
        int n=arr.length;
        if(sorted(arr, n)){
            System.out.println("Array is sorted ");
        }else{
            System.out.println("Array is not sorted");
        }
       
    }

  static boolean sorted(int arr[],int n){
     for(int i=1;i<n;i++){
            if(arr[i]>=(arr[i-1])){
              
            }   
            else{
                return false;
            }
        }
    
        return true;
}
}