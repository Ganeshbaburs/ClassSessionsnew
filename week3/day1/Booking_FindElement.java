package week3.day1;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Booking_FindElement {
	public static void main(String[] args) {
		// Set driver path
		System.setProperty("webdriver.chrome.driver",
				"./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		// Load the url
		 driver.get("https://www.booking.com/searchresults.html?label=gen173nr-1FCAEoggI46AdIM1gEaGyIAQGYATG4ARfIAQzYAQHoAQH4AQKIAgGoAgM;sid=808f7281b978933590cb44fd4d69f5a4;ac_click_type=b&ac_position=1&checkin_month=12&checkin_monthday=22&checkin_year=2018&checkout_month=1&checkout_monthday=1&checkout_year=2019&class_interval=1&dest_id=-2103041&dest_type=city&dtdisc=0&from_sf=1&group_adults=2&group_children=0&iata=MAA&inac=0&index_postcard=0&label_click=undef&no_rooms=1&offset=0&postcard=0&raw_dest_type=city&room1=A%2CA&sb_price_type=total&search_selected=1&shw_aparth=1&slp_r_match=0&src=index&src_elem=sb&ss=Chennai%2C%20Tamil%20Nadu%2C%20India&ss_all=0&ss_raw=che&ssb=empty&sshis=0&");
		driver.manage().window().maximize();
		// find ratings
		List<WebElement> allRatings = 
				driver.findElementsByClassName("bui-review-score__title");
		System.out.println(allRatings.size());
		String text = allRatings.get(0).getText();
		// Click on the first link
		allRatings.get(0).click();
		System.out.println(text);
	
	}

}







