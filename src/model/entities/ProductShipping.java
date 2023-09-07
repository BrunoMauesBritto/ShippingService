package model.entities;

public class ProductShipping {
	
	private Integer number;
	private Double price;
	private Integer quantity;
	
	private TV model;
	private Invoice invoice;
	
	public ProductShipping(Integer number, Double price, Integer quantity, TV model) {
		this.number = number;
		this.price = price;
		this.quantity = quantity;
		this.model = model;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public TV getModel() {
		return model;
	}

	public void setModel(TV model) {
		this.model = model;
	}

	public Invoice getInvoice() {
		return invoice;
	}

	public void setInvoice(Invoice invoice) {
		this.invoice = invoice;
	}
	
	
	

}
