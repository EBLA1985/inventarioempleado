package com.laboratory.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.laboratory.dto.EmployeesDTO;
import com.laboratory.services.EmployeesServicesImp;

@Controller
@RequestMapping("/api/administrador")
public class EmployeesController {

	@Autowired
	private EmployeesServicesImp employeesServices;

	@PostMapping
	public ResponseEntity<EmployeesDTO> guardarEmpleado(@RequestBody EmployeesDTO employeesDTO) {
		EmployeesDTO nuevaRespuesta = employeesServices.crearEmpleado(employeesDTO);
		return new ResponseEntity<>(nuevaRespuesta, HttpStatus.CREATED);
	}

	@PutMapping("/{id}")
	public ResponseEntity<EmployeesDTO> actualizarCliente(@RequestBody EmployeesDTO employeesDTO,
			@PathVariable(name = "id") long id) {
		EmployeesDTO empleadoRespuesta = employeesServices.ActualizarEmpleadoPorId(employeesDTO, id);
		return new ResponseEntity<>(empleadoRespuesta, HttpStatus.OK);
	}

	@GetMapping
	public List<EmployeesDTO> obtenerListaEmpleados() {

		return employeesServices.obtenerListasEmpleados();

	}

	@DeleteMapping("/{id}")
	public ResponseEntity<String> eliminarTarjetaPorId(@PathVariable(name = "id") long id) {
		employeesServices.EliminarEmpleado(id);
		return new ResponseEntity<>("Empleado eliminado con exito", HttpStatus.OK);
	}

}
