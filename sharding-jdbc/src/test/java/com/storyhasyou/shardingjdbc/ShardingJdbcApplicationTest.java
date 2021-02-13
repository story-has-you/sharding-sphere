package com.storyhasyou.shardingjdbc;

import com.storyhasyou.kratos.utils.DateUtils;
import com.storyhasyou.kratos.utils.JacksonUtils;
import com.storyhasyou.shardingjdbc.entity.BusinessOrder;
import com.storyhasyou.shardingjdbc.entity.City;
import com.storyhasyou.shardingjdbc.entity.Position;
import com.storyhasyou.shardingjdbc.entity.PositionDetail;
import com.storyhasyou.shardingjdbc.repository.CityRepository;
import com.storyhasyou.shardingjdbc.repository.OrderRepository;
import com.storyhasyou.shardingjdbc.repository.PositionDetailRepository;
import com.storyhasyou.shardingjdbc.repository.PositionRepository;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Map;
import java.util.Random;

/**
 * @author fangxi created by 2021/2/7
 */
@SpringBootTest
public class ShardingJdbcApplicationTest {

    @Autowired
    private PositionRepository positionRepository;

    @Autowired
    private PositionDetailRepository positionDetailRepository;

    @Autowired
    private CityRepository cityRepository;

    @Autowired
    private OrderRepository orderRepository;

    @Test
    public void add() {
        for (long id = 1; id <= 20; id++) {
            Position position = new Position();
            position.setName("fangxi" + id);
            position.setSalary("1000000");
            position.setCity("江苏南京");
            positionRepository.save(position);

            PositionDetail positionDetail = new PositionDetail();
            positionDetail.setPid(position.getId());
            positionDetail.setDescription("desc" + id);
            positionDetailRepository.save(positionDetail);
        }
    }

    @Test
    public void query() {
        Map<String, Object> positions = positionRepository.findPositionsById(1358410669615009793L);
        System.out.println(JacksonUtils.serialize(positions));
    }

    @Test
    public void broadCast() {
        City city = new City();
        city.setName("beijing");
        city.setProvince("beijing");
        cityRepository.save(city);
    }

    // 重复100次
    @RepeatedTest(100)
    public void businessOrder() {
        Random random = new Random();
        int companyId = random.nextInt(10);
        BusinessOrder order = new BusinessOrder();
        order.setDeleted(0);
        order.setCompanyId(companyId);
        order.setPositionId(3242342L);
        order.setUserId(2222);
        order.setPublishUserId(1111);
        order.setResumeType(1);
        order.setStatus("AUTO");
        order.setCreateTime(DateUtils.now());
        order.setOperateTime(DateUtils.now());
        order.setWorkYear("2");
        order.setName("lagou");
        order.setPositionName("Java");
        order.setResumeId(23233);
        orderRepository.save(order);
    }

}
