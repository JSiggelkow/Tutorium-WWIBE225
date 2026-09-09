package prog2.tut7.aufgabe3;

import java.util.*;
import java.util.stream.Collectors;

public record JobPortal (String name, List<JobOffer> jobs) {

    public Map<Company, List<JobOffer>> getJobsWith40WeeklyWorkHoursByCompany() {
        return jobs.stream()
                .filter(j -> j.weeklyWorkHours() == 40)
                .collect(Collectors.groupingBy(JobOffer::company));
    }

    public List<JobOffer> getJobForJoa() {
        return jobs.stream()
                .filter(j -> j.company().location().equals(Location.NORTH))
                .filter(j -> j.jobTitle().equals("Werkstudent"))
                .toList();
    }

    public List<Company> getCompaniesWithAFemaleContactPerson() {
        return jobs.stream()
                .map(JobOffer::company)
                .filter(c -> c.contact().gender() == 'f')
                .toList();
    }

    public Optional<JobOffer> getJobWithHighestSalaryBelow30WorkHours() {
        return jobs.stream()
                .filter(j -> j.weeklyWorkHours() < 30)
                .max(Comparator.comparing(JobOffer::weeklySalary));
    }

    public List<String> getAllContactPersonNamesSortedFromCompaniesLocatedInSouth() {
        return jobs.stream()
                .filter(j -> j.company().location().equals(Location.SOUTH))
                .map(j -> j.company().contact().name())
                .distinct()
                .sorted(Comparator.reverseOrder())
                .toList();
    }

    public Map<Company, List<JobOffer>> getJobsFromEastWithHourlyRateAbove20ByCompany() {
        return jobs.stream()
                .filter(j -> j.company().location().equals(Location.EAST))
                .filter(j -> (double) j.weeklySalary() / j.weeklyWorkHours() > 20)
                .collect(Collectors.groupingBy(JobOffer::company));
    }

    public void printThreeCompaniesWithLeastJobOffersFromEastWithHourlyRateAbove20() {
        getJobsFromEastWithHourlyRateAbove20ByCompany()
                .entrySet()
                .stream()
                .sorted(Comparator.comparing(e -> e.getValue().size()))
                .limit(3)
                .forEach(e -> System.out.println(e.getKey().name() + " hat " + e.getValue().size() + " Jobs veröffentlicht."));
    }

    public Map<Company, Double> getAverageSalaryGroupedByCompany() {

        return jobs.stream()
                .collect(Collectors.groupingBy(JobOffer::company,
                        Collectors.averagingDouble(JobOffer::weeklySalary)));



        /* Eine mögliche Lösung ohne Streams:

        List<Company> companies = jobs.stream()
                .map(JobOffer::company)
                .distinct()
                .toList();

        Map<Company, Double> averageSalary = new HashMap<>();

        for (Company c : companies) {
            double sum = 0;
            int count = 0;
            for (JobOffer j : jobs) {
                if (j.company().equals(c)) {
                    sum += j.weeklySalary();
                    count++;
                }
            }
            averageSalary.put(c, sum/count);
        }
        */

    }

}
