package org.demo.data.repository.jpa;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.demo.bean.jpa.BarangEntity;

/**
 * Repository : Barang.
 */
public interface BarangJpaRepository extends PagingAndSortingRepository<BarangEntity, String> {

}
