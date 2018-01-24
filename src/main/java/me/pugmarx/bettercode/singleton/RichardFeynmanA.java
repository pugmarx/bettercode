package me.pugmarx.bettercode.singleton;

/**
 * Public final field based singleton. Crude, but gets the job done for simple scenarios
 */
public class RichardFeynmanA {
    public static final RichardFeynmanA INSTANCE = new RichardFeynmanA();
    private RichardFeynmanA(){}
}