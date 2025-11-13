public class SecondLargestElement {


    
    // public static void main(String[] args) {
    //     int arr[]={2,3,4,6,10};

    //     int second=0;
    //     int ans=arr[0];

    //     for(int i=1;i<arr.length;i++){
    //         if(arr[i]>ans){
    //             second=ans;
    //             ans=arr[i];
    //         }
    //     } 
    //     System.out.println(second);
    // }



     public static void main(String[] args) {
        int []arr2={2,3,4,6,10,2,8};

        int n=arr2.length;
       int largest=arr2[0];

        for(int i=1;i<n;i++){
            if(arr2[i]>largest){
            largest=arr2[i];
            }
        } 
        int SecondLargest=arr2[0];

        for(int i=1;i<n;i++){
            if(arr2[i]>SecondLargest && arr2[i]!=largest){
                   SecondLargest=arr2[i];
            }

    }
    System.out.println(SecondLargest);
}
}


