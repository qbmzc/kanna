package com.congco.kannagateway;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;

/**网关
 * @author congco
 * @date 19-6-12 下午8:01
 */
@SpringCloudApplication
public class KannaGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(KannaGatewayApplication.class, args);
    }
}
