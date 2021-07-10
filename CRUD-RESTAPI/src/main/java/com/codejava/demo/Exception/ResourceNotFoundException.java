package com.codejava.demo.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends RuntimeException {
    private static final long serialVersionUID = 1L;
    private String resourceName;
    private String fieldName;
    private Object fielValue;

    public ResourceNotFoundException(String resourceName, String fieldName, Object fielValue) {
        super(String.format("%s not found with %s : '%s'", resourceName, fieldName, fielValue));
        this.resourceName = resourceName;
        this.fieldName = fieldName;
        this.fielValue = fielValue;
    }

    public String getResourceName() {
        return resourceName;
    }

    public String getFieldName() {
        return fieldName;
    }

    public Object getFielValue() {
        return fielValue;
    }
    //    public ResourceNotFoundException(String message, String resourceName, String fieldName, Object fielValue) {
//        super(message);
//        this.resourceName = resourceName;
//        this.fieldName = fieldName;
//        this.fielValue = fielValue;
//    }
//
//    public ResourceNotFoundException(String message, Throwable cause, String resourceName, String fieldName, Object fielValue) {
//        super(message, cause);
//        this.resourceName = resourceName;
//        this.fieldName = fieldName;
//        this.fielValue = fielValue;
//    }
//
//    public ResourceNotFoundException(Throwable cause, String resourceName, String fieldName, Object fielValue) {
//        super(cause);
//        this.resourceName = resourceName;
//        this.fieldName = fieldName;
//        this.fielValue = fielValue;
//    }
//
//    public ResourceNotFoundException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace, String resourceName, String fieldName, Object fielValue) {
//        super(message, cause, enableSuppression, writableStackTrace);
//        this.resourceName = resourceName;
//        this.fieldName = fieldName;
//        this.fielValue = fielValue;
//    }
}
