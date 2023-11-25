package top.it6666.开闭原则.遵循开闭原则的代码示例;

/**
 * 图形编辑器
 */
class GraphicEditor {
    /**
     * 绘制形状
     */
    void drawShape(Shape s) {
        s.draw(); // 调用具体形状的绘制方法
    }
}
