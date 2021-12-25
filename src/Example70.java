import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : 村雨遥
 * @version : 1.0
 * @project : Java 编程实例
 * @package : PACKAGE_NAME
 * @className : Example70
 * @createTime : 2021/12/25 17:16
 * @email : 747731461@qq.com
 * @微信 : cunyu1024
 * @公众号 : 村雨遥
 * @网站 : https://cunyu1943.github.io
 * @description :
 */
public class Example70 {
    public static void main(String[] args) {
        int[][] matrix = new int[5][5];
        Scanner scanner = new Scanner(System.in);
        //初始化数组
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.println("请输入 matrix[" + i + "][" + j + "]");
                matrix[i][j] = scanner.nextInt();
            }
        }

        int maxY = 0;
        int maxX = 0;
        for (int i = 0; i < 5; i++) {
            maxX = matrix[i][0];
            boolean flag = true;
            // 求第 i 行最大值 maxX
            for (int j = 1; j < 5; j++) {
                if (maxX < matrix[i][j]) {
                    maxX = matrix[i][j];
                    maxY = j;
                }
            }

            for (int j = 1; j < 5; j++) {
                if (maxX < matrix[j][maxY]) {
                    {
                        flag = false;
                        break;
                    }
                }
            }
            if (flag) {
                System.out.println("靶点位置：matxix[" + i + "][" + maxY + "]:" + maxX);
            }
        }
    }
}
