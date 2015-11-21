public class Deduct implements Operation {
    @Override
    public int apply(int left, int right) {
        return left-right;
    }

    @Override
    public String toString() {
        return "-";
    }
}
