// 13. Check whether the given array is sub array or not?
class Program13 {
    public static void main(String[] args) {
        int [] a = {2,3,6,2,5,6};
        int [] b = {2,3,6};

        for (int i = 0;i<a.length-b.length;i++){
            int j;
            for (j = 0;j<b.length;j++){
                if(a[i+j]!=b[j]){
                    break;
                }
            }
            if(j == b.length){
                System.out.println("Subset Array");
                break;
            } else {
                System.out.println("Not Subset Array");
                break;
            }
        }
    }
}
