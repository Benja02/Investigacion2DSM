package com.udb.calculadoramvp.interfaces;

/*
Contiene los métodos showResult() e invalidOperation() cuyas tareas correspondientes son las de mostrar el resultado de la operación y mandar un mensaje de error en caso de que
los datos introducidos no sean números o que la división tenga dividendo con valor de 0.
 */

public interface OperationView {
    void showResult(String result);
    void invalidOperation();
}