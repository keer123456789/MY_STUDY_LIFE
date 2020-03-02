package study.Thread;

/**
 * @BelongsProject: MY_STUDY_LIFE
 * @BelongsPackage: study.Thread
 * @Author: keer
 * @CreateTime: 2020-02-27 14:06
 * @Description:
 */
public class ThreadStart {
    public static void main(String[] args) throws InterruptedException {
        Thread t=new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("线程");
            }
        });
        t.start();
        System.out.println("主线程");
    }
}
