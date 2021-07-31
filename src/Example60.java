import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : 村雨
 * @version : 1.0
 * @project : Java 编程实例
 * @package : PACKAGE_NAME
 * @className : Example60
 * @createTime : 2021/7/4 10:00
 * @email : 747731461@qq.com
 * @公众号 : 村雨遥
 * @website : https://cunyu1943.github.io
 * @description :
 */
public class Example60 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("输入月份");
        int month = scanner.nextInt();

        switch (month) {
            case 3:
            case 4:
            case 5:
                System.out.println(month + " 月是春季");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println(month + " 月是夏季");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println(month + " 月是秋季");
                break;
            case 12:
            case 1:
            case 2:
                System.out.println(month + " 月是冬季");
                break;
            default:
                break;
        }
    }
}
