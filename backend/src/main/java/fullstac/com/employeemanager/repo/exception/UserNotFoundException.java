package fullstac.com.employeemanager.repo.exception;

public class UserNotFoundException extends RuntimeException{
    public UserNotFoundException(String message) {

        super(message);
    }
}
