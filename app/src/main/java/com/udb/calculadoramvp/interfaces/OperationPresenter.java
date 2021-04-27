package com.udb.calculadoramvp.interfaces;

/*
Es el intermediario entre el interactor y la vista (manda a llamar los métodos correspondientes en las interfaces) por lo que le corresponde hacerlo
mediante las funciones showResult(), invalidOperation(), add(), subtract(), multiply() y divide().
 */

public interface OperationPresenter {
    void showResult(String result);
    void invalidOperation();
    void add(int num1, int num2);
    void subtract(int num1, int num2);
    void multiply(int num1, int num2);
    void divide(int num1, int num2);
}
