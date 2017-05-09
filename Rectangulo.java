package Rectangulo;
public class Rectangulo {
    public static double ancho;
    public static double altura;
    public Rectangulo(){
        this.ancho=1;
        this.altura=1;
    }
    public Rectangulo(double ac,double at){
        this.ancho=ac;
        this.altura=at;
    }    
    public static double getArea(double ac,double at){
        return ac*at;
    }
    public static double getPerimetro(double ac,double at) {
        return (2*ac)*(2*at);
    }
    public static void main(String args[]){
        Rectangulo r1=new Rectangulo(4,40);
        System.out.println("Rectangulo 1");
        System.out.println("Su ancho es: "+ancho);
        System.out.println("Su altura es: "+altura);
        System.out.println("Area: "+getArea(ancho,altura));
        System.out.println("Perimetro: "+getPerimetro(ancho,altura));
        
        Rectangulo r2=new Rectangulo(3.5,35.9);
        
        System.out.println("Rectangulo 2");
        System.out.println("Su ancho es: "+ancho);
        System.out.println("Su altura es: "+altura);
        System.out.println("Area: "+getArea(ancho,altura));
        System.out.println("Perimetro: "+getPerimetro(ancho,altura));
       
    }
}
 

