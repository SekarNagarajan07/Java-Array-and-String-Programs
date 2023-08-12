//9. How to check if array contains a number in Java
class program9 {
    public static void main(String[] args) {
        int [] num = {1,2,3,4,5};
        int find = 3;
        boolean found = false;
        for (int i = 0;i<num.length;i++){
            if(num[i] == find){
                found = true;
                break;
            }
            }
        if(found){
            System.out.println("Is Found");
        } else {
            System.out.println("Not Found");
        }
        }

    }

