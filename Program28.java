//28. Java Program to determine whether two matrices are equal
class Program28 {
    public static void main(String[] args) {
        Boolean matrix = true;
        int [][] m1 = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        int [][] m2 = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        for (int i = 0;i<m1.length;i++){
            for (int j = 0;j<m2.length;j++){
                if(m1[i][j] != m2[i][j]){
                    matrix = false;
                    break;
                }
            }
        }
        if(matrix){
            System.out.println("Is Equal");
        } else {
            System.out.println("Not Equal");
        }
    }
}
