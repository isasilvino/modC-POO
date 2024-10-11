
package funcionario;


public class Main {
    public static void main(String[] args) {
        
        Funcionario func = new Funcionario ("Jorge", 1700.00, "RH");
        
        System.out.println("Nome do funcionario: "+ func.getNome());
        System.out.println("Salario: "+ func.getSalario());
        System.out.println("Departamento: "+func.getDepartamento());
        
        func.aumentarSalario();
    }
    
}
