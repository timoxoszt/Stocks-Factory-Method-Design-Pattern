package com.nt521.stocks.factory;

import com.nt521.stocks.stock.Process;

public abstract class Data {
    public void updateStock(){
        // ... logic code ...
        Process okProcess = updateData();
    }

    public abstract Process updateData();
}
