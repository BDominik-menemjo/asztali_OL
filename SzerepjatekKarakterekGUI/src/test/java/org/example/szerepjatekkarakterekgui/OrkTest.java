package org.example.szerepjatekkarakterekgui;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class OrkTest {
    private static Ork okos, buta;

    @BeforeAll
    static void beforeAll() {
        okos=new Ork(41);
        buta=new Ork(40);
    }

    @Test
    void okosMetodusTesztOkos() {
        Assertions.assertTrue(okos.okos(), "Hiba az okos() metódus működésében 40-nél nagyobb intelligenciánál!");
    }

    @Test
    void okosMetodusButa() {
        Assertions.assertFalse(buta.okos(), "Hiba az okos() metódus működésében 40-nél kisebb intelligenciánál!");
    }
}