package top.it6666.开闭原则.遵循开闭原则的代码示例;

/**
 * @author BNTang
 * @version 1.0
 * @description
 * @since 2023/11/26 0026
 **/
public class Example {
    public static void main(String[] args) {
        GraphicEditor graphicEditor = new GraphicEditor();
        graphicEditor.drawShape(new Circle());
        graphicEditor.drawShape(new Triangle());
    }
}
