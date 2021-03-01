package com.jscoder.app.service.impl;


import com.jscoder.app.repository.Dao.ProductoRepositoryDao;
import com.jscoder.app.repository.entity.Producto;
import com.jscoder.app.service.IproductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class productoServiceimpl implements IproductoService {
    @Autowired
    ProductoRepositoryDao productoRepositoryDao;

    @Override
    public List<Producto> findall() {
        return (List<Producto>) productoRepositoryDao.findAll();
    }

    @Override
    public Producto save(Producto productos) {
        return null;
    }

    @Override
    public Optional<Producto> findById(Integer id_producto) {
        return Optional.empty();
    }

    @Override
    public void delete(Producto producto) {

    }
}
