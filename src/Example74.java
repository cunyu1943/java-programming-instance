import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 *
 * @Package : PACKAGE_NAME
 * @ClassName : Example74.java
 * @CreateTime : 2022/4/1 23:12
 * @Version : 1.0
 * @Author : 村雨
 * @Email : 747731461@qq.com
 * @公众号 : 村雨遥
 * @Website : https://cunyu1943.github.io
 * @Description :
 */
public class Example74 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入 x");
        int x = scanner.nextInt();
        if (x < 1) {
            System.out.format("x = %d，y = %d\n", x, x);
        } else if (x < 10) {
            System.out.format("x = %d，y = %d\n", x, 2 * x - 1);
        } else {
            System.out.format("x = %d，y = %d\n", x, 3 * x - 11);
        }

    }
}
