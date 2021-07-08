import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CuentaBancaria cuenta_personal = new CuentaBancaria();
		cuenta_personal.beneficiario = "Carlos Eduardo";
		
		System.out.println("Ingresa un monto a depositar");
		Scanner leer = new Scanner(System.in);
		float deposito = leer.nextFloat();
		
		System.out.println("Ingresa un monto a retirar");
		float retiro = leer.nextFloat();

		
		cuenta_personal.depositos(deposito);
		cuenta_personal.retiros(retiro);
		
		System.out.println("Tu saldo actual es " + cuenta_personal.consultarSaldo());
		
		System.out.println(cuenta_personal.beneficiario);
		
		CuentaBancaria cuenta_papa = new CuentaBancaria();
		cuenta_papa.beneficiario = "Rodolfo";
		System.out.println(cuenta_papa.beneficiario);

	}

}
