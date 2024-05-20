package city.yueyang.redis.entity;

import java.io.Serializable;

/**
 * <p>
 * 存储Redis值类型的数据传输类
 * </p>
 *
 * @author XiaoHH
 * @version 1.0.0
 * @date 2023-09-06 星期三 11:21:28
 * @file RedisValueDTO.java
 */
public class RedisValueDTO implements Serializable {

    /**
     * Redis的Key
     */
    private String key;

    /**
     * 设置到Redis当中的值
     */
    private String value;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
