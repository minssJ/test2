package books3;

public class account {
 private  String ac;
 private int amount;
 private String id;
 
 
 
 public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
 public String getAc() {
	return ac;
}
public void setAc(String ac) {
	this.ac = ac;
}
public int getAmount() {
	return amount;
}
public void setAmount(int amount) {
	this.amount = amount;
}
@Override
public String toString() {
	return "account [id=" + id + ", ac=" + ac + ", amount=" + amount + "]";
}
 
 
 
}
