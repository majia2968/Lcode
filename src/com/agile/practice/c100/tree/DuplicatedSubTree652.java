package com.agile.practice.c100.tree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class DuplicatedSubTree652 {

	public static void main(String[] args) {
        BinaryTree  bt = new BinaryTree();
        Node node = bt.buildTree();
        bt.printTree(node);
		Map<String, List<Node>> map = new HashMap<String, List<Node>>();
        List<Node> dups = new ArrayList<Node>();
        serialize(node, map);
		System.out.println(map.size());
        for (Entry<String, List<Node>> group : map.entrySet()) {
//        	for (Node name : group.getKey()) {
//        		System.out.println(name.data);
//        		}
            System.out.println(group.getKey());
        }
	}
    
    public static List<Node> findDuplicateSubtrees(Node root) {
        Map<String, List<Node>> map = new HashMap<String, List<Node>>();
        List<Node> dups = new ArrayList<Node>();
        serialize(root, map);
        for (List<Node> group : map.values()) {
            if (group.size() > 1) dups.add(group.get(0));
        }
        return dups;
    }

    private static String serialize(Node node, Map<String, List<Node>> map) {
    	if (node == null) return "";
        String s = "(" + serialize(node.left, map) + node.data + serialize(node.right, map) + ")";
        if (!map.containsKey(s)) map.put(s, new ArrayList<Node>());
        map.get(s).add(node);
        return s;
    }

}
