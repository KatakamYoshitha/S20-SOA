package com.klu.ProductApplication;

import jakarta.persistence.*;

@Entity
@Table(name="products2")
public class Product {
	@Id  
	int pid;
	String pname;
	String pcat;
	float price;
	public Product(int pid, String pname, String pcat, float price) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.pcat = pcat;
		this.price = price;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getCat() {
		return pcat;
	}
	public void setCat(String pcat) {
		this.pcat = pcat;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pname=" + pname + ", pcat=" + pcat + ", price=" + price + "]";
	}
}
