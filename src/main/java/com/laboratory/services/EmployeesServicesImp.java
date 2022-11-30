package com.laboratory.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.laboratory.dto.EmployeesDTO;
import com.laboratory.entity.Employees;
import com.laboratory.repository.EmployeesRepository;

@Service
public class EmployeesServicesImp implements EmployeesServices {

	@Autowired
	public EmployeesRepository employeesRepository;

	public EmployeesDTO mapearDTO(Employees employees) {
		EmployeesDTO employeesDTO = new EmployeesDTO();
		employeesDTO.setId(employees.getId());
		employeesDTO.setCedula(employees.getCedula());
		employeesDTO.setNombres(employees.getNombres());
		employeesDTO.setApellido(employees.getApellido());
		employeesDTO.setEmail(employees.getEmail());
		employeesDTO.setFechaNacimiento(employees.getFechaNacimiento());
		employeesDTO.setDireccionDomicilio(employees.getDireccionDomicilio());
		employeesDTO.setTelefono(employees.getTelefono());
		employeesDTO.setEstadoVacunacion(employees.getEstadoVacunacion());
		employeesDTO.setTipoVacuna(employees.getTipoVacuna());
		employeesDTO.setFechaVacuna(employees.getFechaVacuna());
		employeesDTO.setNumeroDosis(employees.getNumeroDosis());
		return employeesDTO;
	}

	public Employees mapearEntidad(EmployeesDTO employeesDTO) {
		Employees employees = new Employees();
		
		employees.setNombres(employeesDTO.getNombres());
		employees.setApellido(employeesDTO.getApellido());
		employees.setEmail(employeesDTO.getEmail());
		employees.setFechaNacimiento(employeesDTO.getFechaNacimiento());
		employees.setDireccionDomicilio(employeesDTO.getDireccionDomicilio());
		employees.setTelefono(employeesDTO.getTelefono());
		employees.setEstadoVacunacion(employeesDTO.getEstadoVacunacion());
		employees.setTipoVacuna(employeesDTO.getTipoVacuna());
		employees.setFechaVacuna(employeesDTO.getFechaVacuna());
		employees.setNumeroDosis(employeesDTO.getNumeroDosis());
		return employees;

	}	
	
	
	
	@Override
	public EmployeesDTO crearEmpleado(EmployeesDTO employeesDTO) {
	    Employees employees = mapearEntidad(employeesDTO);
	    Employees nuevoemployees = employeesRepository.save(employees);
	    EmployeesDTO NuevaRespuestaDTO = mapearDTO(nuevoemployees);
        return NuevaRespuestaDTO;
	}

	@Override
	public List<EmployeesDTO> obtenerListasEmpleados() {
		 List<Employees> listaemployees = employeesRepository.findAll();
		 return listaemployees.stream().map(employees -> mapearDTO(employees)).collect(Collectors.toList());
	
	}

	@Override
	public EmployeesDTO ObtenerEmpleadoPorId(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EmployeesDTO ActualizarEmpleadoPorId(EmployeesDTO employeesDTO, long id) {

		Employees employees = employeesRepository.getById(id);
		
		employees.setFechaNacimiento(employeesDTO.getFechaNacimiento());
		employees.setDireccionDomicilio(employeesDTO.getDireccionDomicilio());
		employees.setTelefono(employeesDTO.getTelefono());
		employees.setEstadoVacunacion(employeesDTO.getEstadoVacunacion());
		employees.setTipoVacuna(employeesDTO.getTipoVacuna());
		employees.setFechaVacuna(employeesDTO.getFechaVacuna());
		employees.setNumeroDosis(employeesDTO.getNumeroDosis());
		Employees empleadoActualizada = employeesRepository.save(employees);
		return mapearDTO(empleadoActualizada);

	}

	@Override
	public void EliminarEmpleado(Long id) {
		// TODO Auto-generated method stub
		employeesRepository.deleteById(id);
		
	}

}
