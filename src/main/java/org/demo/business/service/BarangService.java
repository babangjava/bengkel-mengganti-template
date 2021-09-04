/*
 * Created on 25 Jul 2021 ( Time 02:07:51 )
 * Generated by Telosys Tools Generator ( version 2.1.1 )
 */
package org.demo.business.service;

import java.util.List;

import org.demo.bean.Barang;

/**
 * Business Service Interface for entity Barang.
 */
public interface BarangService { 

	/**
	 * Loads an entity from the database using its Primary Key
	 * @param kodeBarang
	 * @return entity
	 */
	Barang findById( String kodeBarang  ) ;

	/**
	 * Loads all entities.
	 * @return all entities
	 */
	List<Barang> findAll();

	/**
	 * Saves the given entity in the database (create or update)
	 * @param entity
	 * @return entity
	 */
	Barang save(Barang entity);

	/**
	 * Updates the given entity in the database
	 * @param entity
	 * @return
	 */
	Barang update(Barang entity);

	/**
	 * Creates the given entity in the database
	 * @param entity
	 * @return
	 */
	Barang create(Barang entity);

	/**
	 * Deletes an entity using its Primary Key
	 * @param kodeBarang
	 */
	void delete( String kodeBarang );


}