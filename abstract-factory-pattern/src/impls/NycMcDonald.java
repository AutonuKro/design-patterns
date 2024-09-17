package impls;

/**
 * @author autonu.kro
 */
public class NycMcDonald extends McDonald{

        private final BurgerIngredientFactory burgerIngredientFactory;

        public NycMcDonald() {

                this.burgerIngredientFactory = new NycBurgerIngredientFactory();
        }

        @Override
        protected Burger create(String type) {

                Burger burger = new CheezBurger(burgerIngredientFactory);
                burger.name = "Nyc burger";
                burger.make();
                burger.pack();
                return burger;
        }

        public static class NycBurgerIngredientFactory implements BurgerIngredientFactory{

                @Override
                public Buns createBuns() {

                        return new NycBuns();
                }

                @Override
                public Sauce createSauce() {

                        return new NycSauce();
                }

                @Override
                public Petty createPetty() {

                        return new NycPetty();
                }
        }

        public static class NycBuns implements Buns{

                public String toString() {

                        return "Soft NYC buns";
                }
        }

        public static class NycSauce implements Sauce{

                public String toString() {

                        return "Cherry tomato NYC sauce";
                }
        }

        public static class NycPetty implements Petty{

                public String toString() {

                        return "Double chicken NYC chicken";
                }
        }
}
