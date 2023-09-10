class time {
  public static void main(String[] args) {
    double hour = 11.0;
    double minute = 12.0;
    double second = 1.0;
    double total_seconds = (hour * 3600) + (minute * 60) + second;
    double percent = ((total_seconds / 86400) * 100);
    System.out.println("Seconds since midnight: " + total_seconds);
    System.out.println("Seconds until midnight: " + (86400 - total_seconds));
    System.out.println(percent);
    System.out.println("Percentage of the day that has passed " +  + percent + "%");
    System.out.println("Time spent working on project:  " + (total_seconds - 38930) + " seconds");
  }
}