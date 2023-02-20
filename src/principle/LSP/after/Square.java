package principle.LSP.after;

public class Square implements Quadrilateral{
    private double size;

    public Square(double size) {
        this.size = size;
    }

    @Override
    public double getLength() {
        return this.size;
    }

    @Override
    public double getWidth() {
        return this.size;
    }
}
