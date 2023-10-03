package com.company;

public class ExceptionOccurObject extends AbstractExceptionOccurObject{
    public void catchException() {
        try {
            makeException();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
