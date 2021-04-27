package com.kodilla.collections.adv.maps.homework;

import java.util.Objects;

public class Principal {
    private String principal;


    public Principal(String principal) {
        this.principal = principal;

    }
    public String getPrincipal(){
        return principal;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Principal)) return false;
        Principal principal1 = (Principal) o;
        return Objects.equals(getPrincipal(), principal1.getPrincipal());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPrincipal());
    }

    @Override
    public String toString() {
        return "Principal{" +
                "principal='" + principal + '\'' +
                '}';
    }
}