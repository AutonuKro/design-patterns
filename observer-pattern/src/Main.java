import impls.Manager;
import impls.Observer;
import impls.ProductAvialableSubject;
import impls.User;

/**
 * @author autonu.kro
 */
public class Main{

        public static void main(String[] args) {

                ProductAvialableSubject productAvialableSubject = new ProductAvialableSubject();
                Observer observer = new User(productAvialableSubject);
                observer = new Manager(productAvialableSubject);
                productAvialableSubject.setState(true);
                productAvialableSubject.setState(false);
        }
}