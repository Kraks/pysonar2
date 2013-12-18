package org.yinwang.pysonar.ast;

import org.jetbrains.annotations.NotNull;
import org.yinwang.pysonar.State;
import org.yinwang.pysonar.types.Type;


public class Ellipsis extends Node {

    public Ellipsis(int start, int end) {
        super(start, end);
    }


    @NotNull
    @Override
    public String toString() {
        return "<Ellipsis>";
    }


    @NotNull
    @Override
    public Type transform(State s) {
        return Type.NONE;
    }

}
