import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.stream.DoubleStream;

public class HocVien {
	private final int SMH=3;

	private int Mahv;
	{
		dem++;
		this.Mahv=dem;
	}

	private String HoTen;

	private Date NgaySInh;
	
	private String GioiTinh;

	private String QueQuan;

	private double[] diem;

	private static int dem=0;

	public HocVien(String ht, String qq ,Date ns,String gt) {
		this.HoTen=ht;
		this.NgaySInh=ns;
		this.GioiTinh=gt;
		this.QueQuan=qq;
		this.diem=null;
	}
	public HocVien(){
		
	}
	public int getMaHv(){
		return this.Mahv;
	}
	public String getHoTen(){
		return this.HoTen;
	}
	public Date getNgaySinh(){
		return this.NgaySInh;
	}
	public String getQueQuan(){
		return this.QueQuan;
	}

	public String getGioiTinh(){
		return this.GioiTinh;
	}
	public void setHoTen(String ht){
		this.HoTen=ht;
	}
	public void setNgaySinh(Date ns){
		this.NgaySInh=ns;
	}
	public void setQueQuan(String qq){
		this.QueQuan=qq;
	}
	public void setGioiTinh(String gt){
		this.GioiTinh=gt;
	}

	public void nhapHv(Scanner scanner) throws ParseException {
		System.out.println("nhap ten");
		this.HoTen=scanner.nextLine();
		System.out.println("nhap que quan");
		this.QueQuan=scanner.nextLine();
		System.out.println("nhap ngay sin");
		String ns=scanner.nextLine();
		SimpleDateFormat f=new SimpleDateFormat("dd/MM/yyyy");
		this.NgaySInh=f.parse(ns);
		System.out.println("nhap gioi tinh");
		this.GioiTinh=scanner.nextLine();
	}

	public void nhapDiemHv(Scanner scanner) {
		
		this.diem=new double[SMH];
		for(int i=0;i<SMH;i++){
			System.out.println(this.HoTen.toUpperCase());
			System.out.printf("nhap mon thu %d",i+1);
				this.diem[i]=scanner.nextDouble();
		}

	} 

	public void hienThiHv() {
		SimpleDateFormat f=new SimpleDateFormat("dd/dd/yyyy");
		System.out.printf("Mahv%d\nHoTen:%s\nNoiSinh:%s\nNgaySinh:%s\nGioiTinh:%s\n", this.Mahv,this.HoTen,this.QueQuan,f.format(this.NgaySInh),this.GioiTinh);
		if (this.diem!=null) {
			System.out.println("diem cac mon hoc la");
			for(double d:this.diem){
				System.out.printf("%.2f\t",d);
			}
			System.out.println("diem tb"+this.tb());
		}
	}
public double tb(){
	return DoubleStream.of(this.diem).average().getAsDouble();
}
	public boolean isHocBong() {
		for(double d:this.diem){
			if(d<5)return false;
		
		}
	return this.tb()>=8;

	}

}
