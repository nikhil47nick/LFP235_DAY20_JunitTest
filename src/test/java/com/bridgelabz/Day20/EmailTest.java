package com.bridgelabz.Day20;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static junit.framework.TestCase.assertEquals;


@RunWith(Parameterized.class)
public class EmailTest {
    private String email;
    private String expected;
    private UserRegistration userRegistration;

     public EmailTest(String email, String expected){
        this.email = email;
        this.expected = expected;
    }

    @Before
    public void initialize() {
        userRegistration = new UserRegistration();
    }

    @Parameterized.Parameters
    public static Collection input(){
        return Arrays.asList(new Object[][] { {"abc@yahoo.com","Valid"},
                                        {"abc-100@yahoo.com","Valid"},
                                         {"abc.100@yahoo.com","Valid"},
                                            {"abc111@abc.com","Valid"},
                                            {"abc-100@abc.net","Valid"},
                                            {"abc.100@abc.com.au","Valid"},
                                            {"abc@1.com","Valid"},
                                            {"abc@gmail.com.com","Valid"},
                                            {"abc+100@gmail.com","Valid"} } );
    }

    @Test
    public void testEmail(){
        System.out.println("Parameterized mail is : " + email);
        String result = userRegistration.emailCheck(email);
        assertEquals(expected,result);

    }

}
