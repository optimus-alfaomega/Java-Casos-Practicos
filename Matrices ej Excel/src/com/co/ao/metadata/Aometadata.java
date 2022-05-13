package com.co.ao.metadata;

import java.lang.reflect.InvocationTargetException;

public class Aometadata<T> {

    private T reference = null;

    public Aometadata() {

    }

    public Aometadata<T> configuration(T reference) {
        this.reference = reference;
        return this;
    }

    public Aometadata<T> configuration() {
        return this;
    }

    public Aometadata<T> Methods() {
        if (this.reference != null) {
            for (int index = 0; index < this.reference.getClass().getMethods().length; index++) {
                System.out.println(this.reference.getClass().getMethods()[index]);
            }
        } else {
            System.out.println("reference undefined");
        }
        return this;
    }

    public Aometadata<T> Command(String name, Object[] args, Class<?>... parameterTypes) {
        if (this.reference != null) {

            try {
                this.reference.getClass().getMethod(name, parameterTypes).invoke(null, args);
            } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException
                    | NoSuchMethodException
                    | SecurityException e) {
                e.printStackTrace();
            }
        }
        return this;
    }

    public Aometadata<T> packageName() {
        if (this.reference == null) {
            System.out.println("reference is null");
        } else
            System.out.println(this.reference.getClass().getPackageName());
        return this;
    }

    public Aometadata<T> isInterface() {
        if (this.reference == null) {
            System.out.println("reference is null");
        } else
            System.out.println(this.reference.getClass().isInterface());
        return this;
    }

    public T getNewInstance(Object[] initArgs, Class<?>... parameterTypes)
            throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException,
            IllegalArgumentException, InvocationTargetException {
        T valor = (T) this.reference.getClass().getConstructor(parameterTypes).newInstance(initArgs);
        return valor;
    }

    public Aometadata<T> className() {

        if (this.reference == null) {
            System.out.println("reference is null");
        } else {
            System.out.println(this.reference.getClass().getName());
        }
        return this;
    }

    public String toString() {

        return "@info: " + this.reference.getClass().getName() + ",  " + this.reference.getClass().getSimpleName();

    }

}
