package Shape;
public class app2604 {
   
    public static class TestPoint {public static void main(String[] args) {
       
        point obj1 = new point();
        obj1.hienThi();
       
        point obj2 = new point(-12.8, 13);
        obj2.hienThi();
      
        point obj3 = new point("A", 3.5, 4.5);
        obj3.hienThi();
        point obj4 = new point();
        obj4.nhap();
        obj4.hienThi();
    }
}


}
