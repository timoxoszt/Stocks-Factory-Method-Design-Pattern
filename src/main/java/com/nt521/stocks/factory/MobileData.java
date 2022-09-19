package com.nt521.stocks.factory;

import com.nt521.stocks.stock.Mobile;
import com.nt521.stocks.stock.Process;

public class MobileData extends Data{
    @Override
    public Process updateData() {
        return new Mobile();
    }
}
