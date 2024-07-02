package first_java.design_patterns.builder;

public class Pizza {
    private final String dough;
    private final String sauce;
    private final String cheese;
    private final String topping;

    private Pizza(Builder builder) {
        this.dough = builder.dough;
        this.sauce = builder.sauce;
        this.cheese = builder.cheese;
        this.topping = builder.topping;
    }

    public static class Builder {
        private String dough;
        private String sauce;
        private String cheese;
        private String topping;

        public Builder dough(String dough) {
            this.dough = dough;
            return this;
        }

        public Builder sauce(String sauce) {
            this.sauce = sauce;
            return this;
        }

        public Builder cheese(String cheese) {
            this.cheese = cheese;
            return this;
        }

        public Builder topping(String topping) {
            this.topping = topping;
            return this;
        }

        public Pizza build() {
            return new Pizza(this);
        }
    }

    @Override
    public String toString() {
        return "Pizza [dough=" + dough + ", sauce=" + sauce + ", cheese=" + cheese + ", topping=" + topping + "]";
    }

    public static void main(String[] args) {
        Pizza pizza = new Pizza.Builder()
            .dough("Massa fina")
            .sauce("Tomate")
            .cheese("Mozzarella")
            .topping("Pepperoni")
            .build();

        System.out.println(pizza);
    }
}
