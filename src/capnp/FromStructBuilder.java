package org.capnproto;

public interface FromStructBuilder<T> {
    public abstract T fromStructBuilder(StructBuilder builder);
    public abstract StructSize structSize();
}