package com.freemusic.musicwebcommon.exceptions;

public class MusicWebException extends RuntimeException{
    private String errorMessage;

    public MusicWebException() {
        super();
    }

    public MusicWebException(String errorMessage) {
        super(errorMessage);
        this.errorMessage = errorMessage;
    }


    public static void cast(CommonError commonError){
        throw  new MusicWebException(commonError.getErrorMessage());
    }

    public static void cast(String errorMessage){
        throw  new MusicWebException(errorMessage);
    }


    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }
}
