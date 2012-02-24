import flotr2jf.Chart;
import flotr2jf.data.PlotData;
import flotr2jf.options.Axis;
import flotr2jf.options.graphseries.Colors;


public class ExampleGraph5 {

	public static String getGraphOptions() {
		Chart chart = new Chart();
	
		chart.setTitle("This is the Graph Title");
		chart.setHtmlText(false);

		Axis yAxis = new Axis();
		yAxis.setTitle("Y Title");
		yAxis.setTitleAngle(90);
		chart.addYAxis(yAxis);

		Axis xAxis = new Axis();
		xAxis.setTitle("X Title");
		chart.addXAxis(xAxis);

		return chart.printChartOptions();
	}
	
	public static String getGraph() {
		PlotData sqrtPlot = new PlotData("sqrt(x)", null);

		// Flot use Line as default type. To change the type, just call the helper method use<Type>.
		sqrtPlot.setBarOptions();
		sqrtPlot.getBars().setBarWidth(0.8);
		sqrtPlot.getBars().setLineWidth(0);
		Colors colors = new Colors("#afefef", "#ff5522","#afefef");
		sqrtPlot.getBars().setFillColor(colors);

		int i = 0;
		while( i++ < 10 ) {
			sqrtPlot.addPoint(i, Math.sqrt(i));
		}
	
		Chart chart = new Chart();
		chart.addElements(sqrtPlot);

		return chart.printChart();
	}

}
