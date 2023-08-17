//36. Java Program to print the elements of an array present on even position
class Program36 {
    public static void main(String[] args) {
        int [] a = new int[]{1,2,3,4,5,6};

        for (int i = 1;i<a.length; i++){
            if(a[i]%2==0){
                System.out.print(a[i] + " ");
            }
        }
    }
}
