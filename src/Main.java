import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(1);
        arr.add(3);

        int even = 0;
        int odd = 0;

        for(int i : arr){
            if(i % 2 == 0){
                even++;
            }else{
                odd++;
            }
        }
        if(even > odd){
            System.out.println("EVEN");
        }
        else if(odd > even){
            System.out.println("ODD");
        }else{
            System.out.println("NEUTRAL");
        }
    }
}
