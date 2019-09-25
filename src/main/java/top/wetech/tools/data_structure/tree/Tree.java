package top.wetech.tools.data_structure.tree;

import top.wetech.tools.data_structure.model.Student;

/**
 * 一颗二叉树
 */
public class Tree {
    private Node tree;

    /**
     * 二叉树查找
     *
     * @param student 要查找的student
     * @return 返回查找到的node
     */
    public Node find(Student student) {
        Node current = tree;
        while (current.getStudent().compareTo(student) != 0) {
            if (current.getStudent().compareTo(student) > 0) {
                current = current.getLeftChild();
            } else {
                current = current.getRightChild();
            }
            if (current == null) {
                return null;
            }
        }
        return current;
    }

    /**
     * 插入student到tree，由根节点到叶子节点：一个一个比较，直到碰到null，将该student放入该节点
     * 如果碰到相等的元素，判断右子节点是否为null，则放到右子节点
     *
     * @param student 要插入的student
     */
    public void insert(Student student) {
        Node current = tree;
        Node parent = current;
        boolean isLeft = false;
        while (current != null){
            parent = current;
            if (current.getStudent().compareTo(student) > 0){
                current = current.getLeftChild();
                isLeft = true;
            } else if (current.getStudent().compareTo(student) < 0){
                current = current.getRightChild();
            } else {
                current = current.getRightChild();
            }
        }
        Node newNode = new Node(student, null, null);
        if (isLeft){
            parent.setLeftChild(newNode);
        } else {
            parent.setRightChild(newNode);
        }
    }

    /**
     * 从tree中删除node节点，分以下三种情况：
     * 1.该node节点为叶子节点；
     * 2.该node节点只有一个子节点；
     * 3.该node节点有2个子节点；
     * @param student
     */
    public void delete(Student student) {

    }

    /**
     * 遍历二叉树
     */
    public void display(Node localNode) {
        if (localNode != null){
            display(localNode.getLeftChild());
            System.out.println(localNode.getStudent());
            display(localNode.getRightChild());
        }
    }

}
