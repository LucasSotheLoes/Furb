package semestre2.poo.unidade10.exercicio2;

public class Main {
	public static void main(String[]args) {
		Empresa furb = new Empresa("Furb");
		Venda []v = new Venda[5];
		v[0] = new Venda(200);
		v[1] = new Venda(100);
		v[2] = new Venda(500);
		v[3] = new Venda(350);
		v[4] = new Venda(280);
		Funcionario []f = new Funcionario[7];
		f[0] = new Vendedor("Luiz",1000,0.10);
		f[1] = new Vendedor("Paula",1200,0.07);
		f[2] = new Programador("Julio", 1000);
		f[3] = new Programador("anna", 1000);
		f[4] = new Programador("Anderson", 1200);
		f[5] = new Funcionario("José",1000);
		f[6] = new Funcionario("Maria",1400);
		for(int i = 0;i < 7;i++) 
		furb.incluirFuncionario(f[i]);
		
		((Vendedor)f[0]).incluirVenda(v[0]);
		((Vendedor)f[0]).incluirVenda(v[1]);
		((Vendedor)f[1]).incluirVenda(v[2]);
		((Vendedor)f[1]).incluirVenda(v[3]);
		((Vendedor)f[1]).incluirVenda(v[4]);
		((Programador)f[2]).incluirLinguagem("Java");
		((Programador)f[2]).incluirLinguagem("C");
		((Programador)f[3]).incluirLinguagem("Java");
		((Programador)f[3]).incluirLinguagem("C#");
		((Programador)f[4]).incluirLinguagem("Phyton");
		System.out.println(furb.calcularCustoSalario());
		
		furb.getFuncionarios().stream()
		.forEach(funcionario -> System.out.println("Nome: " + funcionario.getNome() + 
                ", Salário: " + funcionario.calcularSalario()));
		furb.getFuncionarios().stream()
        .filter(funcionario -> funcionario instanceof Vendedor) 
        .map(funcionario -> (Vendedor) funcionario)  
        .forEach(vendedor -> System.out.println("Nome Vendedor: " + vendedor.getNome() + 
                                                ", Comissão: " + vendedor.getPercentualComissao() + "%"));
		furb.getFuncionarios().stream()
        .filter(funcionario -> funcionario instanceof Programador) 
        .map(funcionario -> (Programador) funcionario)  
        .forEach(programador -> System.out.println("Nome Programador: " + programador.getNome() + 
                                                ", Linguagens: " + programador.getLinguagens()));
		
	}
}
