# soapproducer
Spring Boot Web Service - SOAP Producer Example

Technical Implementation:

This producer application created based on the contract-first approach. Which is first create XSD file from there we can create JAVA objects. Using this we can create web service endpoint.
Also during maven process XSD will be loaded and converted into WSDL file. Later this WSDL file will be used for soapconsumer application to connect the producer application.

How SOAP Producer application can be tested without consumer application?

We can test the SOAP producer application using following ways.

1) Using SOAP UI(Load WSDL file and test the producer endpoint)
2) Postman or Thunder Client

To begin with,

1) mvn clean install
2) Start the producer application. It will be exposed in 8080 and ensure WSDL is exposed via http://localhost:8080/ws/employeeinformation.wsdl
3) Open postman or thunder client and do the following.
  Create new request with POST and URL value will be http://localhost:8080/ws/
  Ensure header content-type value is text/xml
  Paste the below SOAP request into request body section
  
  <soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/" xmlns:gs="http://com/soap/producer/soapproducer/employee-information">
    <soapenv:Header/>
    <soapenv:Body>
        <gs:getEmployeeInformationRequest>
            <gs:employeeId>1000</gs:employeeId>
        </gs:getEmployeeInformationRequest>
    </soapenv:Body>
</soapenv:Envelope>

Invoke the endpoint, you can receive the SOAP response in the form of XML




