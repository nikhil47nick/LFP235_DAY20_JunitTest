package com.bridgelabz.Day20;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class EmailTest {
    private String email;
    private String expected;
    private

     EmailTest(String email, String expected){
        super();
        this.email = email;
        this.expected = expected;
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
        UserRegistration ur = new UserRegistration();
        Assert.assertEquals(expected,ur.emailCheck(email));
    }

}