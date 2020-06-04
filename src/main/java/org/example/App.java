package org.example;

import redis.clients.jedis.Jedis;

import java.util.HashMap;

/**
 * Hello world!
 */
public class App {

    private static final String HOST = "39.99.193.207";
    private static final int PORT = 6379;

    public static void main(String[] args) {

        Jedis jedis = new Jedis(HOST, PORT);
//        jedis.set("k1", "v11");

        System.out.println(jedis.get("k1"));
        HashMap<String, String> map = new HashMap<>();
        map.put("name","小李");
        map.put("age","19");
        jedis.hset("h1",map);

        System.out.println(jedis.hget("h1","age"));

    }
}
