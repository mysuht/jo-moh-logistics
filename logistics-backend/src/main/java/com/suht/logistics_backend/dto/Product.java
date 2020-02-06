package com.suht.logistics_backend.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="PRODUCT")
public class Product {
	@Id
	@Column(name="PROD_ID")
	int id;
	
	@Column(name="PROD_NAME")
	String name;
	
	@Column(name="PROD_CYP", precision=4, scale=2)
	Double cyp;
	
	@Column(name="PROD_DOSE")
	String dose;
	
	@Column(name="PROD_IS_ACTIVE")
	String active;
	
	
	@Column(name="PROD_SHIP_QTY_IN")
	int qtyInShip;
	
	@Column(name="PROD_SHIP_QTY_WHSE")
	int qtyWhseShip;
	
	@Column(name="PROD_SHIP_QTY_SDP")
	int qtySDPShip;
	
	@Column(name="PR_CTRINDEX")
	int prCtrIndex;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getCyp() {
		return cyp;
	}

	public void setCyp(Double cyp) {
		this.cyp = cyp;
	}

	public String getDose() {
		return dose;
	}

	public void setDose(String dose) {
		this.dose = dose;
	}

	public String getActive() {
		return active;
	}

	public void setActive(String active) {
		this.active = active;
	}

	public int getQtyInShip() {
		return qtyInShip;
	}

	public void setQtyInShip(int qtyInShip) {
		this.qtyInShip = qtyInShip;
	}

	public int getQtyWhseShip() {
		return qtyWhseShip;
	}

	public void setQtyWhseShip(int qtyWhseShip) {
		this.qtyWhseShip = qtyWhseShip;
	}

	public int getQtySDPShip() {
		return qtySDPShip;
	}

	public void setQtySDPShip(int qtySDPShip) {
		this.qtySDPShip = qtySDPShip;
	}

	public int getPrCtrIndex() {
		return prCtrIndex;
	}

	public void setPrCtrIndex(int prCtrIndex) {
		this.prCtrIndex = prCtrIndex;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
	
	
	
}
