/**
 * Created with IntelliJ IDEA.
 *
 * @author : cunyu
 * @version : 1.0
 * @email : 747731461@qq.com
 * @公众号 : 村雨遥
 * @website : https://cunyu1943.github.io
 * @date : 2021/6/2 16:46
 * @project : Java 编程实例
 * @package : PACKAGE_NAME
 * @className : Example11
 * @description :
 */

public class Example11 {
    public static void main(String[] args) {
        int count = 0;
        System.out.println("组成的三位数是：");
        for (int i = 1; i < 5; i++) {
            for (int j = 1; j < 5; j++) {
                if (i != j) {
                    for (int k = 1; k < 5; k++) {
                        if (i != k && j != k) {
                            count++;
                            System.out.print((i * 100 + j * 10 + k) + "\t");
                            if (count % 5 == 0) {
                                System.out.println();
                            }
                        }
                    }
                }
            }
        }

        System.out.println("\n共有 " + count + " 个不重复的三位数");
    }
}
