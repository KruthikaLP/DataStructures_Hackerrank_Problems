import java.util.*;
import java.io.*;

class Node {
    Node left;
    Node right;
    int data;
    
    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

class Solution {

	/* 
    
    class Node 
    	int data;
    	Node left;
    	Node right;
	*/
	public static void topView(Node root) {
        Queue<Node> q = new LinkedList<>();
        TreeMap<Integer,Integer> map = new TreeMap<>();
        if(root==null) return;
        q.add(root);
        int hb =0;
        while(!q.isEmpty()){
            Node node = q.poll();
            if(!map.containsKey(hb)){
                map.put(hb, node.data);
            }
            if(node.left!=null){
                q.add(node.left);
                hb--;
            }
            if(node.right!=null){
                q.add(node.right);
                    hb++;
                }
            }
            for(Integer value : map.values()){
                System.out.print(value+" ");
            }
        }

	public static Node insert(Node root, int data) {
        if(root == null) {
            return new Node(data);
        } else {
            Node cur;
            if(data <= root.data) {
                cur = insert(root.left, data);
                root.left = cur;
            } else {
                cur = insert(root.right, data);
                root.right = cur;
            }
            return root;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        Node root = null;
        while(t-- > 0) {
            int data = scan.nextInt();
            root = insert(root, data);
        }
        scan.close();
        topView(root);
    }	
}
