package com.udb.calculadoramvp.interactor;

import com.udb.calculadoramvp.interfaces.OperationInteractor;
import com.udb.calculadoramvp.interfaces.OperationPresenter;

/*
 En esta clase llamada OperationInteractor es nuestro MODELO del MVP, ya que aquí es donde se gestiona todos los datos
que nuestra app de calculadora realizará, ya sea para la suma, division, resta o multiplicación.

Esta clase implementará la interfaz correspondiente a OperationInteractor.
*/


public class OperationInteractorImpl implements OperationInteractor {
    private int result;
    private OperationPresenter presenter;

    public OperationInteractorImpl(OperationPresenter operationPresenter) {
        this.presenter = operationPresenter;
    }

    @Override
    public void add(int num1, int num2) {
        result =  num1 + num2;
        presenter.showResult(Integer.toString(result));
    }

    @Override
    public void subtract(int num1, int num2) {
        result = num1 - num2;
        presenter.showResult(Integer.toString(result));
    }

    @Override
    public void multiply(int num1, int num2) {
        result = num1 * num2;
        presenter.showResult(Integer.toString(result));
    }

    @Override
    public void divide(int num1, int num2) {
        if (num2 != 0) {
            result = num1 / num2;
            presenter.showResult(Integer.toString(result));
        } else {
            presenter.invalidOperation();
        }
    }
}
