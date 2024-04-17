public class WaterMonster extends Monster {
    public WaterMonster() {
    }
    public WaterMonster(String name) {
        super(name);
    }

    @Override
    String attack() {
        return getName() + " bring fire to the earth" + Math.random();
    }
}
