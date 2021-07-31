import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : cunyu
 * @version : 1.0
 * @email : 747731461@qq.com
 * @公众号 : 村雨遥
 * @website : https://cunyu1943.github.io
 * @date : 2021/6/1 22:10
 * @project : Java 编程实例
 * @package : PACKAGE_NAME
 * @className : Example5
 * @description :
 */

public class Example5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入成绩");
        int score = scanner.nextInt();
        char grade;
        grade = score >= 90 ? 'A' : score >= 60 ? 'B' : 'C';
        System.out.println("等级为：" + grade);
    }
}
