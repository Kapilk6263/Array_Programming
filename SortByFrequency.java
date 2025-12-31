import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SortByFrequency {
    public static void main(String[] args) {
        int arr[]={2,2,4,4,4,3,1,1}; 
        System.out.println(sort(arr));
    } 

    public static List<Integer> sort(int arr[]){
        Map<Integer,Integer> freq=new HashMap<>();
        
        for(int n:arr){
            if(freq.containsKey(n)){
                freq.put(n, freq.get(n)+1);
            }else{
                freq.put(n, 1);
            }
        } 


        List<Integer> List=new ArrayList<>();

        for(int n:arr){
            List.add(n);
        } 

        //heighest frequency first 
       List.sort((a,b)->{
        if(freq.get(a)!=freq.get(b))return freq.get(b)-freq.get(a);
        return a-b;
       }); 
     
       //lowest frequency first 
       
    //     List.sort((a,b)->{
    //     if(freq.get(a)!=freq.get(b))return freq.get(a)-freq.get(b);
    //     return b-a;
    //    }); 

       return List;
    }
}
