import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Yopeso {


    public static void main(String[] args) {

        int [] aar = {1,8,6,2,5,4,8,3,7};
        System.out.println(findMax(aar));

    }

    public static int findMax (int[]arr){
        int first = arr.length-1;
        List<Integer> lista =  new ArrayList<>();
        for(int j=arr.length-1;j>0;j--){
            for (int i=0;i<first;i++) {
                lista.add(Math.min(arr[j],arr[i]) *(j-i) );
            }{
            for (int i=0;i<first;i++) {
                lista.add(Math.min(arr[j],arr[i]) *(j-i) );
            }
            first-=1;


        }
            first-=1;


        }
        lista.add(Math.min(arr[0],arr[arr.length-1]) * arr.length);
        return Collections.max(lista);
    }


}


