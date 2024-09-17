package impls;

/**
 * @author autonu.kro
 */
public abstract class Pizza{

        protected String name;

        protected String dough;

        protected String sauce;

        public String getType() {

                return name + " " + dough + " dough " + "with " + sauce + " sauce.";
        }

        public void bake() {

                System.out.println("30 minutes to baking");
        }

        public void cut() {

                System.out.println("Slicing 4 pieces");
        }

        public void pack() {

                System.out.println("Packing with care");
        }
}
