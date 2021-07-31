/**
 * Created with IntelliJ IDEA.
 *
 * @author : cunyu
 * @version : 1.0
 * @email : 747731461@qq.com
 * @website : https://cunyu1943.github.io
 * @date : 2021/6/7 15:20
 * @project : Java 编程实例
 * @package : PACKAGE_NAME
 * @className : Example43
 * @description :
 */

public class Example43 {
    /*
     * 求0—7所能组成的奇数个数
     * 分析：在0-7中组成的数0不能开头所以数为一位数时奇数有1，3，5，7
     * 二位数时奇数有4*7
     * 三位数一直到8位数是前面奇数个数*8
     */
    //0到7有8个数，但是最高位是7位，0不能放在开头
    public static void main(String[] args) {
        int count = 0;
        int sum = 0;
        for (int i = 1; i < 9; i++) {
            if (i == 1) {
                count = 4;
            } else if (i == 2) {
                count *= 7;
            } else {
                count *= 8;
            }
            sum += count;
            System.out.println("0 - 7 组成的 " + i + " 位奇数个数：" + sum);
        }
        System.out.println("共组成的奇数个数：" + sum);
    }
}
