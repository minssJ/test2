package books3;

public class buyer {

	 private String id;
	 private String Gname;
	
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getBGname() {
		return Gname;
	}
	public void setBGname(String bGname) {
		Gname = bGname;
	}
	@Override
	public String toString() {
		return "buyer [id=" + id + ", BGname=" + Gname + "]";
	}
	
	
	
	
}
