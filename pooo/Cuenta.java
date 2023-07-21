/*
 Realizar una clase llamada Cuenta (bancaria) que debe tener como mínimo los atributos:
numeroCuenta (entero), el DNI del cliente (entero largo) y el saldo actual (entero).
Las operaciones asociadas a dicha clase son:







 */
package EjercicioAprendizaje05;

import java.util.Scanner;

/**
 *
 * @author Carlos
 */
public class Cuenta {
    private int numeroCuenta;
    private long dni;
    private int saldo;
    private double interes;

    /*a) Constructor por defecto y constructor con DNI, saldo, número de cuenta e interés.*/
    public Cuenta() {
    }

    public Cuenta(int numeroCuenta, long dni, int saldo, double interes) {
        this.numeroCuenta = numeroCuenta;
        this.dni = dni;
        this.saldo = saldo;
        this.interes = interes;
    }
    
    /*b) Agregar los métodos getters y setters correspondientes*/

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public long getDni() {
        return dni;
    }

    public int getSaldo() {
        return saldo;
    }

    public double getInteres() {
        return interes;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public void setInteres(double interes) {
        this.interes = interes;
    }
    
    /*c) Metodo para crear un objeto Cuenta, pidiéndole los datos al usuario.*/
    public void crearCuenta(){
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese el número de cuenta: ");
        numeroCuenta=leer.nextInt();
         System.out.print("Ingrese el DNI: ");
        dni=leer.nextLong();
         System.out.print("Ingrese el saldo: ");
        saldo=leer.nextInt();
          System.out.print("Ingrese la tasa de interés(%): ");
        interes=leer.nextDouble();
        
    }
    
    /*d) Método ingresar(double ingreso): el método recibe una cantidad de dinero a ingresar
y se la sumara a saldo actual.*/
    public void ingresar(double ingreso){
        saldo+=ingreso;
        System.out.println("Se realizó correctamente el depósito de "+ingreso+" dólares a su cuenta");
    }
    
    /*e) Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y se
la restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se
pondrá el saldo actual en 0.*/
    
    public void retirar(double retiro){
        if(retiro>saldo){
            saldo=0;
            System.out.println("El valor de su retiro es superior al saldo disponible, por lo que se retiró lo que se pudo");
        }else{
            saldo-=retiro;
            System.out.println("Se realizó correctamente el retiro de "+retiro+" dólares de su cuenta");
        }
    }
    
    /*f) Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar que el
usuario no saque más del 20%.*/
    
    public void extraccionRapida(double retiro){
        if (retiro>(saldo*0.2)){
            System.out.println("No se permite retirar mas del 20% del saldo de su cuenta. Esta operación no se ejecutará");
        } else{
            saldo-=retiro;
            System.out.println("Se retiró correctamente el valor de "+retiro);
        }
    }
    
    /*g) Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta.*/
    public double consultarSaldo(){
        return saldo;
    }
    
    /*h) Método consultarDatos(): permitirá mostrar todos los datos de la cuenta */
    public String consultarDatos(){
        return "Número de cuenta: "+numeroCuenta+" ;DNI: "+dni+"; Saldo: "+saldo+"; Interés: "+interes+"%";
    }

    @Override
    public String toString() {
        return "Cuenta{" + "numeroCuenta=" + numeroCuenta + ", dni=" + dni + ", saldo=" + saldo + ", interes=" + interes + '}';
    }
    
    
}
