package guru.springframework.sfgdi.services;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Component
public class SingletonBean {


    public SingletonBean() {
        System.out.println("Creating a Singleton Bean");
    }

    public String getMyScope(){
        return "I'm Singleton!";
    }

}
