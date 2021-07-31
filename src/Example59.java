import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : 村雨
 * @version : 1.0
 * @project : Java 编程实例
 * @package : PACKAGE_NAME
 * @className : Example59
 * @createTime : 2021/7/4 9:46
 * @email : 747731461@qq.com
 * @公众号 : 村雨遥
 * @website : https://cunyu1943.github.io
 * @description :
 */
public class Example59 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入体重 kg");
        float weight = scanner.nextFloat();
        System.out.println("输入身高 m");
        float height = scanner.nextFloat();
        System.out.println("BMI = " + calcBMI(height, weight));
    }

    public static double calcBMI(float height, float weight) {
        return weight / height / height;
    }
}
