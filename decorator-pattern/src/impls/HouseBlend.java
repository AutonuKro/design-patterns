package impls;

/**
 * @author autonu.kro
 */
public class HouseBlend extends Beverage{

        public HouseBlend() {

                description = "Beverage house blend";
        }

        @Override
        public double cost() {

                return 20.00;
        }

        @Override
        public void print() {

                System.out.println(description);
        }
}
