package me.pugmarx.bettercode.singleton;

/**
 * Static factory method based implementation of Singleton. This approach is popular because it's more flexible,
 * as the code can be modified to change Singleton implementation.
 * One has to be careful, however, in cases where there is a Serializable Singleton required. In such cases, provide
 * an implementation of the readResolve() method to disallow creation of singleton duplicates.
 */
public class RichardFeynmanB {

    private static final RichardFeynmanB _instance = new RichardFeynmanB();

    private RichardFeynmanB(){}

    public static RichardFeynmanB getInstance() {
         return _instance;
    }
}
