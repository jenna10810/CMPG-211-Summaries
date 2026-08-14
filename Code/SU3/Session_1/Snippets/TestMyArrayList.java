public class TestMyArrayList {
    public static void main(String[] args) {
        MyArrayList<GeometricObject> list = new MyArrayList<>();
        Circle c1= new Circle (10, "red",false);
        Circle c2= new Circle (1, "red",false);
        Circle c3= new Circle (6, "red",false);
        Circle c4= new Circle (5, "red",false);

        Rectangle r1= new Rectangle (5,4, "red",false);
        Rectangle r2= new Rectangle (2,3, "red",false);
        Rectangle r3= new Rectangle (3,3, "red",false);
        Rectangle r4= new Rectangle (4,4, "red",false);
        
        list.add(0,c1);
        list.add(1,r1);
        list.add(2,c2);
        list.add(3,r2);
        list.add(4,c3);
        list.add(5,r3);
        list.add(6,c4);
        list.add(7,r4);

        if (list.sortList())
            System.out.println(list);
    }
}