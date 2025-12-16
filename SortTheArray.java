public class SortTheArray {
    public static void main(String[] args) {
        int arr[]={10,23,44,11,22};

        for(int i=0;i<arr.length;i++){
           for(int j=i+1;j<arr.length;j++){
               if(arr[i]>arr[j]){
                arr[i]=arr[i]+arr[j];
                arr[j]=arr[i]-arr[j];
                arr[i]=arr[i]-arr[j];
               }
           }
        }  
        for(int n:arr){
        System.out.print(n+" ");
        }
    }
}
