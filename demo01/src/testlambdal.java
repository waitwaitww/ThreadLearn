
//推到lambda表达式
public class testlambdal {

    //静态内部类
    static class Like2 implements Ilike{

        @Override
        public void Lambda() {
            System.out.println("i like lambda2");
        }
    }

    public static void main(String[] args) {
        Ilike ilike = new Like();
        ilike.Lambda();
        ilike = new Like2();
        ilike.Lambda();
        //局部内部类
        class Like3 implements Ilike{

            @Override
            public void Lambda() {
                System.out.println("i like lambda3");
            }
        }
        ilike = new Like3();
        ilike.Lambda();

        //匿名内部类
        ilike = new Ilike() {
            @Override
            public void Lambda() {
                System.out.println("i like lambda4");
            }
        };
        ilike.Lambda();

        //lambda简化
        ilike=()-> { System.out.println("i like lambda5"); };
        ilike.Lambda();

    }}
//函数式接口
interface Ilike{
    void Lambda();
}

class Like implements Ilike{

    @Override
    public void Lambda() {
        System.out.println("i like lambda");
    }
}
