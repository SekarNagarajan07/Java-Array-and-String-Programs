//1.Find the duplicate numbers from an array?
class program1 {
  public static void main(String[] args) {
    int [] num = {2,9,5,6,7,5,4};
    for (int i = 0;i<num.length;i++){
      for (int j = 0;j<i;j++){
        if(num[i] == num[j]) {
          System.out.println("The Duplicate number is :" + num[j]);
        }
      }
    }
  }
}