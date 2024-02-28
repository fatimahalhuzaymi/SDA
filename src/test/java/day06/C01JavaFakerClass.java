package day06;

import com.github.javafaker.Faker;
import org.junit.Test;

public class C01JavaFakerClass {



    @Test
    public void testFaker(){
        Faker faker = new Faker();
        String fullname1= faker.name().fullName();
        String fullname2= faker.name().fullName();


        System.out.println("fullname"+fullname1);
        System.out.println("faullname"+fullname2);

        System.out.println("faker.number()="+faker.number().numberBetween(180,999));
        System.out.println(fullname1+"  " +fullname2);

        System.out.println("faker.address().fullAddress="+faker.address().fullAddress());
        System.out.println("faker.internet().emailAddress ="+faker.internet().emailAddress());
        System.out.println("faker.internet().password(6,8,true,true,false) = " + faker.internet().password(6, 8, true, true, false));


    }
}
