//32. How to print first non repeated character from String?
class Program32 {
    public static void main(String[] args) {
        String name = "java";
        char [] ch = name.toCharArray();
        for (int i = 0;i<ch.length;i++){
            int j;
            for (j = 0;j<ch.length;j++){
                if(ch[i]==ch[j] && i!=j){
                    break;
                }
            }
            if(j == ch.length){
                System.out.println("first non repeated character from String: " + ch[i]);
                break;
            }
        }
    }
}
