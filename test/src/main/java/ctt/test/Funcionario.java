package ctt.test;

public class Funcionario {
	
    private String cargo;
    
    private double salarioBase;
    
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    
    public String getCargo() {
    	return this.cargo;
    }
    
    public void setSalarioBase(double salarioBase) {
    	this.salarioBase = salarioBase;
    }
    
    public double getSalarioBase() {
    	return this.salarioBase;
    }
}
