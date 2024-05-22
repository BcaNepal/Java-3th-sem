//Math.random()
// Math class is in java.lang package

import java.util.Random;

public class RandomNum{
    public static void main(String[] args){
    //     for(int i=0; i<10;++i){
    //         System.out.println(Math.random());
    //     }
    //     System.out.println("\n\n#############");
    //     Random rand = new Random();
    //    System.out.println(rand.nextInt(20));
    //    float x = rand.nextFloat(10);
    //     System.out.println(x + "    "+(int) x);

        int min = 10, max = 20;
        for(int i=1; i<=10; i++){
            double y = min + Math.random() * (max-min+1);
            int z = (int) y;
            System.out.println(z);
        }
    }

}