public class cong_mang {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        int size = arr1.length + arr2.length;
        int[] arr3 = new int[size];

        for (int i = 0; i < arr1.length; i++) {
            arr3[i] = arr1[i];
        }
        for(int j = 0; j < arr2.length;j++){
            arr3[j+arr1.length] = arr2[j];
        }
        for (int x:arr3
             ) {
            System.out.print(x+"\t");
        }
    }
}
