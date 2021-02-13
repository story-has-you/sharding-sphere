package com.storyhasyou.shardingjdbc.repository;

import com.storyhasyou.shardingjdbc.entity.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author fangxi
 */
@Repository
public interface CityRepository extends JpaRepository<City,Long> {

}
