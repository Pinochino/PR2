import utils.DomainConstraint;

public class PC {
    @DomainConstraint(type = "String", mutable = true, optional = false, length = 20, min = Double.NaN, max = Double.NaN)
    private String model;


    @DomainConstraint(type = "Integer", mutable = false, optional = false, length = -1, min = 1984, max = Double.NaN)
    private Integer year;


    @DomainConstraint(type = "String", mutable = false, optional = false, length = 15, min = Double.NaN, max = Double.NaN)
    private String manufacturer;

    @DomainConstraint(type = "String", mutable = true, optional = false, length = -1, min = Double.NaN, max = Double.NaN)
    private Set<String> Comps;

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
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
