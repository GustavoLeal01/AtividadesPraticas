package herança;

public class testefuncionario {

public static void main(String[] args) {
		
		gerente ge = new gerente("Carlos",44,"Gerente",25000.0f,"8464874-4845", 19500.0f, 785000.0f); 
		vendedor ve = new vendedor("Jackson",19,"vendedor",1750.0f,"8467459-7219", 3000.0f, 50000.0f);
		
		ge.visualizar();
		ve.visualizar();
}}
