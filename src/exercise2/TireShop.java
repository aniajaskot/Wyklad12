package exercise2;

import exercise2.model.Tire;
import exercise2.model.TireType;

import java.util.List;

public class TireShop {
    public static void main(String[] args) {
        List<Tire> tires = List.of(
                new Tire ("Michelin", "ABC123", 17, TireType.SUMMER),
                new Tire ("Pirelli", "ZXC345", 18, TireType.WINTER),
                new Tire ("Dębica", "WIN19", 19, TireType.UNIVERSAL)
        );

        for(Tire tire : tires){
            System.out.println(tire);
        }
    }
}
