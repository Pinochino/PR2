
import utils.DomainConstraint;

import java.util.Objects;

public class PC {
    @DomainConstraint(type = "String", mutable = true, optional = false, length = 20, min = Double.NaN, max = Double.NaN)
    private String model;

    @DomainConstraint(type = "Integer", mutable = false, optional = false, length = -1, min = 1984, max = Double.NaN)
    private Integer year;

    @DomainConstraint(type = "String", mutable = false, optional = false, length = 15, min = Double.NaN, max = Double.NaN)
    private String manufacturer;

    @DomainConstraint(type = "String", mutable = true, optional = false, length = -1, min = Double.NaN, max = Double.NaN)
    private Set<String> Comps;

    public PC(String model, int year, String manufacturer, Set<String> comps)  {
        this.model = model;
        this.Comps = comps;
        if (!isValidatorLengthModel() && !isValidatorMinYear() ){
            try {
                throw  new Exception("Please enter the new ones");
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }

    }

    public PC(String model, Integer year, String manufacturer, Set<String> comps) throws Exception {
        this.model = model;
        this.year = year;
        this.manufacturer = manufacturer;
        Comps = comps;
        if (!invalidComponent()){
            throw  new Exception("Please enter the new ones");
        }

    }

    public String getModel() {
        return this.model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getYear() {
        return this.year;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public Set<String> getComps() {
        return Comps;
    }

    public void setComps(Set<String> comps) {
        Comps = comps;
    }

    public boolean isValidatorLengthModel(){
        if (this.getModel().length() > 20 || this.getModel().isEmpty()){
            return false;
        }
        return  true;
    }

    public boolean isValidatorMinYear(){

        if (this.getYear() > 1984){
            return false;
        }
        return  true;
    }

    public boolean isValidatorLengthManufacturer(){
        if (this.getManufacturer().length() > 15 || getManufacturer().isEmpty()){
            return false;
        }
        return  true;
    }

    public boolean isValidComps(){
        return this.getComps() != null;
    }
    public boolean invalidComponent(){
        return isValidatorMinYear() && isValidatorLengthModel() &&  isValidComps();
    }
    @Override
    public boolean equals(Object obj) {
         if (this == obj) return true;
         if (!(obj instanceof PC)) return false;
         PC p = (PC) obj;
         return Objects.equals(model, p.model) &&
                 Objects.equals(year, p.year) &&
                 Objects.equals(manufacturer, p.manufacturer) &&
                 Objects.equals(Comps, p.Comps);
    }


    @Override
    public String toString() {
        return "PC{" +
                "model='" + model + '\'' +
                ", year=" + year +
                ", manufacturer='" + manufacturer + '\'' +
                ", Comps=" + Comps +
                '}';
    }
}
