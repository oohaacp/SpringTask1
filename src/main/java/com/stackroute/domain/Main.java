package com.stackroute.domain;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionReader;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;

import java.security.cert.X509Certificate;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        Movie movieobjA = context.getBean("MovieA", Movie.class);
        movieobjA.display();

        Movie movieobjB = context.getBean("MovieB", Movie.class);
        movieobjB.display();

        Movie movieobjC = context.getBean("MovieC", Movie.class);
        movieobjC.display();

        Movie movieobjD = context.getBean("MovieD", Movie.class);
        movieobjD.display();

        Movie movieobjE = context.getBean("MovieE", Movie.class);
        movieobjE.display();

        Movie movieobjF = context.getBean("MovieF", Movie.class);
        movieobjF.display();

        Movie movieobj4 = context.getBean("MovieF", Movie.class);
        System.out.println(movieobj4 == movieobjF);
    }
}