package impls;

import java.util.ArrayList;
import java.util.List;

/**
 * @author autonu.kro
 */
public class ProductAvialableSubject implements Subject<Boolean>{

        private final List<Observer> observers;

        private boolean state;

        public ProductAvialableSubject() {

                this.observers = new ArrayList<>();
        }

        @Override
        public void register(Observer observer) {

                observers.add(observer);
        }

        @Override
        public void remove(Observer observer) {

                observers.remove(observer);
        }

        @Override
        public void sendNotification() {

                for(Observer observer : observers) {
                        observer.update();
                }
        }

        @Override
        public Boolean getState() {

                return state;
        }

        public void setState(boolean state) {

                this.state = state;
                sendNotification();
        }
}
