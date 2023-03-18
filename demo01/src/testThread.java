
//创建线程方式一：继承thread类， 重写run方法，调用start开启线程
public class testThread extends Thread{

    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println("啊啊啊"+i);
        }
    }

    public static void main(String[] args) {
        //创建线程对象
        testThread thread = new testThread();
        //调用start()方法开启线程
        thread.start();

        for (int i = 0; i < 20; i++) {
            System.out.println("哈哈哈"+i);
        }
        //main线程
    }
}
