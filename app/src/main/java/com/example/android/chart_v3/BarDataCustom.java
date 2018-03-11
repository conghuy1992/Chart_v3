package com.example.android.chart_v3;

import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.interfaces.datasets.IBarDataSet;

import java.util.List;

/**
 * Created by Android on 3/11/2018.
 */

public class BarDataCustom extends BarData {
    public BarDataCustom() {
    }

    public BarDataCustom(IBarDataSet... dataSets) {
        super(dataSets);
    }

    public BarDataCustom(List<IBarDataSet> dataSets) {
        super(dataSets);
    }
}
