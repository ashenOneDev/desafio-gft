package gft.dio;

public class TesteMDC {
    public int mdc(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return mdc(b, a % b);
        }
    }
}
