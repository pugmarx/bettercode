package me.pugmarx.bettercode.builder;


/**
 * Demo of *Item 2* from EffectiveJava 2E.
 * Builder [GOF] can be used when a class contains a number of optional parameters. Providing multiple constructors in
 * such cases leads to bloated code, which is also confusing as the user has to keep a count of the parameters, and
 * their indices. Static factories aren't useful since the number of optional parameters can be large, hence creating
 * a static method for each combination can be a pain. JavaBeans have been traditionally used to handle such cases, but
 * JavaBeans suffer from the drawback of potentially being used in an inconsistent state; unless they're immutable!
 */
public class Cake {
    private final int flour;
    private final int bakingPowder;

    // Optional params
    private final int eggs;
    private final int icing;
    private final int sugar;
    private final int cocoa;
    private final int oil;

    public Cake(Maker maker) {
        this.flour = maker.flour;
        this.bakingPowder = maker.bakingPowder;
        this.eggs = maker.eggs;
        this.icing = maker.icing;
        this.sugar = maker.sugar;
        this.cocoa = maker.cocoa;
        this.oil = maker.oil;
    }

    // Builder
    public static class Maker implements Builder<Cake> {
        // Required params
        private final int flour;
        private final int bakingPowder;

        // Optional - initialized to defaults
        private int eggs = 0;
        private int icing = 0;
        private int sugar = 0;
        private int cocoa = 0;
        private int oil = 0;

        public Maker(int flourOz, int bakingPowderMg) {
            this.flour = flourOz;
            this.bakingPowder = bakingPowderMg;
        }

        public Maker oil(int oilOz) {
            oil = oilOz;
            return this;
        }

        public Maker cocoa(int cocoaMg) {
            cocoa = cocoaMg;
            return this;
        }

        public Maker icing(int icingMg) {
            icing = icingMg;
            return this;
        }

        public Maker sugar(int sugarMg) {
            sugar = sugarMg;
            return this;
        }

        public Maker eggs(int eggCount) {
            eggs = eggCount;
            return this;
        }

        public Cake build() {
            return new Cake(this);
        }
    }
}
