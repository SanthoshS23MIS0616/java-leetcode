class ParkingSystem {

    int big, medium, small;

    // constructor
    public ParkingSystem(int big, int medium, int small) {

        this.big = big;
        this.medium = medium;
        this.small = small;
    }

    // method to add car
    public boolean addCar(int carType) {

        // big car
        if (carType == 1) {

            if (big > 0) {
                big--;
                return true;
            }
        }

        // medium car
        else if (carType == 2) {

            if (medium > 0) {
                medium--;
                return true;
            }
        }

        // small car
        else if (carType == 3) {

            if (small > 0) {
                small--;
                return true;
            }
        }

        // parking full
        return false;
    }
}

/**
 * Your ParkingSystem object will be instantiated and called as such:
 * ParkingSystem obj = new ParkingSystem(big, medium, small);
 * boolean param_1 = obj.addCar(carType);
 */