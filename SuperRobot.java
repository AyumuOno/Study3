import java.util.Random;
public class SuperRobot extends Robot{
    private int enhance = 0;
    private int randomEnhance = 0;
    private int randomEvasion = 0;
    Random rand = new Random();
    public SuperRobot(String name, int hp, int power, int enhance){
        super(name,hp,power);
        this.enhance = enhance;
    }

    public void attack(RealRobot enemy){
        randomEnhance = rand.nextInt(101);
        randomEvasion = rand.nextInt(101);
        if(randomEnhance < this.enhance){
            this.power *= 1.2;
            System.out.println(this.name + "は気合でパワーアップした！攻撃力が" + this.power + "になった！");
        }
        if(randomEvasion < enemy.getevasion()){
            System.out.println(this.name + "の攻撃！ しかし，スコープドッグターボカスタムは回避した!");
        }else{
            System.out.println(this.name + "の攻撃！ " + enemy.name + "に" + this.power + "のダメージ！");
            enemy.setHp(enemy.getHp() - this.power);
            if (enemy.hp < 0)enemy.hp = 0;
        }
    }

    public void printStatus(){
        System.out.println("スーパーロボット");
        System.out.println("機体名: "+ this.name);
        System.out.println("耐久力: "+ this.hp + " 攻撃力: " + this.power);
        System.out.println("強化確率" + this.enhance);
    }
}