package top.wetech.tools.data_structure.delete;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * delete from array, there is two situation: one is the array is not allowed duplicate, one is duplicated.
 */
public class Delete {

    public static void main(String[] args) {
        String[] test = new String[]{"1", "2", "3", "3", "4", "5", "6"};
        System.out.println(Arrays.toString(delete_from_duplicated_array(test, "3")));
    }

    /**
     * delete one data from the allow duplicated array, search need n times, and move data need > n/2 times.
     *
     * @param array the array need to delete data from.
     * @param data  the data need to delete from the array.
     * @return return the deleted array.
     */
    private static String[] delete_from_duplicated_array(String[] array, String data) {
        ArrayList<Integer> indexs = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            if (data.equals(array[i])) {
                array[i] = "";
                indexs.add(i);
            }
        }
        System.out.println("##### index is " + indexs);
        for (int i = 1; i <= indexs.size(); i++) {
            for (int j = indexs.get(indexs.size() - i); j < array.length - 1; j++) {
                array[j] = array[j + 1];
                array[j + 1] = "";
            }
        }
        return array;
    }
}
