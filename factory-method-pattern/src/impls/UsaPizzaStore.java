package impls;

/**
 * @author autonu.kro
 */
public class UsaPizzaStore extends PizzaStore{

        @Override
        protected Pizza create(String type) {

                return switch(type.toLowerCase()) {
                        case "nyc" -> new NycPizza();
                        case "chicago" -> new ChicagoPizza();
                        default -> null;
                };
        }

        public static class NycPizza extends Pizza{

                public NycPizza() {

                        name = "NYC Pizza";
                        dough = "Thin crust";
                        sauce = "Buffalo";
                }
        }

        public static class ChicagoPizza extends Pizza{

                public ChicagoPizza() {

                        name = "Chicago Pizza";
                        dough = "Thick crust";
                        sauce = "White sauce";
                }
        }
}
