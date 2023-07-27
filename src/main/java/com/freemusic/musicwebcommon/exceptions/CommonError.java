package com.freemusic.musicwebcommon.exceptions;


public enum CommonError {
    UNKNOWN_ERROR("System running error"),
    PARAMS_ERROR("Illegal parameter"),
    OBJECT_NULL("The object is null"),
    QUERY_NULL("Query result is null"),
    REQUEST_NULL("request parameter is null");

    private String errorMessage;

    public String getErrorMessage(){
        return errorMessage;
    }

    private CommonError(String errorMessage){
        this.errorMessage = errorMessage;
    }
}
