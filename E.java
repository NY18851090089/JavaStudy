/**
 * @ClassName E
 * @Description TODO
 * @Author ny
 * @Date 2020/10/15
 **/
public class E{
    public static void main (String args[]){
        Fish redFish = new Fish();
        Lake lake = new Lake();
        lake.setFish(redFish);
        lake.foodFish(120);
        int w = lake.fish.weight;
        Fish fishOK = lake.getFish();
        System.out.printf("%d:%d:%d",w,lake.weight,fishOK.weight);
    }
}



