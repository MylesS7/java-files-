//Myles Spencer
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
class Counter {
   int count;
   public synchronized void incr () { count++; }
   public int count () { return count; }
}

class Main {
   
   public static boolean isPrime(int num) {
      int half = num/2;
      if (num%2==0) {
         return false;
      } else {
         for(int i=3; i<=half; i+=2) {
            if (num%i==0) { 
               return false; }
         }
      }
      return true;
   } 
   
  
   public static void main(String[] args)throws InterruptedException {
      Counter threadCount = new Counter();
      int from=1000000, to=2000000;
      Thread q1 = new Thread(new Runnable(){
            public void run(){
               for (int i=(from+1); i<=to; i+=8){
                  if(isPrime(i)) { threadCount.incr(); }
               }
            }
         });
   
      Thread q2 = new Thread(
         new Runnable(){
            public void run(){
               for (int i=(from+3); i <=to; i+=8){
                  if(isPrime(i)) { threadCount.incr(); }
               }
            }
         });
         
      Thread q3 = new Thread(
         new Runnable(){
            public void run(){
               for (int i=(from+5); i <=to; i+=8){
                  if(isPrime(i)) { threadCount.incr(); }
               }
            }
         });
   
      Thread q4 = new Thread(
         new Runnable(){
            public void run(){
               for (int i=(from+7); i <=to; i+=8){
                  if(isPrime(i)) { threadCount.incr(); }
               }
            }
         });
   
      LocalDateTime threadStart = LocalDateTime.now();
      q1.start();
      q2.start();
      q3.start();
      q4.start();
   
      q1.join();
      q2.join();
      q3.join();
      q4.join();
      int threadDuration = (int) threadStart.until(LocalDateTime.now(),ChronoUnit.MILLIS);
      int threadSec=threadDuration/1000, threadMilli=threadDuration%1000;
 
      
   
      LocalDateTime serialStart = LocalDateTime.now();
      int serialCount = 0;
      for (int i=(from+1); i<to; i+=2){
         if(isPrime(i)) { serialCount++; }
      }
      int serialDuration = (int) serialStart.until(LocalDateTime.now(),ChronoUnit.MILLIS);
      int serialSec=serialDuration/1000, serialMilli=serialDuration%1000;
 

      
      System.out.print("4 threads implementation found "+threadCount.count());
      System.out.print(" prime numbers, between "+from+" to "+to);
      System.out.println(", in "+threadSec+"s"+threadMilli+"ms");
      System.out.print("Serial implementation found "+serialCount);
      System.out.print(" prime numbers, between "+from+" to "+to);
      System.out.println(", in "+serialSec+"s"+serialMilli+"ms");
     
   }
}