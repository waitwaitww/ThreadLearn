
//创建线程方法2：实现runnable接口，重写run方法，执行线程时需要将runnable接口实现类丢入start中运行
public class demo02 implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println("啊啊啊"+i);
        }
    }

    public static void main(String[] args) {
        //创建runnable实现类对象
        demo02 demo02 = new demo02();

        new Thread(demo02).start();


        for (int i = 0; i < 20; i++) {
            System.out.println("哈哈哈"+i);
        }
        //main线程
    }
}
