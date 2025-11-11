public class ArrayMax {
    public static void main(String[] args) {
        int arr[]={3,55,244,433,22,234};

        int max=arr[0];
        int min=arr[0];
        for(int i=0;i<arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
            } 
            else if(min>arr[i]){
                   min=arr[i]; 
            }
            

        }
        System.out.println("Maximum element of the array"+max);
        System.out.println(min);
    }
}
