import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : zhangliang
 * @version : 1.0
 * @project : Java 编程实例
 * @package : PACKAGE_NAME
 * @className : Example64
 * @createTime : 2021/9/28 15:39
 * @email : 747731461@qq.com
 * @公众号 : 村雨遥
 * @website : https://cunyu1943.github.io
 * @description :
 */
public class Example64 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入分数");
        int score = scanner.nextInt();
        System.out.println("输入的分数是：" + score);
        switch (score / 10) {
            case 0:
                System.out.println("fail");
                break;
            case 1:
                System.out.println("fail");
                break;
            case 2:
                System.out.println("fail");
                break;
            case 3:
                System.out.println("fail");
                break;
            case 4:
                System.out.println("fail");
                break;
            case 5:
                System.out.println("fail");
                break;
            case 6:
                System.out.println("pass");
                break;
            case 7:
                System.out.println("pass");
                break;
            case 8:
                System.out.println("good");
                break;
            case 9:
                System.out.println("excellent");
                break;
            case 10:
                System.out.println("excellent");
                break;
            default:
                break;
        }
    }
}
