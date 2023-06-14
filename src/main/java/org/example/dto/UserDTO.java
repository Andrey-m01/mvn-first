package org.example.dto;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class UserDTO {
    private static final Logger LOGGER = LoggerFactory.getLogger(UserDTO.class);

    private String name;
    private String lastName;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void log(){
        LOGGER.info("name = {}, lastName = {}", name, lastName);
    }
}