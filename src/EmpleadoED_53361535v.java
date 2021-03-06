import java.util.*;
        
/**
 * 
 * @author JUAN PABLO ORTI MARTINEZ
 * @version 1.0
 * @
 */
public class EmpleadoED_53361535v {
    /**
     * 
     */
 static final double FACTOR_HORA_EXTRA = 1.2;
 private String nombreCompleto, dni;
 private double salarioBasePorHora = 10.56;
 /**
  * 
  * @param nombreCompleto 
  * @param dni 
  */
 public EmpleadoED_53361535v(String nombreCompleto, String dni) {
     /**
      *Constructor con dos parámetros
      * @param nombreCompleto nombreCompleto nombre completo en mayúsculas
      * @param dni dni documento nacional de identidad con letra y sin espacios
      */
 this.nombreCompleto = nombreCompleto;
 this.dni = dni;
 }
 /**
  * @ calcula el salario bruto mansual en funcion del salario base por hora y las horas extras
  * @param horasExtra el precio de la hora extra se determina con la constante FACTOR_HORA_EXTRA
  * @return devuelve el salario bruto mensual al mes 
  */
 public double getSalarioEsteMes(int horasExtra) {
 double cantidadExtra, salarioFinal;
 cantidadExtra = horasExtra * this.salarioBasePorHora *
FACTOR_HORA_EXTRA;
 salarioFinal=this.salarioBasePorHora * 40 * 4 + cantidadExtra;
 salarioFinal=(double)Math.round(salarioFinal * 100d) / 100d;
 return salarioFinal;
 }

 // Este método no lo comentaremos con JavaDoc
 public static void main(String[] args) {
 EmpleadoED_53361535v emp = new EmpleadoED_53361535v("JUAN PABLO ORTI MARTINEZ",
"53361535v");
 int horasExtra = 2;
     System.out.println("El salario de " + emp.nombreCompleto + " este mes será de " + emp.getSalarioEsteMes(horasExtra) + " euros, al hacer " + horasExtra + " horas extra.");
 }
}