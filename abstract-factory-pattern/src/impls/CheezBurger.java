package impls;

/**
 * @author autonu.kro
 */
public class CheezBurger extends Burger{

        private final BurgerIngredientFactory burgerIngredientFactory;

        public CheezBurger(BurgerIngredientFactory burgerIngredientFactory) {

                this.burgerIngredientFactory = burgerIngredientFactory;
        }

        @Override
        public void make() {

                System.out.println("Preparing: " + name);
                buns = burgerIngredientFactory.createBuns();
                sauce = burgerIngredientFactory.createSauce();
                petty = burgerIngredientFactory.createPetty();

                System.out.println("Ingredients : ");
                System.out.println("            1. " + buns);
                System.out.println("            2. " + sauce);
                System.out.println("            3. " + petty);
        }
}
