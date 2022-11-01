package hw6;

public class TestHarness {

	public static void main(String[] args) {

		SeasonalActivities sa = new SeasonalActivitiesImpl();

		for (Seasons season : Seasons.values()) {
			switch (season) {
			case SPRING:
				sa.HuntEasterEggs();
				break;
			case SUMMER:
				sa.GoSunbathing();
				break;
			case AUTUMN:
				sa.ApplePicking();
				break;
			case WINTER:
				sa.SkiingInSnow();
				break;
			}
		}
	}

}
