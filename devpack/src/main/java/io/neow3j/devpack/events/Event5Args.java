package io.neow3j.devpack.events;

public class Event5Args<T1, T2, T3, T4, T5> implements EventInterface {

    public native void fire(T1 arg1, T2 arg2, T3 arg3, T4 arg4, T5 arg5);

}