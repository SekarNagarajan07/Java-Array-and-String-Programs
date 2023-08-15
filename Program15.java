import java.util.Arrays;

// 15. Write a program to find length of longest consecutive sequence
//in array of integers?

class Consecutive {
    public static int longestConsecutive(int [] num){
        if(num == null || num.length == 0){
            return 0;
        }
        Arrays.sort(num);

        int longestStreak = 1;
        int count = 1;

        for (int i = 1;i<num.length;i++){
            if(num[i] !=num[i-1]){
                if (num[i] == num[i-1]+1){
                    count++;
                } else {
                    longestStreak = Math.max(longestStreak,count);
                    count = 1;
                }
            }
        }
        return Math.max(longestStreak,count);
    }

    public static void main(String[] args) {
        int [] num = {1,2,4,5,6,7,8,9};
        int result = longestConsecutive(num);
        System.out.println("length of longest consecutive is: " + result);
    }
}
