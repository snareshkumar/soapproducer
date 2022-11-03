package com.soap.producer.soapproducer.service;

import org.springframework.stereotype.Service;

import com.soap.producer.soapproducer.employee_information.EmployeeInformation;
import com.soap.producer.soapproducer.employee_information.Gender;
import com.soap.producer.soapproducer.employee_information.GetEmployeeInformationResponse;

@Service
public class EmployeeInformationService {

    public GetEmployeeInformationResponse getEmployeeInformationByEmployeeId(String employeeId) {
        if (!employeeId.equalsIgnoreCase("100")) {
            var employeeInformation = new EmployeeInformation();
            employeeInformation.setDepartment("IT Development");
            employeeInformation.setDesignation("Software Engineer");
            employeeInformation.setEmployeeName("John Doe");
            employeeInformation.setGender(Gender.MALE);
            employeeInformation.setSalary(50000);
            var response = new GetEmployeeInformationResponse();
            response.setEmployeeInformation(employeeInformation);
            return response;
        } else {
            return new GetEmployeeInformationResponse();
        }

    }

}
