package ro.itschool.springmvc.models.dtos;


import lombok.Data;

@Data
public class Greeting {

    private long id;
    private String content;
}