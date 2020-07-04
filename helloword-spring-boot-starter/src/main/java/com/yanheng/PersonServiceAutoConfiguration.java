package com.yanheng;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author yanHeng
 * @date 2020-05-25 21:53
 * @description 自动配置类
 */
@Configuration
@EnableConfigurationProperties(PersonProperties.class)
@ConditionalOnClass(PersonService.class)
@ConditionalOnProperty(prefix = "spring.person",value = "enabled",matchIfMissing = true)
public class PersonServiceAutoConfiguration {

    @Autowired
    private PersonProperties personProperties;

    @Bean
    @ConditionalOnMissingBean(PersonService.class)
    public PersonService personService(){
        PersonService personService = new PersonService(personProperties);
        return personService;
    }
}
