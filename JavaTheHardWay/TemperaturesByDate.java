import java.util.Scanner;

class TemperatureSample {
      int month, day, year;
      double temperature;
}

public class TemperaturesByDate {
      public static void main(String[] args) throws Exception {
            String site = "http://academic.udayton.edu/kissock/http/Weather/gsod95-current/CODENVER.txt";
            // String path = "/txt/avg-daily-temps-with-dates-atx.txt";
            Scanner inFile = new Scanner((new java.net.URL(site)).openStream());

            TemperatureSample[] tempDB = new TemperatureSample[10000];
            int numRecords, i = 0;

            while (inFile.hasNextInt() && i < tempDB.length) {
                  TemperatureSample e = new TemperatureSample();
                  e.month = inFile.nextInt();
                  e.day = inFile.nextInt();
                  e.year = inFile.nextInt();
                  e.temperature = inFile.nextDouble();
                  if (e.temperature == -99) {
                    continue;
                  }
                  tempDB[i] = e;
                  i++;
            }
            inFile.close();
            numRecords = i;

            System.out.println(numRecords + " daily temperatures loaded.");

            double total = 0, avg, yearTotal = 0, yearAvg;
            int count = 0;
            int yearCount = 0;
            for (i = 0; i < numRecords ; i++ ) {
                  if (tempDB[i].month == 11) {
                        total += tempDB[i].temperature;
                        count++;
                  }
                  if (tempDB[i].year == 2008){
                        yearTotal += tempDB[i].temperature;
                        yearCount++;
                  }
            }

            avg = total/count;
            avg = roundToOneDecimal(avg);
            System.out.println("Average daily temperature over " + count + " days in November: " + avg);

            yearAvg = yearTotal/yearCount;
            yearAvg = roundToOneDecimal(yearAvg);
            System.out.println("Average daily temperature in " + yearCount + " days in 2008: " + yearAvg);

            TemperatureSample ts = tempDB[0];
            System.out.println(ts.year);

      }

      public static double roundToOneDecimal(double d) {
            return Math.round(d*10)/10.0;
      }
}
