package com.freemusic.musicwebcommon.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;


@ControllerAdvice
public class GlobalExceptionHandler {

    //log.error

    @ResponseBody
    @ExceptionHandler(MusicWebException.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public RestErrorResponse customException(MusicWebException e){
            String errorMessage = e.getErrorMessage();
            RestErrorResponse restErrorResponse = new RestErrorResponse(errorMessage);
            return restErrorResponse;
    }

    @ResponseBody
    @ExceptionHandler(Exception.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public RestErrorResponse exception(Exception e){
        RestErrorResponse restErrorResponse = new RestErrorResponse(CommonError.UNKNOWN_ERROR.getErrorMessage());
        return restErrorResponse;
    }
}
