package org.hcl.shoppingcart;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.hcl.shoppingcart.*;
public class Test {
public static void main(String[] args) {
ClassPathResource resource=new ClassPathResource("/ShoppingCart/src/main/resources/spring-beans.xml");
XmlBeanFactory factory= new XmlBeanFactory(resource);
     ShoppingCart shoppingCart =(ShoppingCart)factory.getBean("shoppingCart");
Cashier cashier=(Cashier)factory.getBean("cashier");
cashier.calculateTotalPrice(shoppingCart);
}
}
