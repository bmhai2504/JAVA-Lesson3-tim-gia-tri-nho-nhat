public class Main {
    public static void main(String[] args) {
        int[] arr = {8,9,4,6,3,5,7,1,2};
        int minValueArr = minValue(arr);
        System.out.println(minValueArr);
    }
    public static int minValue(int[] arr){
        int temp = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(temp > arr[i]){
                temp = arr[i];
            }
        }
        return temp;
    }
}