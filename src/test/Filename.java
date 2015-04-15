package test;

public class Filename {
	String s;
	char p;
	char e;
	public Filename(String s,char p,char e) {
		// TODO Auto-generated constructor stub
		this.s=s;
		this.p= p;
		this.e= e;
	}
	public String path(){
		int pos  = s.lastIndexOf(p);
		
		return s.substring(0,pos);
		
	}
	public String extention(){
		int pos = s.indexOf(e);
		
		return s.substring(pos+1);
		
	}
	public String filename(){
		int posbg= s.lastIndexOf(p);
		int posend = s.indexOf(e);
		return s.substring(posbg+1,posend);
		
	}
	public static void main(String[] args) {
		Filename f = new Filename("/keylor/lidan/kfsdsd.txt",'/','.');
		System.out.println(f.path());
		System.out.println(f.extention());
		System.out.println(f.filename());
	}

}
