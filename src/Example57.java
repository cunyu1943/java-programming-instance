/**
 * Created with IntelliJ IDEA.
 *
 * @author : 村雨
 * @version : 1.0
 * @project : Java 编程实例
 * @package : PACKAGE_NAME
 * @className : Example57
 * @createTime : 2021/7/4 8:40
 * @email : 747731461@qq.com
 * @公众号 : 村雨遥
 * @website : https://cunyu1943.github.io
 * @description :
 */
public class Example57 {
    public static void main(String[] args) {
        Hero hero = new Hero("虞姬", 3000, 1000, 50, 800, 0, 0, 0);
        System.out.println("英雄信息如下");
        System.out.println(hero.toString());
    }
}
//
// class Hero {
//     private String name;
//     private float hp;
//     private float mp;
//     private int initSpeed;
//     private int attack;
//     private int killed;
//     private int beKilled;
//     private int assist;
//
//     public Hero() {
//     }
//
//     public Hero(String name, float hp, float mp, int initSpeed, int attack, int killed, int beKilled, int assist) {
//         this.name = name;
//         this.hp = hp;
//         this.mp = mp;
//         this.initSpeed = initSpeed;
//         this.attack = attack;
//         this.killed = killed;
//         this.beKilled = beKilled;
//         this.assist = assist;
//     }
//
//
//     @Override
//     public String toString() {
//         final StringBuffer sb = new StringBuffer();
//         sb.append("名字 = '").append(name).append('\'');
//         sb.append(", 血量 = ").append(hp);
//         sb.append(", 蓝量 = ").append(mp);
//         sb.append(", 初始速度 = ").append(initSpeed);
//         sb.append(", 攻击值 = ").append(attack);
//         sb.append(", 击杀数 = ").append(killed);
//         sb.append(", 被击杀数 = ").append(beKilled);
//         sb.append(", 助攻数 = ").append(assist);
//         return sb.toString();
//     }
// }
//
