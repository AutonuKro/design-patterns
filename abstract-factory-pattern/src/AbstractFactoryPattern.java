import impls.Burger;
import impls.McDonald;
import impls.NycMcDonald;

/**
 * @author autonu.kro
 */
public class AbstractFactoryPattern{

        public static void main(String[] args) {

                McDonald mcDonald = new NycMcDonald();
                Burger burger = mcDonald.order("burger");
        }
}
