public class FireMonster extends Monster {

    public FireMonster(String name) {
        super(name);
    }

    @Override
    String attack() {
        return getName() + " bring fire to the earth" + Math.random();
    }
}
