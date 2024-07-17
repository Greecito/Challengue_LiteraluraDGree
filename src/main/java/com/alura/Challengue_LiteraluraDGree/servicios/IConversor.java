package com.alura.Challengue_LiteraluraDGree.servicios;

public interface IConversor {
    <T> T convertir(String json, Class<T> clase);
}
