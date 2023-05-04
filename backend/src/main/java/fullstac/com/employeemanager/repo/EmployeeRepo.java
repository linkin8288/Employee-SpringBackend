package fullstac.com.employeemanager.repo;

import fullstac.com.employeemanager.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface EmployeeRepo extends JpaRepository<Employee, Long> {

    void deleteEmployeeByid(Long id);

    Optional<Employee> findEmployeeById(Long id);
}
