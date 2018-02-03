# AutoValue
 Demo of *Item 10* from EffectiveJava 3/E.

 All objects must obey general contract when overriding <code>equals</code>. <code>AutoValue</code> from Google
 saves the programmer from writing custom <code>equals</code> and <code>hashCode</code> implementations. IDEs can
 generate implementations, but they're fragile -- and not future-proof. <code>AutoValue</code> annotation is a smarter
 approach, therefore.

 See:

 1. AutoValue introduction: https://github.com/google/auto/blob/master/value/userguide/index.md
 2. AutoValue Builder: https://github.com/google/auto/blob/master/value/userguide/builders.md