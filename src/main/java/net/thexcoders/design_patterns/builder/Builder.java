package net.thexcoders.design_patterns.builder;

public class Builder {
    // used to get rid of the constructor overloads and
    // "build" the instance using setters;


    private int attr1;
    private String attr2;
    private boolean attr3;


    public static class MyBuilder {
        Builder builder = new Builder();

        public MyBuilder setAttr1(int val) {
            builder.attr1 = val;
            return this;
        }

        public MyBuilder setAttr2(String val) {
            builder.attr2 = val;
            return this;
        }

        public MyBuilder setAttr3(boolean val) {
            builder.attr3 = val;
            return this;
        }

        public Builder build() {
            return this.builder;
        }

    }


    public static void main(String[] args) {
        // calling an example

        Builder builderDP1 = new Builder.MyBuilder()
                .setAttr1(3)
                .setAttr2("Hello World")
                .setAttr3(true)
                .build();

        Builder builderDP2 = new Builder.MyBuilder()
                .setAttr1(6)
                .setAttr3(false)
                .build();

    }
}
