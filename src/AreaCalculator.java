public class AreaCalculator {
    public class areaCalculator {

        public static void main(String[] args) {
            System.out.println(Area(5.0));
            System.out.println(Area(-1));
            System.out.println(Area(5.0, 4.0));
            System.out.println(Area(-1, -4.0));
        }
        public static double Area(double Radius){
            if (Radius < 0){
                return -1;
            }
            return (Math.PI * (Radius*Radius));
        }
        public static double Area(double X, double Y){
            if((X < 0) && (Y < 0)){
                return -1;
            }
            return (X*Y);
        }
    }

}
