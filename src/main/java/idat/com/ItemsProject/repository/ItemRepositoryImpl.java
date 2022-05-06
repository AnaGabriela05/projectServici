package idat.com.ItemsProject.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;
import idat.com.ItemsProject.model.Item;


@Repository
public class ItemRepositoryImpl implements ItemRepository{

	public List<Item> listar = new ArrayList<Item>();

	
	@Override
	public void guardarItem(Item items) {
		// TODO Auto-generated method stub
		listar.add(items);
		
	}

	@Override
	public void editarItem(Item items) {
		// TODO Auto-generated method stub
		listar.remove(obtenerItemId(items.getIdItem()));
		listar.add(items);
	}

	@Override
	public void eliminarItem(Integer id) {
		// TODO Auto-generated method stub
		listar.remove(obtenerItemId(id));
	}

	@Override
	public List<Item> listarItems() {
		// TODO Auto-generated method stub
		return listar;
	}

	@Override
	public Item obtenerItemId(Integer id) {
		// TODO Auto-generated method stub
		return listar.stream().filter(items -> items.getIdItem()==id).findFirst().orElse(null);
	}

}
