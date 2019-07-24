package _4_builder;

/**
 * Created by Alvin on 2019-07-24.
 */

public class BaoZi {
    /** 粉 */
    private final String powder;
    /** 內餡 */
    private final String stuff;
    /** 加入牛奶 */
    private boolean addingMilk;
    /** 加入雞蛋 */
    private boolean addingEgg;
    /** 調味 */
    private String flavor;

    private BaoZi(BaoZiBuilder builder) {
        this.powder = builder.powder;
        this.stuff = builder.stuff;
        this.addingMilk = builder.addingMilk;
        this.addingEgg = builder.addingEgg;
        this.flavor = builder.flavor;
    }

    /**
     * @return the {@link #powder}
     */
    public String getPowder() {
        return powder;
    }

    /**
     * @return the {@link #stuff}
     */
    public String getStuff() {
        return stuff;
    }

    /**
     * @return the {@link #addingMilk}
     */
    public boolean isAddingMilk() {
        return addingMilk;
    }

    /**
     * @return the {@link #addingEgg}
     */
    public boolean isAddingEgg() {
        return addingEgg;
    }

    /**
     * @return the {@link #flavor}
     */
    public String getFlavor() {
        return flavor;
    }

    @Override
    public String toString() {
        return "BaoZi{" +
                "powder='" + powder + '\'' +
                ", stuff='" + stuff + '\'' +
                ", addingMilk=" + addingMilk +
                ", addingEgg=" + addingEgg +
                ", flavor='" + flavor + '\'' +
                '}';
    }

    public static class BaoZiBuilder {

        /** 粉 */
        private String powder;
        /** 內餡 */
        private String stuff;
        /** 加入牛奶 */
        private boolean addingMilk;
        /** 加入雞蛋 */
        private boolean addingEgg;
        /** 調味 */
        private String flavor;

        BaoZiBuilder(String powder , String stuff) {
            this.powder = powder;
            this.stuff = stuff;
        }

        public static BaoZiBuilder getInstance(String powder , String stuff) {
            return new BaoZiBuilder(powder , stuff);
        }

        public BaoZiBuilder addingMilk(boolean addingMilk) {
            this.addingMilk = addingMilk;
            return this;
        }

        public BaoZiBuilder addingEgg(boolean addingEgg) {
            this.addingEgg = addingEgg;
            return this;
        }

        public BaoZiBuilder setFlavor(String flavor) {
            this.flavor = flavor;
            return this;
        }

        public BaoZi build(){
            return new BaoZi(this);
        }
    }
}
