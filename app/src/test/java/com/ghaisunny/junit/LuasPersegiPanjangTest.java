package com.ghaisunny.junit;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class LuasPersegiPanjangTest {
    private LuasPersegiPanjang luasPersegiPanjang = new LuasPersegiPanjang();

    @Test
    public void testAddSuccess(){
        int result = luasPersegiPanjang.add(10,90);
        assertEquals(900,result);
    }
}
