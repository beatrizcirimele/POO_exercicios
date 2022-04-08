import java.util.Scanner;

public class calteste {

	public static void main(String[] args) {
		
		double x =0 ,y = 0;
		int opcao = 1;
		
		calculo cal = new calculo(0,0);
		Scanner leia = new Scanner(System.in);
		
	System.out.println("Escreva dois numeros desejados: ");	
	System.out.print("\nPrimeiro numero: ");	
	x =leia.nextDouble();
		cal.setX(x);
		System.out.print("\nSegundo numero: ");	
	y =leia.nextDouble();	
		cal.setY(y);
		
		
		System.out.println("Selecione a opção desejada");
		
		
		
		

		do {

			System.out.println("Aperte 0 para sair");
			System.out.println("\n1°) soma: "+cal.getX()+" + "+y);
			System.out.println("\n2°) subtração: "+cal.getX()+" - "+y);
			System.out.println("\n3°) multiplicação: "+cal.getX()+" - "+y);
			System.out.println("\n4°) divisão: "+cal.getX()+" / "+y);
			System.out.println("\n5°) Subistitui o valor de x");
			System.out.println("\n6°) Subistitui o valor de y");
			System.out.print("\n\nOpção: ");
			
			opcao = leia.nextInt();
			
			switch(opcao){
			
			case 0:
				System.out.println("Ate logo");
				break;			
			
			case 1: 
				cal.calsoma();
				break;
			
			case 2:
				cal.calsubt();
				break;
			
			case 3:
				cal.calmult();;
				break;
			
			case 4:
				cal.caldivi();
				break;
			
			case 5:										
		System.out.println("insira um novo valor para x");
			x =leia.nextDouble();
				cal.setX(x);
				break;
			
			case 6:										
		System.out.println("insira um novo valor para y");
			y =leia.nextDouble();
				cal.setX(y);
				break;
																				
			default: 
				System.out.println("numero invalido");
			
			
				
			}}while(opcao != 0);
	
	

	}

}
