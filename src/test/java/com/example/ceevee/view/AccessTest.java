package com.example.ceevee.view;

import com.example.sslserver.view.Acess;
import org.junit.jupiter.api.Test;


class AccessTest {


    @Test
     void testAccessObject(){
        PojoTestUtils.validateAccessors(Acess.class);
    }

}