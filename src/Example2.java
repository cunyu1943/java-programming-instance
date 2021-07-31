/**
 * Created with IntelliJ IDEA.
 *
 * @author : cunyu
 * @version : 1.0
 * @email : 747731461@qq.com
 * @公众号 : 村雨遥
 * @website : https://cunyu1943.github.io
 * @date : 2021/6/1 13:30
 * @project : Java 编程实例
 * @package : PACKAGE_NAME
 * @className : Example2
 * @description :
 */

public class Example2 {
    public static void main(String[] args) {
//        素数个数
        int count = 0;
        System.out.println("100 ~ 200 之间的素数：");
        for (int i = 100; i <= 200; i++) {
//            默认非素数
            boolean isPrime = false;
            for (int j = 2; j <= (int) Math.sqrt(i); j++) {
//                一旦能除尽，则说明不是素数，直接跳出循环
                if (i % j == 0) {
                    isPrime = true;
                    break;
                }
            }
//            如果是素数，则素数个数 + 1，然后打印出该素数
            if (isPrime == false) {
                count++;
                System.out.print(i + "\t");
//                每行打印 5 个素数，
                if (count % 5 == 0) {
                    System.out.println();
                }
            }
        }

        System.out.println("\n素数总个数：" + count);
    }
}
