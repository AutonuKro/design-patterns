package impls;

/**
 * @author autonu.kro
 */
public abstract class SmartControllerFactory<T>{

        public void doExecute(T data, String type) {

                SmartController<T> smartController = create(type);
                smartController.execute(data);
        }

        protected abstract SmartController<T> create(String type);
}
