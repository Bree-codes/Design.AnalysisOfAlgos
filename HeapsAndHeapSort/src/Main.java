import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args){
        HeapOperations heapOperations = new HeapOperations();

        List<Integer> nums = new ArrayList<>(Arrays.asList(15,16,1,30,0,5,20,3,1,2,7,64,33,7,6,54,65,44,3,6,22,66,25,64,12,554,12,443,44,11,66,14,12,6,12,658,8,87,6));
        nums = heapOperations.siftDownHeapification(nums);
        for (int i : nums){
            System.out.print(i+",\t");
        }
    }
}