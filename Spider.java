package Tugas1;

public class Spider extends Hewan{
    public Spider(int legs, String makanan) {
        super(legs, makanan);
    }

    @Override
    public int getNumberOfLegs() {
        return this.legs;
    }

    @Override
    public String getFavoriteFood() {
        return this.makanan;
    }
}
