package fastfood;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MenuTest {

    @Test
    void montarMenu(){
        double total = 0;
        Menu Vegetariano = new Vegetariano(20.0 , 2.0 , true);
        Menu Adulto = new Adulto(15.0);
        Menu Infantil = new Infantil(18.0 , "Boneco do Chuck" , 80.0);


}