public class ThirstyPigeon {
    public static void main(String[] args) {
        Water picture = new ProxyWater();
        picture.drink();
    }
}

interface Water{
    public void drink();
}

class RealWater implements Water{
    @Override
    public void drink(){
        System.out.println("this water can quench your thirst");
    }
}

class ProxyWater implements Water{
    private Water water = null;
    public ProxyWater() {
        if (water==null)
            this.water = new RealWater();
    }

    @Override
    public void drink(){
        System.out.print("you only think that ");
        water.drink();
    }
}