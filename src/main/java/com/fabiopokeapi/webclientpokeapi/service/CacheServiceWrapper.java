/*package com.fabiopokeapi.webclientpokeapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import reactor.core.publisher.Mono;

public class CacheServiceWrapper {

   @Autowired
    private RedisCacheService redisCacheService;

    @Value("${app-config.cache.redis-enabled}")
    private Boolean redisEnabled;

    public Mono<String> get(String key) {
        return redisCacheService.get(key);
    }


    public Mono<Boolean> exists(String key) {
        return redisCacheService.existsForKey(key);
    }

    public Mono<String> save(String key, String value) {
        return redisCacheService.save(key, value);
    }
}
*/