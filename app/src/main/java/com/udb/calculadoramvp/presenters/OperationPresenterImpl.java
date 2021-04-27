package com.udb.calculadoramvp.presenters;

import com.udb.calculadoramvp.interactor.OperationInteractorImpl;
import com.udb.calculadoramvp.interfaces.OperationInteractor;
import com.udb.calculadoramvp.interfaces.OperationPresenter;
import com.udb.calculadoramvp.interfaces.OperationView;


/*
Esta clase es clave para entender MVP, ya que debe tener acceso tanto al interactor como a la vista para
poder comunicarlos.
Esta clase es el PRESENTADOR de nuestro MVP donde ya se dijo, se encarga de conectar lo grafico con los datos.

En está se implementará la interfaz correspondiente a OperationPresenter.

*/

public class OperationPresenterImpl implements OperationPresenter  {
    private OperationView view;
    private OperationInteractor interactor;

    public OperationPresenterImpl(OperationView view) {
        this.view = view;
        this.interactor = new OperationInteractorImpl(this);
    }

    @Override
    public void showResult(String result) {
        if (view != null) {
            view.showResult(result);
        }
    }

    @Override
    public void invalidOperation() {
        if (view != null) {
            view.invalidOperation();
        }
    }


    @Override
    public void add(int num1, int num2) {
        if (interactor != null) {
            interactor.add(num1, num2);
        }
    }

    @Override
    public void subtract(int num1, int num2) {
        if (interactor != null) {
            interactor.subtract(num1, num2);
        }
    }

    @Override
    public void multiply(int num1, int num2) {
        if (interactor != null) {
            interactor.multiply(num1, num2);
        }
    }

    @Override
    public void divide(int num1, int num2) {
        if (interactor != null) {
            interactor.divide(num1, num2);
        }
    }


}
