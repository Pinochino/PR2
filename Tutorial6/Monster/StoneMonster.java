package Tutorial6.Monster;

public class StoneMonster extends  Monster{
    public StoneMonster() {
    }
    public StoneMonster(String name) {
        super(name);
    }
    @Override
    String attack() {
        return getName() + " bring fire to the earth" + Math.random();
    }
}
