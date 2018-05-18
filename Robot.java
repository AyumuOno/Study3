public class Robot{
    private String name;
    private int hp;
    private int power;
    public Robot(String name, int hp, int power){
        this.name = name;
        this.hp = hp;
        this.power = power;
    }

    public void attack(Robot enemy){
        enemy.hp -= this.power;
        System.out.println(this.name + "の攻撃！ " + enemy.name + "に" + this.power + "のダメージ！");
        if (enemy.hp < 0)enemy.hp = 0;
    }

    public void printStatus(){
        System.out.println("機体名: "+ this.name);
        System.out.println("耐久力: "+ this.hp + " 攻撃力: " + this.power);
    }
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @return the hp
     */
    public int getHp() {
        return hp;
    }

        /**
     * @param hp the hp to set
     */
    public void setHp(int hp) {
        this.hp = hp;
    }
    /**
     * @return the power
     */
    public int getPower() {
        return power;
    }

    /**
     * @param power the power to set
     */
    public void setPower(int power) {
        this.power = power;
    }

}