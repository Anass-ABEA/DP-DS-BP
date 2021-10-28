package net.thexcoders.data_structures.trees.any;

import java.util.*;

public class TreeImpl {
    protected int value;

    protected ArrayList<TreeImpl> children = new ArrayList<>();


    public TreeImpl(int val) {
        this.value = val;
    }

    public void BFS_Print() {
        for (TreeImpl child : children) {
            child.BFS_Print();
        }
        System.err.println(this.value);
    }

    public void BFS_Print_Down() {
        System.err.println(this.value);
        for (TreeImpl child : children) {
            child.BFS_Print_Down();
        }
    }

    public void DFS_Print() {
        for (TreeImpl child : children) {
            System.err.println(child.value);
        }
        for (TreeImpl child : children) {
            child.DFS_Print();
        }
    }

    public int depth(){
        if(children.size() == 0){
            return 1;
        }
        int max = 0;
        for(TreeImpl impl : children){
            int val = impl.depth();
            max = Math.max(val,max);
        }
        return 1 + max;
    }


}
