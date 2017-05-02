class Multitasking extends Thread{  
 public void run(){  
   System.out.println("task one");  
 }  
 public static void main(String args[]){  
  Multitasking t1=new Multitasking();  
  Multitasking t2=new Multitasking();  
  Multitasking t3=new Multitasking();  
  
  t1.start();  
  t2.start();  
  t3.start();  
 }  
}  