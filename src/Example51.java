import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : 村雨
 * @version : 1.0
 * @Project : Java 编程实例
 * @Package : PACKAGE_NAME
 * @ClassName : Example51
 * @createTime : 2021/6/25 23:40
 * @Email : 747731461@qq.com
 * @公众号 : 村雨遥
 * @Website : https://cunyu1943.github.io
 * @Description :
 */
public class Example51 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入圆柱体半径");
        float radius = scanner.nextFloat();
        System.out.println("输入圆柱体高");
        float height = scanner.nextFloat();

        Cylinder cylinder = new Cylinder();
        System.out.println("底面积：" + cylinder.area(radius));
        System.out.println("体积：" + cylinder.volume(radius, height));

    }
}

class Cylinder {
    final double PI = 3.14;
    // 半径
    float radius;
    // 高
    float height;

    /**
     * 求圆柱体的底面积
     *
     * @param radius 半径
     * @return 圆柱体底面积
     */
    public double area(float radius) {
        return PI * radius * radius;
    }

    /**
     * 求圆柱体体积
     *
     * @param radius 半径
     * @param height 高度
     * @return 圆柱体体积
     */
    public double volume(float radius, float height) {
        return height * area(radius);
    }
}