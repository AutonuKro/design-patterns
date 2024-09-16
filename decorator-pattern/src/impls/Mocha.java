package impls;

/**
 * @author autonu.kro
 */
public class Mocha extends BeverageDecorator{

        private static final double COST_OF_MOCHA = 12.50;

        public Mocha(Beverage beverage) {

                super(beverage);
                description = "Decorated with mocha";
        }

        @Override
        public double cost() {

                return COST_OF_MOCHA + beverage.cost();
        }

        @Override
        public void print() {
                System.out.print(description + " ");
                beverage.print();
        }
}
