// 5. Sort the array in ascending order?
class program5 {
    public static void main(String[] args) {
        int [] num = {5,4,2,8,7,9};
        int temp,size;
        size = num.length;
        for (int i = 0;i<size;i++){
            for (int j = i + 1;j<size;j++){
                if (num[i]>num[j]){
                    temp = num[i];
                    num[i] = num[j];
                    num[j] = temp;
                }
            }
        }
        System.out.print("Ascending Order :");
        for (int i = 0;i<size;i++){
            System.out.print(num[i] + " ");
        }
    }
}
