package com.jimi.springframework.container;

import com.jimi.springframework.pet.service.PetStoreService;
import org.springframework.beans.factory.groovy.GroovyBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.context.support.GenericGroovyApplicationContext;

import java.util.List;

public class ContainerInstanceSample {
    public static void main(String[] args) {
        // create and configure beans
        ApplicationContext context = new ClassPathXmlApplicationContext("services.xml", "daos.xml");

      // retrieve configured instance
        PetStoreService service = context.getBean("petStore", PetStoreService.class);

// use configured instance
        List<String> userList = service.getUsernameList();
    }


    /**
     * With Groovy configuration,
     */
   public static void createContainnerByGroovy(){
        ApplicationContext context = new GenericGroovyApplicationContext("services.groovy", "daos.groovy");
    }

    /**
     * The most flexible variant is GenericApplicationContext in combination with reader delegates
     */
    public  static  void  createGenericApplicationContextLoadGroovy(){
        GenericApplicationContext context = new GenericApplicationContext();
        new GroovyBeanDefinitionReader(context).loadBeanDefinitions("services.groovy", "daos.groovy");
        context.refresh();
    }
    /**
     * The most flexible variant is GenericApplicationContext in combination with reader delegates
     */
    public  static  void  createGenericApplicationContextLoadXml(){
        GenericApplicationContext context = new GenericApplicationContext();
        new XmlBeanDefinitionReader(context).loadBeanDefinitions("services.xml", "daos.xml");
        context.refresh();
    }
}
