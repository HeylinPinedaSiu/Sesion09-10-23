import java.util.Scanner;

public class App {
    static Scanner lector = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        
        int opc = mostrarMenu();
        desarrollarCalculos(opc);
    }
    
    public static int mostrarMenu(){
        System.out.println("Seleccione el cuerpo geometrico:");
        System.out.println("1. Prisma");
        System.out.println("2. Cilindro");
        System.out.println("3. Piramide");
        System.out.println("4. Cono");
        System.out.println("5. Esfera");
        int opc = lector.nextInt();
        return opc;
    }

    public static void desarrollarCalculos(int opc){
        switch (opc) {
            case 1:
                System.out.println("PRISMA");
                System.out.print("Cantidad de lados: ");
                int n = lector.nextInt();
                System.out.print("Longitud de los lados: ");
                double l = lector.nextDouble();
                System.out.print("Altura: ");
                double h = lector.nextDouble();
                System.out.println("El area lateral es " + calcularAreaLateral(n,l,h));
                System.out.println("El area total es " + calcularAreaTotal(n,l,h));
                System.out.println("El volumen es " + calcularVolumen(n,l,h));
                break;
        
            default:
                break;
        }        
    }
    
    public static double calcularAreaLateral(int n,double l,double h){
            return (n*l*h);
    }
    
    public static double calcularAreaTotal(int n,double l, double h){
        double alfa = (360/n)*(Math.PI/180);
        double apotema = l/(2*Math.tan(alfa/2));
        double areaBase = ((n*l)*apotema)/2;
        return areaBase;
    }
    
    public static double calcularVolumen(int n, double l, double h){
        double alfa = (360/n)*(Math.PI/180);
        double apotema = l/(2*Math.tan(alfa/2));
        double areaBase = ((n*l)*apotema)/2;
        return (areaBase*h);
    }
}
