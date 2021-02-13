package com.storyhasyou.shardingjdbc.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

/**
 * The type City.
 *
 * @author fangxi
 */
@Data
@Entity
@Table(name = "city")
public class City implements Serializable {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "province")
    private String province;
}
