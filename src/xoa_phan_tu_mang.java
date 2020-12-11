import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;
import java.util.Scanner;

public class xoa_phan_tu_mang {

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 4, 2};
        //In mang
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println("Nhap vao phan tu muon xoa: ");
        Scanner sc = new Scanner(System.in);
        int delValue = sc.nextInt();

        getDelete(delValue,arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
    }

    public static int getIndex(int value, int[] array) {
        int index = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                index = i;
            }
        }
        return index;
    }

    public static void getDelete(int value, int[] array){
        int index = getIndex(value, array);
        while (index != -1){
            for (int i = index; i < array.length; i++) {
                if (i != array.length - 1) {
                    array[i] = array[i + 1];
                } else {
                    array[array.length - 1] = 0;
                }
            }
            index = getIndex(value, array);
        }
    }
}
