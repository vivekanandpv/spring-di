package com.example.springdi.domain;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

@Component
public class FictionAuthor extends Author implements InitializingBean, DisposableBean {
    @Override
    public void getDetails() {
        System.out.println("FictionAuthor");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("FictionAuthor: destroy()");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("FictionAuthor: afterPropertiesSet()");
    }
}
