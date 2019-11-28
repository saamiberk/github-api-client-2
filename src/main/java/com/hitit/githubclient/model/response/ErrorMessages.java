package com.hitit.githubclient.model.response;

public enum ErrorMessages {
    NO_RECORD_FOUND("Provided repo is not found");


    private String errorMessages;

    ErrorMessages(String errorMessages){
        this.errorMessages = errorMessages;
    }

    public String getErrorMessages() {
        return errorMessages;
    }

    public void setErrorMessages(String errorMessages) {
        this.errorMessages = errorMessages;
    }
}
