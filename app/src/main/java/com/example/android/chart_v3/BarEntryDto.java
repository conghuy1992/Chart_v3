package com.example.android.chart_v3;

import com.github.mikephil.charting.data.BarEntry;

/**
 * Created by Android on 3/11/2018.
 */

public class BarEntryDto extends BarEntry {
    public float star;
    public BarEntryDto(float x, float y,int star) {
        super(x, y);
        this.star=star;
    }
}
