package impls;

/**
 * @author autonu.kro
 */
public class Milk extends BeverageDecorator{

        private static final double COST_OF_MILK = 10.25;

        public Milk(Beverage beverage) {

                super(beverage);
                description = "Decorated with milk";
        }

        @Override
        public double cost() {

                return COST_OF_MILK + beverage.cost();
        }

        @Override
        public void print() {

                System.out.print(description + " ");
                beverage.print();
        }
}
