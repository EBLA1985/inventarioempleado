package com.laboratory.services;

import java.util.List;

import com.laboratory.dto.EmployeesDTO;

public interface EmployeesServices {
	
	public EmployeesDTO crearEmpleado(EmployeesDTO employeesDTO);
	public List<EmployeesDTO> obtenerListasEmpleados();
	public EmployeesDTO ObtenerEmpleadoPorId(Long id);
	public EmployeesDTO ActualizarEmpleadoPorId(EmployeesDTO employeesDTO, long id);
	public void EliminarEmpleado(Long id);

}
