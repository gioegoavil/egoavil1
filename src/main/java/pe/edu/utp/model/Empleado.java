package pe.edu.utp.model;

import org.springframework.stereotype.Component;

@Component
public class Empleado {
 private String dni;
 private String nombres;
 private String apellidos;
 private double sueldo;
 
 public Empleado() {
	// TODO Auto-generated constructor stub
}

public String getDni() {
	return dni;
}

public void setDni(String dni) {
	this.dni = dni;
}

public String getNombres() {
	return nombres;
}

public void setNombres(String nombres) {
	this.nombres = nombres;
}

public String getApellidos() {
	return apellidos;
}

public void setApellidos(String apellidos) {
	this.apellidos = apellidos;
}

public double getSueldo() {
	return sueldo;
}

public void setSueldo(double sueldo) {
	this.sueldo = sueldo;
}
 
}
