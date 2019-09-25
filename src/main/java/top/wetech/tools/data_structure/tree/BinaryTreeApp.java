package top.wetech.tools.data_structure.tree;

import top.wetech.tools.data_structure.model.Student;

/**
 * 操作binary tree
 */
public class BinaryTreeApp {
    public static void main(String[] args) {
        Tree tree = new Tree();
        Student stu1 = new Student(1, "chen", true, 33);
        Student stu2 = new Student(2, "wang", false, 44);
        Student stu3 = new Student(3, "yang", true, 55);
        Student stu4 = new Student(4, "zhe", true, 43);
        tree.insert(stu1);
        tree.insert(stu2);
        tree.insert(stu3);
        tree.insert(stu4);

        Node find = tree.find(stu2);
        if (find == null) {
            System.out.println("Didn't find it.");
        } else {
            System.out.println("Found it: " + find);
        }

        tree.delete(stu4);
    }
}
