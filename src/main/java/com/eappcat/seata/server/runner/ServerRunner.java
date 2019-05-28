package com.eappcat.seata.server.runner;

import io.seata.server.Server;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class ServerRunner implements ApplicationRunner {
    @Override
    public void run(ApplicationArguments args) throws Exception {
        Server.main(args.getSourceArgs());
    }
}
