package prototypeInSinglton;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * Created by asus on 6/15/2020.
 */
public class Singlton implements IClass , ApplicationContextAware {

    private ApplicationContext context;

    private Prototype prototype;

   /* public Prototype getPrototype() {

        return prototype;
    }*/

    public Prototype getPrototype() {

        return context.getBean("prot",Prototype.class);
    }

    public void setPrototype(Prototype prototype) {
        this.prototype = prototype;
    }

    public Singlton(){
        System.out.println(" create Singlton object ");
    }

    public void print(){
        System.out.println(" print Prototype");
    }

   @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
          this.context=applicationContext;
    }
}
