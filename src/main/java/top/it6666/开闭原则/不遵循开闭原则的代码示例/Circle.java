package top.it6666.开闭原则.不遵循开闭原则的代码示例;

/**
 * @author BNTang
 * @version 1.0
 * @description 圆形
 * @since 2023/11/26 0026
 **/
public class Circle extends Shape {
    Circle() {
        super.type = 1;
    }

    public void draw() {
        System.out.println("绘制圆形");
    }
}
