package study.Thread;

/**
 * @BelongsProject: MY_STUDY_LIFE
 * @BelongsPackage: study.Thread
 * @Author: keer
 * @CreateTime: 2020-02-27 14:54
 * @Description:
 */
public class ThreadWait {
    final static Object person =new Object();
    public static class T1 extends Thread{
        public void run(){
            synchronized (person){
                System.out.println("T1 come");
                try{
                    System.out.println("T1 wait");
                    person.wait();
                }catch (InterruptedException r){
                    r.getStackTrace();
                }
                System.out.println("T1 over");
                person.notify();
                try{
                    Thread.sleep(2000);
                }catch (InterruptedException r){
                    r.getStackTrace();
                }
            }
        }
    }
    public static class T2 extends Thread{
        public void run(){
            synchronized (person){
                System.out.println("T2 come");
                person.notify();
                System.out.println("T2 over");
                try{
                    Thread.sleep(2000);
                }catch (InterruptedException r){
                    r.getStackTrace();
                }

            }
        }
    }
    public static class T3 extends Thread{
        public void run(){
            synchronized (person){
                System.out.println("T3 come");
                try{
                    System.out.println("T3 wait");
                    person.wait();
                }catch (InterruptedException r){
                    r.getStackTrace();
                }
                System.out.println("T3 over");
                person.notify();
                try{
                    Thread.sleep(2000);
                }catch (InterruptedException r){
                    r.getStackTrace();
                }
            }
        }
    }
    public static void main(String args[]) {
        try {
            Thread thread1 = new T1();
            Thread thread2 = new T2();
            Thread thread3 = new T3();
            thread1.start();
            thread2.start();
            thread3.start();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
