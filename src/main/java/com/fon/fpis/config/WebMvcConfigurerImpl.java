package com.fon.fpis.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebMvcConfigurerImpl implements WebMvcConfigurer {

    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**").allowedHeaders("*").allowedMethods("*").allowedOrigins("*").allowCredentials(true);
    }

//    public Validator getValidator() {
//        return validator();
//    }
//
//    @Bean
//    public LocalValidatorFactoryBean validator() {
//        LocalValidatorFactoryBean validator = new LocalValidatorFactoryBean();
//        validator.setValidationMessageSource(validationMessageSource());
//        return validator;
//    }
//
//    @Bean
//    public ReloadableResourceBundleMessageSource validationMessageSource() {
//        ReloadableResourceBundleMessageSource messageSource = new ReloadableResourceBundleMessageSource();
//        messageSource.setBasename("classpath:ValidationMessages");
//        return messageSource;
//    }
}
