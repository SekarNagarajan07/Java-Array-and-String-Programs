//17. Write a Java program to Print even and odd numbers of an given array of
//integers.
class Program17 {
    public static void main(String[] args) {
        int [] num = {1,2,3,4,5,6,7,8,9};
        System.out.print("Even Number: ");
        for (int i = 0;i<num.length;i++){
            if (num[i]%2==0){
                System.out.print(num[i] + " ");
            }
        }
        System.out.print("Odd Number: ");
        for (int i = 0;i<num.length;i++){
            if (num[i]%2==1){
                System.out.print(num[i] + " ");
            }
        }

    }
}
