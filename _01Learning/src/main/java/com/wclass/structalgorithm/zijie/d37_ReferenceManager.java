package com.wclass.structalgorithm.zijie;


import com.wclass.structalgorithm.zijie.object.Node;

/**
 * ClassName:d37_ReferenceManager
 * Package:com.yj.nz
 * Description:描述
 *
 * @Date:2023/2/7 15:35
 * @Author:NieZheng
 * @Version:1.0
 */
public class d37_ReferenceManager {

    public Node node;

    public void copyValue(Node obj){
        if (obj == null){
            return;
        }
        if (node == null){
            node = new Node(obj.val);
        }
        node.val = obj.val;
    }

    public void copyReference(Node obj){
        node = obj;
    }

}
