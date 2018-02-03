# Singleton

Demonstration of three approaches for *Singleton*

* *RichardFeynmanA* shows the traditional <code>public final</code> field based singleton which is crude, but gets the job done for simple scenarios
* *RichardFeynmanB* shows a slightly better <code>static factory method</code> based implementation of Singleton. This approach is popular because it's more flexible,
as the code can be modified to change Singleton implementation.
One has to be careful, however, in cases where there is a Serializable Singleton required. In such cases, provide
an implementation of the readResolve() method to disallow creation of duplicates.
* *RichardFeynmanC* shows an unpopular but elegant <code>enum</code> based approach.