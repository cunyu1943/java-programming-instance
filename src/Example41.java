/**
 * Created with IntelliJ IDEA.
 *
 * @author : cunyu
 * @version : 1.0
 * @email : 747731461@qq.com
 * @website : https://cunyu1943.github.io
 * @date : 2021/6/7 14:55
 * @project : Java 编程实例
 * @package : PACKAGE_NAME
 * @className : Example41
 * @description :
 */

public class Example41 {
    public static void main(String[] args) {

        // 关于index，可以从1开始，但是我们知道桃子数一定是要大于5的，所以从6开始
        int index = 6;
        // 一直找，一直找
        while (true) {
            // 对于每一个index都调用finds()方法来判断其是否符合条件
            boolean finds = finds(index);
            // 如果符合条件，则输出结果，并且终止循环
            if (finds) {
                System.out.println("海滩上最少有 " + index + " 个桃子。");
                break;
            }
            // 6除以5余1，那么步进就得是5，因为1~4得到的余数分别为2，3，4，0，当然，步进为1也是ok，就是效率低了些。
            index += 5;
        }


    }

    /**
     * 定义一个判断数字是否符合条件，符合就返回一个true，否则返回false
     * 所谓条件就是该数每次计算之间，num值一定要大于5，不然怎么分五份呢是不？
     *
     * @param num
     * @return
     */
    public static boolean finds(int num) {
        // 定义要返回的布尔值
        boolean flag = false;
        // 有5只猴子，判断5次
        for (int i = 1; i <= 5; i++) {
            // 判断num是否大于5，要是还没到第五只猴子呢就不足五个桃子了，那第五只猴子要生气了，并且判断该数是否除5余1
            if (num > 5 && num % 5 == 1) {
                // 判断是不是最后一只猴子，如果到最后一直猴子了，且符合条件，就返回true，表明找到了该数。
                if (i == 5) {
                    flag = true;
                } else {
                    // 如果不是最后一只猴子，那么该猴子丢掉一个，且拿走五分之一，剩下原来桃子数-1的4/5
                    num = ((num - 1) * 4) / 5;
                }
            } else {
                // 如果该数小于5导致没法分了，或者不符合最后能丢掉一个的条件，直接返回false
                return false;
            }
        }
        return flag;
    }
}
