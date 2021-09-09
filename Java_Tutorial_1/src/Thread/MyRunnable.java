
package Thread;


public class MyRunnable implements Runnable {

    @Override
    public void run() {
        for(int i=0;i<10;i++){
            System.out.println("Inside the child thread Runnable"+i);
        }
    }
    
}
