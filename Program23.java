//23. Check whether the given string palindrome or not ?
class Program23 {
    public static void main(String[] args) {
        String name = "malayalam";
        String rev = "";
       int length = name.length();

       for (int i = length-1;i>=0;i--){
           rev = rev + name.charAt(i);
       }
       if(name.equals(rev)){
           System.out.print(name + " Palindrome");
       } else {
           System.out.print(name + " Not a palindrome");
       }
    }
}
