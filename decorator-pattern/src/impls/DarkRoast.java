package impls;

/**
 * @author autonu.kro
 */
public class DarkRoast extends Beverage{

        public DarkRoast() {

                description = "Dark Roast Coffee";
        }

        @Override
        public double cost() {

                return 35.50;
        }

        @Override
        public void print() {

                System.out.println(description);
        }
}
