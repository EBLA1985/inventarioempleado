package com.laboratory.dto;

public class EmployeesDTO {

	public long id;
	public String cedula;	
	
	public String nombres;
	public String apellido;
	public String email;
	public String fechaNacimiento;
	public String direccionDomicilio;
	public String telefono;
	public String estadoVacunacion;
	public String tipoVacuna;
	public String fechaVacuna;
	public String numeroDosis;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getCedula() {
		return cedula;
	}
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
	public String getNombres() {
		return nombres;
	}
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	public String getDireccionDomicilio() {
		return direccionDomicilio;
	}
	public void setDireccionDomicilio(String direccionDomicilio) {
		this.direccionDomicilio = direccionDomicilio;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getEstadoVacunacion() {
		return estadoVacunacion;
	}
	public void setEstadoVacunacion(String estadoVacunacion) {
		this.estadoVacunacion = estadoVacunacion;
	}
	public String getTipoVacuna() {
		return tipoVacuna;
	}
	public void setTipoVacuna(String tipoVacuna) {
		this.tipoVacuna = tipoVacuna;
	}
	public String getFechaVacuna() {
		return fechaVacuna;
	}
	public void setFechaVacuna(String fechaVacuna) {
		this.fechaVacuna = fechaVacuna;
	}
	public String getNumeroDosis() {
		return numeroDosis;
	}
	public void setNumeroDosis(String numeroDosis) {
		this.numeroDosis = numeroDosis;
	}

	public EmployeesDTO() {
		super();
	}

	
}
