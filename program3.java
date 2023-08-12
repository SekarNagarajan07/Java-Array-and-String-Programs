//3.Find the Second Largest and Smallest number from an array?
class program3 {
    public static void main(String[] args) {
       int [] num = {1,2,3,4,5,6,7};
       int temp,size;
       size = num.length;

       for (int i = 0;i<size;i++){
           for (int j = i + 1;j<size;j++){
               if(num[i]>num[j]){
                   temp = num[i];
                   num[i] = num[j];
                   num[j] = temp;
               }
           }
       }
        System.out.println("Second Largest Number :" + num[size-2]);

        for (int i = 0;i<size;i++){
            for (int j = i + 1;j<size;j++){
                if(num[i]<num[j]){
                    temp = num[i];
                    num[i] = num[j];
                    num[j] = temp;
                }
            }
        }
        System.out.println("Second Smallest Number :" + num[size-2]);
    }
}
