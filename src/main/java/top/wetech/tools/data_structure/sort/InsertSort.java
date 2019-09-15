package top.wetech.tools.data_structure.sort;

/**
 * 插入排序：时间复杂度也为O(N^2)，但是在大多数情况下，都会优于冒泡排序和选择排序，插入排序的假设是局部有序，从被标记的位置（一般为下标为1）
 * 开始，依次跟前面的数值进行对比，找到大于被标记的值的位置，然后插入。
 */
public class InsertSort {
    public static int[] sort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int mark = i;
            int mark_data = array[mark];
            while (mark > 0 && mark_data < array[mark-1]){
                array[mark] = array[mark-1];
                mark--;
            }
            array[mark] = mark_data;
        }
        return array;
    }
}
