package top.wetech.tools.data_structure.tree;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import top.wetech.tools.data_structure.model.Student;

/**
 * 数据节点
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Node {
    private Student student;
    private Node leftChild;
    private Node rightChild;
}
