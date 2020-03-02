package study.Thread;

/**
 * @BelongsProject: MY_STUDY_LIFE
 * @BelongsPackage: study.Thread
 * @Author: keer
 * @CreateTime: 2020-02-27 14:43
 * @Description:
 */
public class ThreadJoin {
    public static void main(String[] args) throws InterruptedException {
        long startTime = System.currentTimeMillis();
        Thread t1=new Thread(new CollectRunnable("线程1",5000));
        Thread t2=new Thread(new CollectRunnable("线程2",2000));
        Thread t3=new Thread(new CollectRunnable("线程3",1000));
        t1.start();
        t2.start();
        t3.start();
        t1.join();
        t2.join();
        t3.join();
        System.out.println("采集完成,消耗 " + (System.currentTimeMillis() - startTime));
    }
}

class CollectRunnable implements Runnable {
    private String name;
    private long spendTime;

    public CollectRunnable(String name, long spendTime) {
        this.name = name;
        this.spendTime = spendTime;
    }

    @Override
    public void run() {
        try {
            System.out.println("线程" + name + "开始采集");
            Thread.sleep(spendTime);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}