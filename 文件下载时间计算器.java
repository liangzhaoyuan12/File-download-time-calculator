//原理：先获知用户输入的单位，将所有大小单位变换为字节
//速度也是一样，将所有变成B/S
//变量名字解释：shijian为最后计算出的时间的结果；shujvliang为用户输入带单位的文件大小，后全部转化为字节量zijieliang进行计算；
//用户输入sudu，全部转化为sududaxiao（B/S）
import java.util.Scanner;
public class 文件下载时间计算器
{
    static double zijieliang;
    static double shijian;

    public static double A(double shujvliang, double sudo)
    {
        double zijieliang=shujvliang*1024*1024*1024*1024;
        double shijian=zijieliang/sudo;
        System.out.println("以下结果单位为秒");
        return shijian;
    }
    public static double B(double shujvliang,double sudo)
    {
        double zijieliang=shujvliang*1024*1024*1024;
        double shijian=zijieliang/sudo;
        System.out.println("以下结果单位为秒");
        return shijian;
    }
    public static double C(double shujvliang,double sudo)
    {
        double zijieliang = shujvliang * 1024 * 1024;
        double shijian = zijieliang / sudo;
        System.out.println("以下结果单位为秒");
        return shijian;
    }
    public static double D(double shujvliang,double sudu)
    {
        double zijieliang = shujvliang * 1024;
        double shijian = zijieliang / sudu;
        System.out.println("以下结果单位为秒");
        return shijian;
    }
    public static double E(double shujvliang,double sudu)
    {
        double zijieliang = shujvliang;
        double shijian = zijieliang / sudu;
        System.out.println("以下结果单位为秒");
        return shijian;
    }
    public static void main(String args[])
    {
        System.out.println("请选择您输入的文件大小的单位");
        System.out.println("1.TB       2.GB        3.MB        4.KB        5.B");
        Scanner sc=new Scanner(System.in);
        int xvanze=sc.nextInt();
        System.out.println("请输入数据大小（仅限于数字）");
        double shujvliang= sc.nextDouble();
        System.out.println("请输入目测平均下载速度单位");
        System.out.println("1.TB/s       2.GB/s        3.MB/s        4.KB/s        5.B/s");
        int xvanze2= sc.nextInt();
        System.out.println("请输入目测平均下载速度大小（仅限于数字）");
        double sududaxiao= sc.nextDouble();
        double sudu=1;
        switch (xvanze2)
        {
            case 1:
                sudu = sududaxiao * 1024 * 1024 * 1024 * 1024;
                break;
            case 2:
                sudu=sududaxiao*1024*1024*1024;
                break;
            case 3:
                sudu=sududaxiao*1024*1024;
                break;
            case 4:
                sudu=sududaxiao*1024;
                break;
            case 5:
                sudu=sududaxiao;
                break;
        }
        switch (xvanze)
        {
            case 1:
                System.out.println(A(shujvliang,sudu));
                break;
            case 2:
                System.out.println(B(shujvliang,sudu));
                break;
            case 3:
                System.out.println(C(shujvliang,sudu));
                break;
            case 4:
                System.out.println(D(shujvliang,sudu));
                break;
            case 5:
                System.out.println(E(shujvliang,sudu));
                break;
        }
    }
}
