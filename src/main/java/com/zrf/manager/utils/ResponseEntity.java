package com.zrf.manager.utils;

import lombok.Data;

@Data
public class ResponseEntity<T> {
    private int status;
    private String msg;
    private T data;

    public static <T> ResponseEntity<T> success(T data) {
        ResponseEntity<T> entity = new ResponseEntity<>();
        entity.setData(data);
        entity.setMsg("success");
        entity.setStatus(200);
        return entity;
    }


    public static <T> ResponseEntity<T> error() {
        ResponseEntity<T> entity = new ResponseEntity<>();
        entity.setMsg("error");
        entity.setStatus(404);
        return entity;
    }

}
