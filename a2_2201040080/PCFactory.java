public class PCFactory {
    private static PCFactory INSTANCE;

    public PCFactory() {
    }

    private static PCFactory getInstance(){
        if (INSTANCE == null){
            PCFactory instance = PCFactory.getInstance();
        }
        return INSTANCE;
    }

    public PC createObject(String model, int year, String manufacturer, Set<String> comps) throws Exception{
        return new PC(model, year, manufacturer, comps);
    }
    public PC createObject(String model,  String manufacturer, Set<String> comps) throws Exception{
        return new PC(model, manufacturer, comps);
    }
    public PC createObject(String model,  int year, Set<String> comps) throws Exception{
        return new PC(model, year, comps);
    }
}
