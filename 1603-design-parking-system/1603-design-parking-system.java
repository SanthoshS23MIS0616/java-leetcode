class ParkingSystem {

    int arr[] = new int[3];


    public ParkingSystem(int big, int medium, int small) {

        arr[0] = big;
        arr[1]=medium;
        arr[2] = small;
    }
    
    public boolean addCar(int carType) {
        if(arr[carType-1]>0){
            arr[carType-1]--;
            return true;
        }
        return false;
        
    }
}
