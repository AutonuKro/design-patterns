package impls;

/**
 * @author autonu.kro
 */
public class RPSSmartControllerFactory extends SmartControllerFactory<Double>{

        @Override
        protected SmartController<Double> create(String type) {

                return switch(type) {
                        case "360" -> new RPS360SmartController();
                        case "365" -> new RPS365SmartController();
                        default -> null;
                };
        }

        public static class RPS360SmartController implements SmartController<Double>{

                @Override
                public void execute(Double data) {

                        System.out.println("Class: " + getClass() + ", value: " + data);
                }
        }

        public static class RPS365SmartController implements SmartController<Double>{

                @Override
                public void execute(Double data) {

                        System.out.println("Class: " + getClass() + ", value: " + data);
                }
        }
}
