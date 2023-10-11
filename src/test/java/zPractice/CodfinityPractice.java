package zPractice;
import org.testng.annotations.Test;
import java.util.Arrays;

public class CodfinityPractice {

    @Test
    public void testMethode() {

        int[] sir = {1, 4, 2, 6, 3, 8, -5, -7, 9};
        int[] sirNou  = sortareIncrementareFunction(sir);
        for (int i : sirNou){
            System.out.print(i+", ");
        }


    }
    int[] sortareIncrementareFunction( int[] inputData){
        int[] result = new int[inputData.length];
        for(int i=0; i<result.length; i++){
            result[i] = inputData[i]+1;
        }
        Arrays.sort(result);
        return result;
    }



}


