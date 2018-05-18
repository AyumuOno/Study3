import java.util.Random;
public class Study03 {
    public static void main(String[] args){
        Random rand = new Random();
        final String Rname = "スコープドック";
        final String Sname = "エンキドゥルガー";

        final int Rhp = 200;
        final int Shp = 400;

        final int Rpower = 50;
        final int Spower = 80;

        final int randomR = rand.nextInt(101);
        final int randomS = rand.nextInt(101);
    
        RealRobot Rrobot = new RealRobot(Rname,Rhp,Rpower,randomR);
        SuperRobot Srobot = new SuperRobot(Sname, Shp, Spower,randomS);

        Rrobot.printStatus();
        Srobot.printStatus();
        System.out.println();

        while(true){
            Rrobot.attack(Srobot);
            Srobot.attack(Rrobot);

            if (Rrobot.hp <= 0){
                System.out.println(Rrobot.name+"のHPが0になった");
                break;
            }
            
            if (Srobot.hp <= 0){
                System.out.println(Srobot.name+"のHPが0になった");
                break;
            }
        }
        System.out.println();
        Rrobot.printStatus();
        Srobot.printStatus();
    }

}