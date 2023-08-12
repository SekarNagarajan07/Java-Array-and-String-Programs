// 2.Find the Largest Number from an array?
 class program2 {
    public static void main(String[] args) {
        int [] num = {1,2,3,7,6};
        int max,size;
        size = num.length;
        for(int i = 0;i<size;i++){
            for (int j = i + 1;j<size;j++){
                if(num[i] > num[j]){
                   max = num[i];
                   num[i] = num[j];
                   num[j] = max;
                }
            }
        }
        System.out.println("Largest Number is :" + num[size-1]);

    }

}
