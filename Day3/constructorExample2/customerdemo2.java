
public class customerdemo2 {
	
	private int customerid;
	private String customername;
	private String customercity;
	
	customerdemo2(int i, String string, String string2){
		System.out.println("user-define");
	}

	void display() {
		System.out.println(customerid +""+ customername +""+customercity);
	}

	public int getCustomerid() {
		return customerid;
	}

	public void setCustomerid(int customerid) {
		this.customerid = customerid;
	}

	public String getCustomername() {
		return customername;
	}

	public void setCustomername(String customername) {
		this.customername = customername;
	}

	public String getCustomercity() {
		return customercity;
	}

	public void setCustomercity(String customercity) {
		this.customercity = customercity;
	}
	
}
