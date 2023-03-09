public class Main {
    public static void main(String[] args) {
        Point point = new Point(1, 2);
        System.out.println(point.toString());

        MoveablePoint moveablePoint = new MoveablePoint(3,4);
        System.out.println(moveablePoint.move());
        System.out.println(moveablePoint.move());
        System.out.println(moveablePoint.move());
        System.out.println(moveablePoint);
    }
}