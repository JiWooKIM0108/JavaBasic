package Lesson11;

class Car6
{
    protected int num;
    protected double gas;

    public Car6()
    {
        num = 0;
        gas = 0.0;
        System.out.println("車を作成しました");
    }
    public void setCar6(int n, double g)
    {
        num = n;
        gas = g;

        System.out.println("ナンバーを"+num+"ガソリン量を"+gas+"にしました");
    }

    public void show()
    {
        System.out.println("車のナンバーは"+num+"です");
        System.out.println("ガソリン量は"+gas+"です");
    }
}

// レーシングカークラス
class RacingCar6 extends Car6
{
    private int course;

    public RacingCar6()
    {
        course = 0;
        System.out.println("レーシングカーを作成しました");
    }

    public void setCourse(int c)
    {
        course = c;
        System.out.println("コース番号を"+course+"にしました");
    }
    public void show()
    {
        System.out.println("レーシングカーのナンバーは"+num+"です");
        System.out.println("ガソリン量は"+gas+"です");
        System.out.println("コース番号は"+course+"です");
    }
}

class Sample6
{
    public static void main(String[] args)
    {
        Car6[] cars1;
        cars1 = new Car6[2];

        cars1[0] = new Car6();
        cars1[0].setCar6(1234, 20.5);

        cars1[1] = new RacingCar6();
        cars1[1].setCar6(1234, 20.5);

        for (int i=0; i< cars1.length; i++) {
            cars1[i].show();
        }
    }
}