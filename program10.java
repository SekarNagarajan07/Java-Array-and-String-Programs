//10. How to find all pairs on integer array whose sum is equal to given Number ?
class program10 {
    public static void main(String[] args) {
        int [] a = {2,3,7,9,5,1};
        int num = 10;
        for (int i = 0;i<a.length;i++){
            for (int j = i+1;j<a.length;j++){
                if(a[i]+a[j]==num){
                    System.out.println(a[i] + " " + a[j]);
                }
            }
        }
    }
}
