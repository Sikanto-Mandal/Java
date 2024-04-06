import java.util.*;
public class BinaryTree {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    static class BinaryTr{
        static int idx = -1;
        public static Node buildTree (int nodes[]){
            idx ++;
            if(nodes[idx]== -1){
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            
            newNode.left =buildTree(nodes); 
            newNode.right = buildTree(nodes);

            return newNode;

        }
        public static void preOrder(Node root){
            if(root == null){
                System.out.print("-1"+" ");
                return ;
            }
            System.out.print(root.data + " ");
            preOrder (root.left);
            preOrder(root.right);
        
        }

        //InOrder traversal
        public static void inOrder(Node root){
            if(root == null){
                return;
            }
            inOrder(root.left);            
            System.out.print( root.data+" ");
            inOrder(root.right);
        }
        //Post order 
        public static void postOrder(Node root){
            if(root == null){
                return;
            }
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data+" ");
        }
        //Level Order Traversals
        public static void levelOrder(Node root){
            if(root == null){
                return;
            }
            Queue<Node> q = new LinkedList<>();
                q.add(root);
                q.add(null);

                while(!q.isEmpty()){
                    Node currNode = q.remove();
                    if(currNode== null){
                        System.out.println();
                        if(q.isEmpty()){
                            break;
                        }else{
                            q.add(null);
                        }
                    }else{
                    System.out.print(currNode.data + " ");
                    if(currNode.left != null){

                        q.add(currNode.left);

                    } 
                    if(currNode.right != null){
                        q.add(currNode.right);
                    }
                }
            }
            
        }
    }
    public static void main(String[] args) {
        int nodes[] = {1,2,4,-1,-1,5,-1, -1,3,-1,6,-1,-1};

        BinaryTr tree = new BinaryTr();
        Node root = tree.buildTree(nodes);
        // System.out.println(root.data);
        // tree.preOrder(root);

        // tree.inOrder(root);
        // tree.postOrder(root);
        tree.levelOrder(root);
    }
    
}
