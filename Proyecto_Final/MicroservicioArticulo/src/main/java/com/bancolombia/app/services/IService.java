package com.bancolombia.app.services;
import java.util.List;
import com.bancolombia.app.entities.Articulo;
public interface IService {
	boolean insert(Articulo item);
	List<Articulo> getAll();
}
