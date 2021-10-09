package aop;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Book {
    @Value("ЖБД")
    private String name;

    @Value("Semenov R.V.")
    private String authot;


    @Value("2021")
    public int yearOfPublication;


    public String getName() {
        return name;
    }

    public String getAuthot() {
        return authot;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }
}
