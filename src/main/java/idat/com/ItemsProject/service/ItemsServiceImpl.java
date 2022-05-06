package idat.com.ItemsProject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import idat.com.ItemsProject.model.Item;
import idat.com.ItemsProject.repository.ItemRepository;

@Service
public class ItemsServiceImpl implements ItemService{

	@Autowired
	public ItemRepository repo;
	
	@Override
	public void guardarItem(Item items) {
		// TODO Auto-generated method stub
		repo.guardarItem(items);
	}

	@Override
	public void editarItem(Item items) {
		// TODO Auto-generated method stub
		
		repo.editarItem(items);
	}

	@Override
	public void eliminarItem(Integer id) {
		// TODO Auto-generated method stub
		repo.eliminarItem(id);
	}

	@Override
	public List<Item> listarItem() {
		// TODO Auto-generated method stub
		return repo.listarItems();
	}

	@Override
	public Item obtenerItemId(Integer id) {
		// TODO Auto-generated method stub
		return repo.obtenerItemId(id);
	}

}
