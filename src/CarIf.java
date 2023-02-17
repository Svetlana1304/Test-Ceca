public class CarIf {
    public static void main(String[]args){
        String carMake="Ford";
        int door=4;

        if(carMake=="Ford")
            if(door==4)
                System.out.println("Auto marke Ford sa četvora vrata");
        if(carMake!="Ford")
            if(door!=4)
                System.out.println("Auto ne ispunjava uslov");
        if(carMake=="Ford")
            if(door!=4)
    }
}
