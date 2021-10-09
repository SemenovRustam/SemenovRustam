package spring_intro;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.w3c.dom.ls.LSOutput;

public class ScopeTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext3.xml");
        Dog myDog = context.getBean("dog", Dog.class);
        myDog.say();
//        Dog yourDog = context.getBean("dog", Dog.class);
//
//
//        System.out.println("ссылаются на одну переменную?" +
//                (myDog==yourDog));
//        System.out.println(myDog);
//        System.out.println(yourDog);
        context.close();
    }
}
