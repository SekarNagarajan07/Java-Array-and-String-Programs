//26. Removal all white space from String
class Program26 {
    public static void main(String[] args) {
       String name = "this is java";
       char [] ch = name.toCharArray();
       String str = "";

       for (int i = 0;i<ch.length;i++){
           if(ch[i] != ' '){
               str = str + ch[i];
           }
       }
        System.out.print(str);
    }
}
