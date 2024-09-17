import impls.*;

/**
 * @author autonu.kro
 */
public class FactoryMethodPattern{

        public static void main(String[] args) {

                PizzaStore indinaPizzaStore = new IndianPizzaStore();
                PizzaStore usaPizzaStore = new UsaPizzaStore();
                Pizza indianPizza = indinaPizzaStore.order("veg");
                Pizza usaPizza = usaPizzaStore.order("nyc");
                System.out.println(indianPizza.getType());
                System.out.println(usaPizza.getType());

                SmartControllerFactory<Double> factory = new RPSSmartControllerFactory();
                factory.doExecute(100.0, "365");
        }
}
