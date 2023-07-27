package com.freemusic.musicwebcommon.exceptions;

import java.io.Serializable;

public class RestErrorResponse implements Serializable {

    private String errorMessage;

    public RestErrorResponse(String errorMessage){
        this.errorMessage = errorMessage;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }
}
