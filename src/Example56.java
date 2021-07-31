/**
 * Created with IntelliJ IDEA.
 *
 * @author : 村雨
 * @version : 1.0
 * @project : Java 编程实例
 * @package : PACKAGE_NAME
 * @className : Example56
 * @createTime : 2021/7/3 22:23
 * @email : 747731461@qq.com
 * @公众号 : 村雨遥
 * @website : https://cunyu1943.github.io
 * @description :
 */
public class Example56 {
    public static void main(String[] args) {
        Equipment equipment1 = new Equipment("饮血之刃", 1500);
        Equipment equipment2 = new Equipment("破军", 2000);
        Equipment equipment3 = new Equipment("攻速鞋", 500);

        System.out.println("伽罗目前的装备为：");
        System.out.println(equipment1.toString());
        System.out.println(equipment2.toString());
        System.out.println(equipment3.toString());
    }
}

class Equipment {
    private String name;
    private int price;

    public Equipment() {
    }

    public Equipment(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "装备名：" + name + ", 价格：" + price;
    }
}
