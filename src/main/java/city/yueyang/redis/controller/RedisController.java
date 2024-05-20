package city.yueyang.redis.controller;

import city.yueyang.redis.entity.RedisValueDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.*;

/**
 * <p>
 * 操作Redis的Controller
 * </p>

 */
@RestController
@RequestMapping("/redis")
public class RedisController {

    /**
     * 注入Redis的操作对象
     */
    @Autowired
    private RedisTemplate<String, String> redisTemplate;

    /**
     * 设置一个值到Redis当中
     *
     * @param value 设置的内容对象
     * @return 返回Success
     */
    @PostMapping
    public String set(@RequestBody RedisValueDTO value) {
        this.redisTemplate.opsForValue().set(value.getKey(), value.getValue());
        return "Success";
    }

    /**
     * 根据key在Redis当中获取一个值
     *
     * @param key redis的key
     * @return 缓存当中的值
     */
    @GetMapping("/{key}")
    public String get(@PathVariable("key") String key) {
        return this.redisTemplate.opsForValue().get(key);
    }
}
