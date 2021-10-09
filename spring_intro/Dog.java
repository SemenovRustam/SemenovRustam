package spring_intro;


import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

//@Component
public class Dog implements Pet{
    //private String name;
    public Dog(){
        System.out.println("Dog bean is created");
    }
    @Override
    public void say() {
        System.out.println("Gav Gav");
    }


//    @PostConstruct
//    protected void init(){
//        System.out.println("init method");
//    }
//   @PreDestroy
//    private void destroy(){
//        System.out.println("destroy method");
//    }

//    public String getName() {
//        return name;
//    }

//    public void setName(String name) {
//        this.name = name;
//    }
}
