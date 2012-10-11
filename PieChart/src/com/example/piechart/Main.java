package com.example.piechart;

import android.app.Activity;
import android.os.Bundle;

public class Main extends Activity {

	private PieChart chart;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		chart=new PieChart(this);
		setContentView(chart);
	}

}
