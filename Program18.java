//18. Write a Java program to arrange the elements of an given array of integers
//where all positive integers appear before all the Negative integers.?
class Program18 {
    public static void main(String[] args) {
        int [] num = {-1,-2,1,2,-3,-4,3,4,5,6};
        int index = 0;

        for (int i = 0;i<num.length;i++){
            if(num[i]>0){
                int temp = num[i];
                num[i] = num[index];
                num[index] = temp;
                index++;
            }
        }
        for (int i = 0;i<num.length;i++){
            System.out.print(num[i] + " ");
        }
    }
}
