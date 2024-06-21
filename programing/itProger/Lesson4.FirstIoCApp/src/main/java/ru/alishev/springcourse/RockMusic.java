package ru.alishev.springcourse;

import org.springframework.stereotype.Component;

/**
 * @author Neil Alishev
 */
@Component("musicBean")
public class RockMusic implements Music {
    @Override
    public String getSong() {
        return "Wind cries Mary";
    }
}
