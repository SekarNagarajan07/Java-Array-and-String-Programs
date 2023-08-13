//11. Write a program to remove duplicates from array in Java?
class Program11 {
    public static void main(String[] args) {
        int a [] = {2,3,6,2,5,6};
        for (int i = 0;i<a.length;i++){
            int j;
            for (j = 0;j<a.length;j++){
                if(a[i]==a[j] && i!=j){
                    break;
                }
            }

            if(j == a.length){
                System.out.print(a[i] + " ");
            }
        }
    }
}
