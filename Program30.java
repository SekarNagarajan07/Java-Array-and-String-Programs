//30. How to find multiple missing numbers in given integer array with duplicates?
class Program30 {
    public static void main(String[] args) {
        // 1-> Presented 0-> Not Presented
        int [] num = {2,3,5,9,10};
        int [] a = new int[11];
        for (int iter : num){
            a[iter]=1;
            }
        for (int j = 1;j<a.length;j++){
            if(a[j]==0){
                System.out.print(j + " ");
            }
        }
    }
}
