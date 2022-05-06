package idat.com.ItemsProject.comtroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import idat.com.ItemsProject.model.*;
import idat.com.ItemsProject.service.*;

@RestController
@RequestMapping("/item")
public class ItemController {

	@Autowired
	private ItemService serv;
	
	
	@RequestMapping(path = "/listar", method = RequestMethod.GET)
	public ResponseEntity<List<Item>> listarItems(){
		
		return new ResponseEntity<List<Item>>(serv.listarItem(), HttpStatus.CREATED);  
	}
	
	@RequestMapping(path = "/registar", method = RequestMethod.POST)
	public ResponseEntity<Void> guardar(@RequestBody Item item){
		
		
		
		serv.guardarItem(item);
		return  new ResponseEntity<Void>(HttpStatus.CREATED);
		
	}
	
	@RequestMapping(path = "/listar/{id}" , method = RequestMethod.GET)
	public ResponseEntity<Item> listarPorId(@PathVariable Integer id) {
		
		Item p = serv.obtenerItemId(id);
		if(p != null)
			return new ResponseEntity<Item>(p, HttpStatus.OK);
		
		return new ResponseEntity<Item>(HttpStatus.NOT_FOUND);
		
	}
	
	@RequestMapping(path = "/editar", method = RequestMethod.PUT)
	public ResponseEntity<Void> editar(@RequestBody Item producto){
		
		Item p = serv.obtenerItemId(producto.getIdItem());

		if(p != null) {
			serv.editarItem(producto);
			return new ResponseEntity<Void>(HttpStatus.OK);
		}
		
		return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
		
	}
	
	@RequestMapping(path = "/eliminar/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<Void> eliminar(@PathVariable Integer id){
		
		Item p = serv.obtenerItemId(id);
		if(p != null) {
			serv.eliminarItem(id);
			return new ResponseEntity<Void>(HttpStatus.OK);
		}
		
		return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);

		
	}
	
}
