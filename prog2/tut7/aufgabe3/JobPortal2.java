package prog2.tut7.aufgabe3;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public record JobPortal2(String name, List<JobOffer> jobs) {

	public Map<Company, List<JobOffer>> groupJobsWith40WeeklyWorkHoursByCompany() {
		return jobs.stream()
				.filter(j -> j.weeklyWorkHours() == 40)
				.collect(Collectors.groupingBy(JobOffer::company));
	}

	public List<JobOffer> getJobsForJoa() {
		return jobs.stream()
				.filter(j -> j.jobTitle().equals("Werkstudent"))
				.filter(j -> j.company().location().equals(Location.NORTH))
				.toList();
	}

	public List<Company> getCompaniesWithAFemaleContactPerson() {
		return jobs.stream()
				.map(JobOffer::company)
				.filter(c -> c.contact().gender() == 'F')
				.toList();
	}
}
