package Presto;

import org.testng.annotations.Test;

import Presto.pages.MapPage;

public class Demo extends BaseTest {

	MapPage mapPage = new MapPage();
	
	@Test
	public void test() {
		mapPage.clickZoomInByOffSetXY();
		mapPage.selectPopupMenu("Search nearby");
		mapPage.searchPlace("Hotels");
	}
	
	@Test
	public void selectPopupMenu() {
		mapPage.selectPopupMenu("Search nearby");
	}
	
	@Test
	public void rightClick() {
		mapPage.rightClick();
	}
	
	@Test
	public void zoomInByCoord() {
		mapPage.clickZoomInByOffSetXY();	
	}
	
	@Test
	public void zoomIn() {
		mapPage.clickZoomIn();
	}

	@Test
	public void zoomOut() {
		mapPage.clickZoomOut();
	}

	@Test
	public void wheelScroll() {
		mapPage.wheelScroll(-500, 0, 0); // Zoom In
		mapPage.wheelScroll(120, 0, 0);  // Zoom Out
	}
	
	@Test
	public void dragObject() {
		mapPage.dragElement();
	}
}