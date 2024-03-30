public class Tostring {
    String carName;
    String carModel;
    int carModelnum;
    int carMotors;
    String carColour;

    public Tostring(String carName, String carModel,  int carModelnum, int carMotors, String carColour) {
        this.carName = carName;
        this.carModel = carModel;
        this.carModelnum = carModelnum;
        this.carMotors = carMotors;
        this.carColour = carColour;
    }

    @Override
    public String toString() {
        return "Tostring{" +
                "carName='" + carName + '\'' +
                ", carModel='" + carModel + '\'' +
                ", carModelnum=" + carModelnum +
                ", carMotors=" + carMotors +
                ", carColour='" + carColour + '\'' +
                '}';
    }

    public static void main(String[] args){
        Tostring st = new Tostring("Swift", "Toyota", 7 , 9, "Black");
        System.out.println(st.toString());
    }
}
