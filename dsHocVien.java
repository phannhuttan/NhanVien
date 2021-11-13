import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;

public class dsHocVien {

	private ArrayList<HocVien> ds=new ArrayList<>();

	private HocVien[] hocVien;

		public void nhapDshv(Scanner scanner) throws ParseException {
			HocVien h=new HocVien();
			h.nhapHv(scanner);
			this.nhapDshv(scanner);

		}


	public void nhapDiemDs(Scanner scanner) {
		for(HocVien h:this.ds){
			h.nhapDiemHv(scanner);
		}

	}

	public void hienThiDs() {
		for(HocVien h:this.ds){
			h.hienThiHv();
		}
	}

	public HocVien timKiem(int ms) {
		for(HocVien h:this.ds){
			if(h.getMaHv()==ms)
				 return h;
		}
		return null;
	}

	public ArrayList<HocVien> timKiem(String kw) {
		ArrayList<HocVien>kq=new ArrayList<>();
		kw=kw.toLowerCase();
		for(HocVien h:this.ds){
			if(h.getHoTen().toLowerCase().contains(kw)==true ||h.getQueQuan().toLowerCase().contains(kw)==true)
				kq.add(h);
		}
		return kq;
	}

	public void sapXep() {
		this.ds.sort((HocVien h1,HocVien h2)->{
			// return h2.getMaHv()-h1.getMaHv();
			if(h1.tb()>h2.tb())
			return 1;
			else if(h1.tb()<h2.tb())
				return -1;
			return 0;

		});

	}

	public ArrayList<HocVien> timDsHb() {
		ArrayList kq=new ArrayList<>();
		for(HocVien d:this.ds)
			if(d.isHocBong())
				kq.add(d);
		return kq;	
	}

	public void themHocVien(HocVien hv) {
		this.ds.add(hv);
	}

	}
