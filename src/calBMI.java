public class calBMI {
    public static void main(String[] args) {
        double bmi;
        double height;
        double weight;
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.println("Nhap chieu cao");
        height = input.nextDouble();
        java.util.Scanner input2 = new java.util.Scanner(System.in);
        System.out.println("Nhap can nang");
        weight = input2.nextDouble();
        bmi = weight/Math.pow(height,2);
        if (bmi < 18.5){
            System.out.println("Underweight");
        }else if (bmi < 25){
            System.out.println("Normal");
        }else if (bmi < 30){
            System.out.println("Overweight");
        }else{
            System.out.println("Obese");
        }
    }
}
