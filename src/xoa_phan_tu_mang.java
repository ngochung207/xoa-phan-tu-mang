import java.util.Scanner;

public class xoa_phan_tu_mang {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        //In mang
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println("Nhap vao phan tu muon xoa: ");
        Scanner sc = new Scanner(System.in);
        int delValue = sc.nextInt();
        int indexDelete = getIndex(delValue, arr);

        System.out.println(indexDelete);

        for (int i = indexDelete; i < arr.length; i++) {
            if (i != arr.length - 1) {
                arr[i] = arr[i + 1];
            } else {
                arr[arr.length - 1] = 0;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
    }

    public static int getIndex(int value, int[] arry) {
        int index = -1;
        for (int i = 0; i < arry.length; i++) {
            if (arry[i] == value) {
                index = i;
            }
        }
        return index;
    }
}
