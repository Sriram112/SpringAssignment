package test;

import classes.Cat;
import classes.Color;
import classes.Config;
import classes.Dog;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.awt.*;

public class CatandDogTest {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(Config.class);
        /* CAT AND IT'S COLOR OBJECTS */
        Cat c1= ctx.getBean(Cat.class);
        classes.Color color = new Color();
        color.setBase_color("White");
        color.setTexture_color("White");
        c1.setCat_name("lucky");
        c1.setBreed_name("PersianCat");
        c1.setOwner_name("sriram");
        c1.setColor(color);
        c1.catDisplay();


        Dog d1=ctx.getBean(Dog.class);
        classes.Color color1 = new Color();
        color1.setBase_color("black");
        color1.setTexture_color("Black");
        d1.setDog_name("Puppy");
        d1.setBreed_name("husky");
        d1.setOwner_name("sriram");
        d1.setColor(color1);
        d1.dogDisplay();
    }
}
