import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 *
 * @Package : PACKAGE_NAME
 * @ClassName : Example73.java
 * @CreateTime : 2022/4/1 23:12
 * @Version : 1.0
 * @Author : 村雨
 * @Email : 747731461@qq.com
 * @公众号 : 村雨遥
 * @Website : https://cunyu1943.github.io
 * @Description :
 */
public class Example73 {
    public static final double PI = 3.141526;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入圆半径 r，圆柱高 h");
        float r = scanner.nextFloat();
        float h = scanner.nextFloat();
        System.out.format("圆周长：%.2f\n", 2 * PI * r);
        System.out.format("圆面积：%.2f\n", PI * r * r);
        System.out.format("圆球表面积：%.2f\n", 4 * PI * r * r);
        System.out.format("圆球体积：%.2f\n", 4 / 3 * PI * r * r * r);
        System.out.format("圆柱体积：%.2f\n", h * PI * r * r);
    }
}
