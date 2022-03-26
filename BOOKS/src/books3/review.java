package books3;

public class review {
	private String id;
	private String Gname;
	private String Greview;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getGname() {
		return Gname;
	}
	public void setGname(String gname) {
		Gname = gname;
	}
	public String getGreview() {
		return Greview;
	}
	public void setGreview(String greview) {
		Greview = greview;
	}
	@Override
	public String toString() {
		return "review [id=" + id + ", Gname=" + Gname + ", Greview=" + Greview + "]";
	}
	
	
}
