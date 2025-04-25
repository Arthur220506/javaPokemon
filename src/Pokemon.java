public class Pokemon {
    private String name;
    private String type;
    private int hp;
    private int damage;

    public Pokemon(String name, String type, int hp, int damage) {
        this.name = name;
        this.type = type;
        this.hp = hp;
        this.damage = damage;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public int getHp() {
        return hp;
    }
    public void setHp(int hp) {
        this.hp = hp;
    }
    public int getDamage() {
        return damage;
    }
    public void setDamage(int damage) {
        this.damage = damage;
    }

    
}
