package com.facol.si.edoo.gui.visualizers;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.xy.IntervalXYDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

public class GraphicalUtilities {
	private String title;
	private String xAxisLabel = "Dados Fornecidos";
	private String yAxisLabel = "Altura";
	private IntervalXYDataset dataset;

	private boolean legend = false;
	private boolean tooltips = false;
	private boolean urls = false;

	public void addIntegerArray(int[] data) {
		XYSeries series = new XYSeries("Integer Data");
		for (int i = 0; i < data.length; i++) {
			series.add(i, data[i]);
		}
		dataset = new XYSeriesCollection(series);
	}

	public void addFloatArray(float[] data) {
		XYSeries series = new XYSeries("Float Data");
		for (int i = 0; i < data.length; i++) {
			series.add(i, data[i]);
		}
		dataset = new XYSeriesCollection(series);
	}

	public void addDoubleArray(double[] data) {
		XYSeries series = new XYSeries("Double Data");
		for (int i = 0; i < data.length; i++) {
			series.add(i, data[i]);
		}
		dataset = new XYSeriesCollection(series);
	}

	public ChartPanel getGraphic() {
		JFreeChart chart = ChartFactory.createHistogram(this.title, this.xAxisLabel, this.yAxisLabel, this.dataset,
				PlotOrientation.VERTICAL, this.legend, this.tooltips, this.urls);

		return new ChartPanel(chart);
	}
}
