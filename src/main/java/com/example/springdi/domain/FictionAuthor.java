package com.example.springdi.domain;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class FictionAuthor extends Author {
    @Override
    public void getDetails() {
        System.out.println("FictionAuthor");
    }

    @PostConstruct
    public void postConstruction() {
        System.out.println("FictionAuthor: postConstruction()");
    }

    @PreDestroy
    public void preDestroy() {
        System.out.println("FictionAuthor: preDestroy()");
    }
}
