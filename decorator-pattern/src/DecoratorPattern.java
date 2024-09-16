import impls.*;

/**
 * @author autonu.kro
 */
public class DecoratorPattern{

        public static void main(String[] args) {

                Beverage darkRoast = new DarkRoast();
                darkRoast = new Milk(darkRoast);
                darkRoast = new Mocha(darkRoast);
                System.out.println(darkRoast.cost());
                darkRoast.print();

                Beverage darkRoastWithDoubleMoacha = new DarkRoast();
                darkRoastWithDoubleMoacha = new Mocha(darkRoastWithDoubleMoacha);
                darkRoastWithDoubleMoacha = new Mocha(darkRoastWithDoubleMoacha);
                System.out.println(darkRoastWithDoubleMoacha.cost());
                darkRoastWithDoubleMoacha.print();
        }
}
