import java.nio.charset.IllegalCharsetNameException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args){
        HeapOperations heapOperations = new HeapOperations();

        List<Integer> nums = new ArrayList<>(Arrays.asList(1,7,30,13,26,15,2));
        nums = heapOperations.siftDownHeapfication(nums);
        for (int i : nums){
            System.out.print(i+",\t");
        }
    }
}