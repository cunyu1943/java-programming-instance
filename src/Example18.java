/**
 * Created with IntelliJ IDEA.
 *
 * @author : cunyu
 * @version : 1.0
 * @email : 747731461@qq.com
 * @公众号 : 村雨遥
 * @website : https://cunyu1943.github.io
 * @date : 2021/6/3 13:08
 * @project : Java 编程实例
 * @package : PACKAGE_NAME
 * @className : Example18
 * @description :
 */

public class Example18 {
    static char[] teamA = {'a', 'b', 'c'};
    static char[] teamB = {'x', 'y', 'z'};

    public static void main(String[] args) {
        int size = teamA.length;

        System.out.println("对战名单如下：");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (teamA[i] == 'a' && teamB[j] == 'x') {
                    continue;
                } else if (teamA[i] == 'a' && teamB[j] == 'y') {
                    continue;
                } else if ((teamA[i] == 'c' && teamB[j] == 'x') || (teamA[i] == 'c' && teamB[j] == 'z')) {
                    continue;
                } else if (((teamA[i] == 'b' && teamB[j] == 'z') || (teamA[i] == 'b' && teamB[j] == 'y'))) {
                    continue;
                } else {
                    System.out.println(teamA[i] + " VS " + teamB[j]);
                }
            }

        }
    }
}
