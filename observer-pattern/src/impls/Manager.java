package impls;

/**
 * @author autonu.kro
 */
public class Manager implements Observer{

        private final Subject<Boolean> subject;

        public Manager(Subject<Boolean> subject) {

                this.subject = subject;
                subject.register(this);
        }

        @Override
        public void update() {

                System.out.println("Manager state: " + subject.getState());
        }
}
