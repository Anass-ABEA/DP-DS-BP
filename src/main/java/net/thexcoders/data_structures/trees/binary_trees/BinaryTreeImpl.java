package net.thexcoders.data_structures.trees.binary_trees;

public class BinaryTreeImpl  implements BinaryTree{
    protected int value;
    protected BinaryTreeImpl left;
    protected BinaryTreeImpl right;

    public BinaryTreeImpl(int val) {
        this.value = val;
    }

    public boolean search(int value) {
        if (this.value == value) return true;
        if (value < this.value && left != null) {
            return left.search(value);
        } else {
            if (value > this.value && right != null) {
                return right.search(value);
            }
            return false;
        }
    }

    public boolean insert(int val) {
        if (val == value) return false;
        if (val > value && right == null) {
            right = new BinaryTreeImpl(val);
            return true;
        }
        if (val < value && left == null) {
            left = new BinaryTreeImpl(val);
            return true;
        }
        if (val < value) return left.insert(val);
        return right.insert(val);
    }

    public static void toString(BinaryTreeImpl root, int level) {
        if(root==null)
            return;
        toString(root.right, level+1);
        if(level!=0){
            for(int i=0;i<level-1;i++)
                System.out.print("|\t");
            System.out.println("|---"+root.value);
        }
        else
            System.out.println(root.value);
        toString(root.left, level+1);
    }

}
