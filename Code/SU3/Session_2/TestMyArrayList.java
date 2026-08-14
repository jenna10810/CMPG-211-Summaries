public class TestMyArrayList {
  public static void main(String[] args) {
    MyArrayList<Integer> list = new MyArrayList<>();
	
    System.out.println("TEST WITH EMPTY LIST:"+list);
	list.filter(new Integer(3), new Integer(5));
    System.out.println(list);

    list.add(0,new Integer(6));
    list.add(1,new Integer(5));
    list.add(2,new Integer(3));
    list.add(3,new Integer(4)); 
	list.add(4,new Integer(2));
    list.add(5,new Integer(5));
	list.add(6,new Integer(1));
    
    System.out.println("TEST with low> high");
	list.filter(new Integer(5), new Integer(3)); 

	System.out.println(list);

	System.out.println("TEST with low < high");
	list.filter(new Integer(3), new Integer(5));

    System.out.println(list);
  }
}


