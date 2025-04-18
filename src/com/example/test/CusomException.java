package com.example.test;

import java.time.LocalDateTime;

public class CusomException extends Exception {

    private final String errorCode;

    private final LocalDateTime localDateTime;


    public CusomException(String message) {
        super(message);
        this.errorCode = "Custom_error";

        this.localDateTime = LocalDateTime.now();
    }


    public CusomException(String message, String errorCode) {
        super(message);
        this.errorCode = errorCode;
        this.localDateTime = LocalDateTime.now();
    }
}


//    SELECT *
//    FROM Employee
//    GROUP BY name, salary
//    HAVING count(*)>1;
//}
