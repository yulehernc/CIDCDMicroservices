package com.bancolombia.app.datasource;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Component;
import com.bancolombia.app.entities.Articulo;
@Component
public class ArticuloRepository{
	private final List<Articulo> lista=new ArrayList<>();
	public boolean insert(Articulo item){
	return lista.add(item);
	}
	public List<Articulo> getAll() {
		return lista;
	}
}