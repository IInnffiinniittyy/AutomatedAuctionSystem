package com.AuctionApp.JavaBeanFiles;

public class SoldItemsDTO {
  
	private int solditemId;  
	private String soldName; 
	private int iPrice; 
	private int iQuantity;  
	private String iCategory;  
	private int bID;
	
	public SoldItemsDTO(int solditemId, String soldName, int iPrice, int iQuantity, String iCategory, int bID) {
		super();
		this.solditemId = solditemId;
		this.soldName = soldName;
		this.iPrice = iPrice;
		this.iQuantity = iQuantity;
		this.iCategory = iCategory;
		this.bID = bID;
	}
	
	public SoldItemsDTO() {
		super();
	}

	public int getSolditemId() {
		return solditemId;
	}

	public void setSolditemId(int solditemId) {
		this.solditemId = solditemId;
	}

	public String getSoldName() {
		return soldName;
	}

	public void setSoldName(String soldName) {
		this.soldName = soldName;
	}

	public int getiPrice() {
		return iPrice;
	}

	public void setiPrice(int iPrice) {
		this.iPrice = iPrice;
	}

	public int getiQuantity() {
		return iQuantity;
	}

	public void setiQuantity(int iQuantity) {
		this.iQuantity = iQuantity;
	}

	public String getiCategory() {
		return iCategory;
	}

	public void setiCategory(String iCategory) {
		this.iCategory = iCategory;
	}

	public int getbID() {
		return bID;
	}

	public void setbID(int bID) {
		this.bID = bID;
	}

	@Override
	public String toString() {
		return "SoldItemsDTO [solditemId=" + solditemId + ", soldName=" + soldName + ", iPrice=" + iPrice
				+ ", iQuantity=" + iQuantity + ", iCategory=" + iCategory + ", bID=" + bID + "]";
	}
	
}
