package impls;

/**
 * @author autonu.kro
 */
public interface Subject<T>{

        void register(Observer observer);

        void remove(Observer observer);

        void sendNotification();

        T getState();
}
