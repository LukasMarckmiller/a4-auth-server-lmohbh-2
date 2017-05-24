package edu.hm.api;/*
 * (C) 2017, Lukas, l.marckmiller@hm.edu on 21.05.2017. 
 * Java 1.8.0_121, Windows 10 Pro 64bit
 * Intel Core i5-6600K CPU/3.50GHz overclocked 4.1GHz, 4 cores, 16000 MByte RAM)
 * with IntelliJ IDEA 2017.1.1
 *
 */

interface AuthenticationServer {

    AuthenticationServerResult createUser(User userToCreate);

    AuthenticationServerResult createToken(User userToAccess);

    AuthenticationServerResult validateToken(String token);

    AuthenticationServerResult invalidateToken(String token);
}
