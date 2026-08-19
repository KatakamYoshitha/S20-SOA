package com.klu.cartApplication;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="cartb")
public class cart {
	@Id
	int cid;
	int pid;
	int qty;
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	@Override
	public String toString() {
		return "cart [cid=" + cid + ", pid=" + pid + ", qty=" + qty + "]";
	}
	public cart(int cid, int pid, int qty) {
		super();
		this.cid = cid;
		this.pid = pid;
		this.qty = qty;
	}
	public cart() {
		super();
		// TODO Auto-generated constructor stub
	}
}
