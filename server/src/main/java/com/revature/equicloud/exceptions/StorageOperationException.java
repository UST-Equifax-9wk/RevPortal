package com.revature.equicloud.exceptions;

public class StorageOperationException extends RuntimeException{
    
    
        public StorageOperationException(String message) {
            super(message);
        }
    
        public StorageOperationException(String message, Throwable cause) {
            super(message, cause);
        }

    
}
