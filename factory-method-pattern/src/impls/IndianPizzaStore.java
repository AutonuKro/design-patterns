package impls;

/**
 * @author autonu.kro
 */
public class IndianPizzaStore extends PizzaStore{

        @Override
        protected Pizza create(String type) {

                return switch(type.toLowerCase()) {
                        case "veg" -> new IndianVegPizza();
                        case "non-veg" -> new IndianNonVegPizza();
                        default -> null;
                };
        }

        public static class IndianVegPizza extends Pizza{

                public IndianVegPizza() {

                        dough = "Ata";
                        name = "Indian Veg Pizza";
                        sauce = "Tomato";
                }
        }

        public static class IndianNonVegPizza extends Pizza{

                public IndianNonVegPizza() {

                        dough = "Ata";
                        name = "Indian Non Veg Pizza";
                        sauce = "Chicken";
                }
        }
}
