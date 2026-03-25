public abstract class Figura {

    public abstract double calculararea();
    
}

class Retangulo extends Figura{
    private double base;
    private double altura;

    public Retangulo(double base, double altura){
        this.base = base;
        this.altura = altura;
        
    }
    @Override
    public double calculararea(){
        return base * altura;
    }
}

class Circulo extends Figura{
    private double raio;

    public Circulo(double raio){
        this.raio = raio;
        
    }
    @Override
    public double calculararea(){
        return Math.PI * (raio * raio);
    }
}