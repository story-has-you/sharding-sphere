package com.storyhasyou.shardingjdbc.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * @author fangxi
 */
@Data
@Entity
@Table(name = "position_detail")
public class PositionDetail implements Serializable {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "pid")
    private Long pid;

    @Column(name = "description")
    private String description;

}
