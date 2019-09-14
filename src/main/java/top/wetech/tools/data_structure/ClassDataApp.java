package top.wetech.tools.data_structure;

import lombok.Data;
import top.wetech.tools.data_structure.model.Person;

@Data
public class ClassDataApp {
    public static void main(String[] args) {
        int max = 100;
        DataArray dataArray = new DataArray(max);
        dataArray.insert("jinping", "xi", 56);
        dataArray.insert("ying", "wang", 25);
        dataArray.insert("guangming", "yang", 27);
        dataArray.insert("zuoli", "chen", 27);
        dataArray.insert("lizhi", "kan", 29);
        dataArray.insert("pengxiang", "wang", 27);
        dataArray.insert("caiyun", "huang", 26);
        dataArray.displayArray();
        System.out.println("----------------");
        String search_key = "ying";
        Person ying = dataArray.find(search_key);
        if (ying != null) {
            System.out.println("Found it: ");
            ying.displayPerson();
        } else {
            System.out.println("Not found it.");
        }
        System.out.println("---------------");
        String person1 = "zuoli";
        String person2 = "jinping";
        System.out.println("Deleting " + person1 + ", " + person2);
        dataArray.delete(person1);
        dataArray.delete(person2);
        System.out.println("Deleted.");
        dataArray.displayArray();
    }
}

class DataArray {
    private Person[] personArr;
    private int nElems;

    /**
     * 初始化数组，数组中的元素个数为0，长度为max
     *
     * @param max 数组的长度
     */
    protected DataArray(int max) {
        personArr = new Person[max];
        nElems = 0;
    }

    /**
     * 根据firstName查找某个人
     *
     * @param firstName 这里假设firstName在数组中没有重复
     * @return 返回Person
     */
    public Person find(String firstName) {
        int i = 0;
        for (i = 0; i < nElems; i++) {
            if (personArr[i].getFirstName().equals(firstName)) { // found it;
                break;
            }
        }
        if (i == nElems) { // can't find it;
            return null;
        } else {
            return personArr[i];
        }
    }

    /**
     * 向数组中插入一个人
     *
     * @param firstName 名
     * @param lastName  姓
     * @param age       年龄
     */
    public void insert(String firstName, String lastName, int age) {
        personArr[nElems] = new Person(firstName, lastName, age);
        nElems++;
    }

    /**
     * 根据firstName从数组中删除
     *
     * @param firstNmae 名
     * @return 删除成功与失败
     */
    public boolean delete(String firstNmae) {
        boolean flag = false;
        for (int i = 0; i < nElems; i++) {
            if (personArr[i].getFirstName().equals(firstNmae)) {
                for (int j = i; j < nElems - 1; j++) {
                    personArr[j] = personArr[j + 1];
                }
                flag = true;
                nElems--;
            }
        }
        return flag;
    }

    /**
     * 打印数组中的所有person
     */
    public void displayArray() {
        for (int i = 0; i < nElems; i++) {
            personArr[i].displayPerson();
        }
    }

}
