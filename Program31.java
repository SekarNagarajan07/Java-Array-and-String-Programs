//31. How to count a number of vowels and consonants in a given String?
class Program31 {
    public static void main(String[] args) {
        String name = "sekar nagarajan";
        int count1 = 0;
        int count2 = 0;

        for (int i = 0;i<name.length();i++){
            if(name.charAt(i)=='a'|| name.charAt(i)=='e'||name.charAt(i)=='i'|| name.charAt(i)=='o'|| name.charAt(i)=='u'){
                count1++;
            } else if(name.charAt(i)!='a'|| name.charAt(i)!='e'||name.charAt(i)!='i'|| name.charAt(i)!='o'|| name.charAt(i)!='u'){
                count2++;
            }
        }
        System.out.println("Total no of vowels: " + count1);
        System.out.println("Total no of consonants: " + count2);
    }
}
