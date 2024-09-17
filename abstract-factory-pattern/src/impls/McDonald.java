package impls;

/**
 * @author autonu.kro
 */
public abstract class McDonald{

        public Burger order(String type) {

                return create(type);
        }

        protected abstract Burger create(String type);
}
