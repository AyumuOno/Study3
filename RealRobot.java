public class RealRobot extends Robot{
    private int evasion = 0;

    public RealRobot(String name, int hp, int power, int evasion){
        super(name,hp,power);
        this.evasion = evasion;
    }

    public void printStatus(){
        System.out.println("リアルロボット");
        System.out.println("機体名: "+ this.name);
        System.out.println("耐久力: "+ this.hp + " 攻撃力: " + this.power);
        System.out.println("回避確率" + this.evasion);
    }
    
    /**
     * @return the evasion
     */
    public int getEvasion() {
        return evasion;
    }
}