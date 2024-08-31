/* Hidden stub code will pass a root argument to the function below. Complete the function to solve the challenge. Hint: you may want to write one or more helper functions.  

The Node class is defined as follows:
    class Node {
        int data;
        Node left;
        Node right;
     }
*/
    boolean checkBST(Node root) {
        List<Integer> val = new LinkedList<>();
        inOrdert(root,val);
        int prev = val.get(0);
        boolean isbst = true;
        for(int i=1;i<val.size();i++){
            if(val.get(i)<=prev){
                isbst = false;
            }
            prev = val.get(i);
        }
        return isbst;
    }
 void inOrdert(Node node,List<Integer> val){
     if(node==null){
         return;
     }
     inOrdert(node.left,val);
     val.add(node.data);
     inOrdert(node.right,val);
 }
    
