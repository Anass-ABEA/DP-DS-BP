package net.thexcoders.data_structures.trees.simple_trees;

import java.util.ArrayList;

public class TreeImpl implements Tree {
    protected int value;
    protected ArrayList<TreeImpl> children;

    public TreeImpl(int val){
        this.value = val;
    }

    public boolean deptSearch(int val){
        if (val == value) return true;
        for(TreeImpl tree : children){
            if(tree.deptSearch(val)) return true;
        }
        return false;
    }

}
