import flotr2jf.Chart;
import flotr2jf.data.PlotData;
import flotr2jf.options.Axis;


public class ExampleGraph2 {

	public static String getGraphOptions() {
		Chart chart = new Chart();
	
		Axis yAxis = new Axis();
		yAxis.setMax(2D);
		yAxis.setMin(-2D);
		chart.addYAxis(yAxis);

		Axis yAxisRight = new Axis();
		yAxisRight.setPosition("right");
		chart.addY2Axis(yAxisRight);

		Axis xAxis = new Axis();
		chart.addXAxis(xAxis);
	
		return chart.printChartOptions();
	}
	
	public static String getGraph() {
		PlotData sinPlot = new PlotData("sin(x)", null);
		PlotData cosPlot = new PlotData("cos(x)+5", null);
		// TODO
		cosPlot.setRightYAxis();

		int i = 0;
		while( i++ < 100 ) {
			sinPlot.addPoint(i, Math.sin(i));
			cosPlot.addPoint(i, Math.cos(i)+5);
		}
	
		Chart chart = new Chart();
		chart.addElements(sinPlot);
		chart.addElements(cosPlot);

		return chart.printChart();
	}

}
