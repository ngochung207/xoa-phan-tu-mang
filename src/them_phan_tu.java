public class them_phan_tu {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
//        System.out.println(getIndex(2, arr));

        addValueToArray(100,arr.length-1,arr);
        for (int i: arr
             ) {
            System.out.print(i + "\t");
        }

    }

    public static int getIndex(int value, int[] array) {
        int size = array.length;
        int index = -1;
        for (int i = 0; i < size; i++) {
            if (array[i] == value) {
                index = i;
                break;
            }
        }
        return index;
    }

    public static int[] addValueToArray(int value, int index, int[] array) {
        int size = array.length;
        for(int i = size-1; i > index; i--) {
            array[i] = array[i-1];
        }
        array[index] = value;
        return array;
    }
}