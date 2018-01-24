package me.pugmarx.bettercode.singleton;

import org.junit.Test;

import static junit.framework.TestCase.assertNotNull;
import static org.junit.Assert.assertEquals;

public class RichardFeynmanValidator {

    @Test
    public void checkPublicFieldBasedInvocation(){
        RichardFeynmanA richardFeynmanA = RichardFeynmanA.INSTANCE;
        assertNotNull(richardFeynmanA);
    }

    @Test
    public void checkStaticMethodBasedInvocation(){
        RichardFeynmanB richardFeynmanB = RichardFeynmanB.getInstance();
        assertNotNull(richardFeynmanB);
    }

    @Test
    public void checkEnumBasedApproach(){
        RichardFeynmanC richardFeynmanC = RichardFeynmanC.INSTANCE;
        assertNotNull(richardFeynmanC);

        RichardFeynmanC richardFeynmanC2 = RichardFeynmanC.INSTANCE;

        assertEquals(richardFeynmanC, richardFeynmanC2);
    }

}
