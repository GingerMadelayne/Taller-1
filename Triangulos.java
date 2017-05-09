package Triangulos;
public class Triangulos extends ObjetoGeometrico {
    public static double Area;
    public static double Perimetro;
    public static double lado1;
    public static double lado2;
    public static double lado3;
    
    public Triangulos () {
        
    }
    public Triangulos ( double l1,double l2, double l3){
        this.lado1=l1;
        this.lado2=l2;
        this.lado3=l3;     
    }
    public double getlado1(){
        return lado1;
    }
    public double getlado2(){
        return lado2;
    }
    public double getlado3(){
        return lado3;
    }
    public void setlado1(double lado1){
        this.lado1=lado1;
    }
    public void setlado2(double lado2){
        this.lado2=lado2;
    } 
    public void setlado3(double lado3){
        this.lado3=lado3;
    }
    public double getArea( ){
        return Area=this.lado1*this.lado2/2;
        
    }
    public double getPerimetro( ){
        return Perimetro=this.lado1+this.lado2+this.lado3;
    }
    
}
