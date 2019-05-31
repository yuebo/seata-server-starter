package com.eappcat.seata.server;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "spring.seata.server")
@Data
public class SeataServerConfigProperties {
    private Integer port=8091;
    private String type="file";
}
