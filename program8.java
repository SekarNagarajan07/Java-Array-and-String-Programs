//8. Remove the specific element from an array?
import java.util.Scanner;
class program8 {
    public static void main(String[] args) {
        int size = 5,element;
        int [] arr = new int[size];
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 5 Element: ");
        for (int i = 0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the Element to Remove: ");
        element = sc.nextInt();

        for (int i = 0;i<size;i++){
            if(element == arr[i]){
                for (int j = i ;j<size-1;j++){
                    arr[j] = arr[j+1];
                    break;
                }
            }
        }
        System.out.println("The New Array: ");
        for (int i =0;i<size-1;i++){
            System.out.print(arr[i] + " ");
        }
    }
}
