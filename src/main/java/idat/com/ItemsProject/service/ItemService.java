package idat.com.ItemsProject.service;

import java.util.List;


import idat.com.ItemsProject.model.Item;

public interface ItemService {

	public void guardarItem(Item items);
	public void editarItem(Item items);
	public void eliminarItem(Integer id);
	public List<Item> listarItem();
	public Item obtenerItemId(Integer id);
}
