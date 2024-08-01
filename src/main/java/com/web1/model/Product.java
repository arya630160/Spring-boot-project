package com.web1.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Product {

	@Id
	 @GeneratedValue(strategy = GenerationType.AUTO) 
	private int pid;
	private String name;
	private long mobile_no;
	@Column(name="pname;",unique=true,columnDefinition = "varchar(40)",nullable = false)
	private String pname;
	@Column(name="price",columnDefinition = "float check(price>0 and price<65000) ",nullable = false)
	private double price;
	private int quantity;
	private double total;
	private double discount;
	private double gst;
	private double invoice_bill;
	
	
	public Product(int pid, String name, long mobile_no, String pname, double price, int quantity, double total,
			double discount, double gst, double invoice_bill) {
		super();
		this.pid = pid;
		this.name = name;
		this.mobile_no = mobile_no;
		this.pname = pname;
		this.price = price;
		this.quantity = quantity;
		this.total = total;
		this.discount = discount;
		this.gst = gst;
		this.invoice_bill = invoice_bill;
	}


	public int getPid() {
		return pid;
	}


	public void setPid(int pid) {
		this.pid = pid;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public long getMobile_no() {
		return mobile_no;
	}


	public void setMobile_no(long mobile_no) {
		this.mobile_no = mobile_no;
	}


	public String getPname() {
		return pname;
	}


	public void setPname(String pname) {
		this.pname = pname;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public int getQuantity() {
		return quantity;
	}


	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}


	public double getTotal() {
		return total;
	}


	public void setTotal(double total) {
		this.total = total;
	}


	public double getDiscount() {
		return discount;
	}


	public void setDiscount(double discount) {
		this.discount = discount;
	}


	public double getGst() {
		return gst;
	}


	public void setGst(double gst) {
		this.gst = gst;
	}


	public double getInvoice_bill() {
		return invoice_bill;
	}


	public void setInvoice_bill(double invoice_bill) {
		this.invoice_bill = invoice_bill;
	}


	@Override
	public String toString() {
		return "Product [pid=" + pid + ", name=" + name + ", mobile_no=" + mobile_no + ", pname=" + pname + ", price="
				+ price + ", quantity=" + quantity + ", total=" + total + ", discount=" + discount + ", gst=" + gst
				+ ", invoice_bill=" + invoice_bill + ", getPid()=" + getPid() + ", getName()=" + getName()
				+ ", getMobile_no()=" + getMobile_no() + ", getPname()=" + getPname() + ", getPrice()=" + getPrice()
				+ ", getQuantity()=" + getQuantity() + ", getTotal()=" + getTotal() + ", getDiscount()=" + getDiscount()
				+ ", getGst()=" + getGst() + ", getInvoice_bill()=" + getInvoice_bill() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}


	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
}
