class ParkingSystem {
    int big;
    int medium;
    int small;

    public ParkingSystem(int big, int medium, int small) {
        this.big = big;
        this.medium = medium;
        this.small = small;
    }
    
    public boolean addCar(int carType) {
        switch(carType){
            case 1:
                this.big--;
                return checkSpace(this.big+1);
            case 2:
                this.medium--;
                return checkSpace(this.medium+1);
            case 3:
                this.small--;
                return checkSpace(this.small+1);
            default:
                return false;
        }
    }

    private boolean checkSpace(int type){
        if(type >= 1){
            return true;       
        }
        return false;
    }
}