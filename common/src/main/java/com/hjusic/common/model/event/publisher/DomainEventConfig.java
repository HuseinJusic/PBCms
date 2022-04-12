package com.hjusic.common.model.event.publisher;

import com.hjusic.common.model.event.DomainEvents;
import io.micrometer.core.instrument.MeterRegistry;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.annotation.Bean;

public class DomainEventConfig {

    @Bean
    DomainEvents domainEvents(ApplicationEventPublisher applicationEventPublisher, MeterRegistry meterRegistry) {
        return new MeteredDomainEventPublisher(new JustForwardDomainEventPublisher(applicationEventPublisher), meterRegistry);
    }
}
