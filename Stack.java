//Myles Spencer
public class Stack{ 
   static int[] simpleArray;
   static int index=0;
   static int num=0;
   public static void main(String[] args){
      
      Stack.push(2);
      Stack.push(1);
      Stack.dumpstack(); 
      Stack.push(3); 
      Stack.push(10); 
      Stack.pop(); 
      Stack.push(15);
      Stack.dumpstack();
      Stack.pop();
      Stack.pop();
      Stack.dumpstack();
      Stack.pop();
      Stack.pop();
      Stack. pop();
      Stack.dumpstack();
   }
//methods
   public static void push(int a){
      if(simpleArray==null){
         simpleArray = new int[10];
         simpleArray[index]=a;
      }else{
         simpleArray[index]=a;
         //System.out.println(simpleArray[index]);
      }
      index++;
      num++;
   }

   public static void pop(){
      if(simpleArray == null){
         System.out.println("Nothing here");
      }
      else{
         if(num <= 0){
            System.out.println("Cannot pop.No elements in array.");
         }
         else{
            index--; 
            num--;
         }
      }
   } 


   public static void dumpstack(){
      if(num>0){
         for(int i = 0; i < index; i++){
            System.out.print(simpleArray[i]);
            System.out.print("|");
         }
         System.out.println("");
      }else{
         System.out.println("No elements in the array");
      }
   }
}


