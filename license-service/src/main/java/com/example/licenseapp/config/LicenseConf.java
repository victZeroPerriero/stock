package com.example.licenseapp.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;

import java.util.Locale;

//@Configuration
//public class LicenseConf {
//    private static final String MESSAGES="messages";
//
//    @Bean
//    public LocaleResolver localeResolver(){
//        SessionLocaleResolver localeResolver = new SessionLocaleResolver();
//        localeResolver.setDefaultLocale(Locale.US);
//        return localeResolver;
//    }
//
//    @Bean
//    public ResourceBundleMessageSource messageSource(){
//        ResourceBundleMessageSource messageSource = new ResourceBundleMessageSource();
//        messageSource.setUseCodeAsDefaultMessage(true);
//        messageSource.setBasenames(MESSAGES);
//        return messageSource;
//    }
//
//}
