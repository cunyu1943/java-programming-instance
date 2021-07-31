/**
 * Created with IntelliJ IDEA.
 *
 * @author : cunyu
 * @version : 1.0
 * @email : 747731461@qq.com
 * @公众号 : 村雨遥
 * @website : https://cunyu1943.github.io
 * @date : 2021/6/2 16:36
 * @project : Java 编程实例
 * @package : PACKAGE_NAME
 * @className : Example9
 * @description :
 */

public class Example9 {
    public static void main(String[] args) {
        System.out.println("1000 以内的完数：");
        int count = 0;
        for (int i = 1; i <= 1000; i++) {
            if (check(i)) {
                count++;
                System.out.print(i + "\t");
            }
        }
        System.out.println("\n1000 以内的完数个数：" + count);
    }

    /**
     * 判断一个数是否为完数
     *
     * @param num
     * @return true 完数；false 非完数
     */
    public static boolean check(int num) {
        int sum = 0;
//        求 num 的各个因子并求和
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }

//        判断各个因子之和是否等于该数
        if (sum == num) {
            return true;
        }

        return false;
    }
}
