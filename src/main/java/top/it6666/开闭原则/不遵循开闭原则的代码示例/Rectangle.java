package top.it6666.开闭原则.不遵循开闭原则的代码示例;

/**
 * 矩形
 */
class Rectangle extends Shape {
    Rectangle() {
        super.type = 2;
    }

    /**
     * 绘制图形
     */
    void draw() {
        System.out.println("Drawing a rectangle");
    }
}
