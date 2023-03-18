//龟兔赛跑
public class test5 implements Runnable{

    public  String winner;
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {

            if(Thread.currentThread().getName() == "兔子"){
                try {
                    Thread.sleep(5);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            //判断比赛是否结束
            Boolean flag = gomeOver(i);
            if (flag){
                break;
            }else {
                System.out.println(Thread.currentThread().getName() + "跑了" + i + "米");
            }
        }
    }

    //判断比赛是否结束
    private boolean gomeOver(int step){
        //判断是否有胜利者
        if (winner != null){
            return true;
        }else {
            if (step == 99) {
                winner = Thread.currentThread().getName();
                System.out.println(winner+"!!!!!!!!");
                return true;
            }else return false;
        }
    }

    public static void main(String[] args) {
        test5 t = new test5();
        new Thread(t,"乌龟").start();
        new Thread(t,"兔子").start();
    }
}
