package com.storyhasyou.shardingjdbc.repository;

import com.storyhasyou.shardingjdbc.entity.BusinessOrder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author fangxi
 */
@Repository
public interface OrderRepository extends JpaRepository<BusinessOrder,Long> {
}
