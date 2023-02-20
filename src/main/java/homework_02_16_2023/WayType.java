package homework_02_16_2023;

public enum WayType {
    PLANE(1.10),
    TRAIN(4.10),
    CAR(5.30),
    BICYCLE(37),
    WALKING(118);

    private double durationInHours;

    WayType(double durationInHours) {
        this.durationInHours = durationInHours;
    }

    public double getDurationInHours() {
        return durationInHours;
    }

    public double getDurationInDays() {
        return durationInHours / 24;
    }

    public double getDurationInMinutes() {
        return durationInHours * 60;
    }

    public double getDurationInSeconds() {
        return durationInHours * 3600;
    }

    public static void main(String[] args) {
        WayType wayType = WayType.PLANE;
        System.out.println("Duration in hours with PLANE " + wayType.getDurationInHours());
        System.out.println("Duration in days with PLANE " + wayType.getDurationInDays());
        System.out.println("Duration in minutes with PLANE " + wayType.getDurationInMinutes());
        System.out.println("Duration in seconds with PLANE " + wayType.getDurationInSeconds());
        WayType wayType1 = WayType.TRAIN;
        System.out.println("Duration in hours with TRAIN " + wayType1.getDurationInHours());
        System.out.println("Duration in days with TRAIN " + wayType1.getDurationInDays());
        System.out.println("Duration in minutes with TRAIN " + wayType1.getDurationInMinutes());
        System.out.println("Duration in seconds with TRAIN " + wayType1.getDurationInSeconds());
        WayType wayType2 = WayType.CAR;
        System.out.println("Duration in hours with CAR " + wayType2.getDurationInHours());
        System.out.println("Duration in days with CAR " + wayType2.getDurationInDays());
        System.out.println("Duration in minutes with CAR " + wayType2.getDurationInMinutes());
        System.out.println("Duration in seconds with CAR " + wayType2.getDurationInSeconds());
        WayType wayType3 = WayType.BICYCLE;
        System.out.println("Duration in hours with BICYCLE " + wayType3.getDurationInHours());
        System.out.println("Duration in days with BICYCLE " + wayType3.getDurationInDays());
        System.out.println("Duration in minutes with BICYCLE " + wayType3.getDurationInMinutes());
        System.out.println("Duration in seconds with BICYCLE " + wayType3.getDurationInSeconds());
        WayType wayType4 = WayType.WALKING;
        System.out.println("Duration in hours with WALKING " + wayType4.getDurationInHours());
        System.out.println("Duration in days with WALKING " + wayType4.getDurationInDays());
        System.out.println("Duration in minutes with WALKING " + wayType4.getDurationInMinutes());
        System.out.println("Duration in seconds with WALKING " + wayType4.getDurationInSeconds());
    }
}
