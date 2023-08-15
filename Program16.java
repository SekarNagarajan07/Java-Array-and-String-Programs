// 16. Java program to move all zero of an integer array to the end of the array?
class Program16 {
    public static void main(String[] args) {
        int [] arr = {1,0,2,0,3,4,5,0,6};
        int length = arr.length;
        int count = 0;

        for (int i = 0;i<length;i++){
            if (arr[i]!= 0){
                arr[count++] = arr[i];
            }
        }
        while (count<length){
            arr[count++] = 0;
        }
        for (int i = 0;i<length;i++){
            System.out.print(arr[i] + " ");
        }
    }
}
