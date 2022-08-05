//Myles Spencer
public class StackviaLinkList{
public static Node head = null;
public static void main(String [] args){
 push(2);
 push(1);
 dumpstack();
 push(3);
 push(10);
 pop();
 push(15);
 dumpstack();
 pop();
 pop();
 dumpstack();
 pop();
 pop();
 pop();
dumpstack();
}

public static void push(int val){ 
   Node temp = new Node(val,head);
    head = temp;
    

}

 public static void pop(){
     if(head == null){
         System.out.println("There is nothing in the stack");
    } 
     else{
      head = head.nextNode;
     }
 }
 
 public  static void dumpstack(){
     if(head == null){
         System.out.println("Empty Stack"); 
    }
     else{
     Node pntr = head;
     while(pntr != null){
         System.out.print(pntr.value);
         pntr = pntr.nextNode;
         System.out.print("|");
       
                 }
                   System.out.println();
             }
         }
     }



 








