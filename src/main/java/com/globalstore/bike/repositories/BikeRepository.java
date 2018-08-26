/**
 * 
 */
package com.globalstore.bike.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.globalstore.bike.models.Bike;

/**
 * @author znabd
 *
 */
public interface BikeRepository extends JpaRepository<Bike, Long> {

	
}
