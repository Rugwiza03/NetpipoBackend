package com.netpipo.service;



import org.springframework.core.annotation.MergedAnnotations;

import com.netpipo.entity.Employee;
import com.netpipo.repository.EmployeeRepository;

public class EmployeeServiceTest {

    @Mock
    private EmployeeRepository employeeRepository;

    @InjectMocks
    private EmployeeService employeeService;

    // @BeforeEach
    // public void setUp() {
    //     MergedAnnotations.openMocks(this);
    // }

    @Test
    public void testCreateEmployee() {
        Employee employee = new Employee();
        employee.setName("John Doe");

        // when(employeeRepository.save(any(Employee.class))).thenReturn(employee);

        Employee savedEmployee = employeeService.createEmployee(employee);

        assertNotNull(savedEmployee);
                assertEquals("John Doe", savedEmployee.getName());
                    }
                
                    private void assertNotNull(Employee savedEmployee) {
                // TODO Auto-generated method stub
                throw new UnsupportedOperationException("Unimplemented method 'assertNotNull'");
            }
        
                    private void assertEquals(String string, String name) {
                // TODO Auto-generated method stub
                throw new UnsupportedOperationException("Unimplemented method 'assertEquals'");
            }
}