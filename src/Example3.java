/**
 * Created with IntelliJ IDEA.
 *
 * @author : cunyu
 * @version : 1.0
 * @email : 747731461@qq.com
 * @公众号 : 村雨遥
 * @website : https://cunyu1943.github.io
 * @date : 2021/6/1 13:53
 * @project : Java 编程实例
 * @package : PACKAGE_NAME
 * @className : Example3
 * @description :
 */

public class Example3 {
    public static void main(String[] args) {
        System.out.println("水仙花数：");
        for (int i = 100; i < 1000; i++) {
//            个位
            int one = i % 10;
//            十位
            int ten = i % 100 / 10;
//            百位
            int hundred = i / 100;
//            计数
            int count = 0;
            if (one * one * one + ten * ten * ten + hundred * hundred * hundred == i) {
                count++;
//                打印水仙花数，每 5 个换行输出
                System.out.print(i + "\t");
                if (count % 5 == 0) {
                    System.out.println();
                }
            }
        }
    }
}
