// 4. Find the sum of an array?
class program4 {
    public static void main(String[] args) {
        int sum = 0;
        int [] num = {1,2,3,4,5};
        for (int i = 0;i<num.length;i++){
            sum = sum + num[i];
        }
        System.out.println("The sum of Array: " + sum);
    }
}
