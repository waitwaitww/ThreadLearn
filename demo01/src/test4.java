//多线程同时操作同一个对象

//问题：多个线程操控同一个资源的情况下，线程不安全
public class test4 implements Runnable{
    private int ticketNum = 10;

    @Override
    public void run() {
        while (true){
            if (ticketNum <= 0){
                break;
            }
            //Thread.currentThread().getName()获取当前线程名
            System.out.println(Thread.currentThread().getName()+"第"+ticketNum--);
        }
    }

    public static void main(String[] args) {
        test4 t = new test4();
        new Thread(t,"小红").start();
        new Thread(t,"小兰").start();
        new Thread(t,"小明").start();
    }
}
