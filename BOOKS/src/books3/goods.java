package books3;


public class goods {
	private String Gname;
	private int Gprice;
	private String Gdate;
	private String Gauthor;
	private String Ggenre;
	private int Gstock;
	private String Gseller;
	
	
	public String getGname() {
		return Gname;
	}
	public void setGname(String gname) {
		Gname = gname;
	}
	public int getGprice() {
		return Gprice;
	}
	public void setGprice(int gprice) {
		Gprice = gprice;
	}
	public String getGdate() {
		return Gdate;
	}
	public void setGdate(String gdate) {
		Gdate = gdate;
	}
	public String getGauthor() {
		return Gauthor;
	}
	public void setGauthor(String gauthor) {
		Gauthor = gauthor;
	}
	public String getGgenre() {
		return Ggenre;
	}
	public void setGgenre(String ggenre) {
		Ggenre = ggenre;
	}
	public int getGstock() {
		return Gstock;
	}
	public void setGstock(int gstock) {
		Gstock = gstock;
	}
	public String getGseller() {
		return Gseller;
	}
	public void setGseller(String gseller) {
		Gseller = gseller;
	}
	
	@Override
	public String toString() {
		return "goods [Gname=" + Gname + ", Gprice=" + Gprice + ", Gdate=" + Gdate + ", Gauthor=" + Gauthor
				+ ", Ggenre=" + Ggenre + ", Gstock=" + Gstock + ", Gseller=" + Gseller + "]";
	}

	
}
