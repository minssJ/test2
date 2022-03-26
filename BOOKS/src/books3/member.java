package books3;

public class member {
	private String id;
	private String pw;
	private String Mname;
	private String Birth;
	private String Email;
	private String Phone;
	private String Adress;
	private String Ac;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getMname() {
		return Mname;
	}
	public void setMname(String mname) {
		Mname = mname;
	}
	public String getBirth() {
		return Birth;
	}
	public void setBirth(String birth) {
		Birth = birth;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getPhone() {
		return Phone;
	}
	public void setPhone(String phone) {
		Phone = phone;
	}
	public String getAdress() {
		return Adress;
	}
	public void setAdress(String adress) {
		Adress = adress;
	}
	public String getAc() {
		return Ac;
	}
	public void setAc(String ac) {
		Ac = ac;
	}
	
	@Override
	public String toString() {
		return "member [id=" + id + ", pw=" + pw + ", Mname=" + Mname + ", Birth=" + Birth + ", Email=" + Email
				+ ", Phone=" + Phone + ", Adress=" + Adress + ", Ac=" + Ac + "]";
	}
	
	
	
}
