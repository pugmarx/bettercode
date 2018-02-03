# Builder
### Demo of *Item 2* from EffectiveJava 3/E

Builder [GOF] can be used when a class contains a number of optional parameters. Providing multiple constructors in
such cases leads to bloated code, which is also confusing as the user has to keep a count of the parameters, and
their indices. Static factories aren't useful since the number of optional parameters can be large, hence creating
a static method for each combination can be a pain. JavaBeans have been traditionally used to handle such cases, but
JavaBeans suffer from the drawback of potentially being used in an inconsistent state; unless they're immutable!