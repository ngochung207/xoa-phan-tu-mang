public class tim_gia_tri_lon_nhat_mang_2_chieu {
    public static void main(String[] args) {
        int[][] arr = {
                {0,1,2,3,4,5,6},
                {7,8,9,10,11,12,13},
        };
        int valueMax = arr[0][0];
        int valueMin = arr[0][0];
        for (int[] x: arr
             ) {
            for(int i = 0; i < x.length; i++){
                if (valueMax < x[i]){
                    valueMax = x[i];
                } else if (valueMin> x[i]){
                    valueMin = x[i];
                }
            }
        };
        System.out.println(valueMax);
        System.out.println(valueMin);
    }
}
