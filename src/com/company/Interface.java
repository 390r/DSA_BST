

public interface Interface {


    /**
     *  Full method's descriptions in MyAVL class {@link MyBST}.
     */


    /*
     * Insert new element int (data) into a tre with root MyNode (root)
     *======*/
    insert(MyNode root , int data);


    /*
     * InOrder traversal through the tree with root MyNode root
     *======*/
    inOrderTrav(MyNode root);

    /*
     * Linear search in BST for value toFind
     *======*/
    findVal(MyNode root, int toFind);

    /*
     * Delete element (if it is in tree). Recursive.
     *======*/
    remove (MyNode root, int toRemove);

    /*
     * Print the Tree with root node root as asked it the task:
     *  The only way I realized to do that - at first convert the tree into array view,
     *  then use property:
     *      root = arr[i];
     *      left child = arr[i*2+1];
     *      right child = arr[i*2+2];
     *  build a string and return it.
     *======*/
    print(MyNode root, int len);

    /*
     * Mirror the Tree - swap left and right children recursively.
     *  In this case inOrderTraverse will change it's result
     *======*/
    MyNode mirror(MyNode root);

}
