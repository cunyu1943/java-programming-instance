/**
 * Created with IntelliJ IDEA.
 *
 * @author : 村雨
 * @version : 1.0
 * @Project : Java 编程实例
 * @Package : PACKAGE_NAME
 * @ClassName : Example55
 * @createTime : 2021/6/26 21:28
 * @Email : 747731461@qq.com
 * @公众号 : 村雨遥
 * @Website : https://cunyu1943.github.io
 * @Description :
 */
public class Example55 {
    public static void main(String[] args) {
        Person person = new Person("村雨遥", 1);
        person.speak();
    }
}

class Monkey {
    private String name;
    private int sex;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public Monkey(String name, int sex) {
        this.name = name;
        this.sex = sex;
    }

    public Monkey() {
    }

    public void speak() {
        System.out.println(this.name + " 咿咿呀呀！");
    }
}

class Person extends Monkey {

    public Person(String name, int sex) {
        super(name, sex);
    }

    @Override
    public void speak() {
        System.out.println(this.getName() + ", 你好呀！");

    }
}
