public class PCFactory {

    public static PCFactory INSTANCE;

    private PCFactory(){}
   public static  PCFactory getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new PCFactory();
        }
           return INSTANCE;
   }

   public PC createPC(String model, int year, String manufacturer, Set<String> comps) throws Exception{
        return new PC(model, year, manufacturer, comps);
   }

}
