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

public class Main
{
    public static void main(String[] args)
    {
        ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
        System.out.println("bean.xml file loaded");
        Movie movie=context.getBean("movie", Movie.class);
        movie.display();

        ClassPathResource res=new ClassPathResource("beans.xml");
        BeanFactory factory=new XmlBeanFactory(res);
        Movie movie1=context.getBean("movie", Movie.class);
        movie1.display();

        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
        BeanDefinitionReader reader = new XmlBeanDefinitionReader(beanFactory);
        reader.loadBeanDefinitions(new FileSystemResource("src/main/resources/beans.xml"));
        Movie movie2= (Movie) beanFactory.getBean("movie");
        movie2.display();
    }
}
