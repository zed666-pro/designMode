package principle.LSP.before;

public class Test {
    public static void main(String[] args) {
//        Rectangle rectangle = new Rectangle();
//        rectangle.setWidth(20);
//        rectangle.setLength(30);
//        resize(rectangle);
//        printLengthAndWidth(rectangle);

        Square square = new Square();
        square.setLength(10);


        resize(square);
        printLengthAndWidth(square);
    }

    public static void printLengthAndWidth(Rectangle rectangle){
        System.out.println(rectangle.getLength());
        System.out.println(rectangle.getWidth());
    }

    public static void resize(Rectangle rectangle){
        while (rectangle.getWidth() <= rectangle.getLength())
            rectangle.setWidth(rectangle.getWidth() + 1);
    }
}
