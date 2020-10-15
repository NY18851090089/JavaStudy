
class Lake{
    Fish fish;
    void setFish(Fish s){
        fish = s;
    }
    void foodFish(int m){
        fish.weight = fish.weight+m;
    }
    Fish getFish(){
        fish.weight -= 10;
        return fish;
    }
}


