package impls;

/**
 * @author autonu.kro
 */
public class User implements Observer{

        private final Subject<Boolean> subject;

        public User(Subject<Boolean> subject) {

                this.subject = subject;
                subject.register(this);
        }

        @Override
        public void update() {

                System.out.println("User state : " + subject.getState());
        }
}
