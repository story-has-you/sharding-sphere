package com.storyhasyou.shardingjdbc.keygenerator;

import com.storyhasyou.kratos.utils.IdUtils;
import com.storyhasyou.kratos.utils.JacksonUtils;
import lombok.extern.slf4j.Slf4j;
import org.apache.shardingsphere.spi.keygen.ShardingKeyGenerator;

import java.util.Properties;

/**
 * 自定义id生成，生成订单id
 * 在
 * <code>
 * org.apache.shardingsphere.spi.keygen.ShardingKeyGenerator
 * </code>
 * 这个文件中添加包名
 *
 * @author fangxi created by 2021/2/7
 */
@Slf4j
public final class OrderIdGenerator implements ShardingKeyGenerator {


    @Override
    public Comparable<?> generateKey() {
        Long timeId = IdUtils.getId();
        log.info("生成的id:{}", timeId);
        return timeId;
    }

    @Override
    public String getType() {
        return "order_id";
    }

    @Override
    public Properties getProperties() {
        return null;
    }

    @Override
    public void setProperties(Properties properties) {

    }
}
