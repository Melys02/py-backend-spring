package pro.backend.spring.py_backend_spring.exception;

public class ResourceNotFoundException extends RuntimeException  {

    public ResourceNotFoundException(String message){
        super(message);
    }

}
