import java.util.ArrayList;
import java.util.List;

public class MyArrays {

    public static void main(String[] args) {
        Integer[] arrays = {5, 3, 2, 1, 1};
        System.out.println(method1(arrays));
        int[] arr = {1, 3, 1, 4};
        System.out.println(method2(arr));
    }

    public static List<Integer> method1(Integer[] array){
        List<Integer> newArray = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            if(array[i] == 4 && i != array.length - 1){
                for (int j = i + 1; j < array.length; j++) {
                    newArray.add(array[j]);
                }
                return newArray;
            } else if (array[i] == 4 && i == array.length - 1){
                throw new RuntimeException("После 4, нет данных");
            } else if (array[i] != 4 && i == array.length - 1){
                throw new RuntimeException("В массиве нет 4");
            }
        }
        return newArray;
    }

    public static boolean method2(int[] array){
        int count1 = 0;
        int count4 = 0;
        int countOther = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i] == 1){
                count1++;
            }
            if(array[i] == 4){
                count4++;
            }
            if(array[i] != 4 && array[i] != 1){
                countOther++;
            }
        }
        if(count1 > 0 && count4 > 0 && countOther == 0){
            return true;
        }
        return false;
    }
}
