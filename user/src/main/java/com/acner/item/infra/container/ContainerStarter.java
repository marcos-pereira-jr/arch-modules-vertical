package com.acner.item.infra.container;

import com.acner.item.application.FindUserUsercase;
import com.acner.item.domain.ClientDataSource;
import com.acner.item.domain.FindClientService;
import com.acner.item.infra.persistence.ClientSourcerInMe;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ContainerStarter {
    @Bean
    public ClientDataSource clientDataSource() {
        return new ClientSourcerInMe();
    }

    @Bean
    public FindClientService findClientService(ClientDataSource clientDataSource) {
        return new FindClientService(clientDataSource);
    }

    @Bean
    public FindUserUsercase findUserUsercase(FindClientService service) {
        return new FindUserUsercase(service);
    }
}
