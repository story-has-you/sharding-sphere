package com.storyhasyou.shardingjdbc.repository;

import com.storyhasyou.shardingjdbc.entity.PositionDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author fangxi
 */
@Repository
public interface PositionDetailRepository extends JpaRepository<PositionDetail,Long> {
}
