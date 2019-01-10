package com.eric.State.states;

import com.eric.State.CoffeMaker;

public interface State {
    void serve(final CoffeMaker maker);
}
