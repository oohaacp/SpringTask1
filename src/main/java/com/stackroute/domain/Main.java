package com.stackroute.domain;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.*;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;

public class Main
{
    public static void main(String args[])
    {
        // ApplicationContext.............
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Movie movieobj1 = context.getBean("movie", Movie.class);
        movieobj1.display();



    }
}