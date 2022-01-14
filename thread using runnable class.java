public class MyRunThread implements Runnable{
 
    public static int myCount = 0;
    public MyRunThread(){
         
    }
    public void run() {
        while(MyRunThread.myCount <= 10){
            try{
                System.out.println("Expl Thread: "+(++MyRunThread.myCount));
                Thread.sleep(100);
            } catch (InterruptedException iex) {
                System.out.println("Exception in thread: "+iex.getMessage());
            }
        }
    } 
    public static void main(String a[]){
        System.out.println("Starting Main Thread...");
        MyRunThread mrt = new MyRunThread();
        Thread t = new Thread(mrt);
        t.start();
        while(MyRunThread.myCount <= 10){
            try{
                System.out.println("Main Thread: "+(++MyRunThread.myCount));
                Thread.sleep(100);
            } catch (InterruptedException iex){
                System.out.println("Exception in main thread: "+iex.getMessage());
            }
        }
        System.out.println("End of Main Thread...");
    }
}
