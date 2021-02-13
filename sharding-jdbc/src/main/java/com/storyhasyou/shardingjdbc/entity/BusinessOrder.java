package com.storyhasyou.shardingjdbc.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * @author fangxi
 */
@Data
@Entity
@Table(name = "b_order")
public class BusinessOrder implements Serializable {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "is_del")
    private Integer deleted;

    @Column(name = "company_id")
    private Integer companyId;

    @Column(name = "position_id")
    private Long positionId;

    @Column(name = "user_id")
    private Integer userId;

    @Column(name = "publish_user_id")
    private Integer publishUserId;

    @Column(name = "resume_type")
    private Integer resumeType;

    @Column(name = "status")
    private String status;

    @Column(name = "create_time")
    private LocalDateTime createTime;

    @Column(name = "operate_time")
    private LocalDateTime operateTime;

    @Column(name = "work_year")
    private String workYear;

    @Column(name = "name")
    private String name;

    @Column(name = "position_name")
    private String positionName;

    @Column(name = "resume_id")
    private Integer resumeId;

}
