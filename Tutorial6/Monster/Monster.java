package Tutorial6.Monster;
abstract class Monster {
    private  String name;

    public Monster(String name) {
    }

    abstract  String attack();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Monster(){
        this.name = "Unamed Monster";
    }
}
