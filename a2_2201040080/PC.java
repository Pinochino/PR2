import java.util.Objects;

public class PC {
    private String model;
    private Integer year;
    private String manufacturer;
    private Set<String> Comps;

    public PC(String model, int year, String manufacturer, Set<String> comps)  {
        this.model = model;
        this.year = year;
        this.manufacturer = manufacturer;
        this.Comps = comps;
    }
    public PC(String model, String manufacturer,Set<String> comps)  {
        this.model = model;
        this.manufacturer = manufacturer;
        this.Comps = comps;
    }

    public PC(String model, int year,Set<String> comps)  {
        this.model = model;
        this.year = year;
        this.Comps = comps;
    }

    public PC(String model, Integer year, String manufacturer, Set<String> comps) throws Exception {
        this.model = model;
        this.year = year;
        this.manufacturer = manufacturer;
        Comps = comps;
        if (!isValidatorLengthModel() || !isValidatorMinYear() || !invalidComponent() || !isValidComps() || !isValidatorLengthManufacturer()){
            try {
                throw  new Exception("Please enter the new ones");
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }

    }

    public String getModel() {
        return this.model;
    }

    public void setModel(String model) {
        if (isValidatorLengthModel()){
            this.model = model;
        }
    }

    public Integer getYear() {
        return this.year;
    }

    public String getManufacturer() {
        return this.manufacturer;
    }

    public Set<String> getComps() {
        return Comps;
    }

    public void setComps(Set<String> comps) {
       if (isValidComps()){
           this.Comps = comps;
       }
    }

    public boolean isValidatorLengthModel(){
        return this.getModel().length() <= 20 && !this.getModel().isEmpty() && this.getModel() != null;
    }

    public boolean isValidatorMinYear(){
        return this.getYear() <= 1984;
    }

    public boolean isValidatorLengthManufacturer(){
        return this.getManufacturer().length() <= 15 && !getManufacturer().isEmpty() && this.getManufacturer() != null;
    }

    public boolean isValidComps(){
        return this.getComps() != null;
    }
    public boolean invalidComponent(){
        return isValidatorMinYear() && isValidatorLengthModel() &&  isValidComps();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PC pc = (PC) o;
        return Objects.equals(model, pc.model) && Objects.equals(year, pc.year) && Objects.equals(manufacturer, pc.manufacturer) && Objects.equals(Comps, pc.Comps);
    }

    @Override
    public String toString() {
        return "PC<" + model  +
                ", " + year +
                ", " + manufacturer  +
                ", " + Comps +
                '>';
    }
}
