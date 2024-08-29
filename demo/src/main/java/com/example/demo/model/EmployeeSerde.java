package com.example.demo.model;

import com.example.demo.model.Employee;
import org.apache.kafka.common.serialization.Serdes;

public class EmployeeSerde extends Serdes.WrapperSerde<Employee> {
    public EmployeeSerde() {
        super(new EmployeeSerializer(), new EmployeeDeserializer());
    }
}
