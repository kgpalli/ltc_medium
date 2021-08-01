package LeetCode.med1_30;

public class ParkingSystem {
    int big,medium,small;

    public ParkingSystem(int big, int medium, int small) {
        this.big = big;
        this.medium = medium;
        this.small = small;

    }

    public boolean addCar(int carType) {
        if(carType==1 && big==0 || carType==2 && medium==0 || carType==3 && small==0)
            return false;

        if(carType==1)big--;
        if(carType==2)medium--;
        if(carType==3)small--;

        return true;

    }

    public static void main(String[]args){
        ParkingSystem ps = new ParkingSystem(1,1,0);

        System.out.println(ps.addCar(1));
        System.out.println(ps.addCar(2));
        System.out.println(ps.addCar(3));
        System.out.println(ps.addCar(1));

    }

}
