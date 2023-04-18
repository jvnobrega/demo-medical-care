package com.acme.demo.medical.care.infra;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@Import({})
@EntityScan("com.acme.demo.medical.care.domain")
@EnableJpaRepositories("com.acme.demo.medical.care.domain")
@EnableTransactionManagement
public class CustomerMainConfiguration {

}
