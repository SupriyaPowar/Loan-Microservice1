package com.loanmicroservices.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
public class ApplyLoanRequest {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int loan_id;
	private String first_name;
	private String last_name;
	private long phone_number;
	private String email_id;
	private String  pan_number;
	private double loan_amount;
	private int loan_tenure;
	private int emi_option;
	private String remark;
	private String  status;

	public ApplyLoanRequest() {
		// TODO Auto-generated constructor stub
	}
	public int getLoan_id() {
		return loan_id;
	}
	public void setLoan_id(int loan_id) {
		this.loan_id = loan_id;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public long getPhone_number() {
		return phone_number;
	}
	public void setPhone_number(long phone_number) {
		this.phone_number = phone_number;
	}
	public String getEmail_id() {
		return email_id;
	}
	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}
	public String getPan_number() {
		return pan_number;
	}
	public void setPan_number(String pan_number) {
		this.pan_number = pan_number;
	}
	public double getLoan_amount() {
		return loan_amount;
	}
	public void setLoan_amount(double loan_amount) {
		this.loan_amount = loan_amount;
	}
	public int getLoan_tenure() {
		return loan_tenure;
	}
	public void setLoan_tenure(int loan_tenure) {
		this.loan_tenure = loan_tenure;
	}
	public int getEmi_option() {
		return emi_option;
	}
	public void setEmi_option(int emi_option) {
		this.emi_option = emi_option;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "ApplyLoanRequest [loan_id=" + loan_id + ", first_name=" + first_name + ", last_name=" + last_name
				+ ", phone_number=" + phone_number + ", email_id=" + email_id + ", pan_number=" + pan_number
				+ ", loan_amount=" + loan_amount + ", loan_tenure=" + loan_tenure + ", emi_option=" + emi_option
				+ ", remark=" + remark + ", status=" + status + "]";
	}
	
	
	
	
	
	
	
	
}
