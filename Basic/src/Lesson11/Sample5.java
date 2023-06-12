package Lesson11;

class Car5
{
    protected int num;
    protected double gas;

    public Car5()
    {
        num = 0;
        gas = 0.0;
        System.out.println("車を作成しました");
    }
    public void setCar(int n, double g)
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
class RacingCar extends Car5
{
    private int course;

    public RacingCar()
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

class Sample5
{
    public static void main(String[] args)
    {
        Car5 car5;
        car5 = new RacingCar();

        car5.setCar(1234, 20.5);

        car5.show();
    }
}