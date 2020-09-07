public class Main {
    public static void main(String[] args){
        LivingRoom LR=new LivingRoom(5,3);
        double area=LR.getArea();
        System.out.println(area);

        //////////static methods checking
        System.out.println(Calculator.add(5,3));
        System.out.println(Calculator.subtract(5,3));

    }
}
