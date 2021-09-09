
package Thread;


public class Main {
    
    public static void main(String[] args) {
      
//        MyThread t = new MyThread();
//        t.start();
//        
//        for(int i=0;i<10;i++){
//            System.out.println("Inside the main thread"+i);
//        }
//        
        
        MyRunnable r = new MyRunnable();
        Thread t = new Thread(r );
        t.start();
        
        for(int i=0;i<10;i++){
            System.out.println("Inside the main thread"+i);
        }
    }
    
}
