package com.eappcat.seata.server.runner;

import com.eappcat.seata.server.SeataServerConfigProperties;
import io.seata.server.Server;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ServerRunner implements ApplicationRunner {
    @Autowired
    private SeataServerConfigProperties configProperties;
    @Override
    public void run(ApplicationArguments args) throws Exception {
        List<String> argList=new ArrayList<>();
        if(configProperties.getPort()!=null){
            argList.add(configProperties.getPort().toString());
        }
        if(configProperties.getType()!=null){
            argList.add(configProperties.getType());
        }

        Server.main(argList.toArray(new String[]{}));
    }
}
