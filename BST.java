public class BST{
   static Node root;
   public static void main(String[] args){ 
   insert(20);
  }


   public static void insert(int val){
      Node a = new Node(value,left,right);
      Node pntr = root;
      Node holder = null;
      while(pntr != null){
         holder = pntr;
         if(val < pntr.value){
            pntr=pntr.left; 
         }
         else {pntr = pntr.right;}
      }
     
      if(holder == null){
         holder = new Node(val,left,right);
      }
      else if(holder.value < holder.val){
         holder.left = new Node(val,left,right);
      }
      else{
         holder.right = new Node(val,left,right);
      }
   }
      public void delete(){
      
      
      }
      
      
     public void dumptree(){
     if(root == null){
      System.out.println("Nothing here");
      else{
        node pntr = root;
        while(pntr != root){
           System.out.print(val);
           pntr = pntr.left;
           
        }
           
      }
     }
     
     
     } 
}
  class Node{
      Node left, right;
      int value;
   
      public Node(int val, Node left, Node right){
         left = null;
         right = null;
         value = val;
      }         
   }

