package impls;

/**
 * @author autonu.kro
 */
public abstract class PizzaStore{

        public Pizza order(String type) {

                Pizza pizza = create(type);
                pizza.bake();
                pizza.cut();
                pizza.pack();
                return pizza;
        }

        protected abstract Pizza create(String type);
}
