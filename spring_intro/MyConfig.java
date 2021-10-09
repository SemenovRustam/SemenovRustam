package spring_intro;


import org.springframework.context.annotation.*;

@Configuration
@PropertySource("myApp.properties")
//@ComponentScan("spring_intro")
public class MyConfig {

    @Bean
    @Scope("singleton")
    public Pet catBean(){
        return  new Cat();
    }
    @Bean
    public Person  personBean(){
        return new Person(catBean());
    }
}
