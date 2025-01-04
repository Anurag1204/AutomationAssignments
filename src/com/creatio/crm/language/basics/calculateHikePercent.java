package com.creatio.crm.language.basics;

public class calculateHikePercent {
	
	public double calculateHikePercentage(double salary, int experience, double rating) {

		double hike = 0;
		if (experience >= 5) {
			if (rating >= 4) {
				hike = (salary * 15 / 100) + 1500 + 5000;
			} else if (rating >= 3 && rating < 4) {
				hike = (salary * 10 / 100) + 1200 + 5000;
			} else {
				hike = (salary * 3 / 100) + 300 + 5000;
			}

		} else if (experience < 5) {
			if (rating >= 4) {
				hike = (salary * 15 / 100) + 1500;
			} else if (rating >= 3 && rating < 4) {
				hike = (salary * 10 / 100) + 1200;
			} else {
				hike = (salary * 3 / 100) + 300;
			}

		}
		return (hike / salary) * 100;

}
}
