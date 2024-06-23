import java.util.List;

public class HeapOperations {
    public List<Integer> siftDownHeapification(List<Integer> nums){

        int end = nums.size()-1;

        while(end >= 0){
            int parent = (end - 1)/2;

            if(nums.get(parent) > nums.get(end)){
                swap(nums,parent,end);
            }
            --end;
        }

        return nums;
    }

    private void swap(List<Integer> nums, int a, int b){
        int temp = nums.get(a);
        nums.set(a, nums.get(b));
        nums.set(b,temp);
    }
}
