package my_pairs;

/**
 * ���������� ������. 2 ����, 5 ������.
 */
public class Pair<T> {
    T x, y;
    public Pair(T x, T y) {
        this.x = x;
        this.y = y;
    }

    public T getY() {
        return y;
    }

    public T getX() {
        return x;
    }
}
