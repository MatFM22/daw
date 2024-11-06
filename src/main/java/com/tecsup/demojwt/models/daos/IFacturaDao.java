package com.tecsup.demojwt.models.daos;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.tecsup.demojwt.models.entities.Factura;



public interface IFacturaDao extends CrudRepository<Factura, Long>{

    @Query("select f from Factura f join fetch f.cliente c join fetch f.items l join fetch l.producto where f.id=?1")
    public Factura fetchByIdWithClienteWhithItemFacturaWithProducto(Long id);
}
