import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class OddIntegerFromList {
    private static Integer[] input;

    public OddIntegerFromList() {
    }

    public int oddInteger(Integer[] fromuser){
        this.input = fromuser;
        ArrayList<Integer> toSort = new ArrayList<Integer> (Arrays.asList (input));
        Collections.sort (toSort);
        int count = 0;
        for(int i =0; i < toSort.size () -1 ; i ++){
            for(int j =0; j < toSort.size () -1 ; j ++){
                if(toSort.get (i).equals(toSort.get (j))){
                    count ++;
                }
            }

            if( count % 2 != 0){ return toSort.get (i);}
        }
        return -1;

    }
    public static void main(String[] args){
        OddIntegerFromList test = new OddIntegerFromList ();
        System.out.println (test.oddInteger (new Integer[]{1, 1, 2, 3, 4, 5, 6, 6, 6}));
    }
}
