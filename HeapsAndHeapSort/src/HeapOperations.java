import java.util.List;

public class HeapOperations {
    public List<Integer> siftDownHeapification(List<Integer> nums){

        int end = nums.size()-1;
        final int LENGTH = end;

        while(end >= 0){
            int parent = (end - 1)/2;

            if(nums.get(parent) > nums.get(end)){
                swap(nums,parent,end);

                int pointer = end;

                int left_child = 2 * pointer + 1;
                int right_child = left_child + 1;

                while(left_child <= LENGTH){
                    if(right_child <= LENGTH){
                        if(nums.get(left_child) <= nums.get(right_child) && nums.get(left_child) < nums.get(pointer)){
                            swap(nums, left_child, pointer);
                            pointer = left_child;
                        } else if(nums.get(right_child) < nums.get(pointer)) {
                            swap(nums, right_child, pointer);
                            pointer = right_child;
                        }else {
                            break;
                        }
                    } else if (nums.get(left_child) < nums.get(pointer)) {
                        swap(nums, left_child, pointer);
                        pointer = left_child;
                    }else {
                        break;
                }
                    left_child = 2 * pointer + 1;
                    right_child = left_child + 1;
            }
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
