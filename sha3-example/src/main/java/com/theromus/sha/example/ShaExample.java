package com.theromus.sha.example;

import static com.theromus.sha.Parameters.SHA3_224;
import static com.theromus.sha.Parameters.SHA3_256;
import static com.theromus.sha.Parameters.SHA3_384;
import static com.theromus.sha.Parameters.SHA3_512;
import static com.theromus.utils.HexUtils.getHex;

import com.theromus.sha.Sha;


public class ShaExample {

    public static void main(String[] args) {
        String s = getHex("The show must go on".getBytes());

        Sha sha = new Sha();
        System.out.println("sha3-224 = " + sha.getHash(s, SHA3_224));
        System.out.println("sha3-256 = " + sha.getHash(s, SHA3_256));
        System.out.println("sha3-384 = " + sha.getHash(s, SHA3_384));
        System.out.println("sha3-512 = " + sha.getHash(s, SHA3_512));
    }

}
