//25. Remove duplicate numbers from an array
class Program25 {
    public static void main(String[] args) {
        int [] a = {1,2,3,3,4,5,5,6};
        int len = a.length;
        int temp[] = new int[a.length];
        int j = 0;
        for (int i = 0;i<len-1;i++){
            if(a[i]!= a[i+1]){
                temp[j++] = a[i];
            }
        }
        temp[j++] = a[len-1];
        for (int i = 0;i<j;i++){
            System.out.print(temp[i] + " ");
        }
    }
}
