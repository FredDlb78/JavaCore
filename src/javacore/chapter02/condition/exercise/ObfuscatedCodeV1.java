package javacore.chapter02.condition.exercise;

public class ObfuscatedCodeV1 {

    public static void main(String[] args) {

        String vehiculeType = "voiture"; // Type de véhicule (1 = voiture, 2 = bus, 3 = camion)

        double distanceToTravel = 100; // en km

        double fuelConsumptionPerKm = 0;
        final double CAR_FUEL_CONSUMPTION_PER_KM = 0.10; // en euros
        final double BUS_FUEL_CONSUMPTION_PER_KM = 0.20; // en euros
        final double TRUCK_FUEL_CONSUMPTION_PER_KM = 0.35; // en euros

        boolean isActiveFuelPromotion = true;
        double fuelPromotionRate = 0.03;

        double travelPrice = 0; // en euros

        if (vehiculeType.equals("voiture")) {
            fuelConsumptionPerKm = CAR_FUEL_CONSUMPTION_PER_KM;
        }
        if (vehiculeType.equals("bus")) {
            fuelConsumptionPerKm = BUS_FUEL_CONSUMPTION_PER_KM;
            travelPrice = distanceToTravel * fuelConsumptionPerKm;
        }
        if (vehiculeType.equals("camion")) {
            fuelConsumptionPerKm = TRUCK_FUEL_CONSUMPTION_PER_KM;
            travelPrice = distanceToTravel * fuelConsumptionPerKm;
        }

        travelPrice = distanceToTravel * fuelConsumptionPerKm;

        if (isActiveFuelPromotion) {
            double savings = distanceToTravel * fuelPromotionRate;
            travelPrice -= (savings);
            System.out.println("Promotion de " + (fuelPromotionRate * 100) + "% sur le carburant, celle-ci vous permet une économie de " + savings + " euros.");
        }

        System.out.println("Un trajet de " + distanceToTravel + " km en " + vehiculeType + " coutera " + travelPrice + " €.");
    }
}