package semestre2.poo.unidade10.exercicio1;

public class Main {
	public static void main(String[]args) {
		Circulo c = new Circulo(3);
		Retangulo q = new Quadrado(5);
		Retangulo r = new Retangulo(6,2);
		Triangulo t = new Triangulo(3,4,5);
		System.out.println("A area do circulo é: "+c.calcularArea());
		System.out.println("A area do quadrado é: "+q.calcularArea());
		System.out.println("A area do retangulo é: "+r.calcularArea());
		System.out.println("A area do triangulo é: "+t.calcularArea());
	}
}
