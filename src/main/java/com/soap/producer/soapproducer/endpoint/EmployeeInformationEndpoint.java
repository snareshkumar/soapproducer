package com.soap.producer.soapproducer.endpoint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.soap.producer.soapproducer.employee_information.GetEmployeeInformationRequest;
import com.soap.producer.soapproducer.employee_information.GetEmployeeInformationResponse;
import com.soap.producer.soapproducer.service.EmployeeInformationService;

@Endpoint
public class EmployeeInformationEndpoint {

    private static final String NAMESPACE_URI = "http://com/soap/producer/soapproducer/employee-information";

    @Autowired
    private EmployeeInformationService employeeInformationService;

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getEmployeeInformationRequest")
    @ResponsePayload
    public GetEmployeeInformationResponse getEmployeeInformationResponse(
            @RequestPayload GetEmployeeInformationRequest request) {

        return employeeInformationService.getEmployeeInformationByEmployeeId(request.getEmployeeId());
    }

}
