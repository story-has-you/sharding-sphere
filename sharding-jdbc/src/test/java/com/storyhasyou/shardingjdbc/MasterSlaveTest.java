package com.storyhasyou.shardingjdbc;

import com.storyhasyou.shardingjdbc.entity.City;
import com.storyhasyou.shardingjdbc.repository.CityRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

/**
 * @author fangxi created by 2021/2/15
 */
@SpringBootTest
public class MasterSlaveTest {

    @Autowired
    private CityRepository cityRepository;

    @Test
    public void testAdd() {
        City city = new City();
        city.setName("shanghai");
        city.setProvince("shanghai");
        cityRepository.save(city);
    }

    @Test
    public void testFind() {
        List<City> list = cityRepository.findAll();
        list.forEach(System.out::println);
    }

}
