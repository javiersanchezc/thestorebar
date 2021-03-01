package com.jscoder.app.repository.Dao;


import com.jscoder.app.repository.entity.Producto;
import org.springframework.data.repository.CrudRepository;

public interface ProductoRepositoryDao extends CrudRepository<Producto,Integer> {
}
