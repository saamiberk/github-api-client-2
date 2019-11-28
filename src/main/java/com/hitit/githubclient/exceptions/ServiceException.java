package com.hitit.githubclient.exceptions;

import java.io.IOException;

public class ServiceException extends IOException {
     /*
       it provide different logic like error messages, json, etc
       if we need to.
      */
    public ServiceException(String message) {
        super(message);
    }
}
