import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : cunyu
 * @version : 1.0
 * @email : 747731461@qq.com
 * @公众号 : 村雨遥
 * @website : https://cunyu1943.github.io
 * @date : 2021/6/3 9:39
 * @project : Java 编程实例
 * @package : PACKAGE_NAME
 * @className : Example14
 * @description :
 */

public class Example14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year = 0;
        int month = 0;
        int day = 0;
        System.out.println("输入年：");
        year = scanner.nextInt();
        System.out.println("输入月：");
        month = scanner.nextInt();
        System.out.println("输入日：");
        day = scanner.nextInt();

        // 判断是否是闰年
        // GregorianCalendar:判断年份是否是闰年的方法
        GregorianCalendar gre = new GregorianCalendar();
        // 返回true:是闰年，false：不是闰年
        boolean isLeapYear = gre.isLeapYear(year);

//        2 月份的天数
        int feb = isLeapYear ? 29 : 28;

        int dayOfYear = 0;

        switch (month) {

            case 1:
                dayOfYear = day;
                break;
            case 2:
                dayOfYear = 31 + day;
                break;
            case 3:
                dayOfYear = 31 + feb + day;
                break;
            case 4:
                dayOfYear = 31 + feb + 31 + day;
                break;
            case 5:
                dayOfYear = 31 + feb + 31 + 30 + day;
                break;
            case 6:
                dayOfYear = 31 + feb + 31 + 30 + 31 + day;
                break;
            case 7:
                dayOfYear = 31 + feb + 31 + 30 + 31 + 30 + day;
                break;
            case 8:
                dayOfYear = 31 + feb + 31 + 30 + 31 + 30 + 31 + day;
                break;
            case 9:
                dayOfYear = 31 + feb + 31 + 30 + 31 + 30 + 31 + 31 + day;
                break;
            case 10:
                dayOfYear = 31 + feb + 31 + 30 + 31 + 30 + 31 + 31 + 30 + day;
                break;
            case 11:
                dayOfYear = 31 + feb + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + day;
                break;
            case 12:
                dayOfYear = 31 + feb + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30 + day;
                break;

            default:
                System.out.println("月份输入错误");
                break;
        }
        System.out.println("这一天是这一年的第 " + dayOfYear + " 天!");

    }
}

