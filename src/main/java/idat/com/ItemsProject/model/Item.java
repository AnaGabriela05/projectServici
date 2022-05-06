package idat.com.ItemsProject.model;

import java.io.Serializable;

public class Item implements Serializable{
	
	private static final long serialVersionUID = 3728776189173701449L;
	
	private Integer idItem;
	private String item;
	private Integer cantidad;
	private Double total;
	
	public Item() {}

	public Integer getIdItem() {
		return idItem;
	}

	public void setIdItem(Integer idItem) {
		this.idItem = idItem;
	}

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}

	public Double getTotal() {
		return total;
	}

	public void setTotal(Double total) {
		this.total = total;
	}
	
	
	
}
