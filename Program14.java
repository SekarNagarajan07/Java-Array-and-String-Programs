//14. How to merge sorted array?
class Program14 {
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 7};
        int[] arr2 = {2, 4, 6, 8, 10};

        int len1 = arr1.length;
        int len2 = arr2.length;
        int[] c = new int[len1 + len2];

        int i = 0, j = 0, k = 0;

        while (i < len1 && j < len2) {
            if (arr1[i] <= arr2[j]) {
                c[k++] = arr1[i++];
            } else {
                c[k++] = arr2[j++];
            }
        }

        while (i < len1) {
            c[k++] = arr1[i++];
        }

        while (j < len2) {
            c[k++] = arr2[j++];
        }
        
        for (int num : c) {
            System.out.print(num + " ");
        }
    }
}
