import flotr2jf.Chart;
import flotr2jf.data.PlotData;
import flotr2jf.options.Axis;


public class ExampleGraph1 {

	public static String getGraphOptions() {
		Chart chart = new Chart();
	
		Axis yAxis = new Axis();
		chart.addYAxis(yAxis);
	
		Axis xAxis = new Axis();
		chart.addXAxis(xAxis);
	
		return chart.printChartOptions();
	}
	
	public static String getGraph() {
		PlotData sinPlot = new PlotData("sin(x)", null);
		
		int i = 0;
		while( i++ < 100 ) {
			sinPlot.addPoint(i, Math.sin(i));
		}
	
		Chart chart = new Chart();
		chart.addElements(sinPlot);

		return chart.printChart();
	}

}
