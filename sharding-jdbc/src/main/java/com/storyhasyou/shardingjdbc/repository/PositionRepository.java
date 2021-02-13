package com.storyhasyou.shardingjdbc.repository;

import com.storyhasyou.shardingjdbc.entity.Position;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Map;

/**
 * @author fangxi
 */
@Repository
public interface PositionRepository extends JpaRepository<Position, Long> {

    @Query(nativeQuery = true, value = "select p.id,p.name,p.salary,p.city,pd.description from position p join position_detail pd on(p.id=pd.pid) where p.id=:id")
    Map<String, Object> findPositionsById(@Param("id") long id);
}
