package principle.LSP.after;


public class Test {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(30,20);
        resize(rectangle);
        printLengthAndWidth(rectangle);

    }

    public static void printLengthAndWidth(Quadrilateral rectangle){
        System.out.println(rectangle.getLength());
        System.out.println(rectangle.getWidth());
    }

    public static void resize(Rectangle rectangle){
        while (rectangle.getWidth() <= rectangle.getLength())
            rectangle.setWidth(rectangle.getWidth() + 1);
    }

}
