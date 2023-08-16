//27. Print repeated characters of String?
class Program27 {
    public static void main(String[] args) {
        String name = "example";
        char [] ch = name.toCharArray();
        for (int i = 0;i<ch.length;i++){
            for (int j = i+1;j<ch.length;j++){
                if(ch[i] == ch[j]){
                    System.out.println("repeated characters of String: " + ch[j]);
                }
            }
        }
    }
}
