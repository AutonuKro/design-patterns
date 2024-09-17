package impls;

/**
 * @author autonu.kro
 */
public abstract class Burger{

        protected String name;

        protected Buns buns;

        protected Petty petty;

        protected Sauce sauce;

        public abstract void make();

        public void pack() {

                System.out.println("Packing with care");
        }
}
