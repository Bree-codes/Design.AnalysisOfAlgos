public class Main {

    public static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,7,8,9};
        int a = 0, b=1;

        swap(arr,a,b);

        System.out.println("The value at index 0 is: " + arr[a]);
        System.out.println("The value at index 1 is: " + arr[b]);
    }
}
