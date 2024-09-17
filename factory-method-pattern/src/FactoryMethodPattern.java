import impls.IndianPizzaStore;
import impls.Pizza;
import impls.PizzaStore;
import impls.UsaPizzaStore;

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
        }
}
