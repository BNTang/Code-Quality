package top.it6666.开闭原则.不遵循开闭原则的代码示例;

/**
 * 图形编辑器
 */
class GraphicEditor {

    /**
     * 绘制图形
     *
     * @param s 形状
     */
    void drawShape(Shape s) {
        if (s.type == 1)
            drawCircle((Circle) s);
        else if (s.type == 2)
            drawRectangle((Rectangle) s);
        // 对于新的形状，需要添加新的判断逻辑
    }

    /**
     * 绘制圆形
     *
     * @param r 圆形
     */
    private void drawCircle(Circle r) {
        r.draw();
    }

    /**
     * 绘制矩形
     *
     * @param r 矩形
     */
    private void drawRectangle(Rectangle r) {
        r.draw();
    }
}
