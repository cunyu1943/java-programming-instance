/**
 * Created with IntelliJ IDEA.
 *
 * @author : cunyu
 * @version : 1.0
 * @email : 747731461@qq.com
 * @公众号 : 村雨遥
 * @website : https://cunyu1943.github.io
 * @date : 2021/6/4 10:48
 * @project : Java 编程实例
 * @package : PACKAGE_NAME
 * @className : Example27
 * @description :
 */

public class Example27 {
    public static void main(String[] args) {
//        默认是素数
        boolean flag = false;
        int count = 0;

        System.out.println("100 内的素数：");
        for (int i = 2; i < 100; i++) {
            for (int j = 2; j <= Math.sqrt(i); j++) {
//                能除尽，则表示不是素数，跳出当次内循环
                if (i % j == 0) {
                    flag = true;
                    break;
                } else {
                    flag = false;
                }
            }
//            如果是素数，则打印并计数，然后每行打印 5 个
            if (flag == false) {
                count++;
                System.out.print(i + "\t");
                if (count % 5 == 0) {
                    System.out.println();
                }
            }

        }
    }
}
