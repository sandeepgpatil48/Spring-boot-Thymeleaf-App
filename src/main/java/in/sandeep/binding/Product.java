package in.sandeep.binding;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class Product {

	@NotNull(message="Id is required..!")
	private Integer pid;
	
	@NotNull(message="Name is required..!")
	@Size(min =3, max=8)	
	private String pname;
	
	@NotNull(message="Price is required..!")
	private Long price;
	
	public Integer getPid() {
		return pid;
	}
	public void setPid(Integer pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public Long getPrice() {
		return price;
	}
	public void setPrice(Long price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pname=" + pname + ", price=" + price + "]";
	}
	
	
	
}
