// 12. How to find first non-repeating element in array of integers?
class Program12 {
    public static void main(String[] args) {
        int [] a = {2,3,6,2,5,6};
        for (int i = 0;i<a.length;i++){
            int j;
            for (j = 0;j<a.length;j++){
                if(a[i] == a[j] && i!=j){
                    break;
                }
            }
            if(j == a.length){
                System.out.println("first non-repeating element: " + a[i]);
                break;
            }
        }
    }
}
