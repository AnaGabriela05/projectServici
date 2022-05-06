package idat.com.ItemsProject.repository;

import java.util.List;
import idat.com.ItemsProject.model.Item;



public interface ItemRepository {

	public void guardarItem(Item items);
	public void editarItem(Item items);
	public void eliminarItem(Integer id);
	public List<Item> listarItems();
	public Item obtenerItemId(Integer id);
	
}
