public class RemoveDuplicate {
    public static void main(String[] args) {
        int arr[]={2,2,3,3,3,4,4,4,5,5,5};

        
        int n=arr.length;
     int i=0;
     for(int j=1;j<n;j++){
        if(arr[j]!=arr[i]){
            arr[i+1]=arr[j];
            i++;
        }
     }

      for (int k = 0; k <= i; k++) {
            System.out.print(arr[k] + " ");
        }
     
    }
}
