package Shape;
   import javax.swing.JOptionPane;
   public class point{

   
   // Ham khoi tao khong tham sopublic Point(){setTenDiem("A");setTungDo(0.0);setHoanhDo(0.0);}
   // Ham khoi tao 2 tham so tung do va hoanh do
   // Ham khoi tao khong tham sopublic Point(){setTenDiem("A");setTungDo(0.0);setHoanhDo(0.0);}

   private String tenDiem;
    private double tungDo;
    private double hoanhDo;
    //ham khoi tao khong tham so
    public point()
    {
        setTenDiem("A");
        setTungDo(0.0);
        setHoanhDo(0.0);
    }
    public point(double d, int i) {
    }
    public point(String string, double d, double e) {
    }
    public void setTenDiem(String ten){tenDiem = ten;}
    public void setTungDo(double tung){tungDo = tung;}
    public void setHoanhDo(double hoanh){hoanhDo = hoanh;}
    public String getTenDiem(){return tenDiem;}
    public double getTungDo(){return tungDo;}
    public double getHoanhDo(){return hoanhDo;}

    //nhap mot diem tu ban phim
    public void nhap(){
        String strTenDiem, strTung, strHoanh;double dTung, dHoanh;
         strTenDiem = JOptionPane.showInputDialog(null,"Nhap ten diem: ",JOptionPane.INFORMATION_MESSAGE);
         setTenDiem(strTenDiem);strTung = JOptionPane.showInputDialog(null,"Nhap tung do: ",JOptionPane.INFORMATION_MESSAGE);
         dTung = Double.parseDouble(strTung);setTungDo(dTung);strHoanh= JOptionPane.showInputDialog(null,"Nhap hoanh do: ",JOptionPane.INFORMATION_MESSAGE);
         dHoanh = Double.parseDouble(strHoanh);setHoanhDo(dHoanh);
    }
    //in ra man hinh
    public void hienThi(){
        JOptionPane.showMessageDialog(null, "Point: "+ getTenDiem() + "(" + getTungDo()+ "," + getHoanhDo() + ")");
    }


       
}
