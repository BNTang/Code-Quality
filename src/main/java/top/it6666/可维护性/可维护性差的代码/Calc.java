package top.it6666.可维护性.可维护性差的代码;

public class Calc {
    public int d(int x, int y) {
        return x + y;
    }

    public int e(int x, int y) {
        int result = 0;
        for (int i = 0; i < x; i++) {
            result -= y;
        }
        return result;
    }
}
