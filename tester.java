
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class tester {

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat f=new SimpleDateFormat("dd/mmm/yyyy");
		HocVien h1=new HocVien("phan tan", "DT", f.parse("01/0/2002"),"nam");
		HocVien h2=new HocVien("an", "HCm", f.parse("01/06/2012"),"nu");
		h1.hienThiHv();
		dsHocVien ds=new dsHocVien();
		ds.themHocVien(h1);
		ds.themHocVien(h2);
		
		System.err.println("---------------");
		
	}

}
