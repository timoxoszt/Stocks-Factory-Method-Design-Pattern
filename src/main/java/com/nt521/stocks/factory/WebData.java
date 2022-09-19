package com.nt521.stocks.factory;

import com.nt521.stocks.stock.Process;
import com.nt521.stocks.stock.Web;

public class WebData extends Data{
    @Override
    public Process updateData() {
        return new Web();
    }
}
