/*
 * Created on 25 Jul 2021 ( Time 02:07:52 )
 * Generated by Telosys Tools Generator ( version 2.1.1 )
 */
package org.demo.business.service;

import java.util.List;

import org.demo.bean.PenjualanDetail;

/**
 * Business Service Interface for entity PenjualanDetail.
 */
public interface PenjualanDetailService { 

	/**
	 * Loads an entity from the database using its Primary Key
	 * @param idPenjualanDetail
	 * @return entity
	 */
	PenjualanDetail findById( Integer idPenjualanDetail  ) ;

	/**
	 * Loads all entities.
	 * @return all entities
	 */
	List<PenjualanDetail> findAll();

	/**
	 * Saves the given entity in the database (create or update)
	 * @param entity
	 * @return entity
	 */
	PenjualanDetail save(PenjualanDetail entity);

	/**
	 * Updates the given entity in the database
	 * @param entity
	 * @return
	 */
	PenjualanDetail update(PenjualanDetail entity);

	/**
	 * Creates the given entity in the database
	 * @param entity
	 * @return
	 */
	PenjualanDetail create(PenjualanDetail entity);

	/**
	 * Deletes an entity using its Primary Key
	 * @param idPenjualanDetail
	 */
	void delete( Integer idPenjualanDetail );


}
